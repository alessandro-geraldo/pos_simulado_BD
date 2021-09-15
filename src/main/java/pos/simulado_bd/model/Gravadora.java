package pos.simulado_bd.model;

import javax.persistence.*;
import java.util.List;

@Entity
public class Gravadora {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long codGravadora;
    @Column(nullable = false)
    private String nomeGravadora;
    @Column(nullable = false)
    private String pais;
    @OneToMany(mappedBy = "gravadora")
    private List<Gravacao> gravacao;

    public Gravadora() {
    }

    public Gravadora(Long codGravadora, String nomeGravadora, String pais, List<Gravacao> gravacao) {
        this.codGravadora = codGravadora;
        this.nomeGravadora = nomeGravadora;
        this.pais = pais;
        this.gravacao = gravacao;
    }

    public Long getCodGravadora() {
        return codGravadora;
    }

    public void setCodGravadora(Long codGravadora) {
        this.codGravadora = codGravadora;
    }

    public String getNomeGravadora() {
        return nomeGravadora;
    }

    public void setNomeGravadora(String nomeGravadora) {
        this.nomeGravadora = nomeGravadora;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public List<Gravacao> getGravacao() {
        return gravacao;
    }

    public void setGravacao(List<Gravacao> gravacao) {
        this.gravacao = gravacao;
    }

    @Override
    public String toString() {
        return "Gravadora{" +
                "codGravadora=" + codGravadora +
                ", nomeGravadora='" + nomeGravadora + '\'' +
                ", pais='" + pais + '\'' +
                '}';
    }
}
