package monolito.example.crud.Mapper;

import monolito.example.crud.DTO.PersonasDTO;
import monolito.example.crud.Modelo.Persona;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public interface PersonaMapper {
    PersonasDTO personaObject(Persona persona);
    List<PersonasDTO> personaDTOs(List<Persona> personas);
}
