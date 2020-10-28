package ibm.ob.api.model;

import org.springframework.util.MultiValueMap;

import org.springframework.util.LinkedMultiValueMap;

import org.springframework.http.ResponseEntity;
import ibm.ob.api.model.ResponseBankingTransactionById;


public class GetTransactionDetailResponseWrapper {

	private ResponseBankingTransactionById response;

        public MultiValueMap<String, String> getHeaders(){
            final MultiValueMap<String, String> map=new LinkedMultiValueMap<String, String>();
            return map;
	}

	public void setHeaders(){
            
	}
 
	public ResponseBankingTransactionById getResponse(){
            return response;
	}
 
	public void setResponse(ResponseBankingTransactionById response){
            this.response=response;
	} 
}
