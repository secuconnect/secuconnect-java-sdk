package io.secuconnect.client.model;

import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;

/**
 * SmartTransactionsReceiptValue
 */
public class SmartTransactionsReceiptValue {
  @SerializedName("caption")
  private String caption = null;

  @SerializedName("text")
  private String text = null;

  @SerializedName("name")
  private String name = null;

  @SerializedName("value")
  private String value = null;

  public SmartTransactionsReceiptValue caption(String caption) {
    this.caption = caption;
    return this;
  }

   /**
   * Caption
   * @return caption
  **/
  public String getCaption() {
    return caption;
  }

  public void setCaption(String caption) {
    this.caption = caption;
  }

  public SmartTransactionsReceiptValue text(String text) {
    this.text = text;
    return this;
  }

   /**
   * Text
   * @return text
  **/
  public String getText() {
    return text;
  }

  public void setText(String text) {
    this.text = text;
  }

  public SmartTransactionsReceiptValue name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Name
   * @return name
  **/
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public SmartTransactionsReceiptValue value(String value) {
    this.value = value;
    return this;
  }

   /**
   * Value
   * @return value
  **/
  public String getValue() {
    return value;
  }

  public void setValue(String value) {
    this.value = value;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SmartTransactionsReceiptValue smartTransactionsReceiptValue = (SmartTransactionsReceiptValue) o;
    return Objects.equals(this.caption, smartTransactionsReceiptValue.caption) &&
        Objects.equals(this.text, smartTransactionsReceiptValue.text) &&
        Objects.equals(this.name, smartTransactionsReceiptValue.name) &&
        Objects.equals(this.value, smartTransactionsReceiptValue.value);
  }

  @Override
  public int hashCode() {
    return Objects.hash(caption, text, name, value);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SmartTransactionsReceiptValue {\n");
    
    sb.append("    caption: ").append(toIndentedString(caption)).append("\n");
    sb.append("    text: ").append(toIndentedString(text)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    value: ").append(toIndentedString(value)).append("\n");
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

