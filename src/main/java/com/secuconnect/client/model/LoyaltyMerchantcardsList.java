package com.secuconnect.client.model;

import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * LoyaltyMerchantcardsList
 */
public class LoyaltyMerchantcardsList {
    @SerializedName("count")
    private Integer count = null;

    @SerializedName("data")
    private List<LoyaltyMerchantcardsProductModel> data = null;

    public LoyaltyMerchantcardsList count(Integer count) {
        this.count = count;
        return this;
    }

    /**
     * Number of existing loyalty merchant cards
     *
     * @return count
     **/
    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }

    public LoyaltyMerchantcardsList data(List<LoyaltyMerchantcardsProductModel> data) {
        this.data = data;
        return this;
    }

    public LoyaltyMerchantcardsList addDataItem(LoyaltyMerchantcardsProductModel dataItem) {
        if (this.data == null) {
            this.data = new ArrayList<LoyaltyMerchantcardsProductModel>();
        }
        this.data.add(dataItem);
        return this;
    }

    /**
     * Get data
     *
     * @return data
     **/
    public List<LoyaltyMerchantcardsProductModel> getData() {
        return data;
    }

    public void setData(List<LoyaltyMerchantcardsProductModel> data) {
        this.data = data;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        LoyaltyMerchantcardsList loyaltyMerchantcardsList = (LoyaltyMerchantcardsList) o;
        return Objects.equals(this.count, loyaltyMerchantcardsList.count) &&
                Objects.equals(this.data, loyaltyMerchantcardsList.data);
    }

    @Override
    public int hashCode() {
        return Objects.hash(count, data);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class LoyaltyMerchantcardsList {\n");

        sb.append("    count: ").append(toIndentedString(count)).append("\n");
        sb.append("    data: ").append(toIndentedString(data)).append("\n");
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

