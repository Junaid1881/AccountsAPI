package ibm.ob.api.services;

import ibm.ob.api.model.GetTransactionsP;
import ibm.ob.api.model.GetTransactionsResponseWrapper;

public interface GetTransactionsI {

    public GetTransactionsResponseWrapper execute(GetTransactionsP requestParams);

    public <T> T error(int statusCode, Class<T> type,Exception exception) throws InstantiationException, IllegalAccessException;

}
