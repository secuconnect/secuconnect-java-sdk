package com.secuconnect.client.stomp.api.modelsForStompApiTest;

import com.google.gson.Gson;

public class StompResponseWithSmartTransactionsProductModel {
    private String status;
    private SmartTransactionsProductModelForTests data;

    public static StompResponseWithSmartTransactionsProductModel getStompResponseFromJson(String response) {
        Gson gson = new Gson();
        return  gson.fromJson(response, StompResponseWithSmartTransactionsProductModel.class);
    }

    public SmartTransactionsProductModelForTests getData() {
        return data;
    }

    public String getStatus() {
        return status;
    }
}
