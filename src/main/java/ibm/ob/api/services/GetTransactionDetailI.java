package ibm.ob.api.services;

import ibm.ob.api.model.GetTransactionDetailP;
import ibm.ob.api.model.GetTransactionDetailResponseWrapper;

public interface GetTransactionDetailI {

    public GetTransactionDetailResponseWrapper execute(GetTransactionDetailP requestParams);

    public <T> T error(int statusCode, Class<T> type,Exception exception) throws InstantiationException, IllegalAccessException;

}
