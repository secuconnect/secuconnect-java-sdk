package com.secuconnect.client.stomp.model;

import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;

public class StompRequest {
    private String method;
    private String action;
    @SerializedName("action_id")
    private String actionId;
    private String pid;
    private String sid;
    private Object data;

    public String  getMethod() {
        return this.method;
    }

    public void setMethod(String method) {
        this.method = method;
    }

    public String getAction() {
        return this.action;
    }

    public void setAction(String action) {
        this.action = action;
    }

    public String getActionId() {
        return this.actionId;
    }

    public void setActionId(String actionId) {
        this.actionId = actionId;
    }

    public String getPid() {
        return pid;
    }

    public void setPid(String pid) {
        this.pid = pid;
    }

    public String getSid() {
        return sid;
    }

    public void setSid(String sid) {
        this.sid = sid;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }

    public String toJson() {
        Gson gson = new Gson();

        return gson.toJson(this);
    }
}
