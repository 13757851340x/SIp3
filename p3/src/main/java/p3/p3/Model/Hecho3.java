package p3.p3.Model;

import javax.persistence.*;

@Entity
public class Hecho3 {
    @Id
    @GeneratedValue
    private Long id;
    @Column
    private String nombre;
    @Column
    private String apellido;
    @Column
    private String email;
    @Column
    private int dia;
    @Column
    private String mes;
    @Column
    private int anyo;
    @Column
    private String pais;
    @Column
    private String capital;
    @Column
    private int poblacion;
    @Column
    private String item;
    @Column
    private String descripcion;
    @Column
    private int importe;
    @Column
    private int valoracion;
    @Column
    private String fechaPedido;

    public Hecho3 (){

    }

    public Hecho3(String nombre, String apellido, String email, int dia, String mes, int anyo, String country, String capital, int pop, String item, String descripcion, int importe, int valoracion, String fechaPedido) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.email = email;
        this.dia = dia;
        this.mes = mes;
        this.anyo = anyo;
        this.pais = country;
        this.capital = capital;
        this.poblacion = pop;
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

    public int getPoblacion() {
        return poblacion;
    }

    public void setPoblacion(int poblacion) {
        this.poblacion = poblacion;
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
