package ibm.ob.api.api;

import ibm.ob.api.model.ResponseBankingTransactionById;
import ibm.ob.api.model.ResponseBankingTransactionList;
import io.swagger.annotations.*;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.context.request.NativeWebRequest;
import org.springframework.web.multipart.MultipartFile;

import javax.validation.Valid;
import javax.validation.constraints.*;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import ibm.ob.api.services.GetTransactionsI;
import ibm.ob.api.model.GetTransactionsP;
import ibm.ob.api.model.GetTransactionsResponseWrapper;
import org.springframework.beans.factory.annotation.Autowired;
import ibm.ob.api.services.ListBalancesSpecificAccountsI;
import ibm.ob.api.model.ListBalancesSpecificAccountsP;
import ibm.ob.api.model.ListBalancesSpecificAccountsResponseWrapper;
import ibm.ob.api.services.GetTransactionDetailI;
import ibm.ob.api.model.GetTransactionDetailP;
import ibm.ob.api.model.GetTransactionDetailResponseWrapper;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2020-10-28T19:39:53.787Z[GMT]")

@RestController
public class BankingApiController implements BankingApi {

	@Autowired
	GetTransactionDetailI getTransactionDetailI;


	@Autowired
	ListBalancesSpecificAccountsI listBalancesSpecificAccountsI;


	@Autowired
	GetTransactionsI getTransactionsI;


    public ResponseEntity<ResponseBankingTransactionById> getTransactionDetail(@ApiParam(value = "ID of the account to get transactions for.  Must have previously been returned by one of the account list end points",required=true) @PathVariable("accountId") String accountId,@ApiParam(value = "ID of the transaction obtained from a previous call to one of the other transaction end points",required=true) @PathVariable("transactionId") String transactionId,@ApiParam(value = "Version of the API end point requested by the client. Must be set to a positive integer. The data holder should respond with the highest supported version between [x-min-v](#request-headers) and [x-v](#request-headers). If the value of [x-min-v](#request-headers) is equal to or higher than the value of [x-v](#request-headers) then the [x-min-v](#request-headers) header should be treated as absent. If all versions requested are not supported then the data holder should respond with a 406 Not Acceptable. See [HTTP Headers](#request-headers)" ,required=true) @RequestHeader(value="x-v", required=true) String xV,@ApiParam(value = "Minimum version of the API end point requested by the client. Must be set to a positive integer if provided. The data holder should respond with the highest supported version between [x-min-v](#request-headers) and [x-v](#request-headers). If all versions requested are not supported then the data holder should respond with a 406 Not Acceptable." ) @RequestHeader(value="x-min-v", required=false) String xMinV,@ApiParam(value = "An [RFC4122](https://tools.ietf.org/html/rfc4122) UID used as a correlation id. If provided, the data holder must play back this value in the x-fapi-interaction-id response header. If not provided a [RFC4122] UUID value is required to be provided in the response header to track the interaction." ) @RequestHeader(value="x-fapi-interaction-id", required=false) String xFapiInteractionId,@ApiParam(value = "The time when the customer last logged in to the data recipient. Required for all resource calls (customer present and unattended). Not to be included for unauthenticated calls." ) @RequestHeader(value="x-fapi-auth-date", required=false) String xFapiAuthDate,@ApiParam(value = "The customer's original IP address if the customer is currently logged in to the data recipient. The presence of this header indicates that the API is being called in a customer present context. Not to be included for unauthenticated calls." ) @RequestHeader(value="x-fapi-customer-ip-address", required=false) String xFapiCustomerIpAddress,@ApiParam(value = "The customer's original standard http headers [Base64](#common-field-types) encoded, including the original User Agent header, if the customer is currently logged in to the data recipient. Mandatory for customer present calls.  Not required for unattended or unauthenticated calls." ) @RequestHeader(value="x-cds-User-Agent", required=false) String xCdsUserAgent,@ApiParam(value = "Subject identifier. Locally unique and never reassigned identifier within the Holder for the End-User. Mandatory for authenticated calls. Not required for unattended or unauthenticated calls." ) @RequestHeader(value="x-cds-subject", required=false) String xCdsSubject){
        
        GetTransactionDetailResponseWrapper res  = getTransactionDetailI.execute(new GetTransactionDetailP(accountId, transactionId, xV, xMinV, xFapiInteractionId, xFapiAuthDate, xFapiCustomerIpAddress, xCdsUserAgent, xCdsSubject));

        return new ResponseEntity<>(res.getResponse(),res.getHeaders(), HttpStatus.OK);
    }
    

    public ResponseEntity<ResponseBankingTransactionList> getTransactions(@ApiParam(value = "ID of the account to get transactions for.  Must have previously been returned by one of the account list end points.",required=true) @PathVariable("accountId") String accountId,@ApiParam(value = "Version of the API end point requested by the client. Must be set to a positive integer. The data holder should respond with the highest supported version between [x-min-v](#request-headers) and [x-v](#request-headers). If the value of [x-min-v](#request-headers) is equal to or higher than the value of [x-v](#request-headers) then the [x-min-v](#request-headers) header should be treated as absent. If all versions requested are not supported then the data holder should respond with a 406 Not Acceptable. See [HTTP Headers](#request-headers)" ,required=true) @RequestHeader(value="x-v", required=true) String xV,@ApiParam(value = "Constrain the transaction history request to transactions with effective time at or after this date/time. If absent defaults to newest-time minus 90 days.  Format is aligned to DateTimeString common type") @Valid @RequestParam(value = "oldest-time", required = false) String oldestTime,@ApiParam(value = "Constrain the transaction history request to transactions with effective time at or before this date/time.  If absent defaults to today.  Format is aligned to DateTimeString common type") @Valid @RequestParam(value = "newest-time", required = false) String newestTime,@ApiParam(value = "Filter transactions to only transactions with amounts higher or equal to than this amount") @Valid @RequestParam(value = "min-amount", required = false) String minAmount,@ApiParam(value = "Filter transactions to only transactions with amounts less than or equal to than this amount") @Valid @RequestParam(value = "max-amount", required = false) String maxAmount,@ApiParam(value = "Filter transactions to only transactions where this string value is found as a substring of either the reference or description fields. Format is arbitrary ASCII string. This parameter is optionally implemented by data holders. If it is not implemented then a response should be provided as normal without text filtering applied and an additional boolean field named isQueryParamUnsupported should be included in the meta object and set to true (whether the text parameter is supplied or not)") @Valid @RequestParam(value = "text", required = false) String text,@ApiParam(value = "Page of results to request (standard pagination)", defaultValue = "1") @Valid @RequestParam(value = "page", required = false, defaultValue="1") Integer page,@ApiParam(value = "Page size to request. Default is 25 (standard pagination)", defaultValue = "25") @Valid @RequestParam(value = "page-size", required = false, defaultValue="25") Integer pageSize,@ApiParam(value = "Minimum version of the API end point requested by the client. Must be set to a positive integer if provided. The data holder should respond with the highest supported version between [x-min-v](#request-headers) and [x-v](#request-headers). If all versions requested are not supported then the data holder should respond with a 406 Not Acceptable." ) @RequestHeader(value="x-min-v", required=false) String xMinV,@ApiParam(value = "An [RFC4122](https://tools.ietf.org/html/rfc4122) UID used as a correlation id. If provided, the data holder must play back this value in the x-fapi-interaction-id response header. If not provided a [RFC4122] UUID value is required to be provided in the response header to track the interaction." ) @RequestHeader(value="x-fapi-interaction-id", required=false) String xFapiInteractionId,@ApiParam(value = "The time when the customer last logged in to the data recipient. Required for all resource calls (customer present and unattended). Not to be included for unauthenticated calls." ) @RequestHeader(value="x-fapi-auth-date", required=false) String xFapiAuthDate,@ApiParam(value = "The customer's original IP address if the customer is currently logged in to the data recipient. The presence of this header indicates that the API is being called in a customer present context. Not to be included for unauthenticated calls." ) @RequestHeader(value="x-fapi-customer-ip-address", required=false) String xFapiCustomerIpAddress,@ApiParam(value = "The customer's original standard http headers [Base64](#common-field-types) encoded, including the original User Agent header, if the customer is currently logged in to the data recipient. Mandatory for customer present calls.  Not required for unattended or unauthenticated calls." ) @RequestHeader(value="x-cds-User-Agent", required=false) String xCdsUserAgent,@ApiParam(value = "Subject identifier. Locally unique and never reassigned identifier within the Holder for the End-User. Mandatory for authenticated calls. Not required for unattended or unauthenticated calls." ) @RequestHeader(value="x-cds-subject", required=false) String xCdsSubject){
        
        GetTransactionsResponseWrapper res  = getTransactionsI.execute(new GetTransactionsP(accountId, xV, oldestTime, newestTime, minAmount, maxAmount, text, page, pageSize, xMinV, xFapiInteractionId, xFapiAuthDate, xFapiCustomerIpAddress, xCdsUserAgent, xCdsSubject));

        return new ResponseEntity<>(res.getResponse(),res.getHeaders(), HttpStatus.OK);
    }
    

    public ResponseEntity<ResponseBankingTransactionById> listBalancesSpecificAccounts(@ApiParam(value = "Version of the API end point requested by the client. Must be set to a positive integer. The data holder should respond with the highest supported version between [x-min-v](#request-headers) and [x-v](#request-headers). If the value of [x-min-v](#request-headers) is equal to or higher than the value of [x-v](#request-headers) then the [x-min-v](#request-headers) header should be treated as absent. If all versions requested are not supported then the data holder should respond with a 406 Not Acceptable. See [HTTP Headers](#request-headers)" ,required=true) @RequestHeader(value="x-v", required=true) String xV,@ApiParam(value = "The list of account IDs to obtain balances for" ,required=true )  @Valid @RequestBody ResponseBankingTransactionById accountIds,@ApiParam(value = "Page of results to request (standard pagination)", defaultValue = "1") @Valid @RequestParam(value = "page", required = false, defaultValue="1") Integer page,@ApiParam(value = "Page size to request. Default is 25 (standard pagination)", defaultValue = "25") @Valid @RequestParam(value = "page-size", required = false, defaultValue="25") Integer pageSize,@ApiParam(value = "Minimum version of the API end point requested by the client. Must be set to a positive integer if provided. The data holder should respond with the highest supported version between [x-min-v](#request-headers) and [x-v](#request-headers). If all versions requested are not supported then the data holder should respond with a 406 Not Acceptable." ) @RequestHeader(value="x-min-v", required=false) String xMinV,@ApiParam(value = "An [RFC4122](https://tools.ietf.org/html/rfc4122) UID used as a correlation id. If provided, the data holder must play back this value in the x-fapi-interaction-id response header. If not provided a [RFC4122] UUID value is required to be provided in the response header to track the interaction." ) @RequestHeader(value="x-fapi-interaction-id", required=false) String xFapiInteractionId,@ApiParam(value = "The time when the customer last logged in to the data recipient. Required for all resource calls (customer present and unattended). Not to be included for unauthenticated calls." ) @RequestHeader(value="x-fapi-auth-date", required=false) String xFapiAuthDate,@ApiParam(value = "The customer's original IP address if the customer is currently logged in to the data recipient. The presence of this header indicates that the API is being called in a customer present context. Not to be included for unauthenticated calls." ) @RequestHeader(value="x-fapi-customer-ip-address", required=false) String xFapiCustomerIpAddress,@ApiParam(value = "The customer's original standard http headers [Base64](#common-field-types) encoded, including the original User Agent header, if the customer is currently logged in to the data recipient. Mandatory for customer present calls.  Not required for unattended or unauthenticated calls." ) @RequestHeader(value="x-cds-User-Agent", required=false) String xCdsUserAgent,@ApiParam(value = "Subject identifier. Locally unique and never reassigned identifier within the Holder for the End-User. Mandatory for authenticated calls. Not required for unattended or unauthenticated calls." ) @RequestHeader(value="x-cds-subject", required=false) String xCdsSubject){
        
        ListBalancesSpecificAccountsResponseWrapper res  = listBalancesSpecificAccountsI.execute(new ListBalancesSpecificAccountsP(xV, accountIds, page, pageSize, xMinV, xFapiInteractionId, xFapiAuthDate, xFapiCustomerIpAddress, xCdsUserAgent, xCdsSubject));

        return new ResponseEntity<>(res.getResponse(),res.getHeaders(), HttpStatus.OK);
    }
    

}
