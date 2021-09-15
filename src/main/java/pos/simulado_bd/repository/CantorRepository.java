package pos.simulado_bd.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import pos.simulado_bd.model.Cantor;

import java.util.Optional;

public interface CantorRepository extends JpaRepository<Cantor,Long> {

    Optional<Cantor> findByNomeCantor(String nome);
}
