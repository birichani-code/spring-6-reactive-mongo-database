package birichani_codes.reactivemongo.mappers;

import birichani_codes.reactivemongo.domain.Beer;
import birichani_codes.reactivemongo.model.BeerDTO;
import org.mapstruct.Mapper;

@Mapper
public interface BeerMapper {

    BeerDTO beerToBeerDto(Beer beer);

    Beer beerDtoToBeer(BeerDTO beerDTO);
}
