package com.shashi.client;

import com.shashi.models.Balance;
import io.grpc.stub.StreamObserver;

import java.util.concurrent.CountDownLatch;

public class BalanceStreamingObserver implements StreamObserver<Balance> {
    private CountDownLatch countDownLatch;

    public BalanceStreamingObserver(CountDownLatch countDownLatch) {
        this.countDownLatch = countDownLatch;
    }

    @Override
    public void onNext(Balance balance) {
        System.out.println(
                "Final balance is " + balance.getAmount()
        );
    }

    @Override
    public void onError(Throwable throwable) {
        this.countDownLatch.countDown();
    }

    @Override
    public void onCompleted() {
        System.out.println(
                "server is done!!"
        );
        this.countDownLatch.countDown();
    }
}
