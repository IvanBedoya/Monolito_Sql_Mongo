package monolito.example.crud.Controller;

import monolito.example.crud.Servicio.PersonaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/personas/persona")
@CrossOrigin(origins = {"*"})
public class PersonaController {
    @Autowired
    PersonaService personaService;
    @GetMapping("obtener_todos")
    public ResponseEntity<?> obtenerPersonas(){

        return ResponseEntity.ok(this.personaService.mostrarPersonas());
    }
}
