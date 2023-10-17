package com.secuconnect.client.model;

import com.google.gson.annotations.SerializedName;
import java.util.Objects;

/**
 * CycleExecutions
 */
public class CycleExecutions {
  @SerializedName("sequence")
  protected Integer sequence = null;

  @SerializedName("tenure_type")
  protected String tenureType = null;

  @SerializedName("total_cycles")
  protected Integer totalCycles = null;

  @SerializedName("cycles_completed")
  protected Integer cyclesCompleted = null;

  @SerializedName("cycles_remaining")
  protected Integer cyclesRemaining = null;

  public CycleExecutions sequence(Integer sequence) {
    this.sequence = sequence;
    return this;
  }

   /**
   * sequence
   * @return sequence
  **/
  public Integer getSequence() {
    return sequence;
  }

  public void setSequence(Integer sequence) {
    this.sequence = sequence;
  }

  public CycleExecutions tenureType(String tenureType) {
    this.tenureType = tenureType;
    return this;
  }

   /**
   * Tenure type
   * @return tenureType
  **/
  public String getTenureType() {
    return tenureType;
  }

  public void setTenureType(String tenureType) {
    this.tenureType = tenureType;
  }

  public CycleExecutions totalCycles(Integer totalCycles) {
    this.totalCycles = totalCycles;
    return this;
  }

   /**
   * Total cycles
   * @return totalCycles
  **/
  public Integer getTotalCycles() {
    return totalCycles;
  }

  public void setTotalCycles(Integer totalCycles) {
    this.totalCycles = totalCycles;
  }

  public CycleExecutions cyclesCompleted(Integer cyclesCompleted) {
    this.cyclesCompleted = cyclesCompleted;
    return this;
  }

   /**
   * Completed cycles
   * @return cyclesCompleted
  **/
  public Integer getCyclesCompleted() {
    return cyclesCompleted;
  }

  public void setCyclesCompleted(Integer cyclesCompleted) {
    this.cyclesCompleted = cyclesCompleted;
  }

  public CycleExecutions cyclesRemaining(Integer cyclesRemaining) {
    this.cyclesRemaining = cyclesRemaining;
    return this;
  }

   /**
   * Remaining cycles
   * @return cyclesRemaining
  **/
  public Integer getCyclesRemaining() {
    return cyclesRemaining;
  }

  public void setCyclesRemaining(Integer cyclesRemaining) {
    this.cyclesRemaining = cyclesRemaining;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CycleExecutions cycleExecutions = (CycleExecutions) o;
    return Objects.equals(this.sequence, cycleExecutions.sequence) &&
        Objects.equals(this.tenureType, cycleExecutions.tenureType) &&
        Objects.equals(this.totalCycles, cycleExecutions.totalCycles) &&
        Objects.equals(this.cyclesCompleted, cycleExecutions.cyclesCompleted) &&
        Objects.equals(this.cyclesRemaining, cycleExecutions.cyclesRemaining);
  }

  @Override
  public int hashCode() {
    return Objects.hash(sequence, tenureType, totalCycles, cyclesCompleted, cyclesRemaining);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CycleExecutions {\n");
    sb.append("    sequence: ").append(toIndentedString(sequence)).append("\n");
    sb.append("    tenureType: ").append(toIndentedString(tenureType)).append("\n");
    sb.append("    totalCycles: ").append(toIndentedString(totalCycles)).append("\n");
    sb.append("    cyclesCompleted: ").append(toIndentedString(cyclesCompleted)).append("\n");
    sb.append("    cyclesRemaining: ").append(toIndentedString(cyclesRemaining)).append("\n");
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

