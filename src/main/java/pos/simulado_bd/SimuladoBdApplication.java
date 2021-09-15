package pos.simulado_bd;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import pos.simulado_bd.model.*;
import pos.simulado_bd.service.*;

@SpringBootApplication
public class SimuladoBdApplication {

    private static final Logger logger = LoggerFactory.getLogger(SimuladoBdApplication.class);

    public static void main(String[] args) {

        SpringApplication.run(SimuladoBdApplication.class, args);
    }

    @Bean
    public CommandLineRunner demo(CategoriaService categoriaService,
                                  MusicaService musicaService,
                                  CantorService cantorService,
                                  GravadoraService gravadoraService,
                                  GravacaoService gravacaoService) {
        return (args) -> {
            Categoria cat1 = new Categoria();
            cat1.setDescCategoria("sertanejo");

            Categoria cat2 = new Categoria();
            cat2.setDescCategoria("eletronica");

            categoriaService.saveCategoria(cat1);
            categoriaService.saveCategoria(cat2);

            Musica mus1 = new Musica();
            mus1.setDuracao(5);
            mus1.setTitulo("volta pra mim");
            mus1.setCategoria(cat1);

            Musica mus2 = new Musica();
            mus2.setDuracao(3);
            mus2.setTitulo("beija flor");
            mus2.setCategoria(cat1);

            musicaService.saveMusica(mus1);
            musicaService.saveMusica(mus2);

            Cantor cantor1 = new Cantor();
            cantor1.setNomeCantor("Paula Fernandes");
            cantor1.setPais("Brasil");

            Cantor cantor2 = new Cantor();
            cantor2.setNomeCantor("Sergio Reis");
            cantor2.setPais("Brasil");

            cantorService.saveCantor(cantor1);
            cantorService.saveCantor(cantor2);

            Gravadora gravadora1 = new Gravadora();
            gravadora1.setNomeGravadora("Sony");
            gravadora1.setPais("Brasil");

            Gravadora gravadora2 = new Gravadora();
            gravadora2.setNomeGravadora("Som Livre");
            gravadora2.setPais("Paraguai");

            gravadoraService.saveGravadora(gravadora1);
            gravadoraService.saveGravadora(gravadora2);

            Gravacao gravacao1 = new Gravacao();
            gravacao1.setCantor(cantor1);
            gravacao1.setGravadora(gravadora1);
            gravacao1.setMusica(mus2);

            Gravacao gravacao2 = new Gravacao();
            gravacao2.setCantor(cantor2);
            gravacao2.setGravadora(gravadora2);
            gravacao2.setMusica(mus1);

            gravacaoService.saveGravacao(gravacao1);
            gravacaoService.saveGravacao(gravacao2);

            logger.info("=================================");
            logger.info("departamentos encontrados findAll");
            logger.info("---------------------------------");
            for (Categoria categoria : categoriaService.findAll()) {
                logger.info(categoria.toString());
            }
            logger.info("");

            logger.info("=================================");
            logger.info("musicas encontrados findAll");
            logger.info("---------------------------------");
            for (Musica musica : musicaService.findAll()) {
                logger.info(musica.toString());
            }
            logger.info("");

            logger.info("=================================");
            logger.info("cantores encontrados findAll");
            logger.info("---------------------------------");
            logger.info(cantorService.findById(1L).toString());
            for (Cantor cantor : cantorService.findAll()) {
                logger.info(cantor.toString());
            }
            logger.info("");

            logger.info("=================================");
            logger.info("gravadoras encontrados findAll");
            logger.info("---------------------------------");
            for (Gravadora gravadora : gravadoraService.findAll()) {
                logger.info(gravadora.toString());
            }
            logger.info("");

            logger.info("=================================");
            logger.info("gravações encontrados findAll");
            logger.info("---------------------------------");
            for (Gravacao gravacao : gravacaoService.findAll()) {
                logger.info(gravacao.toString());
            }
            logger.info("");

            logger.info("=================================");
            logger.info("cantores encontrados findByNome");
            logger.info("---------------------------------");
            logger.info(cantorService.findByNomeCantor("Sergio Reis").toString());

            logger.info("=================================");
            logger.info("musicas encontrados findByMusicaTempoDuracao");
            logger.info("---------------------------------");
            for (Musica musica : musicaService.findByMusicaTempoDuraco(4)) {
                logger.info(musica.toString());
            }

        };


    }

}
