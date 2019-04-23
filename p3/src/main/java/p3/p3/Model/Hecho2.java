package p3.p3.Model;

import javax.persistence.*;

@Entity
@Table(name = "practica_3_ssii_hechos2")
public class Hecho2 {
    @Id
    @GeneratedValue
    private Long id;
    @Column(name = "Nombre Completo")
    private String nombre;
    @Column(name = "email")
    private String email;
    @Column(name = "fecha")
    private String fecha;
    @Column(name = "Country")
    private String pais;
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

    public Hecho2(){

    }

    public Hecho2(String nombre, String email, String fecha, String pais, String capital, String item, String descripcion, int importe, int valoracion, String fechaPedido) {
        this.nombre = nombre;
        this.email = email;
        this.fecha = fecha;
        this.pais = pais;
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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
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