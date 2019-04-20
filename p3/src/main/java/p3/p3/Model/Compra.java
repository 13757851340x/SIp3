package p3.p3.Model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Compra {
    @Id
    @GeneratedValue
    private Long id;
    private double importe;
    private int valoracion;

    public Compra(){

    }
}
