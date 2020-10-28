package ibm.ob.api.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import ibm.ob.api.model.BankingTransaction;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;

import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * ResponseBankingTransactionListData
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2020-10-28T19:39:53.787Z[GMT]")

public class ResponseBankingTransactionListData   {
  @JsonProperty("transactions")
  @Valid
  private List<BankingTransaction> transactions = new ArrayList<BankingTransaction>();

  public ResponseBankingTransactionListData transactions(List<BankingTransaction> transactions) {
    this.transactions = transactions;
    return this;
  }

  public ResponseBankingTransactionListData addTransactionsItem(BankingTransaction transactionsItem) {
    this.transactions.add(transactionsItem);
    return this;
  }

  /**
   * Get transactions
   * @return transactions
  */
  @ApiModelProperty(required = true, value = "")
  @NotNull

  @Valid

  public List<BankingTransaction> getTransactions() {
    return transactions;
  }

  public void setTransactions(List<BankingTransaction> transactions) {
    this.transactions = transactions;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ResponseBankingTransactionListData responseBankingTransactionListData = (ResponseBankingTransactionListData) o;
    return Objects.equals(this.transactions, responseBankingTransactionListData.transactions);
  }

  @Override
  public int hashCode() {
    return Objects.hash(transactions);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ResponseBankingTransactionListData {\n");
    
    sb.append("    transactions: ").append(toIndentedString(transactions)).append("\n");
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

