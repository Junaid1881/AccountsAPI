package ibm.ob.api.exception;

import java.util.HashMap;
import java.util.Map;

import ibm.ob.api.exception.ApiExceptionResponse;
import ibm.ob.api.exception.ErrorStatusCode;
import ibm.ob.api.model.*;

public class MetaData {

	public static final Map<String,Map<ErrorStatusCode, ApiExceptionResponse>> apiExceptions;
	
	static {		
		apiExceptions = new HashMap<String,Map<ErrorStatusCode, ApiExceptionResponse>>();

		Map<ErrorStatusCode, ApiExceptionResponse> responses; 
		try {
		
		
		} catch (Exception e) {			
			e.printStackTrace();
		}
	}
}
