package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.LinksPaginated;
import org.openapitools.model.MetaPaginated;
import org.openapitools.model.ResponseBankingScheduledPaymentsListData;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * ResponseBankingScheduledPaymentsList
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2019-09-05T00:54:15.279Z[GMT]")

public class ResponseBankingScheduledPaymentsList   {
  @JsonProperty("data")
  private ResponseBankingScheduledPaymentsListData data;

  @JsonProperty("links")
  private LinksPaginated links;

  @JsonProperty("meta")
  private MetaPaginated meta;

  public ResponseBankingScheduledPaymentsList data(ResponseBankingScheduledPaymentsListData data) {
    this.data = data;
    return this;
  }

  /**
   * Get data
   * @return data
  */
  @ApiModelProperty(required = true, value = "")
  @NotNull

  @Valid

  public ResponseBankingScheduledPaymentsListData getData() {
    return data;
  }

  public void setData(ResponseBankingScheduledPaymentsListData data) {
    this.data = data;
  }

  public ResponseBankingScheduledPaymentsList links(LinksPaginated links) {
    this.links = links;
    return this;
  }

  /**
   * Get links
   * @return links
  */
  @ApiModelProperty(required = true, value = "")
  @NotNull

  @Valid

  public LinksPaginated getLinks() {
    return links;
  }

  public void setLinks(LinksPaginated links) {
    this.links = links;
  }

  public ResponseBankingScheduledPaymentsList meta(MetaPaginated meta) {
    this.meta = meta;
    return this;
  }

  /**
   * Get meta
   * @return meta
  */
  @ApiModelProperty(required = true, value = "")
  @NotNull

  @Valid

  public MetaPaginated getMeta() {
    return meta;
  }

  public void setMeta(MetaPaginated meta) {
    this.meta = meta;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ResponseBankingScheduledPaymentsList responseBankingScheduledPaymentsList = (ResponseBankingScheduledPaymentsList) o;
    return Objects.equals(this.data, responseBankingScheduledPaymentsList.data) &&
        Objects.equals(this.links, responseBankingScheduledPaymentsList.links) &&
        Objects.equals(this.meta, responseBankingScheduledPaymentsList.meta);
  }

  @Override
  public int hashCode() {
    return Objects.hash(data, links, meta);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ResponseBankingScheduledPaymentsList {\n");
    
    sb.append("    data: ").append(toIndentedString(data)).append("\n");
    sb.append("    links: ").append(toIndentedString(links)).append("\n");
    sb.append("    meta: ").append(toIndentedString(meta)).append("\n");
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

