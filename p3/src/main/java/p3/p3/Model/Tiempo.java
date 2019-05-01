package p3.p3.Model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.util.List;

@Entity
public class Tiempo {
    @Id
    @GeneratedValue
    private Long id;
    private int dia;
    private String nomMes;
    private int numMes;
    private int anyo;
    private Integer importe;

    public Tiempo (){

    }

    public Tiempo(int dia, String nomMes, int numMes, int anyo, Integer importe) {
        this.dia = dia;
        this.nomMes = nomMes;
        this.numMes = numMes;
        this.anyo = anyo;
        this.importe = importe;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public int getDia() {
        return dia;
    }

    public void setDia(int dia) {
        this.dia = dia;
    }

    public String getNomMes() {
        return nomMes;
    }

    public void setNomMes(String nomMes) {
        this.nomMes = nomMes;
    }

    public int getNumMes() {
        return numMes;
    }

    public void setNumMes(int numMes) {
        this.numMes = numMes;
    }

    public int getAnyo() {
        return anyo;
    }

    public void setAnyo(int anyo) {
        this.anyo = anyo;
    }

    public Integer getImporte() {
        return importe;
    }

    public void setImporte(Integer importe) {
        this.importe = importe;
    }

    public boolean contenido(List<Tiempo> tiempos){
        boolean contiene = false;
        for(Tiempo t: tiempos){
            if((t.getDia()==this.getDia())&&t.getNomMes().equals(this.nomMes)&&(t.getAnyo()==this.getAnyo())){
                contiene=true;
                t.setImporte(t.getImporte()+this.importe);
            }
        }
        return contiene;
    }
}
