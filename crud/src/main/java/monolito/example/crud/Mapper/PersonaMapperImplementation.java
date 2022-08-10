package monolito.example.crud.Mapper;

import monolito.example.crud.DTO.PersonasDTO;
import monolito.example.crud.Modelo.Persona;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class PersonaMapperImplementation implements PersonaMapper {

    @Override
    public PersonasDTO personaObject(Persona persona){
        PersonasDTO personasdto = new PersonasDTO();
        personasdto.setId(persona.getIdPersona());
        personasdto.setNombres(persona.getNombres());
        personasdto.setApellidos(persona.getApellidos());
        personasdto.setTipoDocumento(persona.getIdDocumento().getIdTipoDocumento().getNombre());
        personasdto.setNumDocumento(persona.getIdDocumento().getNumero());
        personasdto.setEdad(persona.getEdad());
        personasdto.setCiudad(persona.getIdCiudad().getNombre());
        return personasdto;
    }
    @Override
    public List<PersonasDTO> personaDTOs(List<Persona> personas){
        if(personas == null){
            return null;
        }
        else{
            List<PersonasDTO> personasNueva = new ArrayList<PersonasDTO>(personas.size());
            for(Persona persona:personas){
                personasNueva.add(personaObject(persona));
            }
            return personasNueva;
        }
    }

}
