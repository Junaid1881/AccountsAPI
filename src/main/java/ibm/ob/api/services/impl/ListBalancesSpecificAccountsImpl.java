package ibm.ob.api.services.impl;
 
import java.util.*;
 
import ibm.ob.api.model.ListBalancesSpecificAccountsP;
import ibm.ob.api.model.ListBalancesSpecificAccountsResponseWrapper;
import ibm.ob.api.services.ListBalancesSpecificAccountsI;
 
import org.springframework.stereotype.Service;
import org.apache.commons.logging.LogFactory;
import org.apache.commons.logging.Log;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixProperty;

 
@Service
public class ListBalancesSpecificAccountsImpl implements ListBalancesSpecificAccountsI {
 
    private static final Log logger = LogFactory.getLog(ListBalancesSpecificAccountsImpl.class);
   
    public ListBalancesSpecificAccountsResponseWrapper reliable(ListBalancesSpecificAccountsP pojo, Throwable exception){ 
        //TODO
        logger.info("Reliable method triggered with exception : "+exception.getMessage());
        return new ListBalancesSpecificAccountsResponseWrapper();
	}

	@Override
    @HystrixCommand(fallbackMethod = "reliable" , commandProperties = {
		@HystrixProperty(name = "execution.isolation.thread.timeoutInMilliseconds", value = "10000")})
	public ListBalancesSpecificAccountsResponseWrapper execute(ListBalancesSpecificAccountsP requestParams){
        //TODO
        return new ListBalancesSpecificAccountsResponseWrapper();
    }

              
    public <T> T error(int statusCode, Class<T> type,Exception exception) throws InstantiationException, IllegalAccessException {
        //TODO to write error response //NOSONAR
        return type.newInstance();
    }
              
  }
