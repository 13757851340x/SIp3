package p3.p3.Repository;

import p3.p3.Model.Hecho2;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface Hecho2Repo extends JpaRepository<Hecho2,Long> {
    List<Hecho2> findAllByOrderByNombre();
}
