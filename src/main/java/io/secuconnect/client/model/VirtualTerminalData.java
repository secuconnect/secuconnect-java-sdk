package io.secuconnect.client.model;

import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * VirtualTerminalData
 */
public class VirtualTerminalData {
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

  public VirtualTerminalData store(Object store) {
    this.store = store;
    return this;
  }

   /**
   * Store
   * @return store
  **/
  @ApiModelProperty(value = "Store")
  public Object getStore() {
    return store;
  }

  public void setStore(Object store) {
    this.store = store;
  }

  public VirtualTerminalData tid(String tid) {
    this.tid = tid;
    return this;
  }

   /**
   * Terminal id
   * @return tid
  **/
  @ApiModelProperty(value = "Terminal id")
  public String getTid() {
    return tid;
  }

  public void setTid(String tid) {
    this.tid = tid;
  }

  public VirtualTerminalData actions(List<String> actions) {
    this.actions = actions;
    return this;
  }

  public VirtualTerminalData addActionsItem(String actionsItem) {
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
  @ApiModelProperty(value = "Actions")
  public List<String> getActions() {
    return actions;
  }

  public void setActions(List<String> actions) {
    this.actions = actions;
  }

  public VirtualTerminalData giftTerminal(Integer giftTerminal) {
    this.giftTerminal = giftTerminal;
    return this;
  }

   /**
   * Gift terminal
   * @return giftTerminal
  **/
  @ApiModelProperty(value = "Gift terminal")
  public Integer getGiftTerminal() {
    return giftTerminal;
  }

  public void setGiftTerminal(Integer giftTerminal) {
    this.giftTerminal = giftTerminal;
  }

  public VirtualTerminalData amountSplitEnabled(Integer amountSplitEnabled) {
    this.amountSplitEnabled = amountSplitEnabled;
    return this;
  }

   /**
   * Amount split enabled
   * @return amountSplitEnabled
  **/
  @ApiModelProperty(value = "Amount split enabled")
  public Integer getAmountSplitEnabled() {
    return amountSplitEnabled;
  }

  public void setAmountSplitEnabled(Integer amountSplitEnabled) {
    this.amountSplitEnabled = amountSplitEnabled;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    VirtualTerminalData virtualTerminalData = (VirtualTerminalData) o;
    return Objects.equals(this.store, virtualTerminalData.store) &&
        Objects.equals(this.tid, virtualTerminalData.tid) &&
        Objects.equals(this.actions, virtualTerminalData.actions) &&
        Objects.equals(this.giftTerminal, virtualTerminalData.giftTerminal) &&
        Objects.equals(this.amountSplitEnabled, virtualTerminalData.amountSplitEnabled);
  }

  @Override
  public int hashCode() {
    return Objects.hash(store, tid, actions, giftTerminal, amountSplitEnabled);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class VirtualTerminalData {\n");
    
    sb.append("    store: ").append(toIndentedString(store)).append("\n");
    sb.append("    tid: ").append(toIndentedString(tid)).append("\n");
    sb.append("    actions: ").append(toIndentedString(actions)).append("\n");
    sb.append("    giftTerminal: ").append(toIndentedString(giftTerminal)).append("\n");
    sb.append("    amountSplitEnabled: ").append(toIndentedString(amountSplitEnabled)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

