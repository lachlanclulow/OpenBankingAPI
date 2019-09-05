package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import org.openapitools.model.BankingProductBundle;
import org.openapitools.model.BankingProductConstraint;
import org.openapitools.model.BankingProductDepositRate;
import org.openapitools.model.BankingProductEligibility;
import org.openapitools.model.BankingProductFeature;
import org.openapitools.model.BankingProductFee;
import org.openapitools.model.BankingProductLendingRate;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * BankingProductDetailAllOf
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2019-09-05T00:54:15.279Z[GMT]")

public class BankingProductDetailAllOf   {
  @JsonProperty("bundles")
  @Valid
  private List<BankingProductBundle> bundles = null;

  @JsonProperty("features")
  @Valid
  private List<BankingProductFeature> features = null;

  @JsonProperty("constraints")
  @Valid
  private List<BankingProductConstraint> constraints = null;

  @JsonProperty("eligibility")
  @Valid
  private List<BankingProductEligibility> eligibility = null;

  @JsonProperty("fees")
  @Valid
  private List<BankingProductFee> fees = null;

  @JsonProperty("depositRates")
  @Valid
  private List<BankingProductDepositRate> depositRates = null;

  @JsonProperty("lendingRates")
  @Valid
  private List<BankingProductLendingRate> lendingRates = null;

  public BankingProductDetailAllOf bundles(List<BankingProductBundle> bundles) {
    this.bundles = bundles;
    return this;
  }

  public BankingProductDetailAllOf addBundlesItem(BankingProductBundle bundlesItem) {
    if (this.bundles == null) {
      this.bundles = new ArrayList<>();
    }
    this.bundles.add(bundlesItem);
    return this;
  }

  /**
   * An array of bundles that this product participates in.  Each bundle is described by free form information but also by a list of product IDs of the other products that are included in the bundle.  It is assumed that the current product is included in the bundle also
   * @return bundles
  */
  @ApiModelProperty(value = "An array of bundles that this product participates in.  Each bundle is described by free form information but also by a list of product IDs of the other products that are included in the bundle.  It is assumed that the current product is included in the bundle also")

  @Valid

  public List<BankingProductBundle> getBundles() {
    return bundles;
  }

  public void setBundles(List<BankingProductBundle> bundles) {
    this.bundles = bundles;
  }

  public BankingProductDetailAllOf features(List<BankingProductFeature> features) {
    this.features = features;
    return this;
  }

  public BankingProductDetailAllOf addFeaturesItem(BankingProductFeature featuresItem) {
    if (this.features == null) {
      this.features = new ArrayList<>();
    }
    this.features.add(featuresItem);
    return this;
  }

  /**
   * Array of features available for the product
   * @return features
  */
  @ApiModelProperty(value = "Array of features available for the product")

  @Valid

  public List<BankingProductFeature> getFeatures() {
    return features;
  }

  public void setFeatures(List<BankingProductFeature> features) {
    this.features = features;
  }

  public BankingProductDetailAllOf constraints(List<BankingProductConstraint> constraints) {
    this.constraints = constraints;
    return this;
  }

  public BankingProductDetailAllOf addConstraintsItem(BankingProductConstraint constraintsItem) {
    if (this.constraints == null) {
      this.constraints = new ArrayList<>();
    }
    this.constraints.add(constraintsItem);
    return this;
  }

  /**
   * Constraints on the application for or operation of the product such as minimum balances or limit thresholds
   * @return constraints
  */
  @ApiModelProperty(value = "Constraints on the application for or operation of the product such as minimum balances or limit thresholds")

  @Valid

  public List<BankingProductConstraint> getConstraints() {
    return constraints;
  }

  public void setConstraints(List<BankingProductConstraint> constraints) {
    this.constraints = constraints;
  }

  public BankingProductDetailAllOf eligibility(List<BankingProductEligibility> eligibility) {
    this.eligibility = eligibility;
    return this;
  }

  public BankingProductDetailAllOf addEligibilityItem(BankingProductEligibility eligibilityItem) {
    if (this.eligibility == null) {
      this.eligibility = new ArrayList<>();
    }
    this.eligibility.add(eligibilityItem);
    return this;
  }

  /**
   * Eligibility criteria for the product
   * @return eligibility
  */
  @ApiModelProperty(value = "Eligibility criteria for the product")

  @Valid

  public List<BankingProductEligibility> getEligibility() {
    return eligibility;
  }

  public void setEligibility(List<BankingProductEligibility> eligibility) {
    this.eligibility = eligibility;
  }

  public BankingProductDetailAllOf fees(List<BankingProductFee> fees) {
    this.fees = fees;
    return this;
  }

  public BankingProductDetailAllOf addFeesItem(BankingProductFee feesItem) {
    if (this.fees == null) {
      this.fees = new ArrayList<>();
    }
    this.fees.add(feesItem);
    return this;
  }

  /**
   * Fees applicable for the product
   * @return fees
  */
  @ApiModelProperty(value = "Fees applicable for the product")

  @Valid

  public List<BankingProductFee> getFees() {
    return fees;
  }

  public void setFees(List<BankingProductFee> fees) {
    this.fees = fees;
  }

  public BankingProductDetailAllOf depositRates(List<BankingProductDepositRate> depositRates) {
    this.depositRates = depositRates;
    return this;
  }

  public BankingProductDetailAllOf addDepositRatesItem(BankingProductDepositRate depositRatesItem) {
    if (this.depositRates == null) {
      this.depositRates = new ArrayList<>();
    }
    this.depositRates.add(depositRatesItem);
    return this;
  }

  /**
   * Interest rates available for deposits
   * @return depositRates
  */
  @ApiModelProperty(value = "Interest rates available for deposits")

  @Valid

  public List<BankingProductDepositRate> getDepositRates() {
    return depositRates;
  }

  public void setDepositRates(List<BankingProductDepositRate> depositRates) {
    this.depositRates = depositRates;
  }

  public BankingProductDetailAllOf lendingRates(List<BankingProductLendingRate> lendingRates) {
    this.lendingRates = lendingRates;
    return this;
  }

  public BankingProductDetailAllOf addLendingRatesItem(BankingProductLendingRate lendingRatesItem) {
    if (this.lendingRates == null) {
      this.lendingRates = new ArrayList<>();
    }
    this.lendingRates.add(lendingRatesItem);
    return this;
  }

  /**
   * Interest rates charged against lending balances
   * @return lendingRates
  */
  @ApiModelProperty(value = "Interest rates charged against lending balances")

  @Valid

  public List<BankingProductLendingRate> getLendingRates() {
    return lendingRates;
  }

  public void setLendingRates(List<BankingProductLendingRate> lendingRates) {
    this.lendingRates = lendingRates;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BankingProductDetailAllOf bankingProductDetailAllOf = (BankingProductDetailAllOf) o;
    return Objects.equals(this.bundles, bankingProductDetailAllOf.bundles) &&
        Objects.equals(this.features, bankingProductDetailAllOf.features) &&
        Objects.equals(this.constraints, bankingProductDetailAllOf.constraints) &&
        Objects.equals(this.eligibility, bankingProductDetailAllOf.eligibility) &&
        Objects.equals(this.fees, bankingProductDetailAllOf.fees) &&
        Objects.equals(this.depositRates, bankingProductDetailAllOf.depositRates) &&
        Objects.equals(this.lendingRates, bankingProductDetailAllOf.lendingRates);
  }

  @Override
  public int hashCode() {
    return Objects.hash(bundles, features, constraints, eligibility, fees, depositRates, lendingRates);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BankingProductDetailAllOf {\n");
    
    sb.append("    bundles: ").append(toIndentedString(bundles)).append("\n");
    sb.append("    features: ").append(toIndentedString(features)).append("\n");
    sb.append("    constraints: ").append(toIndentedString(constraints)).append("\n");
    sb.append("    eligibility: ").append(toIndentedString(eligibility)).append("\n");
    sb.append("    fees: ").append(toIndentedString(fees)).append("\n");
    sb.append("    depositRates: ").append(toIndentedString(depositRates)).append("\n");
    sb.append("    lendingRates: ").append(toIndentedString(lendingRates)).append("\n");
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

