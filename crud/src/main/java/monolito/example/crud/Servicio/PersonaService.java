package monolito.example.crud.Servicio;

import monolito.example.crud.DTO.PersonasDTO;

import java.util.List;

public interface PersonaService {
    List<PersonasDTO> mostrarPersonas();
}
