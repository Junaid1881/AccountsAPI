package ibm.ob.api.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import ibm.ob.api.model.BankingTransactionDetail;
import ibm.ob.api.model.Links;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * ResponseBankingTransactionById
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2020-10-28T19:39:53.787Z[GMT]")

public class ResponseBankingTransactionById   {
  @JsonProperty("data")
  private BankingTransactionDetail data = null;

  @JsonProperty("links")
  private Links links = null;

  @JsonProperty("meta")
  private Object meta = null;

  public ResponseBankingTransactionById data(BankingTransactionDetail data) {
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

  public BankingTransactionDetail getData() {
    return data;
  }

  public void setData(BankingTransactionDetail data) {
    this.data = data;
  }

  public ResponseBankingTransactionById links(Links links) {
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

  public Links getLinks() {
    return links;
  }

  public void setLinks(Links links) {
    this.links = links;
  }

  public ResponseBankingTransactionById meta(Object meta) {
    this.meta = meta;
    return this;
  }

  /**
   * Get meta
   * @return meta
  */
  @ApiModelProperty(value = "")

  @Valid

  public Object getMeta() {
    return meta;
  }

  public void setMeta(Object meta) {
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
    ResponseBankingTransactionById responseBankingTransactionById = (ResponseBankingTransactionById) o;
    return Objects.equals(this.data, responseBankingTransactionById.data) &&
        Objects.equals(this.links, responseBankingTransactionById.links) &&
        Objects.equals(this.meta, responseBankingTransactionById.meta);
  }

  @Override
  public int hashCode() {
    return Objects.hash(data, links, meta);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ResponseBankingTransactionById {\n");
    
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

