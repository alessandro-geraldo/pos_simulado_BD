package pos.simulado_bd.model;

import javax.persistence.*;
import java.util.List;

@Entity
public class Musica {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long codMusica;
    @Column(nullable = false)
    private double duracao;
    @Column(nullable = false)
    private String titulo;
    @ManyToOne
    private Categoria categoria;
    @OneToMany(mappedBy = "musica")
    private List<Gravacao> gravacoes;

    public Musica() {
    }

    public Musica(Long codMusica, double duracao, String titulo, Categoria categoria, List<Gravacao> gravacoes) {
        this.codMusica = codMusica;
        this.duracao = duracao;
        this.titulo = titulo;
        this.categoria = categoria;
        this.gravacoes = gravacoes;
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

    public Categoria getCategoria() {
        return categoria;
    }

    public void setCategoria(Categoria categoria) {
        this.categoria = categoria;
    }

    public List<Gravacao> getGravacoes() {
        return gravacoes;
    }

    public void setGravacoes(List<Gravacao> gravacoes) {
        this.gravacoes = gravacoes;
    }
}
