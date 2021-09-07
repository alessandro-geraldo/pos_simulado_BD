package pos.simulado_bd.model;

import javax.persistence.*;
import java.util.List;

@Entity
public class Categoria {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long CodCategoria;
    @Column(nullable = false)
    private String descCategoria;
    @ManyToOne
    private List<Musica> musicas;

    public Categoria() {
    }

    public Categoria(Long codCategoria, String descCategoria) {
        CodCategoria = codCategoria;
        this.descCategoria = descCategoria;
    }

    public Long getCodCategoria() {
        return CodCategoria;
    }

    public void setCodCategoria(Long codCategoria) {
        CodCategoria = codCategoria;
    }

    public String getDescCategoria() {
        return descCategoria;
    }

    public void setDescCategoria(String descCategoria) {
        this.descCategoria = descCategoria;
    }
}
