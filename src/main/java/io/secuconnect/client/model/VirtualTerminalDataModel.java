package io.secuconnect.client.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.annotations.SerializedName;
import java.util.ArrayList;
import java.util.List;

/**
 * VirtualTerminalDataModel
 */
public class VirtualTerminalDataModel {
  @SerializedName("store")
  private Object store = null;

  @SerializedName("tid")
  private String tid = null;

  @SerializedName("actions")
  private List<String> actions = null;

  @SerializedName("gift_terminal")
  private Integer giftTerminal = null;

  @SerializedName("amount_split_enabled")
  private Integer amountSplitEnabled = null;

  @SerializedName("disabled")
  private Integer disabled = null;

  public VirtualTerminalDataModel store(Object store) {
    this.store = store;
    return this;
  }

   /**
   * Store
   * @return store
  **/
  public Object getStore() {
    return store;
  }

  public void setStore(Object store) {
    this.store = store;
  }

  public VirtualTerminalDataModel tid(String tid) {
    this.tid = tid;
    return this;
  }

   /**
   * Terminal id
   * @return tid
  **/
  public String getTid() {
    return tid;
  }

  public void setTid(String tid) {
    this.tid = tid;
  }

  public VirtualTerminalDataModel actions(List<String> actions) {
    this.actions = actions;
    return this;
  }

  public VirtualTerminalDataModel addActionsItem(String actionsItem) {
    if (this.actions == null) {
      this.actions = new ArrayList<String>();
    }
    this.actions.add(actionsItem);
    return this;
  }

   /**
   * Actions
   * @return actions
  **/
  public List<String> getActions() {
    return actions;
  }

  public void setActions(List<String> actions) {
    this.actions = actions;
  }

  public VirtualTerminalDataModel giftTerminal(Integer giftTerminal) {
    this.giftTerminal = giftTerminal;
    return this;
  }

   /**
   * Gift terminal
   * @return giftTerminal
  **/
  public Integer getGiftTerminal() {
    return giftTerminal;
  }

  public void setGiftTerminal(Integer giftTerminal) {
    this.giftTerminal = giftTerminal;
  }

  public VirtualTerminalDataModel amountSplitEnabled(Integer amountSplitEnabled) {
    this.amountSplitEnabled = amountSplitEnabled;
    return this;
  }

   /**
   * Amount split enabled
   * @return amountSplitEnabled
  **/
  public Integer getAmountSplitEnabled() {
    return amountSplitEnabled;
  }

  public void setAmountSplitEnabled(Integer amountSplitEnabled) {
    this.amountSplitEnabled = amountSplitEnabled;
  }

  public VirtualTerminalDataModel disabled(Integer disabled) {
    this.disabled = disabled;
    return this;
  }

   /**
   * Disabled
   * @return disabled
  **/
  public Integer getDisabled() {
    return disabled;
  }

  public void setDisabled(Integer disabled) {
    this.disabled = disabled;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    VirtualTerminalDataModel virtualTerminalDataModel = (VirtualTerminalDataModel) o;
    return Objects.equals(this.store, virtualTerminalDataModel.store) &&
        Objects.equals(this.tid, virtualTerminalDataModel.tid) &&
        Objects.equals(this.actions, virtualTerminalDataModel.actions) &&
        Objects.equals(this.giftTerminal, virtualTerminalDataModel.giftTerminal) &&
        Objects.equals(this.amountSplitEnabled, virtualTerminalDataModel.amountSplitEnabled) &&
        Objects.equals(this.disabled, virtualTerminalDataModel.disabled);
  }

  @Override
  public int hashCode() {
    return Objects.hash(store, tid, actions, giftTerminal, amountSplitEnabled, disabled);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class VirtualTerminalDataModel {\n");
    
    sb.append("    store: ").append(toIndentedString(store)).append("\n");
    sb.append("    tid: ").append(toIndentedString(tid)).append("\n");
    sb.append("    actions: ").append(toIndentedString(actions)).append("\n");
    sb.append("    giftTerminal: ").append(toIndentedString(giftTerminal)).append("\n");
    sb.append("    amountSplitEnabled: ").append(toIndentedString(amountSplitEnabled)).append("\n");
    sb.append("    disabled: ").append(toIndentedString(disabled)).append("\n");
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

