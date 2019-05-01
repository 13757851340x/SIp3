package p3.p3.Repository;


import p3.p3.Model.Compra;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;


public interface CompraRepo extends JpaRepository<Compra,Long> {
    List<Compra> findAll();
}
