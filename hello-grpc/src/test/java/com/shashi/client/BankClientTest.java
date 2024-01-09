package com.shashi.client;

import com.google.common.util.concurrent.Uninterruptibles;
import com.shashi.models.*;
import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import io.grpc.stub.StreamObserver;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public class BankClientTest {
    private BankServiceGrpc.BankServiceBlockingStub blockingStub;
    private BankServiceGrpc.BankServiceStub serviceStub;

    @BeforeAll
    public void setup() {
        ManagedChannel managedChannel = ManagedChannelBuilder.forAddress("localhost", 6565)
                .usePlaintext()
                .build();
        this.blockingStub = BankServiceGrpc.newBlockingStub(managedChannel);
        this.serviceStub = BankServiceGrpc.newStub(managedChannel);
    }

    @Test
    public void getBalanceTest() {
        BalanceCheckRequest balanceCheckRequest = BalanceCheckRequest.newBuilder()
                .setAccountNumber(8)
                .build();
        Balance balance = this.blockingStub.getBalance(balanceCheckRequest);
        System.out.println("Account Balance is : " +
                balance.getAmount()
        );
    }

    @Test
    public void withdrawTest() {
        WithdrawRequest withdrawRequest = WithdrawRequest.newBuilder()
                .setAccountNumber(7)
                .setAmount(60)
                .build();
        this.blockingStub.withdraw(withdrawRequest)
                .forEachRemaining(money -> System.out.println("Received money : " + money.getValue()));

    }

    @Test
    public void withdrawAsync() throws InterruptedException {
        CountDownLatch countDownLatch = new CountDownLatch(1);
        WithdrawRequest withdrawRequest = WithdrawRequest.newBuilder()
                .setAccountNumber(7)
                .setAmount(30)
                .build();
        this.serviceStub.withdraw(withdrawRequest, new MoneyStreamingResponse(countDownLatch));
        Uninterruptibles.sleepUninterruptibly(3, TimeUnit.SECONDS);
        countDownLatch.await();
    }

    @Test
    public void cashStreamingRequest() throws InterruptedException {
        CountDownLatch countDownLatch = new CountDownLatch(1);
        StreamObserver<DepositeRequest> streamObserver = this.serviceStub.cashDeposite(new BalanceStreamingObserver(countDownLatch));
        for (int i = 0; i < 10; i++) {
            DepositeRequest depositeRequest = DepositeRequest.newBuilder().setAccountNumber(10).setAmount(5).build();
            streamObserver.onNext(depositeRequest);
        }
        streamObserver.onCompleted();
        countDownLatch.await();
    }
}
