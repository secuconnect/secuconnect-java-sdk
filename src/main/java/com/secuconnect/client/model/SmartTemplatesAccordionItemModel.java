package com.secuconnect.client.model;

import com.google.gson.annotations.SerializedName;
import com.secuconnect.client.model.SmartTemplatesElementModel;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * SmartTemplatesAccordionItemModel
 */
public class SmartTemplatesAccordionItemModel {
  @SerializedName("id")
  private Integer id = null;

  @SerializedName("type")
  private String type = null;

  @SerializedName("config")
  private Object config = null;

  @SerializedName("condition")
  private Object condition = null;

  @SerializedName("elements")
  private List<SmartTemplatesElementModel> elements = null;

  public SmartTemplatesAccordionItemModel id(Integer id) {
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

  public SmartTemplatesAccordionItemModel type(String type) {
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

  public SmartTemplatesAccordionItemModel config(Object config) {
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

  public SmartTemplatesAccordionItemModel condition(Object condition) {
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

  public SmartTemplatesAccordionItemModel elements(List<SmartTemplatesElementModel> elements) {
    this.elements = elements;
    return this;
  }

  public SmartTemplatesAccordionItemModel addElementsItem(SmartTemplatesElementModel elementsItem) {
    if (this.elements == null) {
      this.elements = new ArrayList<>();
    }
    this.elements.add(elementsItem);
    return this;
  }

   /**
   * The child elements to be shown inside an accordion item
   * @return elements
  **/
  public List<SmartTemplatesElementModel> getElements() {
    return elements;
  }

  public void setElements(List<SmartTemplatesElementModel> elements) {
    this.elements = elements;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SmartTemplatesAccordionItemModel smartTemplatesAccordionItemModel = (SmartTemplatesAccordionItemModel) o;
    return Objects.equals(this.id, smartTemplatesAccordionItemModel.id) &&
        Objects.equals(this.type, smartTemplatesAccordionItemModel.type) &&
        Objects.equals(this.config, smartTemplatesAccordionItemModel.config) &&
        Objects.equals(this.condition, smartTemplatesAccordionItemModel.condition) &&
        Objects.equals(this.elements, smartTemplatesAccordionItemModel.elements);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, type, config, condition, elements);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SmartTemplatesAccordionItemModel {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    config: ").append(toIndentedString(config)).append("\n");
    sb.append("    condition: ").append(toIndentedString(condition)).append("\n");
    sb.append("    elements: ").append(toIndentedString(elements)).append("\n");
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

