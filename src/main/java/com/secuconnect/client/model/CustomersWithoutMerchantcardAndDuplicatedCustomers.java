package com.secuconnect.client.model;

import com.google.gson.annotations.SerializedName;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * CustomersWithoutMerchantcardAndDuplicatedCustomers
 */
public class CustomersWithoutMerchantcardAndDuplicatedCustomers {
  @SerializedName("customers_without_merchantcard")
  private List<String> customersWithoutMerchantcard = null;

  @SerializedName("duplicated_customers")
  private List<String> duplicatedCustomers = null;

  public CustomersWithoutMerchantcardAndDuplicatedCustomers customersWithoutMerchantcard(List<String> customersWithoutMerchantcard) {
    this.customersWithoutMerchantcard = customersWithoutMerchantcard;
    return this;
  }

  public CustomersWithoutMerchantcardAndDuplicatedCustomers addCustomersWithoutMerchantcardItem(String customersWithoutMerchantcardItem) {
    if (this.customersWithoutMerchantcard == null) {
      this.customersWithoutMerchantcard = new ArrayList<>();
    }
    this.customersWithoutMerchantcard.add(customersWithoutMerchantcardItem);
    return this;
  }

   /**
   * customers without merchantcard
   * @return customersWithoutMerchantcard
  **/
  public List<String> getCustomersWithoutMerchantcard() {
    return customersWithoutMerchantcard;
  }

  public void setCustomersWithoutMerchantcard(List<String> customersWithoutMerchantcard) {
    this.customersWithoutMerchantcard = customersWithoutMerchantcard;
  }

  public CustomersWithoutMerchantcardAndDuplicatedCustomers duplicatedCustomers(List<String> duplicatedCustomers) {
    this.duplicatedCustomers = duplicatedCustomers;
    return this;
  }

  public CustomersWithoutMerchantcardAndDuplicatedCustomers addDuplicatedCustomersItem(String duplicatedCustomersItem) {
    if (this.duplicatedCustomers == null) {
      this.duplicatedCustomers = new ArrayList<>();
    }
    this.duplicatedCustomers.add(duplicatedCustomersItem);
    return this;
  }

   /**
   * duplicated customers
   * @return duplicatedCustomers
  **/
  public List<String> getDuplicatedCustomers() {
    return duplicatedCustomers;
  }

  public void setDuplicatedCustomers(List<String> duplicatedCustomers) {
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

