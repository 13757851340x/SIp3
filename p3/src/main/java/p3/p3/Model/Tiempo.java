package p3.p3.Model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Tiempo {
    @Id
    @GeneratedValue
    private Long id;
    private int dia;
    private String nomMes;
    private int numMes;
    private int anyo;

    public Tiempo (){

    }
}
