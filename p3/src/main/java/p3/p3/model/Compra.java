package p3.p3.Model;

import javax.persistence.*;

@Entity
public class Compra {
    @Id
    @GeneratedValue
    private int id;
    @ManyToOne
    private Lugar lugar;
    @ManyToOne
    private Tiempo tiempo;
    @ManyToOne
    private Cliente cliente;
    @ManyToOne
    private Producto producto;
    private int valoracion;

    public Compra(){

    }

    public Compra(Lugar lugar, Tiempo tiempo, Cliente cliente, Producto producto, int valoracion) {
        this.lugar = lugar;
        this.cliente = cliente;
        this.tiempo=tiempo;
        this.producto = producto;
        this.valoracion = valoracion;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Lugar getLugar() {
        return lugar;
    }

    public void setLugar(Lugar lugar) {
        this.lugar = lugar;
    }

    public Tiempo getTiempo() {
        return tiempo;
    }

    public void setTiempo(Tiempo tiempo) {
        this.tiempo = tiempo;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Producto getProducto() {
        return producto;
    }

    public void setProducto(Producto producto) {
        this.producto = producto;
    }

    public int getValoracion() {
        return valoracion;
    }

    public void setValoracion(int valoracion) {
        this.valoracion = valoracion;
    }
}
