package monolito.example.crud.Modelo;


import lombok.Data;

import javax.persistence.*;

@Entity
@Data
@Table(name = "PERSONAS")

public class Persona {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name= "ID_PERSONA",nullable = false,insertable = false)
    private long idPersona;
    @Column(name= "NOMBRES",nullable = false)
    private String nombres;
    @Column(name= "APELLIDOS",nullable = false)
    private String apellidos;
    @ManyToOne
    @JoinColumn(name = "ID_DOCUMENTO")
    private Documento idDocumento;
    @Column(name= "EDAD",nullable = false)
    private long edad;
    @ManyToOne
    @JoinColumn(name = "ID_CIUDAD")
    private Ciudad idCiudad;
    @Column(name= "ID_FOTO",nullable = false)
    private long foto;
}
