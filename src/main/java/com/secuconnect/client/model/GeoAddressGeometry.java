package com.secuconnect.client.model;

import com.google.gson.annotations.SerializedName;

import java.util.Objects;

/**
 * Geometry
 */
public class GeoAddressGeometry {
    @SerializedName("lat")
    private String lat = null;

    @SerializedName("lon")
    private String lon = null;

    public GeoAddressGeometry lat(String lat) {
        this.lat = lat;
        return this;
    }

    /**
     * latitude
     *
     * @return lat
     **/
    public String getLat() {
        return lat;
    }

    public void setLat(String lat) {
        this.lat = lat;
    }

    public GeoAddressGeometry lon(String lon) {
        this.lon = lon;
        return this;
    }

    /**
     * longitude
     *
     * @return lon
     **/
    public String getLon() {
        return lon;
    }

    public void setLon(String lon) {
        this.lon = lon;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        GeoAddressGeometry geoAddressGeometry = (GeoAddressGeometry) o;
        return Objects.equals(this.lat, geoAddressGeometry.lat) &&
                Objects.equals(this.lon, geoAddressGeometry.lon);
    }

    @Override
    public int hashCode() {
        return Objects.hash(lat, lon);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class GeoAddressGeometry {\n");

        sb.append("    lat: ").append(toIndentedString(lat)).append("\n");
        sb.append("    lon: ").append(toIndentedString(lon)).append("\n");
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

