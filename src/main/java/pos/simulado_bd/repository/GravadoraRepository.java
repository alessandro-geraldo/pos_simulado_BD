package pos.simulado_bd.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import pos.simulado_bd.model.Gravadora;

import java.util.List;

public interface GravadoraRepository extends JpaRepository<Gravadora,Long> {

    @Query(value = "select * from gravadora where pais like ?1",nativeQuery = true)
    List<Gravadora> findByGravadoraPorPais(String pais);
}
