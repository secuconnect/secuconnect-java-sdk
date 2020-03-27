package com.secuconnect.client.model;

import com.google.gson.annotations.SerializedName;

import java.util.Objects;

/**
 * LoyaltyCustomersRemoved
 */
public class LoyaltyCustomersRemoved {
    @SerializedName("deleted")
    private Boolean deleted = null;

    public LoyaltyCustomersRemoved deleted(Boolean deleted) {
        this.deleted = deleted;
        return this;
    }

    /**
     * Result is true or false
     *
     * @return deleted
     **/
    public Boolean isDeleted() {
        return deleted;
    }

    public void setDeleted(Boolean deleted) {
        this.deleted = deleted;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        LoyaltyCustomersRemoved loyaltyCustomersRemoved = (LoyaltyCustomersRemoved) o;
        return Objects.equals(this.deleted, loyaltyCustomersRemoved.deleted);
    }

    @Override
    public int hashCode() {
        return Objects.hash(deleted);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class LoyaltyCustomersRemoved {\n");

        sb.append("    deleted: ").append(toIndentedString(deleted)).append("\n");
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

