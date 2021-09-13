package pos.simulado_bd.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pos.simulado_bd.model.Fone;
import pos.simulado_bd.repository.FoneRepository;

import java.util.List;
import java.util.Optional;

@Service
public class FoneService {

    @Autowired
    FoneRepository foneRepository;

    public void saveFone(Fone fone){
        foneRepository.save(fone);
    }

    public void deleteFone(Long id){
        foneRepository.deleteById(id);
    }

    public Optional<Fone> findById(Long id){
       return foneRepository.findById(id);
    }

    public List<Fone> findAll(){
        return foneRepository.findAll();
    }
}
