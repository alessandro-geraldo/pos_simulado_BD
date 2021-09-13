package pos.simulado_bd.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pos.simulado_bd.model.Pessoa;
import pos.simulado_bd.repository.PessoaRepository;

import java.util.List;
import java.util.Optional;

@Service
public class PessoaService {

    @Autowired
    PessoaRepository pessoaRepository;

    public void savePessoa(Pessoa pessoa){
        pessoaRepository.save(pessoa);
    }

    public void deletePessoa(Long id){
        pessoaRepository.deleteById(id);
    }

    public Optional<Pessoa> findById(Long id){
        return pessoaRepository.findById(id);
    }

    public List<Pessoa> findAll(){
        return pessoaRepository.findAll();
    }
}
