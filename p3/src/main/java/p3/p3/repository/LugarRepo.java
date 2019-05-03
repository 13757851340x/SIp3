package p3.p3.repository;

import p3.p3.model.Lugar;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface LugarRepo extends JpaRepository<Lugar,Long> {
    Lugar findByCapital(String capital);
}
