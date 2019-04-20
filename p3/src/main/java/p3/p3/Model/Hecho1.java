package p3.p3.Model;

import javax.persistence.*;

@Entity
@Table(name = "practica_3_ssii_hechos1")
public class Hecho1 {
    @Id
    @GeneratedValue
    private Long id;
    @Column(name = "Nombre")
    private String nombre;
    @Column(name = "Apellido")
    private String apellido;
    @Column(name = "email")
    private String email;
    @Column(name = "day")
    private int dia;
    @Column(name = "month")
    private String mes;
    @Column(name = "year")
    private int anyo;
    @Column(name = "Capital")
    private String capital;
    @Column(name = "item")
    private String item;
    @Column(name = "descripcion")
    private String descripcion;
    @Column(name = "Importe")
    private int importe;
    @Column(name = "valoracion")
    private int valoracion;
    @Column(name = "FechaPedido")
    private String fechaPedido;

    public Hecho1(){

    }

    public Hecho1(String nombre, String apellido, String email, int dia, String mes, int anyo, String capital, String item, String descripcion, int importe, int valoracion, String fechaPedido) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.email = email;
        this.dia = dia;
        this.mes = mes;
        this.anyo = anyo;
        this.capital = capital;
        this.item = item;
        this.descripcion = descripcion;
        this.importe = importe;
        this.valoracion = valoracion;
        this.fechaPedido = fechaPedido;
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

    public String getCapital() {
        return capital;
    }

    public void setCapital(String capital) {
        this.capital = capital;
    }

    public String getItem() {
        return item;
    }

    public void setItem(String item) {
        this.item = item;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public int getImporte() {
        return importe;
    }

    public void setImporte(int importe) {
        this.importe = importe;
    }

    public int getValoracion() {
        return valoracion;
    }

    public void setValoracion(int valoracion) {
        this.valoracion = valoracion;
    }

    public String getFechaPedido() {
        return fechaPedido;
    }

    public void setFechaPedido(String fechaPedido) {
        this.fechaPedido = fechaPedido;
    }
}
