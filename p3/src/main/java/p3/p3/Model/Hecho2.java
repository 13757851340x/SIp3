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
}