package com.secuconnect.client;

import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonNull;
import com.google.gson.JsonParseException;
import com.google.gson.JsonPrimitive;
import com.google.gson.JsonSerializationContext;
import com.google.gson.JsonSerializer;
import java.lang.reflect.Type;
import java.util.Date;

class DateAdapter implements JsonSerializer<Date>, JsonDeserializer<Date> {

  private final ApiClient apiClient;

  /**
   * Constructor for DateAdapter
   *
   * @param apiClient Api client
   */
  public DateAdapter(ApiClient apiClient) {
    super();
    this.apiClient = apiClient;
  }

  /**
   * Serialize
   *
   * @param src Date
   * @param typeOfSrc Type
   * @param context Json Serialization Context
   * @return Json Element
   */
  @Override
  public JsonElement serialize(Date src, Type typeOfSrc, JsonSerializationContext context) {
    if (src == null) {
      return JsonNull.INSTANCE;
    } else {
      return new JsonPrimitive(apiClient.formatDatetime(src));
    }
  }

  /**
   * Deserialize
   *
   * @param json Json element
   * @param date Type
   * @param context Json Serialization Context
   * @return Date
   * @throws JsonParseException if fail to parse
   */
  @Override
  public Date deserialize(JsonElement json, Type date, JsonDeserializationContext context) throws JsonParseException {
    String str = json.getAsJsonPrimitive().getAsString();
    try {
      return apiClient.parseDateOrDatetime(str);
    } catch (RuntimeException e) {
      throw new JsonParseException(e);
    }
  }
}
