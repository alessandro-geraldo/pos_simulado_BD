package pos.simulado_bd.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import pos.simulado_bd.model.Pessoa;

import java.util.Optional;

public interface PessoaRepository extends JpaRepository<Pessoa,Long> {

    Optional<Pessoa> findByNomePessoa(String nome);
}
