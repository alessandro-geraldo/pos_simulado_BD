package pos.simulado_bd.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pos.simulado_bd.model.Categoria;
import pos.simulado_bd.repository.CategoriaRepository;

import java.util.List;
import java.util.Optional;

@Service
public class CategoriaService {

    @Autowired
    CategoriaRepository categoriaRepository;

    public void saveCategoria(Categoria categoria){
        categoriaRepository.save(categoria);
    }
    public void deleteCategoria(Long id){
        categoriaRepository.deleteById(id);
    }
    public Optional<Categoria> findById(Long id){
       return categoriaRepository.findById(id);
    }
    public List<Categoria> findAll(){
        return categoriaRepository.findAll();
    }
}
