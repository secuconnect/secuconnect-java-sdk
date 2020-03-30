package io.secuconnect.client.model;

import com.google.gson.annotations.SerializedName;
import java.util.Objects;

/**
 * SmartRoutingsDTO
 */
public class SmartRoutingsDTO {
  @SerializedName("store")
  private String store = null;

  @SerializedName("description")
  private String description = null;

  public SmartRoutingsDTO store(String store) {
    this.store = store;
    return this;
  }

   /**
   * General store ID
   * @return store
  **/
  public String getStore() {
    return store;
  }

  public void setStore(String store) {
    this.store = store;
  }

  public SmartRoutingsDTO description(String description) {
    this.description = description;
    return this;
  }

   /**
   * Description
   * @return description
  **/
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SmartRoutingsDTO smartRoutingsDTO = (SmartRoutingsDTO) o;
    return Objects.equals(this.store, smartRoutingsDTO.store) &&
        Objects.equals(this.description, smartRoutingsDTO.description);
  }

  @Override
  public int hashCode() {
    return Objects.hash(store, description);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SmartRoutingsDTO {\n");
    
    sb.append("    store: ").append(toIndentedString(store)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
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

