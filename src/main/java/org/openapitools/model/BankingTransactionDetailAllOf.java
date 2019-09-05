package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.BankingTransactionDetailExtendedData;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * BankingTransactionDetailAllOf
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2019-09-05T00:54:15.279Z[GMT]")

public class BankingTransactionDetailAllOf   {
  @JsonProperty("extendedData")
  private BankingTransactionDetailExtendedData extendedData;

  public BankingTransactionDetailAllOf extendedData(BankingTransactionDetailExtendedData extendedData) {
    this.extendedData = extendedData;
    return this;
  }

  /**
   * Get extendedData
   * @return extendedData
  */
  @ApiModelProperty(required = true, value = "")
  @NotNull

  @Valid

  public BankingTransactionDetailExtendedData getExtendedData() {
    return extendedData;
  }

  public void setExtendedData(BankingTransactionDetailExtendedData extendedData) {
    this.extendedData = extendedData;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BankingTransactionDetailAllOf bankingTransactionDetailAllOf = (BankingTransactionDetailAllOf) o;
    return Objects.equals(this.extendedData, bankingTransactionDetailAllOf.extendedData);
  }

  @Override
  public int hashCode() {
    return Objects.hash(extendedData);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BankingTransactionDetailAllOf {\n");
    
    sb.append("    extendedData: ").append(toIndentedString(extendedData)).append("\n");
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

