package com.secuconnect.client.model;

import com.google.gson.annotations.SerializedName;

import java.util.Objects;

/**
 * ResultAlwaysTrue
 */
public class ResultAlwaysTrue {
    @SerializedName("result")
    private Boolean result = null;

    public ResultAlwaysTrue result(Boolean result) {
        this.result = result;
        return this;
    }

    /**
     * Result (will always be equal to true)
     *
     * @return result
     **/
    public Boolean isResult() {
        return result;
    }

    public void setResult(Boolean result) {
        this.result = result;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ResultAlwaysTrue resultAlwaysTrue = (ResultAlwaysTrue) o;
        return Objects.equals(this.result, resultAlwaysTrue.result);
    }

    @Override
    public int hashCode() {
        return Objects.hash(result);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ResultAlwaysTrue {\n");

        sb.append("    result: ").append(toIndentedString(result)).append("\n");
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

