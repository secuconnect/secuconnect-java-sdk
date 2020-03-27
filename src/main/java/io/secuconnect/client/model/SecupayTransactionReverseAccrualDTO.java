package io.secuconnect.client.model;

import java.util.Objects;

import com.google.gson.annotations.SerializedName;

/**
 * SecupayTransactionReverseAccrualDTO
 */
public class SecupayTransactionReverseAccrualDTO {
  @SerializedName("accrual")
  private Boolean accrual = false;

  public SecupayTransactionReverseAccrualDTO accrual(Boolean accrual) {
    this.accrual = accrual;
    return this;
  }

   /**
   * Indicates whether the payment is locked for pay-out (TRUE) or not (FALSE).
   * @return accrual
  **/
  public Boolean isAccrual() {
    return accrual;
  }

  public void setAccrual(Boolean accrual) {
    this.accrual = accrual;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SecupayTransactionReverseAccrualDTO secupayTransactionReverseAccrualDTO = (SecupayTransactionReverseAccrualDTO) o;
    return Objects.equals(this.accrual, secupayTransactionReverseAccrualDTO.accrual);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accrual);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SecupayTransactionReverseAccrualDTO {\n");
    
    sb.append("    accrual: ").append(toIndentedString(accrual)).append("\n");
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

