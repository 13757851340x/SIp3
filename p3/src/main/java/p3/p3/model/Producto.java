package p3.p3.model;

import javax.persistence.*;
import java.util.List;

@Entity
public class Producto {
    @Id
    @GeneratedValue
    private Long id;
    private String nombre;
    private String descripcion;
    private Integer importe;
    private int importeTotal;

    public Producto (){

    }

    public Producto (String nombre, String descripcion, Integer importe,int importeTotal){
        this.nombre=nombre;
        this.descripcion=descripcion;
        this.importe=importe;
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

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Integer getImporte() {
        return importe;
    }

    public void setImporte(Integer importe) {
        this.importe = importe;
    }

    public int getImporteTotal() {
        return importeTotal;
    }

    public void setImporteTotal(int importeTotal) {
        this.importeTotal = importeTotal;
    }

    public boolean contenido (List<Producto> productos){
        boolean contiene=false;
        for(Producto p:productos){
            if(p.getNombre().equals(this.nombre)){
                contiene=true;
                p.setImporteTotal(p.getImporteTotal()+this.getImporteTotal());
            }
        }
        return contiene;
    }
}
