package ibm.ob.api.dao;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;
import ibm.ob.api.model.ResponseBankingTransactionById;

@Repository
public interface ResponseBankingTransactionByIdRepo extends MongoRepository<ResponseBankingTransactionById,String>{

}
