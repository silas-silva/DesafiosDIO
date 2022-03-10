package dominio;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

/**
 *
 * @author silas
 */
public class Bootcamp {

    private String nome;
    private String descricao;
    private LocalDate dataInicial = LocalDate.now();
    private LocalDate dataFinal = dataInicial.plusDays(45);
    private Set<Dev> devInscritos = new HashSet<>();
    private Set<Conteudo> conteudos = new LinkedHashSet<>();

    public Set<Conteudo> getConteudos() {
        return conteudos;
    }

    public LocalDate getDataFinal() {
        return dataFinal;
    }

    public LocalDate getDataInicial() {
        return dataInicial;
    }

    public String getDescricao() {
        return descricao;
    }

    public Set<Dev> getDevInscritos() {
        return devInscritos;
    }

    public String getNome() {
        return nome;
    }

    public void setConteudos(Set<Conteudo> conteudos) {
        this.conteudos = conteudos;
    }

    public void setDataFinal(LocalDate dataFinal) {
        this.dataFinal = dataFinal;
    }

    public void setDataInicial(LocalDate dataInicial) {
        this.dataInicial = dataInicial;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public void setDevInscritos(Set<Dev> devInscritos) {
        this.devInscritos = devInscritos;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    
    
    
}
