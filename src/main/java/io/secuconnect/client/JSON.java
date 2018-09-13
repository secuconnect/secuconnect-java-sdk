package io.secuconnect.client;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonParseException;
import com.google.gson.stream.JsonReader;
import java.io.StringReader;
import java.lang.reflect.Type;
import java.util.Date;
import org.joda.time.DateTime;
import org.joda.time.LocalDate;

public class JSON {

  private final ApiClient apiClient;
  private Gson gson;

  /**
   * JSON constructor.
   *
   * @param apiClient An instance of ApiClient
   */
  public JSON(ApiClient apiClient) {
    this.apiClient = apiClient;
    gson = new GsonBuilder().registerTypeAdapter(Date.class, new DateAdapter(apiClient))
        .registerTypeAdapter(DateTime.class, new DateTimeTypeAdapter()).registerTypeAdapter(LocalDate.class, new LocalDateTypeAdapter()).create();
  }

  /**
   * Get Gson.
   *
   * @return Gson
   */
  public Gson getGson() {
    return gson;
  }

  /**
   * Set Gson.
   *
   * @param gson Gson
   */
  public void setGson(Gson gson) {
    this.gson = gson;
  }

  /**
   * Serialize the given Java object into JSON string.
   *
   * @param obj Object
   * @return String representation of the JSON
   */
  public String serialize(Object obj) {
    return gson.toJson(obj);
  }

  /**
   * Deserialize the given JSON string to Java object.
   *
   * @param <T> Type
   * @param body The JSON string
   * @param returnType The type to deserialize into
   * @return The deserialized Java object
   */
  @SuppressWarnings("unchecked")
  public <T> T deserialize(String body, Type returnType) {
    try {
      if (apiClient.isLenientOnJson()) {
        JsonReader jsonReader = new JsonReader(new StringReader(body));
        // see https://google-gson.googlecode.com/svn/trunk/gson/docs/javadocs/com/google/gson/stream/JsonReader.html#setLenient(boolean)
        jsonReader.setLenient(true);
        return gson.fromJson(jsonReader, returnType);
      } else {
        return gson.fromJson(body, returnType);
      }
    } catch (JsonParseException e) {
      // Fallback processing when failed to parse JSON form response body:
      //   return the response body string directly for the String return type;
      //   parse response body into date or datetime for the Date return type.
      if (returnType.equals(String.class)) {
        return (T) body;
      } else if (returnType.equals(Date.class)) {
        return (T) apiClient.parseDateOrDatetime(body);
      } else {
        throw (e);
      }
    }
  }
}

