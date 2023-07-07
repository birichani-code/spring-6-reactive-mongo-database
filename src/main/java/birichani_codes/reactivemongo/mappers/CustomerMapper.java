package birichani_codes.reactivemongo.mappers;

import birichani_codes.reactivemongo.domain.Customer;
import birichani_codes.reactivemongo.model.CustomerDTO;
import org.mapstruct.Mapper;
@Mapper
public interface CustomerMapper {

    CustomerDTO customerToCustomerDto(Customer customer);

    Customer customerDtoToCustomer(CustomerDTO customerDTO);
}
