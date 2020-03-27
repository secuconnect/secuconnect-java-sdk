package io.secuconnect.client.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * ReceiptValue
 */
public class ReceiptValue {
  @SerializedName("caption")
  private String caption = null;

  @SerializedName("name")
  private String name = null;

  @SerializedName("value")
  private String value = null;

  @SerializedName("text")
  private String text = null;

  @SerializedName("decoration")
  private List<String> decoration = null;

  public ReceiptValue caption(String caption) {
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

  public ReceiptValue name(String name) {
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

  public ReceiptValue value(String value) {
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

  public ReceiptValue text(String text) {
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

  public ReceiptValue decoration(List<String> decoration) {
    this.decoration = decoration;
    return this;
  }

  public ReceiptValue addDecorationItem(String decorationItem) {
    if (this.decoration == null) {
      this.decoration = new ArrayList<String>();
    }
    this.decoration.add(decorationItem);
    return this;
  }

   /**
   * Decoration
   * @return decoration
  **/
  public List<String> getDecoration() {
    return decoration;
  }

  public void setDecoration(List<String> decoration) {
    this.decoration = decoration;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ReceiptValue receiptValue = (ReceiptValue) o;
    return Objects.equals(this.caption, receiptValue.caption) &&
        Objects.equals(this.name, receiptValue.name) &&
        Objects.equals(this.value, receiptValue.value) &&
        Objects.equals(this.text, receiptValue.text) &&
        Objects.equals(this.decoration, receiptValue.decoration);
  }

  @Override
  public int hashCode() {
    return Objects.hash(caption, name, value, text, decoration);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ReceiptValue {\n");
    
    sb.append("    caption: ").append(toIndentedString(caption)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    value: ").append(toIndentedString(value)).append("\n");
    sb.append("    text: ").append(toIndentedString(text)).append("\n");
    sb.append("    decoration: ").append(toIndentedString(decoration)).append("\n");
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

