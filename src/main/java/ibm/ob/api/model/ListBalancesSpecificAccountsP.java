package ibm.ob.api.model;

import ibm.ob.api.model.ResponseBankingTransactionById;
import org.springframework.http.ResponseEntity;
import ibm.ob.api.model.ResponseBankingTransactionById;

public class ListBalancesSpecificAccountsP {

    private String xV;
    private ResponseBankingTransactionById accountIds;
    private Integer page;
    private Integer pageSize;
    private String xMinV;
    private String xFapiInteractionId;
    private String xFapiAuthDate;
    private String xFapiCustomerIpAddress;
    private String xCdsUserAgent;
    private String xCdsSubject;

    public ListBalancesSpecificAccountsP() {

    }

    public ListBalancesSpecificAccountsP(String xV,ResponseBankingTransactionById accountIds,Integer page,Integer pageSize,String xMinV,String xFapiInteractionId,String xFapiAuthDate,String xFapiCustomerIpAddress,String xCdsUserAgent,String xCdsSubject) {
        this.xV = xV;
        this.accountIds = accountIds;
        this.page = page;
        this.pageSize = pageSize;
        this.xMinV = xMinV;
        this.xFapiInteractionId = xFapiInteractionId;
        this.xFapiAuthDate = xFapiAuthDate;
        this.xFapiCustomerIpAddress = xFapiCustomerIpAddress;
        this.xCdsUserAgent = xCdsUserAgent;
        this.xCdsSubject = xCdsSubject;
    }

    public String getXV () {
        return xV;
    }

    public void setXV (String xV) {
        this.xV = xV;
    }
    public ResponseBankingTransactionById getAccountIds () {
        return accountIds;
    }

    public void setAccountIds (ResponseBankingTransactionById accountIds) {
        this.accountIds = accountIds;
    }
    public Integer getPage () {
        return page;
    }

    public void setPage (Integer page) {
        this.page = page;
    }
    public Integer getPageSize () {
        return pageSize;
    }

    public void setPageSize (Integer pageSize) {
        this.pageSize = pageSize;
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
