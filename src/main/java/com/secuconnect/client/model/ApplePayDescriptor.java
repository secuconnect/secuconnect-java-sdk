package com.secuconnect.client.model;

import com.google.gson.annotations.SerializedName;
import java.util.Objects;

/**
 * ApplePay details
 */
public class ApplePayDescriptor implements OneOfPaymentContainersDTOModelPrivate {
  @SerializedName("signature")
  private String signature = null;

  @SerializedName("version")
  private String version = "EC_v1";

  @SerializedName("data")
  private String data = null;

  @SerializedName("header")
  private Object header = null;

  public ApplePayDescriptor signature(String signature) {
    this.signature = signature;
    return this;
  }

   /**
   * Base64 encoded signature of the payment and header data.
   * @return signature
  **/
  public String getSignature() {
    return signature;
  }

  public void setSignature(String signature) {
    this.signature = signature;
  }

  public ApplePayDescriptor version(String version) {
    this.version = version;
    return this;
  }

   /**
   * Version information about the payment token.
   * @return version
  **/
  public String getVersion() {
    return version;
  }

  public void setVersion(String version) {
    this.version = version;
  }

  public ApplePayDescriptor data(String data) {
    this.data = data;
    return this;
  }

   /**
   * Base64 encoded encrypted payment data.
   * @return data
  **/
  public String getData() {
    return data;
  }

  public void setData(String data) {
    this.data = data;
  }

  public ApplePayDescriptor header(Object header) {
    this.header = header;
    return this;
  }

   /**
   * Additional version-dependent information you use to decrypt and verify the payment
   * @return header
  **/
  public Object getHeader() {
    return header;
  }

  public void setHeader(Object header) {
    this.header = header;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ApplePayDescriptor applePayDescriptor = (ApplePayDescriptor) o;
    return Objects.equals(this.signature, applePayDescriptor.signature) &&
        Objects.equals(this.version, applePayDescriptor.version) &&
        Objects.equals(this.data, applePayDescriptor.data) &&
        Objects.equals(this.header, applePayDescriptor.header);
  }

  @Override
  public int hashCode() {
    return Objects.hash(signature, version, data, header);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ApplePayDescriptor {\n");
    sb.append("    signature: ").append(toIndentedString(signature)).append("\n");
    sb.append("    version: ").append(toIndentedString(version)).append("\n");
    sb.append("    data: ").append(toIndentedString(data)).append("\n");
    sb.append("    header: ").append(toIndentedString(header)).append("\n");
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

