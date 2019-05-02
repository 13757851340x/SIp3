package p3.p3.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import p3.p3.Model.Compra;

import java.util.List;

public interface CompraRepo extends JpaRepository<Compra,Integer> {
    List<Compra> findAll();
}