package ibm.ob.api.model;

import org.springframework.util.MultiValueMap;

import org.springframework.util.LinkedMultiValueMap;

import org.springframework.http.ResponseEntity;
import ibm.ob.api.model.ResponseBankingTransactionList;


public class GetTransactionsResponseWrapper {

	private ResponseBankingTransactionList response;

        public MultiValueMap<String, String> getHeaders(){
            final MultiValueMap<String, String> map=new LinkedMultiValueMap<String, String>();
            return map;
	}

	public void setHeaders(){
            
	}
 
	public ResponseBankingTransactionList getResponse(){
            return response;
	}
 
	public void setResponse(ResponseBankingTransactionList response){
            this.response=response;
	} 
}
