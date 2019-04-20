package p3.p3.Model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Producto {
    @Id
    @GeneratedValue
    private Long id;
    private String nombre;
    private String descripcion;

    public Producto (){

    }
}
