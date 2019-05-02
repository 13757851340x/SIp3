package p3.p3.Repository;

import p3.p3.Model.Tiempo;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TiempoRepo extends JpaRepository<Tiempo,Long> {
    Tiempo findByDiaAndNumMesAndAnyo(int d,int m,int y);
}
