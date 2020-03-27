package com.secuconnect.client.model;

import com.google.gson.annotations.SerializedName;

import java.util.Objects;

/**
 * GeneralMerchantsCheckoutOptionsCollection
 */
public class GeneralMerchantsCheckoutOptionsCollection {
    @SerializedName("enabled")
    private Boolean enabled = null;

    @SerializedName("smart_devices")
    private GeneralMerchantsCheckoutOptionsCollectionSmartDevices smartDevices = null;

    public GeneralMerchantsCheckoutOptionsCollection enabled(Boolean enabled) {
        this.enabled = enabled;
        return this;
    }

    /**
     * Enabled
     *
     * @return enabled
     **/
    public Boolean isEnabled() {
        return enabled;
    }

    public void setEnabled(Boolean enabled) {
        this.enabled = enabled;
    }

    public GeneralMerchantsCheckoutOptionsCollection smartDevices(GeneralMerchantsCheckoutOptionsCollectionSmartDevices smartDevices) {
        this.smartDevices = smartDevices;
        return this;
    }

    /**
     * Get smartDevices
     *
     * @return smartDevices
     **/
    public GeneralMerchantsCheckoutOptionsCollectionSmartDevices getSmartDevices() {
        return smartDevices;
    }

    public void setSmartDevices(GeneralMerchantsCheckoutOptionsCollectionSmartDevices smartDevices) {
        this.smartDevices = smartDevices;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        GeneralMerchantsCheckoutOptionsCollection generalMerchantsCheckoutOptionsCollection = (GeneralMerchantsCheckoutOptionsCollection) o;
        return Objects.equals(this.enabled, generalMerchantsCheckoutOptionsCollection.enabled) &&
                Objects.equals(this.smartDevices, generalMerchantsCheckoutOptionsCollection.smartDevices);
    }

    @Override
    public int hashCode() {
        return Objects.hash(enabled, smartDevices);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class GeneralMerchantsCheckoutOptionsCollection {\n");

        sb.append("    enabled: ").append(toIndentedString(enabled)).append("\n");
        sb.append("    smartDevices: ").append(toIndentedString(smartDevices)).append("\n");
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

