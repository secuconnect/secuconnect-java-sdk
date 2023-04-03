package com.secuconnect.client.model;

import com.google.gson.annotations.SerializedName;
import java.util.Objects;

/**
 * The header element is a required child of the applepay element. Its child elements provides information required to process the Apple Pay transaction.
 */
public class ApplePayDescriptorHeader {
  @SerializedName("ephemeralPublicKey")
  private String ephemeralPublicKey = null;

  @SerializedName("publicKeyHash")
  private String publicKeyHash = null;

  @SerializedName("transactionId")
  private String transactionId = null;

  public ApplePayDescriptorHeader ephemeralPublicKey(String ephemeralPublicKey) {
    this.ephemeralPublicKey = ephemeralPublicKey;
    return this;
  }

   /**
   * Base64 encoded ephemeral public key
   * @return ephemeralPublicKey
  **/
  public String getEphemeralPublicKey() {
    return ephemeralPublicKey;
  }

  public void setEphemeralPublicKey(String ephemeralPublicKey) {
    this.ephemeralPublicKey = ephemeralPublicKey;
  }

  public ApplePayDescriptorHeader publicKeyHash(String publicKeyHash) {
    this.publicKeyHash = publicKeyHash;
    return this;
  }

   /**
   * Base64 hash of public merchant key cert
   * @return publicKeyHash
  **/
  public String getPublicKeyHash() {
    return publicKeyHash;
  }

  public void setPublicKeyHash(String publicKeyHash) {
    this.publicKeyHash = publicKeyHash;
  }

  public ApplePayDescriptorHeader transactionId(String transactionId) {
    this.transactionId = transactionId;
    return this;
  }

   /**
   * Hex transaction ID
   * @return transactionId
  **/
  public String getTransactionId() {
    return transactionId;
  }

  public void setTransactionId(String transactionId) {
    this.transactionId = transactionId;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ApplePayDescriptorHeader applePayDescriptorHeader = (ApplePayDescriptorHeader) o;
    return Objects.equals(this.ephemeralPublicKey, applePayDescriptorHeader.ephemeralPublicKey) &&
        Objects.equals(this.publicKeyHash, applePayDescriptorHeader.publicKeyHash) &&
        Objects.equals(this.transactionId, applePayDescriptorHeader.transactionId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(ephemeralPublicKey, publicKeyHash, transactionId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ApplePayDescriptorHeader {\n");
    sb.append("    ephemeralPublicKey: ").append(toIndentedString(ephemeralPublicKey)).append("\n");
    sb.append("    publicKeyHash: ").append(toIndentedString(publicKeyHash)).append("\n");
    sb.append("    transactionId: ").append(toIndentedString(transactionId)).append("\n");
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

