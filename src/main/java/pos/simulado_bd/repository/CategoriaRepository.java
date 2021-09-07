package pos.simulado_bd.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import pos.simulado_bd.model.Categoria;

public interface CategoriaRepository extends JpaRepository<Categoria,Long> {
}
