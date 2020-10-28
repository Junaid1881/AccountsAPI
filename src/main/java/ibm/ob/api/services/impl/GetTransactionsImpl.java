package ibm.ob.api.services.impl;
 
import java.util.*;
 
import ibm.ob.api.model.GetTransactionsP;
import ibm.ob.api.model.GetTransactionsResponseWrapper;
import ibm.ob.api.services.GetTransactionsI;
 
import org.springframework.stereotype.Service;
import org.apache.commons.logging.LogFactory;
import org.apache.commons.logging.Log;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixProperty;

 
@Service
public class GetTransactionsImpl implements GetTransactionsI {
 
    private static final Log logger = LogFactory.getLog(GetTransactionsImpl.class);
   
    public GetTransactionsResponseWrapper reliable(GetTransactionsP pojo, Throwable exception){ 
        //TODO
        logger.info("Reliable method triggered with exception : "+exception.getMessage());
        return new GetTransactionsResponseWrapper();
	}

	@Override
    @HystrixCommand(fallbackMethod = "reliable" , commandProperties = {
		@HystrixProperty(name = "execution.isolation.thread.timeoutInMilliseconds", value = "10000")})
	public GetTransactionsResponseWrapper execute(GetTransactionsP requestParams){
        //TODO
        return new GetTransactionsResponseWrapper();
    }

              
    public <T> T error(int statusCode, Class<T> type,Exception exception) throws InstantiationException, IllegalAccessException {
        //TODO to write error response //NOSONAR
        return type.newInstance();
    }
              
  }
