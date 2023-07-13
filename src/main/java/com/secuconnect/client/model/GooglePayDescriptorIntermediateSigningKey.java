package com.secuconnect.client.model;

import com.google.gson.annotations.SerializedName;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * A object that contains the intermediate signing key from Google. It contains the signedKey with keyValue, keyExpiration, and signatures.
 */
public class GooglePayDescriptorIntermediateSigningKey {
  @SerializedName("signedKey")
  protected String signedKey = null;

  @SerializedName("signatures")
  protected List<String> signatures = null;

  public GooglePayDescriptorIntermediateSigningKey signedKey(String signedKey) {
    this.signedKey = signedKey;
    return this;
  }

   /**
   * A base64-encoded message that contains payment description of the key.
   * @return signedKey
  **/
  public String getSignedKey() {
    return signedKey;
  }

  public void setSignedKey(String signedKey) {
    this.signedKey = signedKey;
  }

  public GooglePayDescriptorIntermediateSigningKey signatures(List<String> signatures) {
    this.signatures = signatures;
    return this;
  }

  public GooglePayDescriptorIntermediateSigningKey addSignaturesItem(String signaturesItem) {
    if (this.signatures == null) {
      this.signatures = new ArrayList<String>();
    }
    this.signatures.add(signaturesItem);
    return this;
  }

   /**
   * A list of used singing keys from Google.
   * @return signatures
  **/
  public List<String> getSignatures() {
    return signatures;
  }

  public void setSignatures(List<String> signatures) {
    this.signatures = signatures;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GooglePayDescriptorIntermediateSigningKey googlePayDescriptorIntermediateSigningKey = (GooglePayDescriptorIntermediateSigningKey) o;
    return Objects.equals(this.signedKey, googlePayDescriptorIntermediateSigningKey.signedKey) &&
        Objects.equals(this.signatures, googlePayDescriptorIntermediateSigningKey.signatures);
  }

  @Override
  public int hashCode() {
    return Objects.hash(signedKey, signatures);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GooglePayDescriptorIntermediateSigningKey {\n");
    sb.append("    signedKey: ").append(toIndentedString(signedKey)).append("\n");
    sb.append("    signatures: ").append(toIndentedString(signatures)).append("\n");
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

