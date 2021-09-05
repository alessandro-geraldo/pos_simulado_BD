package pos.simulado_bd.model;

import javax.persistence.*;

@Entity
public class Musica {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long codMusica;
    @Column(nullable = false)
    private double duracao;
    @Column(nullable = false)
    private String titulo;

    public Musica() {
    }

    public Musica(Long codMusica, double duracao, String titulo) {
        this.codMusica = codMusica;
        this.duracao = duracao;
        this.titulo = titulo;
    }

    public Long getCodMusica() {
        return codMusica;
    }

    public void setCodMusica(Long codMusica) {
        this.codMusica = codMusica;
    }

    public double getDuracao() {
        return duracao;
    }

    public void setDuracao(double duracao) {
        this.duracao = duracao;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
}
