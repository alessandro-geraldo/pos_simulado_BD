package pos.simulado_bd.model;

import javax.persistence.*;

@Entity
public class Gravadora {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long codGravadora;
    @Column(nullable = false)
    private String nomeGravadora;
    @Column(nullable = false)
    private String pais;

    public Gravadora() {
    }

    public Gravadora(Long codGravadora, String nomeGravadora, String pais) {
        this.codGravadora = codGravadora;
        this.nomeGravadora = nomeGravadora;
        this.pais = pais;
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
}
