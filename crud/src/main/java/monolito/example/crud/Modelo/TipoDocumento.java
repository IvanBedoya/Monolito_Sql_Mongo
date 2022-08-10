package monolito.example.crud.Modelo;


import lombok.Data;

import javax.persistence.*;

@Entity
@Data
@Table(name = "TIPO_DOCUMENTO")

public class TipoDocumento {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name= "ID_TIPO_DOCUMENTO",nullable = false,insertable = false)
    private Long idTipoDocumento;
    @Column(name= "NOMBRE",nullable = false)
    private String nombre;
}
