package com.secuconnect.client.model;

import com.google.gson.annotations.SerializedName;
import com.secuconnect.client.model.SmartTemplatesElementModel;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * SmartTemplatesComponentModel
 */
public class SmartTemplatesComponentModel {
  @SerializedName("order")
  private Integer order = null;

  @SerializedName("name")
  private String name = null;

  @SerializedName("config")
  private Object config = null;

  @SerializedName("condition")
  private Object condition = null;

  @SerializedName("elements")
  private List<SmartTemplatesElementModel> elements = null;

  public SmartTemplatesComponentModel order(Integer order) {
    this.order = order;
    return this;
  }

   /**
   * The order in which the pages are getting parsed for matching conditions, the first matching will be taken
   * @return order
  **/
  public Integer getOrder() {
    return order;
  }

  public void setOrder(Integer order) {
    this.order = order;
  }

  public SmartTemplatesComponentModel name(String name) {
    this.name = name;
    return this;
  }

   /**
   * The name of component item
   * @return name
  **/
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public SmartTemplatesComponentModel config(Object config) {
    this.config = config;
    return this;
  }

   /**
   * The component configuration
   * @return config
  **/
  public Object getConfig() {
    return config;
  }

  public void setConfig(Object config) {
    this.config = config;
  }

  public SmartTemplatesComponentModel condition(Object condition) {
    this.condition = condition;
    return this;
  }

   /**
   * The component conditions to determine when this component should be shown
   * @return condition
  **/
  public Object getCondition() {
    return condition;
  }

  public void setCondition(Object condition) {
    this.condition = condition;
  }

  public SmartTemplatesComponentModel elements(List<SmartTemplatesElementModel> elements) {
    this.elements = elements;
    return this;
  }

  public SmartTemplatesComponentModel addElementsItem(SmartTemplatesElementModel elementsItem) {
    if (this.elements == null) {
      this.elements = new ArrayList<>();
    }
    this.elements.add(elementsItem);
    return this;
  }

   /**
   * The elements inside the page component
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
    SmartTemplatesComponentModel smartTemplatesComponentModel = (SmartTemplatesComponentModel) o;
    return Objects.equals(this.order, smartTemplatesComponentModel.order) &&
        Objects.equals(this.name, smartTemplatesComponentModel.name) &&
        Objects.equals(this.config, smartTemplatesComponentModel.config) &&
        Objects.equals(this.condition, smartTemplatesComponentModel.condition) &&
        Objects.equals(this.elements, smartTemplatesComponentModel.elements);
  }

  @Override
  public int hashCode() {
    return Objects.hash(order, name, config, condition, elements);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SmartTemplatesComponentModel {\n");
    sb.append("    order: ").append(toIndentedString(order)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
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

