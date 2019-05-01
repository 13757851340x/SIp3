package p3.p3.Model;

import javax.persistence.*;
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

    public Tiempo (){

    }

    public Tiempo(int dia, int numMes, int anyo) {
        this.dia = dia;
        this.nomMes =this.toNom();
        this.numMes = numMes;
        this.anyo = anyo;
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

    public boolean contenido(List<Tiempo> tiempos){
        boolean contiene = false;
        for(Tiempo t: tiempos){
            if((t.getDia()==this.getDia())&&(t.getNumMes()==this.getNumMes())&&(t.getAnyo()==this.getAnyo())){
                contiene=true;
            }
        }
        return contiene;
    }

    private String toNom(){
        switch (this.numMes) {
            case 1:
                return "enero";
            case 2:
                return "febrero";
            case 3:
                return "marzo";
            case 4:
                return "abril";
            case 5:
                return "mayo";
            case 6:
                return "junio";
            case 7:
                return "julio";
            case 8:
                return "agosto";
            case 9:
                return "septiembre";
            case 10:
                return "octubre";
            case 11:
                return "novbiembre";
            case 12:
                return "diciembre";
        }
        return "error";
    }
}
