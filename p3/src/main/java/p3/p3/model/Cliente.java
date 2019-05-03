package p3.p3.model;

import javax.persistence.*;
import java.util.List;

@Entity
public class Cliente {
    @Id
    @GeneratedValue
    private Long id;
    private String nombre;
    private String apellido;
    private String email;
    private int dia;
    private String mes;
    private int anyo;
    private int importeTotal;

   public Cliente(){

   }

    public Cliente(String nombre, String apellido, String email, int dia, String mes, int anyo,int importeTotal) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.email = email;
        this.dia = dia;
        this.mes = mes;
        this.anyo = anyo;
        this.importeTotal=importeTotal;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getDia() {
        return dia;
    }

    public void setDia(int dia) {
        this.dia = dia;
    }

    public String getMes() {
        return mes;
    }

    public void setMes(String mes) {
        this.mes = mes;
    }

    public int getAnyo() {
        return anyo;
    }

    public void setAnyo(int anyo) {
        this.anyo = anyo;
    }

    public int getImporteTotal() {
        return importeTotal;
    }

    public void setImporteTotal(int importeTotal) {
        this.importeTotal = importeTotal;
    }

    public boolean contenido(List<Cliente> clientes){
        boolean contiene = false;
        for(Cliente c: clientes){
            if(c.getNombre().equals(this.getNombre())&&c.getApellido().equals(this.getApellido())){
                contiene=true;
                c.setImporteTotal(c.getImporteTotal()+this.getImporteTotal());
            }
        }
        return contiene;
    }
}
