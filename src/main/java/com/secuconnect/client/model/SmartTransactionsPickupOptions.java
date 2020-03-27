package com.secuconnect.client.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.secuconnect.client.model.ProductInstanceUID;
import java.io.IOException;

/**
 * SmartTransactionsPickupOptions
 */
public class SmartTransactionsPickupOptions {
  @SerializedName("code")
  private String code = null;

  @SerializedName("date")
  private String date = null;

  @SerializedName("store")
  private ProductInstanceUID store = null;

  public SmartTransactionsPickupOptions code(String code) {
    this.code = code;
    return this;
  }

   /**
   * Code
   * @return code
  **/
  public String getCode() {
    return code;
  }

  public void setCode(String code) {
    this.code = code;
  }

  public SmartTransactionsPickupOptions date(String date) {
    this.date = date;
    return this;
  }

   /**
   * Date
   * @return date
  **/
  public String getDate() {
    return date;
  }

  public void setDate(String date) {
    this.date = date;
  }

  public SmartTransactionsPickupOptions store(ProductInstanceUID store) {
    this.store = store;
    return this;
  }

   /**
   * Get store
   * @return store
  **/
  public ProductInstanceUID getStore() {
    return store;
  }

  public void setStore(ProductInstanceUID store) {
    this.store = store;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SmartTransactionsPickupOptions smartTransactionsPickupOptions = (SmartTransactionsPickupOptions) o;
    return Objects.equals(this.code, smartTransactionsPickupOptions.code) &&
        Objects.equals(this.date, smartTransactionsPickupOptions.date) &&
        Objects.equals(this.store, smartTransactionsPickupOptions.store);
  }

  @Override
  public int hashCode() {
    return Objects.hash(code, date, store);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SmartTransactionsPickupOptions {\n");
    
    sb.append("    code: ").append(toIndentedString(code)).append("\n");
    sb.append("    date: ").append(toIndentedString(date)).append("\n");
    sb.append("    store: ").append(toIndentedString(store)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

