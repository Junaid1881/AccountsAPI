package ibm.ob.api.services.impl;
 
import java.util.*;
 
import ibm.ob.api.model.GetTransactionDetailP;
import ibm.ob.api.model.GetTransactionDetailResponseWrapper;
import ibm.ob.api.services.GetTransactionDetailI;
 
import org.springframework.stereotype.Service;
import org.apache.commons.logging.LogFactory;
import org.apache.commons.logging.Log;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixProperty;

 
@Service
public class GetTransactionDetailImpl implements GetTransactionDetailI {
 
    private static final Log logger = LogFactory.getLog(GetTransactionDetailImpl.class);
   
    public GetTransactionDetailResponseWrapper reliable(GetTransactionDetailP pojo, Throwable exception){ 
        //TODO
        logger.info("Reliable method triggered with exception : "+exception.getMessage());
        return new GetTransactionDetailResponseWrapper();
	}

	@Override
    @HystrixCommand(fallbackMethod = "reliable" , commandProperties = {
		@HystrixProperty(name = "execution.isolation.thread.timeoutInMilliseconds", value = "10000")})
	public GetTransactionDetailResponseWrapper execute(GetTransactionDetailP requestParams){
        //TODO
        return new GetTransactionDetailResponseWrapper();
    }

              
    public <T> T error(int statusCode, Class<T> type,Exception exception) throws InstantiationException, IllegalAccessException {
        //TODO to write error response //NOSONAR
        return type.newInstance();
    }
              
  }
