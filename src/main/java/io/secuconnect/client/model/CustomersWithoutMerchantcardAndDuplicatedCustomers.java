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
 * CustomersWithoutMerchantcardAndDuplicatedCustomers
 */
public class CustomersWithoutMerchantcardAndDuplicatedCustomers {
  @SerializedName("customers_without_merchantcard")
  private List<Object> customersWithoutMerchantcard = null;

  @SerializedName("duplicated_customers")
  private List<Object> duplicatedCustomers = null;

  public CustomersWithoutMerchantcardAndDuplicatedCustomers customersWithoutMerchantcard(List<Object> customersWithoutMerchantcard) {
    this.customersWithoutMerchantcard = customersWithoutMerchantcard;
    return this;
  }

  public CustomersWithoutMerchantcardAndDuplicatedCustomers addCustomersWithoutMerchantcardItem(Object customersWithoutMerchantcardItem) {
    if (this.customersWithoutMerchantcard == null) {
      this.customersWithoutMerchantcard = new ArrayList<Object>();
    }
    this.customersWithoutMerchantcard.add(customersWithoutMerchantcardItem);
    return this;
  }

   /**
   * customers without merchantcard
   * @return customersWithoutMerchantcard
  **/
  public List<Object> getCustomersWithoutMerchantcard() {
    return customersWithoutMerchantcard;
  }

  public void setCustomersWithoutMerchantcard(List<Object> customersWithoutMerchantcard) {
    this.customersWithoutMerchantcard = customersWithoutMerchantcard;
  }

  public CustomersWithoutMerchantcardAndDuplicatedCustomers duplicatedCustomers(List<Object> duplicatedCustomers) {
    this.duplicatedCustomers = duplicatedCustomers;
    return this;
  }

  public CustomersWithoutMerchantcardAndDuplicatedCustomers addDuplicatedCustomersItem(Object duplicatedCustomersItem) {
    if (this.duplicatedCustomers == null) {
      this.duplicatedCustomers = new ArrayList<Object>();
    }
    this.duplicatedCustomers.add(duplicatedCustomersItem);
    return this;
  }

   /**
   * duplicated customers
   * @return duplicatedCustomers
  **/
  public List<Object> getDuplicatedCustomers() {
    return duplicatedCustomers;
  }

  public void setDuplicatedCustomers(List<Object> duplicatedCustomers) {
    this.duplicatedCustomers = duplicatedCustomers;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CustomersWithoutMerchantcardAndDuplicatedCustomers customersWithoutMerchantcardAndDuplicatedCustomers = (CustomersWithoutMerchantcardAndDuplicatedCustomers) o;
    return Objects.equals(this.customersWithoutMerchantcard, customersWithoutMerchantcardAndDuplicatedCustomers.customersWithoutMerchantcard) &&
        Objects.equals(this.duplicatedCustomers, customersWithoutMerchantcardAndDuplicatedCustomers.duplicatedCustomers);
  }

  @Override
  public int hashCode() {
    return Objects.hash(customersWithoutMerchantcard, duplicatedCustomers);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CustomersWithoutMerchantcardAndDuplicatedCustomers {\n");
    
    sb.append("    customersWithoutMerchantcard: ").append(toIndentedString(customersWithoutMerchantcard)).append("\n");
    sb.append("    duplicatedCustomers: ").append(toIndentedString(duplicatedCustomers)).append("\n");
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

