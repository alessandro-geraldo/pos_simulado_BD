package pos.simulado_bd.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pos.simulado_bd.model.Musica;
import pos.simulado_bd.repository.MusicaRepository;

import java.util.List;
import java.util.Optional;

@Service
public class MusicaService {

    @Autowired
    MusicaRepository musicaRepository;

    public void saveMusica(Musica musica){
        musicaRepository.save(musica);
    }

    public void deleteMusica(Long id){
        musicaRepository.deleteById(id);
    }

    public Optional<Musica> findById(Long id){
        return musicaRepository.findById(id);
    }

    public List<Musica> findAll(){
        return musicaRepository.findAll();
    }

    public List<Musica> findByMusicaTempoDuraco(Integer tempo){
        return musicaRepository.findByMusicaTempoDuracao(tempo);
    }
}
