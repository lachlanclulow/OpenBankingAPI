package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * CommonPhysicalAddressWithPurposeAllOf
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2019-09-05T00:54:15.279Z[GMT]")

public class CommonPhysicalAddressWithPurposeAllOf   {
  /**
   * Enumeration of values indicating the purpose of the physical address
   */
  public enum PurposeEnum {
    REGISTERED("REGISTERED"),
    
    MAIL("MAIL"),
    
    PHYSICAL("PHYSICAL"),
    
    WORK("WORK"),
    
    OTHER("OTHER");

    private String value;

    PurposeEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static PurposeEnum fromValue(String value) {
      for (PurposeEnum b : PurposeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  @JsonProperty("purpose")
  private PurposeEnum purpose;

  public CommonPhysicalAddressWithPurposeAllOf purpose(PurposeEnum purpose) {
    this.purpose = purpose;
    return this;
  }

  /**
   * Enumeration of values indicating the purpose of the physical address
   * @return purpose
  */
  @ApiModelProperty(required = true, value = "Enumeration of values indicating the purpose of the physical address")
  @NotNull


  public PurposeEnum getPurpose() {
    return purpose;
  }

  public void setPurpose(PurposeEnum purpose) {
    this.purpose = purpose;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CommonPhysicalAddressWithPurposeAllOf commonPhysicalAddressWithPurposeAllOf = (CommonPhysicalAddressWithPurposeAllOf) o;
    return Objects.equals(this.purpose, commonPhysicalAddressWithPurposeAllOf.purpose);
  }

  @Override
  public int hashCode() {
    return Objects.hash(purpose);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CommonPhysicalAddressWithPurposeAllOf {\n");
    
    sb.append("    purpose: ").append(toIndentedString(purpose)).append("\n");
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

