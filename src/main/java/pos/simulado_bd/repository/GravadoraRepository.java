package pos.simulado_bd.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import pos.simulado_bd.model.Gravadora;

public interface GravadoraRepository extends JpaRepository<Gravadora,Long> {
}
