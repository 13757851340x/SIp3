package p3.p3.repository;

import p3.p3.model.Producto;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductoRepo extends JpaRepository<Producto,Long> {
    Producto findByNombre(String item);
}
