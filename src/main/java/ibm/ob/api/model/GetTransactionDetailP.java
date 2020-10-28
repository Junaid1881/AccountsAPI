package ibm.ob.api.model;

import org.springframework.http.ResponseEntity;
import ibm.ob.api.model.ResponseBankingTransactionById;

public class GetTransactionDetailP {

    private String accountId;
    private String transactionId;
    private String xV;
    private String xMinV;
    private String xFapiInteractionId;
    private String xFapiAuthDate;
    private String xFapiCustomerIpAddress;
    private String xCdsUserAgent;
    private String xCdsSubject;

    public GetTransactionDetailP() {

    }

    public GetTransactionDetailP(String accountId,String transactionId,String xV,String xMinV,String xFapiInteractionId,String xFapiAuthDate,String xFapiCustomerIpAddress,String xCdsUserAgent,String xCdsSubject) {
        this.accountId = accountId;
        this.transactionId = transactionId;
        this.xV = xV;
        this.xMinV = xMinV;
        this.xFapiInteractionId = xFapiInteractionId;
        this.xFapiAuthDate = xFapiAuthDate;
        this.xFapiCustomerIpAddress = xFapiCustomerIpAddress;
        this.xCdsUserAgent = xCdsUserAgent;
        this.xCdsSubject = xCdsSubject;
    }

    public String getAccountId () {
        return accountId;
    }

    public void setAccountId (String accountId) {
        this.accountId = accountId;
    }
    public String getTransactionId () {
        return transactionId;
    }

    public void setTransactionId (String transactionId) {
        this.transactionId = transactionId;
    }
    public String getXV () {
        return xV;
    }

    public void setXV (String xV) {
        this.xV = xV;
    }
    public String getXMinV () {
        return xMinV;
    }

    public void setXMinV (String xMinV) {
        this.xMinV = xMinV;
    }
    public String getXFapiInteractionId () {
        return xFapiInteractionId;
    }

    public void setXFapiInteractionId (String xFapiInteractionId) {
        this.xFapiInteractionId = xFapiInteractionId;
    }
    public String getXFapiAuthDate () {
        return xFapiAuthDate;
    }

    public void setXFapiAuthDate (String xFapiAuthDate) {
        this.xFapiAuthDate = xFapiAuthDate;
    }
    public String getXFapiCustomerIpAddress () {
        return xFapiCustomerIpAddress;
    }

    public void setXFapiCustomerIpAddress (String xFapiCustomerIpAddress) {
        this.xFapiCustomerIpAddress = xFapiCustomerIpAddress;
    }
    public String getXCdsUserAgent () {
        return xCdsUserAgent;
    }

    public void setXCdsUserAgent (String xCdsUserAgent) {
        this.xCdsUserAgent = xCdsUserAgent;
    }
    public String getXCdsSubject () {
        return xCdsSubject;
    }

    public void setXCdsSubject (String xCdsSubject) {
        this.xCdsSubject = xCdsSubject;
    }

}
