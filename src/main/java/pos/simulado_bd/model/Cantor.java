package pos.simulado_bd.model;

import javax.persistence.*;
import java.util.List;

@Entity
public class Cantor {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long codCantor;
    @Column(nullable = false)
    private String nomeCantor;
    @Column(nullable = false)
    private String pais;
    @OneToMany(mappedBy = "cantor")
    private List<Gravacao> gravacoes;

    public Cantor() {
    }

    public Cantor(Long codCantor, String nomeCantor, String pais) {
        this.codCantor = codCantor;
        this.nomeCantor = nomeCantor;
        this.pais = pais;
    }

    public Long getCodCantor() {
        return codCantor;
    }

    public void setCodCantor(Long codCantor) {
        this.codCantor = codCantor;
    }

    public String getNomeCantor() {
        return nomeCantor;
    }

    public void setNomeCantor(String nomeCantor) {
        this.nomeCantor = nomeCantor;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    @Override
    public String toString() {
        return "Cantor{" +
                "codCantor=" + codCantor +
                ", nomeCantor='" + nomeCantor + '\'' +
                ", pais='" + pais + '\'' +
                '}';
    }
}
