package com.secuconnect.client.model;

import com.google.gson.annotations.SerializedName;
import com.secuconnect.client.model.GooglePayDescriptorIntermediateSigningKey;
import java.util.Objects;

/**
 * GooglePay details
 */
public class GooglePayDescriptor implements OneOfPaymentContainersDTOModelPrivate {
  @SerializedName("signature")
  protected String signature = null;

  @SerializedName("intermediateSigningKey")
  protected GooglePayDescriptorIntermediateSigningKey intermediateSigningKey = null;

  @SerializedName("protocolVersion")
  protected String protocolVersion = "ECv2";

  @SerializedName("signedMessage")
  protected String signedMessage = null;

  public GooglePayDescriptor signature(String signature) {
    this.signature = signature;
    return this;
  }

   /**
   * Base64 encoded signature of the signedMessage data.
   * @return signature
  **/
  public String getSignature() {
    return signature;
  }

  public void setSignature(String signature) {
    this.signature = signature;
  }

  public GooglePayDescriptor intermediateSigningKey(GooglePayDescriptorIntermediateSigningKey intermediateSigningKey) {
    this.intermediateSigningKey = intermediateSigningKey;
    return this;
  }

   /**
   * Get intermediateSigningKey
   * @return intermediateSigningKey
  **/
  public GooglePayDescriptorIntermediateSigningKey getIntermediateSigningKey() {
    return intermediateSigningKey;
  }

  public void setIntermediateSigningKey(GooglePayDescriptorIntermediateSigningKey intermediateSigningKey) {
    this.intermediateSigningKey = intermediateSigningKey;
  }

  public GooglePayDescriptor protocolVersion(String protocolVersion) {
    this.protocolVersion = protocolVersion;
    return this;
  }

   /**
   * Version information about the payment token.
   * @return protocolVersion
  **/
  public String getProtocolVersion() {
    return protocolVersion;
  }

  public void setProtocolVersion(String protocolVersion) {
    this.protocolVersion = protocolVersion;
  }

  public GooglePayDescriptor signedMessage(String signedMessage) {
    this.signedMessage = signedMessage;
    return this;
  }

   /**
   * A JSON object serialized as an HTML-safe string that contains the encryptedMessage, ephemeralPublicKey, and tag.
   * @return signedMessage
  **/
  public String getSignedMessage() {
    return signedMessage;
  }

  public void setSignedMessage(String signedMessage) {
    this.signedMessage = signedMessage;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GooglePayDescriptor googlePayDescriptor = (GooglePayDescriptor) o;
    return Objects.equals(this.signature, googlePayDescriptor.signature) &&
        Objects.equals(this.intermediateSigningKey, googlePayDescriptor.intermediateSigningKey) &&
        Objects.equals(this.protocolVersion, googlePayDescriptor.protocolVersion) &&
        Objects.equals(this.signedMessage, googlePayDescriptor.signedMessage);
  }

  @Override
  public int hashCode() {
    return Objects.hash(signature, intermediateSigningKey, protocolVersion, signedMessage);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GooglePayDescriptor {\n");
    sb.append("    signature: ").append(toIndentedString(signature)).append("\n");
    sb.append("    intermediateSigningKey: ").append(toIndentedString(intermediateSigningKey)).append("\n");
    sb.append("    protocolVersion: ").append(toIndentedString(protocolVersion)).append("\n");
    sb.append("    signedMessage: ").append(toIndentedString(signedMessage)).append("\n");
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

