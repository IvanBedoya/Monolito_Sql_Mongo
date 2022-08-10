package monolito.example.crud.Modelo;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
@Table(name = "CIUDADES")

public class Ciudad {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID_CIUDAD", nullable = false, insertable = false)
    private long idCiudad;
    @Column(name = "NOMBRE",nullable = false)
    private String nombre;
}
