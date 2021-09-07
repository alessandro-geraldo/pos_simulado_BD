package pos.simulado_bd.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import pos.simulado_bd.model.Pessoa;

public interface PessoaRepository extends JpaRepository<Pessoa,Long> {
}
