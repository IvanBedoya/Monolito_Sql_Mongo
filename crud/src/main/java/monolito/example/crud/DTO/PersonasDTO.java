package monolito.example.crud.DTO;

import lombok.Data;


@Data
public class PersonasDTO {
    private long Id;
    private String nombres;
    private String apellidos;
    private String tipoDocumento;
    private long numDocumento;
    private long edad;
    private String Ciudad;
    private long foto;
}
