package p3.p3.Repository;

import p3.p3.Model.Lugar;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface LugarRepo extends JpaRepository<Lugar,Long> {
    List<Lugar> findAll();
    Lugar findByCapital(String capital);
}
