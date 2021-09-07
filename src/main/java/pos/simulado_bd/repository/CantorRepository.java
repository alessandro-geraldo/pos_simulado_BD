package pos.simulado_bd.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import pos.simulado_bd.model.Cantor;

public interface CantorRepository extends JpaRepository<Cantor,Long> {
}
