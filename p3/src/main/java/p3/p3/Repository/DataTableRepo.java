package p3.p3.Repository;


import p3.p3.Model.DataTable;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;


public interface DataTableRepo extends JpaRepository<DataTable,Long> {
    List<DataTable> findAll();
}
