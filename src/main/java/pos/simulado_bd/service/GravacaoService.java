package pos.simulado_bd.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pos.simulado_bd.model.Gravacao;
import pos.simulado_bd.repository.GravacaoRepository;

import java.util.List;
import java.util.Optional;

@Service
public class GravacaoService {

    @Autowired
    GravacaoRepository gravacaoRepository;

    public void savaGravacao(Gravacao gravacao){
        gravacaoRepository.save(gravacao);
    }

    public void deleteGravacao(Long id){
        gravacaoRepository.deleteById(id);
    }

    public Optional<Gravacao> findById(Long id){
        return gravacaoRepository.findById(id);
    }

    public List<Gravacao> findAll(){
        return gravacaoRepository.findAll();
    }
}
