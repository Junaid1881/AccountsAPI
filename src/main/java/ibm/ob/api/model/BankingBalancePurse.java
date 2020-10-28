package ibm.ob.api.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * BankingBalancePurse
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2020-10-28T19:39:53.787Z[GMT]")

public class BankingBalancePurse   {
  @JsonProperty("amount")
  private String amount;

  @JsonProperty("currency")
  private String currency;

  public BankingBalancePurse amount(String amount) {
    this.amount = amount;
    return this;
  }

  /**
   * The balance available for this additional currency purse
   * @return amount
  */
  @ApiModelProperty(required = true, value = "The balance available for this additional currency purse")
  @NotNull


  public String getAmount() {
    return amount;
  }

  public void setAmount(String amount) {
    this.amount = amount;
  }

  public BankingBalancePurse currency(String currency) {
    this.currency = currency;
    return this;
  }

  /**
   * The currency for the purse
   * @return currency
  */
  @ApiModelProperty(value = "The currency for the purse")


  public String getCurrency() {
    return currency;
  }

  public void setCurrency(String currency) {
    this.currency = currency;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BankingBalancePurse bankingBalancePurse = (BankingBalancePurse) o;
    return Objects.equals(this.amount, bankingBalancePurse.amount) &&
        Objects.equals(this.currency, bankingBalancePurse.currency);
  }

  @Override
  public int hashCode() {
    return Objects.hash(amount, currency);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BankingBalancePurse {\n");
    
    sb.append("    amount: ").append(toIndentedString(amount)).append("\n");
    sb.append("    currency: ").append(toIndentedString(currency)).append("\n");
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

