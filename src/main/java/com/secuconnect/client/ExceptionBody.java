package com.secuconnect.client;

import com.google.gson.annotations.SerializedName;

public class ExceptionBody {

    @SerializedName("error")
    private String error;

    @SerializedName("error_description")
    private String errorDescription;

    public String getError() {
        return error;
    }

    public String getErrorDescription() {
        return errorDescription;
    }
}
