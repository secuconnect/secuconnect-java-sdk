package io.secuconnect.client.stomp.api;

import io.secuconnect.client.model.SmartTransactionsDTO;
import io.secuconnect.client.stomp.communication.StompCommunicationManager;
import io.secuconnect.client.stomp.model.StompRequest;

/**
 * StompSmartTransactionsApi is the class which allows calling Smart Transactions Product methods using STOMP protocol.
 */
public class StompSmartTransactionsApi {
    private String[] destination;
    private StompCommunicationManager stompCommunicationManager;

    StompSmartTransactionsApi(String accessToken) {
        this.destination = new String[] {"api:", ":Smart.Transactions"};

        this.stompCommunicationManager = StompCommunicationManager.createInstance(accessToken);
        this.stompCommunicationManager.connect(1000);
    }

    /**
     * Method for creating a new smart transaction.
     *
     * @param smartTransactionsDTO smart transaction properties
     */
    public void addTransaction(SmartTransactionsDTO smartTransactionsDTO) {
        StompRequest stompRequest = new StompRequest();
        stompRequest.setData(smartTransactionsDTO);
        String smartTransaction = stompRequest.toJson();
        stompCommunicationManager.send(destination[0] + "add" + destination[1], smartTransaction);
    }

    /**
     * Method for updating existing smart transaction by provided ID.
     *
     * @param smartTransactionId smart transaction ID
     * @param smartTransactionsDTO smart transaction properties
     */
    public void updateTransaction(String smartTransactionId, SmartTransactionsDTO smartTransactionsDTO) {
        StompRequest stompRequest = new StompRequest();
        stompRequest.setPid(smartTransactionId);
        stompRequest.setData(smartTransactionsDTO);
        String smartTransaction = stompRequest.toJson();
        stompCommunicationManager.send(destination[0] + "update" + destination[1], smartTransaction);
    }

    /**
     * Method for starting given smart transaction.
     *
     * @param smartTransactionId smart transaction ID
     * @param paymentMethod payment method like 'demo', 'cashless' etc.
     */
    public void startTransaction(String smartTransactionId, String paymentMethod) {
        StompRequest stompRequest = new StompRequest();
        stompRequest.setPid(smartTransactionId);
        stompRequest.setSid(paymentMethod);
        String smartTransaction = stompRequest.toJson();
        stompCommunicationManager.send(destination[0] + "add" + destination[1] + ".Start", smartTransaction);
    }

    /**
     * Method that checks balance of merchantcard from ident and if possible creates bonus product items for basket
     *
     * @param smartTransactionId smart transaction ID
     */
    public void preTransaction(String smartTransactionId) {
        StompRequest stompRequest = new StompRequest();
        stompRequest.setPid(smartTransactionId);
        String smartTransaction = stompRequest.toJson();
        stompCommunicationManager.send(destination[0] + "add" + destination[1] + ".Pretransaction", smartTransaction);
    }

    /**
     * Getter for destination field.
     *
     * @return String[]
     */
    public String[] getDestination() {
        return destination;
    }

    /**
     * Setter for destination field.
     *
     * @param destination destination for stomp
     */
    public void setDestination(String[] destination) {
        this.destination = destination;
    }

    /**
     * Getter for stompCommunicationManager field.
     *
     * @return StompCommunicationManager
     */
    public StompCommunicationManager getStompCommunicationManager() {
        return stompCommunicationManager;
    }

    /**
     * Setter for stompCommunicationManager field.
     *
     * @param stompCommunicationManager main class for stomp
     */
    public void setStompCommunicationManager(StompCommunicationManager stompCommunicationManager) {
        this.stompCommunicationManager = stompCommunicationManager;
    }
}
