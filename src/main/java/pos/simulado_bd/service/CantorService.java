package pos.simulado_bd.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pos.simulado_bd.model.Cantor;
import pos.simulado_bd.repository.CantorRepository;

import java.util.List;
import java.util.Optional;
@Service
public class CantorService {

    @Autowired
    CantorRepository cantorRepository;

    public void saveCantor(Cantor cantor){
        cantorRepository.save(cantor);
    }
    public void deleteCantor(Long id){
        cantorRepository.deleteById(id);
    }
    public Optional<Cantor> findById(Long id){
        return cantorRepository.findById(id);
    }
    public List<Cantor> findAll(){
        return cantorRepository.findAll();
    }
}
