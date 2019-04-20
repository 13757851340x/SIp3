package p3.p3.Model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import lombok.Data;

@Entity
@Data
public class Cliente {
    @Id
    @GeneratedValue
    private Long id;
    private String nombre;
    private String apellido;
    private String email;
    private String dominio;
    private int dia;
    private String mes;
    private int anyo;

    public Cliente(){

    }

    public Cliente(String nombre, String apellido, String email, String dominio, int dia, String mes, int anyo) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.email = email;
        this.dominio = dominio;
        this.dia = dia;
        this.mes = mes;
        this.anyo = anyo;
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

    public String getDominio() {
        return dominio;
    }

    public void setDominio(String dominio) {
        this.dominio = dominio;
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
}
