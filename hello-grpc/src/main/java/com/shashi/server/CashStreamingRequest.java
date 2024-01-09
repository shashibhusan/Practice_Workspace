package com.shashi.server;

import com.shashi.models.Balance;
import com.shashi.models.DepositeRequest;
import io.grpc.stub.StreamObserver;

public class CashStreamingRequest implements StreamObserver<DepositeRequest> {

    private StreamObserver<Balance> responseObserver;
    private int accountBalance;

    public CashStreamingRequest(StreamObserver<Balance> responseObserver) {
        this.responseObserver = responseObserver;
    }

    @Override
    public void onNext(DepositeRequest depositeRequest) {
        int accountNumber = depositeRequest.getAccountNumber();
        int amount = depositeRequest.getAmount();
        this.accountBalance = AccountDatabase.addBalance(accountNumber, amount);
    }

    @Override
    public void onError(Throwable throwable) {

    }

    @Override
    public void onCompleted() {
        Balance balance = Balance.newBuilder().setAmount(this.accountBalance).build();
        this.responseObserver.onNext(balance);
        this.responseObserver.onCompleted();
    }
}
