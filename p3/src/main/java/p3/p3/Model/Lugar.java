package p3.p3.Model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Lugar {
    @Id
    @GeneratedValue
    private Long id;
    private String capital;
    private String pais;
    private int habitantes;

    public Lugar(){

    }
}
