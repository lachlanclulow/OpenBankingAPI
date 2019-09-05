package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.CommonPAFAddress;
import org.openapitools.model.CommonPhysicalAddress;
import org.openapitools.model.CommonPhysicalAddressWithPurposeAllOf;
import org.openapitools.model.CommonSimpleAddress;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * CommonPhysicalAddressWithPurpose
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2019-09-05T00:54:15.279Z[GMT]")

public class CommonPhysicalAddressWithPurpose   {
  /**
   * The type of address object present
   */
  public enum AddressUTypeEnum {
    SIMPLE("simple"),
    
    PAF("paf");

    private String value;

    AddressUTypeEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static AddressUTypeEnum fromValue(String value) {
      for (AddressUTypeEnum b : AddressUTypeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  @JsonProperty("addressUType")
  private AddressUTypeEnum addressUType;

  @JsonProperty("simple")
  private CommonSimpleAddress simple;

  @JsonProperty("paf")
  private CommonPAFAddress paf;

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

  public CommonPhysicalAddressWithPurpose addressUType(AddressUTypeEnum addressUType) {
    this.addressUType = addressUType;
    return this;
  }

  /**
   * The type of address object present
   * @return addressUType
  */
  @ApiModelProperty(required = true, value = "The type of address object present")
  @NotNull


  public AddressUTypeEnum getAddressUType() {
    return addressUType;
  }

  public void setAddressUType(AddressUTypeEnum addressUType) {
    this.addressUType = addressUType;
  }

  public CommonPhysicalAddressWithPurpose simple(CommonSimpleAddress simple) {
    this.simple = simple;
    return this;
  }

  /**
   * Get simple
   * @return simple
  */
  @ApiModelProperty(value = "")

  @Valid

  public CommonSimpleAddress getSimple() {
    return simple;
  }

  public void setSimple(CommonSimpleAddress simple) {
    this.simple = simple;
  }

  public CommonPhysicalAddressWithPurpose paf(CommonPAFAddress paf) {
    this.paf = paf;
    return this;
  }

  /**
   * Get paf
   * @return paf
  */
  @ApiModelProperty(value = "")

  @Valid

  public CommonPAFAddress getPaf() {
    return paf;
  }

  public void setPaf(CommonPAFAddress paf) {
    this.paf = paf;
  }

  public CommonPhysicalAddressWithPurpose purpose(PurposeEnum purpose) {
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
    CommonPhysicalAddressWithPurpose commonPhysicalAddressWithPurpose = (CommonPhysicalAddressWithPurpose) o;
    return Objects.equals(this.addressUType, commonPhysicalAddressWithPurpose.addressUType) &&
        Objects.equals(this.simple, commonPhysicalAddressWithPurpose.simple) &&
        Objects.equals(this.paf, commonPhysicalAddressWithPurpose.paf) &&
        Objects.equals(this.purpose, commonPhysicalAddressWithPurpose.purpose);
  }

  @Override
  public int hashCode() {
    return Objects.hash(addressUType, simple, paf, purpose);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CommonPhysicalAddressWithPurpose {\n");
    
    sb.append("    addressUType: ").append(toIndentedString(addressUType)).append("\n");
    sb.append("    simple: ").append(toIndentedString(simple)).append("\n");
    sb.append("    paf: ").append(toIndentedString(paf)).append("\n");
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

