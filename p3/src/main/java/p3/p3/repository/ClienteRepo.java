package p3.p3.Repository;

import p3.p3.Model.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClienteRepo extends JpaRepository<Cliente,Long> {
    Cliente findByNombreAndApellido(String nombre,String apallido);
}
