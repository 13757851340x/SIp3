package p3.p3.Model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.util.List;

@Entity
public class Producto {
    @Id
    @GeneratedValue
    private Long id;
    private String nombre;
    private String descripcion;
    private int importe;

    public Producto (){

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

    public int getImporte() {
        return importe;
    }

    public void setImporte(int importe) {
        this.importe = importe;
    }

    public Producto (String nombre, String descripcion, int importe){
        this.nombre=nombre;
        this.descripcion=descripcion;
        this.importe=importe;
    }

    public boolean contenido (List<Producto> productos){
        boolean contiene=false;
        for(Producto p:productos){
            if(p.getNombre().equals(this.nombre)){
                contiene=true;
                p.setImporte(p.getImporte()+this.importe);
            }
        }
        return contiene;
    }
}
