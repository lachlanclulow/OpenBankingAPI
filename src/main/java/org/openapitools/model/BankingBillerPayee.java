package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * BankingBillerPayee
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2019-09-05T00:54:15.279Z[GMT]")

public class BankingBillerPayee   {
  @JsonProperty("billerCode")
  private String billerCode;

  @JsonProperty("crn")
  private String crn;

  @JsonProperty("billerName")
  private String billerName;

  public BankingBillerPayee billerCode(String billerCode) {
    this.billerCode = billerCode;
    return this;
  }

  /**
   * BPAY Biller Code of the Biller
   * @return billerCode
  */
  @ApiModelProperty(required = true, value = "BPAY Biller Code of the Biller")
  @NotNull


  public String getBillerCode() {
    return billerCode;
  }

  public void setBillerCode(String billerCode) {
    this.billerCode = billerCode;
  }

  public BankingBillerPayee crn(String crn) {
    this.crn = crn;
    return this;
  }

  /**
   * BPAY CRN of the Biller. If the contents of the CRN match the format of a Credit Card PAN then it should be masked using the rules applicable for the MaskedPANString common type
   * @return crn
  */
  @ApiModelProperty(value = "BPAY CRN of the Biller. If the contents of the CRN match the format of a Credit Card PAN then it should be masked using the rules applicable for the MaskedPANString common type")


  public String getCrn() {
    return crn;
  }

  public void setCrn(String crn) {
    this.crn = crn;
  }

  public BankingBillerPayee billerName(String billerName) {
    this.billerName = billerName;
    return this;
  }

  /**
   * Name of the Biller
   * @return billerName
  */
  @ApiModelProperty(required = true, value = "Name of the Biller")
  @NotNull


  public String getBillerName() {
    return billerName;
  }

  public void setBillerName(String billerName) {
    this.billerName = billerName;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BankingBillerPayee bankingBillerPayee = (BankingBillerPayee) o;
    return Objects.equals(this.billerCode, bankingBillerPayee.billerCode) &&
        Objects.equals(this.crn, bankingBillerPayee.crn) &&
        Objects.equals(this.billerName, bankingBillerPayee.billerName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(billerCode, crn, billerName);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BankingBillerPayee {\n");
    
    sb.append("    billerCode: ").append(toIndentedString(billerCode)).append("\n");
    sb.append("    crn: ").append(toIndentedString(crn)).append("\n");
    sb.append("    billerName: ").append(toIndentedString(billerName)).append("\n");
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

