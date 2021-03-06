package p3.p3.model;

import javax.persistence.*;
import java.util.List;

@Entity
public class Lugar {
    @Id
    @GeneratedValue
    private Long id;
    private String capital;
    private String pais;
    private Integer habitantes;
    private int importeTotal;

    public Lugar() {

    }

    public Lugar(String capital, String pais, Integer habitantes,int importeTotal) {
        this.capital = capital;
        this.pais = pais;
        this.habitantes = habitantes;
        this.importeTotal=importeTotal;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCapital() {
        return capital;
    }

    public void setCapital(String capital) {
        this.capital = capital;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public Integer getHabitantes() {
        return habitantes;
    }

    public void setHabitantes(Integer habitantes) {
        this.habitantes = habitantes;
    }

    public int getImporteTotal() {
        return importeTotal;
    }

    public void setImporteTotal(int importeTotal) {
        this.importeTotal = importeTotal;
    }

    public boolean contenido(List<Lugar> lugares) {
        boolean contiene = false;
        for (Lugar l : lugares) {
            if (l.getCapital().equals(this.getCapital())) {
                if (l.getPais() == null && this.getPais() != null) {
                    l.setPais(this.getPais());
                }
                if (l.getHabitantes() == null && this.getHabitantes() != null) {
                    l.setHabitantes(this.habitantes);
                }
                contiene = true;
                l.setImporteTotal(l.getImporteTotal()+this.getImporteTotal());
            }
        }
        return contiene;
    }
}
