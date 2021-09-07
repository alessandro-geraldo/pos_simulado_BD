package pos.simulado_bd.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import pos.simulado_bd.model.Musica;

public interface MusicaRepository extends JpaRepository<Musica,Long> {
}
