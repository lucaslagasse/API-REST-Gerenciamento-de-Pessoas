package one.digitalinnovation.personapi.mapper;

import one.digitalinnovation.personapi.dto.resquest.PersonDTO;
import one.digitalinnovation.personapi.entity.Person;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

/**
 * Interface que traduz a classe entidade Person em uma classe DTO
 * equivalente e vice-versa.
 */
@Mapper
public interface PersonMapper {

    PersonMapper INSTANCE  = Mappers.getMapper(PersonMapper.class);

    @Mapping(target = "birthDate", source = "birthDate", dateFormat = "dd-MM-yyyy")
    Person toModel(PersonDTO personDTO);

    PersonDTO toDTO(Person person);
}

