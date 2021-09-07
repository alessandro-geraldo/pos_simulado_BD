package pos.simulado_bd.model;

import javax.persistence.*;

@Entity
public class Pessoa {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long codPessoa;
    @Column(nullable = false)
    private String nomePessoa;

    public Pessoa() {
    }

    public Pessoa(Long codPessoa, String nomePessoa) {
        this.codPessoa = codPessoa;
        this.nomePessoa = nomePessoa;
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
}
