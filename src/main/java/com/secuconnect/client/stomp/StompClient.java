package com.secuconnect.client.stomp;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.HashMap;
import java.util.Properties;
import java.util.UUID;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;
import org.apache.activemq.transport.stomp.StompConnection;
import org.apache.activemq.transport.stomp.StompFrame;

public class StompClient {

  private final HashMap<String, String> headers;
  private final StompConnection connection;
  private String accessToken;
  private final String uniqueCorrelationId;
  private final Properties properties;

  public StompClient() {
    properties = loadPropertiesFromConfigFile();
    uniqueCorrelationId = generateUniqueCorrelationId();
    headers = new HashMap<>();

    SSLSocket socket = prepareSocket();
    connection = new StompConnection();
    connection.open(socket);
  }

  public StompConnection getConnection() {
    return connection;
  }

  public HashMap<String, String> getHeaders() {
    return headers;
  }

  public void setAccessToken(String accessToken) {
    this.accessToken = accessToken;
  }

  public void completeHeaders() {
    headers.put("reply_to", properties.getProperty("replyTo"));
    headers.put("reply-to", properties.getProperty("replyTo"));
    headers.put("content-type", properties.getProperty("contentType"));
    headers.put("user-id", accessToken);
    headers.put("correlation_id", uniqueCorrelationId);
    headers.put("correlation-id", uniqueCorrelationId);
  }

  private String generateUniqueCorrelationId() {
    UUID uuid = UUID.randomUUID();
    String uniqueCorrelationId = uuid.toString();

    return uniqueCorrelationId;
  }

  private SSLSocket prepareSocket() {
    SSLSocket socket = null;
    try {
      socket = (SSLSocket) SSLSocketFactory.getDefault()
          .createSocket(properties.getProperty("host"), Integer.parseInt(properties.getProperty("port")));
    } catch (Exception e) {
      e.printStackTrace();
    }

    String[] supportedProtocols = {"TLSv1.2"};
    socket.setEnabledProtocols(supportedProtocols);

    return socket;
  }

  private Properties loadPropertiesFromConfigFile() {
    Properties properties = new Properties();
    InputStream input = null;

    try {
      input = new FileInputStream("./src/main/config.properties");
      properties.load(input);
    } catch (IOException ex) {
      ex.printStackTrace();
    } finally {
      if (input != null) {
        try {
          input.close();
        } catch (IOException e) {
          e.printStackTrace();
        }
      }
    }

    return properties;
  }

  public void connect(String username, String password) {
    try {
      connection.connect(username, password);
    } catch (Exception e) {
      e.printStackTrace();
    }
  }

  public void send(String destination, String msg, String transaction, HashMap<String, String> headers) {
    try {
      connection.send(destination, msg, transaction, headers);
    } catch (Exception e) {
      e.printStackTrace();
    }
  }

  public void send(String destination, String msg, String transaction) {
    send(destination, msg, transaction, headers);
  }

  public String receive() {
    StompFrame frame = null;

    try {
      frame = connection.receive();
    } catch (Exception e) {
      e.printStackTrace();
    }

    return (frame != null) ? frame.getBody() : null;
  }

  public void disconnect() {
    try {
      connection.disconnect();
    } catch (Exception e) {
      e.printStackTrace();
    }
  }

  public void close() {
    try {
      connection.close();
    } catch (IOException e) {
      e.printStackTrace();
    }
  }

  public String destinationOf(String destination) {
    return properties.getProperty("baseDestination") + destination;
  }
}
