package monolito.example.crud.Servicio;

import monolito.example.crud.DTO.PersonasDTO;
import monolito.example.crud.Mapper.PersonaMapper;
import monolito.example.crud.Modelo.Persona;
import monolito.example.crud.Repository.PersonaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PersonaServiceImplementation implements  PersonaService{
    @Autowired
    PersonaRepository personaRepository;
    @Autowired
    PersonaMapper personaMapper;
    @Override
    public List<PersonasDTO> mostrarPersonas(){
        List<Persona> personas = this.personaRepository.findAll();
        return this.personaMapper.personaDTOs(personas);
    }
}

