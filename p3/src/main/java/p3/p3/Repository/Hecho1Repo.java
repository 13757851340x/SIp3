package p3.p3.Repository;

import p3.p3.Model.Cliente;
import p3.p3.Model.Hecho1;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

public interface Hecho1Repo extends JpaRepository<Hecho1,Long> {
}
