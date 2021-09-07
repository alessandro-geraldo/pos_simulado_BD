package pos.simulado_bd.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import pos.simulado_bd.model.Gravacao;

public interface GravacaoRepository extends JpaRepository<Gravacao,Long> {
}
