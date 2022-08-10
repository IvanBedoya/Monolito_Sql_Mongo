package monolito.example.crud.Modelo;


import lombok.Data;

import javax.persistence.*;

@Entity
@Data
@Table(name = "DOCUMENTO")
public class Documento {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name= "ID_DOCUMENTO",nullable = false,insertable = false)
    private Long idDocumento;
    @Column(name= "NUMERO",nullable = false)
    private long numero;
    @ManyToOne
    @JoinColumn(name= "ID_TIPO_DOCUMENTO")
    private TipoDocumento idTipoDocumento;

}
