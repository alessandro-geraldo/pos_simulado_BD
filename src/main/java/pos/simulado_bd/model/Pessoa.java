package pos.simulado_bd.model;

import javax.persistence.*;
import java.util.List;

@Entity
public class Pessoa {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long codPessoa;
    @Column(nullable = false)
    private String nomePessoa;
    @OneToMany(mappedBy = "pessoa")
    private List<Fone> fones;

    public Pessoa() {
    }

    public Pessoa(Long codPessoa, String nomePessoa, List<Fone> fones) {
        this.codPessoa = codPessoa;
        this.nomePessoa = nomePessoa;
        this.fones = fones;
    }

    public Long getCodPessoa() {
        return codPessoa;
    }

    public void setCodPessoa(Long codPessoa) {
        this.codPessoa = codPessoa;
    }

    public String getNomePessoa() {
        return nomePessoa;
    }

    public void setNomePessoa(String nomePessoa) {
        this.nomePessoa = nomePessoa;
    }

    public List<Fone> getFones() {
        return fones;
    }

    public void setFones(List<Fone> fones) {
        this.fones = fones;
    }

    @Override
    public String toString() {
        return "Pessoa{" +
                "codPessoa=" + codPessoa +
                ", nomePessoa='" + nomePessoa + '\'' +

                '}';
    }
}
