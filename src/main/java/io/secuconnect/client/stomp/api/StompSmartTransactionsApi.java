package io.secuconnect.client.stomp.api;

import io.secuconnect.client.model.SmartTransactionsDTO;
import io.secuconnect.client.stomp.communication.StompCommunicationManager;
import io.secuconnect.client.stomp.model.StompRequest;

public class StompSmartTransactionsApi {
    private String[] destination;
    private StompCommunicationManager stompCommunicationManager;

    StompSmartTransactionsApi(String accessToken) {
        this.destination = new String[] {"api:", ":Smart.Transactions"};

        this.stompCommunicationManager = StompCommunicationManager.createInstance(accessToken);
        this.stompCommunicationManager.connect(1000);
    }

    public void addTransaction(SmartTransactionsDTO smartTransactionsDTO) {
        StompRequest stompRequest = new StompRequest(null, null, smartTransactionsDTO);
        String smartTransaction = stompRequest.toJson();
        stompCommunicationManager.send(destination[0] + "add" + destination[1], smartTransaction);
    }

    public void updateTransaction(String smartTransactionId, SmartTransactionsDTO smartTransactionsDTO) {
        StompRequest stompRequest = new StompRequest(smartTransactionId, null, smartTransactionsDTO);
        String smartTransaction = stompRequest.toJson();
        stompCommunicationManager.send(destination[0] + "update" + destination[1], smartTransaction);
    }

    public void startTransaction(String smartTransactionId, String paymentMethod) {
        StompRequest stompRequest = new StompRequest(smartTransactionId, paymentMethod, null);
        String smartTransaction = stompRequest.toJson();
        stompCommunicationManager.send(destination[0] + "add" + destination[1] + ".Start", smartTransaction);
    }

    public void preTransaction(String smartTransactionId) {
        StompRequest stompRequest = new StompRequest(smartTransactionId, null, null);
        String smartTransaction = stompRequest.toJson();
        stompCommunicationManager.send(destination[0] + "add" + destination[1] + ".Pretransaction", smartTransaction);
    }

    public String[] getDestination() {
        return destination;
    }

    public void setDestination(String[] destination) {
        this.destination = destination;
    }

    public StompCommunicationManager getStompCommunicationManager() {
        return stompCommunicationManager;
    }

    public void setStompCommunicationManager(StompCommunicationManager stompCommunicationManager) {
        this.stompCommunicationManager = stompCommunicationManager;
    }
}
