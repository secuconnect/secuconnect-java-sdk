package com.secuconnect.client.model;

import com.google.gson.annotations.SerializedName;

import java.util.Objects;

/**
 * ReceiptTypeValue
 */
public class ReceiptTypeValue extends ReceiptType {
    @SerializedName("value")
    private ReceiptValue value = null;

    public ReceiptTypeValue value(ReceiptValue value) {
        this.value = value;
        return this;
    }

    /**
     * Get value
     *
     * @return value
     **/
    public ReceiptValue getValue() {
        return value;
    }

    public void setValue(ReceiptValue value) {
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
        ReceiptTypeValue receiptTypeValue = (ReceiptTypeValue) o;
        return Objects.equals(this.value, receiptTypeValue.value) &&
                super.equals(o);
    }

    @Override
    public int hashCode() {
        return Objects.hash(value, super.hashCode());
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ReceiptTypeValue {\n");
        sb.append("    ").append(toIndentedString(super.toString())).append("\n");
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

