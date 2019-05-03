package p3.p3.repository;

import p3.p3.model.Tiempo;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface TiempoRepo extends JpaRepository<Tiempo,Long> {
    Tiempo findByDiaAndNumMesAndAnyo(int d,int m,int y);
}
