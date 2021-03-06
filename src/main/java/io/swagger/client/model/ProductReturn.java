/*
 * hotmart-challenge
 * API Hotmart Challenge
 *
 * OpenAPI spec version: 1.0.0
 * Contact: bismarck@ufmg.br
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package io.swagger.client.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * ProductReturn
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-09-22T11:27:03.523Z")



public class ProductReturn {
  @SerializedName("productCode")
  private Integer productCode = null;

  @SerializedName("product")
  private String product = null;

  @SerializedName("description")
  private String description = null;

  @SerializedName("creationDate")
  private String creationDate = null;

  public ProductReturn productCode(Integer productCode) {
    this.productCode = productCode;
    return this;
  }

   /**
   * id do produto
   * @return productCode
  **/
  @ApiModelProperty(example = "1", value = "id do produto")
  public Integer getProductCode() {
    return productCode;
  }

  public void setProductCode(Integer productCode) {
    this.productCode = productCode;
  }

  public ProductReturn product(String product) {
    this.product = product;
    return this;
  }

   /**
   * Nome do produto
   * @return product
  **/
  @ApiModelProperty(example = "Produto-A1", value = "Nome do produto")
  public String getProduct() {
    return product;
  }

  public void setProduct(String product) {
    this.product = product;
  }

  public ProductReturn description(String description) {
    this.description = description;
    return this;
  }

   /**
   * Descrição do produto
   * @return description
  **/
  @ApiModelProperty(example = "produto de teste A1", value = "Descrição do produto")
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public ProductReturn creationDate(String creationDate) {
    this.creationDate = creationDate;
    return this;
  }

   /**
   * data de criação
   * @return creationDate
  **/
  @ApiModelProperty(example = "16/09/2020", value = "data de criação")
  public String getCreationDate() {
    return creationDate;
  }

  public void setCreationDate(String creationDate) {
    this.creationDate = creationDate;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ProductReturn productReturn = (ProductReturn) o;
    return Objects.equals(this.productCode, productReturn.productCode) &&
        Objects.equals(this.product, productReturn.product) &&
        Objects.equals(this.description, productReturn.description) &&
        Objects.equals(this.creationDate, productReturn.creationDate);
  }

  @Override
  public int hashCode() {
    return Objects.hash(productCode, product, description, creationDate);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ProductReturn {\n");
    
    sb.append("    productCode: ").append(toIndentedString(productCode)).append("\n");
    sb.append("    product: ").append(toIndentedString(product)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    creationDate: ").append(toIndentedString(creationDate)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}

