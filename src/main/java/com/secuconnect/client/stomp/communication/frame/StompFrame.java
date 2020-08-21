package com.secuconnect.client.stomp.communication.frame;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

/**
 * @deprecated will be replaced in a new major version
 */
public class StompFrame {

    private String command;
    private Map<String, String> headers;
    private String body;

    /**
     * @param command the command of this frame
     * @param headers the headers of this frame
     * @param body the body of this frame
     */
    private StompFrame(String command, Map<String, String> headers, String body) {
        this.command = command;
        this.headers = headers;
        this.body = body;
    }

    /**
     * @param frameAsString a string containing a frame (needs to fit the expected format)
     * @return StompFrame object with filled parameters
     */
    public static StompFrame parseFromString(String frameAsString) {
        String command = "";
        String body = "";
        HashMap<String, String> headers = new HashMap<>();
        String[] lines = frameAsString.split("\n");

        int i = 0;
        while(!lines[i].matches("[A-Z]+")) i++;
        command = lines[i++];

        while(i < lines.length && !lines[i].isEmpty()) {
            String[] header = lines[i].split(":");
            headers.put(header[0].trim(), header[1].trim());
            i++;
        }

        while(i < lines.length && lines[i].isEmpty()) i++;
        if(i < lines.length) {
            body = lines[i];
        }

        return new StompFrame(command, headers, body);
    }

    /**
     * @param command the command of this frame
     * @param headers the headers of this frame
     * @param body the body of this frame
     * @return StompFrame object with filled parameters
     */
    public static StompFrame createFromData(String command, Map<String, String> headers, String body) {
        return new StompFrame(command, headers, body);
    }

    /**
     * @return the command of this frame
     */
    public String getCommand() {
        return command;
    }

    /**
     * @param command the command of this frame
     */
    public void setCommand(String command) {
        this.command = command;
    }

    /**
     * @return the body of this frame
     */
    public String getBody() {
        return body;
    }

    /**
     * @param body the body of this frame
     */
    public void setBody(String body) {
        this.body = body;
    }

    /**
     * @return the headers of this frame
     */
    public Map<String, String> getHeaders() {
        return headers;
    }

    /**
     * @param headers the headers of this frame
     */
    public void setHeaders(Map<String, String> headers) {
        this.headers = headers;
    }

    /**
     * @return a string representation of this frame
     */
    public String toString() {
        StringBuilder buffer = new StringBuilder();

        // append command
        buffer.append(getCommand()).append("\n");

        //append headers
        Map<String, String> headers = getHeaders();
        for (Entry<String, String> entry : headers.entrySet()) {
            buffer.append(entry.getKey()).append(":").append(entry.getValue()).append("\n");
        }
        buffer.append("\n");

        // append body
        buffer.append(getBody());

        return buffer.toString();
    }

    /**
     * @return a string representation of this frame which is ready for being send to server
     */
    public String sendingFormat() {
        return toString() + String.valueOf('\u0000');
    }
}

