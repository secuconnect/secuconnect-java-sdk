package io.secuconnect.client.stomp.model;

import com.google.gson.Gson;

public class StompRequest {
    private String pid;
    private String sid;
    private Object data;

    public StompRequest(String pid, String sid, Object data) {
        this.pid = pid;
        this.sid = sid;
        this.data = data;
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
