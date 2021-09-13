package pos.simulado_bd.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pos.simulado_bd.model.Gravadora;
import pos.simulado_bd.repository.GravadoraRepository;

import java.util.List;
import java.util.Optional;

@Service
public class GravadoraService {

    @Autowired
    GravadoraRepository gravadoraRepository;

    public void saveGravadora(Gravadora gravadora){
        gravadoraRepository.save(gravadora);
    }

    public void deleteGravadora(Long id){
        gravadoraRepository.deleteById(id);
    }

    public Optional<Gravadora> findById(Long id){
        return gravadoraRepository.findById(id);
    }

    public List<Gravadora> findAll(){
        return gravadoraRepository.findAll();
    }
}
