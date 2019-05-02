package p3.p3.repository;

import p3.p3.model.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ClienteRepo extends JpaRepository<Cliente,Long> {
    List<Cliente> findALL();
    Cliente findByNombreAndApellido(String nombre,String apallido);
}
