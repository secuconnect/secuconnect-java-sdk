package io.secuconnect.client.model;

import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.secuconnect.client.model.ProductInstanceUID;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import org.joda.time.DateTime;
import java.util.Objects;

/**
 * SmartTransactionsPickupOptions
 */
public class SmartTransactionsPickupOptions {
  @SerializedName("code")
  private String code = null;

  @SerializedName("date")
  private DateTime date = null;

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
  @ApiModelProperty(value = "Code")
  public String getCode() {
    return code;
  }

  public void setCode(String code) {
    this.code = code;
  }

  public SmartTransactionsPickupOptions date(DateTime date) {
    this.date = date;
    return this;
  }

   /**
   * Date
   * @return date
  **/
  @ApiModelProperty(value = "Date")
  public DateTime getDate() {
    return date;
  }

  public void setDate(DateTime date) {
    this.date = date;
  }

  public SmartTransactionsPickupOptions store(ProductInstanceUID store) {
    this.store = store;
    return this;
  }

   /**
   * Store
   * @return store
  **/
  @ApiModelProperty(value = "Store")
  public ProductInstanceUID getStore() {
    return store;
  }

  public void setStore(ProductInstanceUID store) {
    this.store = store;
  }

  @Override
  public boolean equals(java.lang.Object o) {
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
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

