package ibm.ob.api.services;

import ibm.ob.api.model.ListBalancesSpecificAccountsP;
import ibm.ob.api.model.ListBalancesSpecificAccountsResponseWrapper;

public interface ListBalancesSpecificAccountsI {

    public ListBalancesSpecificAccountsResponseWrapper execute(ListBalancesSpecificAccountsP requestParams);

    public <T> T error(int statusCode, Class<T> type,Exception exception) throws InstantiationException, IllegalAccessException;

}
