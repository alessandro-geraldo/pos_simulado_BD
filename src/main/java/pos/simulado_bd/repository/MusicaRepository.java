package pos.simulado_bd.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import pos.simulado_bd.model.Musica;

import java.util.List;

public interface MusicaRepository extends JpaRepository<Musica,Long> {

    @Query("select m from Musica m where duracao > 4")
    List<Musica> findByMusicaTempoDuracao(Integer tempo);
}
