package com.secuconnect.client.model;

import com.google.gson.annotations.SerializedName;
import com.secuconnect.client.model.SmartTemplatesAccordionItemModel;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * SmartTemplatesElementModel
 */
public class SmartTemplatesElementModel {
  @SerializedName("id")
  private Integer id = null;

  @SerializedName("type")
  private String type = null;

  @SerializedName("config")
  private Object config = null;

  @SerializedName("condition")
  private Object condition = null;

  @SerializedName("accordion_elements")
  private List<SmartTemplatesAccordionItemModel> accordionElements = null;

  public SmartTemplatesElementModel id(Integer id) {
    this.id = id;
    return this;
  }

   /**
   * Id of element item of the component
   * @return id
  **/
  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public SmartTemplatesElementModel type(String type) {
    this.type = type;
    return this;
  }

   /**
   * The element type
   * @return type
  **/
  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }

  public SmartTemplatesElementModel config(Object config) {
    this.config = config;
    return this;
  }

   /**
   * The element configuration
   * @return config
  **/
  public Object getConfig() {
    return config;
  }

  public void setConfig(Object config) {
    this.config = config;
  }

  public SmartTemplatesElementModel condition(Object condition) {
    this.condition = condition;
    return this;
  }

   /**
   * The element conditions to determine when this element should be shown
   * @return condition
  **/
  public Object getCondition() {
    return condition;
  }

  public void setCondition(Object condition) {
    this.condition = condition;
  }

  public SmartTemplatesElementModel accordionElements(List<SmartTemplatesAccordionItemModel> accordionElements) {
    this.accordionElements = accordionElements;
    return this;
  }

  public SmartTemplatesElementModel addAccordionElementsItem(SmartTemplatesAccordionItemModel accordionElementsItem) {
    if (this.accordionElements == null) {
      this.accordionElements = new ArrayList<>();
    }
    this.accordionElements.add(accordionElementsItem);
    return this;
  }

   /**
   * The accordion items to be shown in accordion element
   * @return accordionElements
  **/
  public List<SmartTemplatesAccordionItemModel> getAccordionElements() {
    return accordionElements;
  }

  public void setAccordionElements(List<SmartTemplatesAccordionItemModel> accordionElements) {
    this.accordionElements = accordionElements;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SmartTemplatesElementModel smartTemplatesElementModel = (SmartTemplatesElementModel) o;
    return Objects.equals(this.id, smartTemplatesElementModel.id) &&
        Objects.equals(this.type, smartTemplatesElementModel.type) &&
        Objects.equals(this.config, smartTemplatesElementModel.config) &&
        Objects.equals(this.condition, smartTemplatesElementModel.condition) &&
        Objects.equals(this.accordionElements, smartTemplatesElementModel.accordionElements);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, type, config, condition, accordionElements);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SmartTemplatesElementModel {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    config: ").append(toIndentedString(config)).append("\n");
    sb.append("    condition: ").append(toIndentedString(condition)).append("\n");
    sb.append("    accordionElements: ").append(toIndentedString(accordionElements)).append("\n");
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

