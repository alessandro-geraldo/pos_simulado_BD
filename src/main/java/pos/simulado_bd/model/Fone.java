package pos.simulado_bd.model;

import javax.persistence.*;

@Entity
public class Fone {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long codFone;
    @Column(nullable = false)
    private String numero;
    @Column(nullable = false)
    private String tipo;
    @ManyToOne
    private Pessoa pessoa;

    public Fone() {
    }

    public Fone(Long codFone, String numero, String tipo, Pessoa pessoa) {
        this.codFone = codFone;
        this.numero = numero;
        this.tipo = tipo;
        this.pessoa = pessoa;
    }

    public Long getCodFone() {
        return codFone;
    }

    public void setCodFone(Long codFone) {
        this.codFone = codFone;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public Pessoa getPessoa() {
        return pessoa;
    }

    public void setPessoa(Pessoa pessoa) {
        this.pessoa = pessoa;
    }
}
