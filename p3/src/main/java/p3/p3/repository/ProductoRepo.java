package p3.p3.Repository;

import p3.p3.Model.Producto;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductoRepo extends JpaRepository<Producto,Long> {
    Producto findByNombre(String item);
}
