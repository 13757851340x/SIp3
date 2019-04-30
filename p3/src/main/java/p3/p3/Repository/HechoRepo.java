package p3.p3.Repository;


import p3.p3.Model.Cliente;
import p3.p3.Model.Hecho;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;


public interface HechoRepo extends JpaRepository<Hecho,Long> {
    List<Hecho> findAllByOrderByNombre();
}
