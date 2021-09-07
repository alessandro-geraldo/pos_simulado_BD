package pos.simulado_bd.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import pos.simulado_bd.model.Fone;

public interface FoneRepository extends JpaRepository<Fone,Long> {
}
