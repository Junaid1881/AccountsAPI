package ibm.ob.api.model;

import org.springframework.http.ResponseEntity;
import ibm.ob.api.model.ResponseBankingTransactionList;

public class GetTransactionsP {

    private String accountId;
    private String xV;
    private String oldestTime;
    private String newestTime;
    private String minAmount;
    private String maxAmount;
    private String text;
    private Integer page;
    private Integer pageSize;
    private String xMinV;
    private String xFapiInteractionId;
    private String xFapiAuthDate;
    private String xFapiCustomerIpAddress;
    private String xCdsUserAgent;
    private String xCdsSubject;

    public GetTransactionsP() {

    }

    public GetTransactionsP(String accountId,String xV,String oldestTime,String newestTime,String minAmount,String maxAmount,String text,Integer page,Integer pageSize,String xMinV,String xFapiInteractionId,String xFapiAuthDate,String xFapiCustomerIpAddress,String xCdsUserAgent,String xCdsSubject) {
        this.accountId = accountId;
        this.xV = xV;
        this.oldestTime = oldestTime;
        this.newestTime = newestTime;
        this.minAmount = minAmount;
        this.maxAmount = maxAmount;
        this.text = text;
        this.page = page;
        this.pageSize = pageSize;
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
    public String getXV () {
        return xV;
    }

    public void setXV (String xV) {
        this.xV = xV;
    }
    public String getOldestTime () {
        return oldestTime;
    }

    public void setOldestTime (String oldestTime) {
        this.oldestTime = oldestTime;
    }
    public String getNewestTime () {
        return newestTime;
    }

    public void setNewestTime (String newestTime) {
        this.newestTime = newestTime;
    }
    public String getMinAmount () {
        return minAmount;
    }

    public void setMinAmount (String minAmount) {
        this.minAmount = minAmount;
    }
    public String getMaxAmount () {
        return maxAmount;
    }

    public void setMaxAmount (String maxAmount) {
        this.maxAmount = maxAmount;
    }
    public String getText () {
        return text;
    }

    public void setText (String text) {
        this.text = text;
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
