package birichani_codes.reactivemongo.repositories;

import birichani_codes.reactivemongo.domain.Customer;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;

public interface CustomerRepsoitory extends ReactiveMongoRepository<Customer, String> {
}
