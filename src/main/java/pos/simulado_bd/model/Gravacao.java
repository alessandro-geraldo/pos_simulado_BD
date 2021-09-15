package pos.simulado_bd.model;

import javax.persistence.*;
import java.util.Date;

@Entity
public class Gravacao {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long codGravacao;
    private Date dataGravacao = new Date();
    @ManyToOne
    private Gravadora gravadora;
    @ManyToOne
    private Cantor cantor;
    @ManyToOne
    private Musica musica;

    public Gravacao() {
    }

    public Gravacao(Long codGravacao, Date dataGravacao, Gravadora gravadora, Cantor cantor, Musica musica) {
        this.codGravacao = codGravacao;
        this.dataGravacao = dataGravacao;
        this.gravadora = gravadora;
        this.cantor = cantor;
        this.musica = musica;
    }

    public Long getCodGravacao() {
        return codGravacao;
    }

    public void setCodGravacao(Long codGravacao) {
        this.codGravacao = codGravacao;
    }

    public Date getDataGravacao() {
        return dataGravacao;
    }

    public void setDataGravacao(Date dataGravacao) {
        this.dataGravacao = dataGravacao;
    }

    public Gravadora getGravadora() {
        return gravadora;
    }

    public void setGravadora(Gravadora gravadora) {
        this.gravadora = gravadora;
    }

    public Cantor getCantor() {
        return cantor;
    }

    public void setCantor(Cantor cantor) {
        this.cantor = cantor;
    }

    public Musica getMusica() {
        return musica;
    }

    public void setMusica(Musica musica) {
        this.musica = musica;
    }

    @Override
    public String toString() {
        return "Gravacao{" +
                "codGravacao=" + codGravacao +
                ", dataGravacao=" + dataGravacao +
                ", gravadora=" + gravadora +
                ", cantor=" + cantor +
                ", musica=" + musica +
                '}';
    }
}
