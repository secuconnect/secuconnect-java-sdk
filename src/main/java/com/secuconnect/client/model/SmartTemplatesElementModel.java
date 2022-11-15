package com.secuconnect.client.model;

import com.google.gson.annotations.SerializedName;
import com.secuconnect.client.model.SmartTemplatesElementModel;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * SmartTemplatesElementModel
 */
public class SmartTemplatesElementModel {
  @SerializedName("order")
  private Integer order = null;

  @SerializedName("type")
  private String type = null;

  @SerializedName("config")
  private Object config = null;

  @SerializedName("condition")
  private Object condition = null;

  @SerializedName("name")
  private String name = null;

  @SerializedName("property")
  private String property = null;

  @SerializedName("elements")
  private List<SmartTemplatesElementModel> elements = null;

  public SmartTemplatesElementModel order(Integer order) {
    this.order = order;
    return this;
  }

   /**
   * The order in which the elements are getting parsed for matching conditions, the first matching will be taken
   * @return order
  **/
  public Integer getOrder() {
    return order;
  }

  public void setOrder(Integer order) {
    this.order = order;
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

  public SmartTemplatesElementModel name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Name of the element
   * @return name
  **/
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public SmartTemplatesElementModel property(String property) {
    this.property = property;
    return this;
  }

   /**
   * Special property for &#x27;loop&#x27; elements to configure on which data to loop on
   * @return property
  **/
  public String getProperty() {
    return property;
  }

  public void setProperty(String property) {
    this.property = property;
  }

  public SmartTemplatesElementModel elements(List<SmartTemplatesElementModel> elements) {
    this.elements = elements;
    return this;
  }

  public SmartTemplatesElementModel addElementsItem(SmartTemplatesElementModel elementsItem) {
    if (this.elements == null) {
      this.elements = new ArrayList<>();
    }
    this.elements.add(elementsItem);
    return this;
  }

   /**
   * The child elements to be shown inside an the current element
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
    SmartTemplatesElementModel smartTemplatesElementModel = (SmartTemplatesElementModel) o;
    return Objects.equals(this.order, smartTemplatesElementModel.order) &&
        Objects.equals(this.type, smartTemplatesElementModel.type) &&
        Objects.equals(this.config, smartTemplatesElementModel.config) &&
        Objects.equals(this.condition, smartTemplatesElementModel.condition) &&
        Objects.equals(this.name, smartTemplatesElementModel.name) &&
        Objects.equals(this.property, smartTemplatesElementModel.property) &&
        Objects.equals(this.elements, smartTemplatesElementModel.elements);
  }

  @Override
  public int hashCode() {
    return Objects.hash(order, type, config, condition, name, property, elements);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SmartTemplatesElementModel {\n");
    sb.append("    order: ").append(toIndentedString(order)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    config: ").append(toIndentedString(config)).append("\n");
    sb.append("    condition: ").append(toIndentedString(condition)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    property: ").append(toIndentedString(property)).append("\n");
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

