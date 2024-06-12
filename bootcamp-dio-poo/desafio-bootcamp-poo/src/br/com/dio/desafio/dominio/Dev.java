package br.com.dio.desafio.dominio;

import java.util.LinkedHashSet;
import java.util.Objects;
import java.util.Optional;
import java.util.Set;

public class Dev {
    private String nome;

    //O Set não permite elementos repetidos e o LinkedHashSet ordena os elementos por ordem de inserção:
    private Set<Conteudo> conteudosInscritos = new LinkedHashSet<>();//Conteudo pode ser tanto Cursos como Mentorias;
    private Set<Conteudo> conteudoFinalizados = new LinkedHashSet<>();

    //Necessário por estar sendo trabalhado com Hash:
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Dev dev = (Dev) o;
        return Objects.equals(getNome(), dev.getNome()) && Objects.equals(getConteudosIncrito(), dev.getConteudosIncrito()) && Objects.equals(getConteudoFinalizado(), dev.getConteudoFinalizado());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getNome(), getConteudosIncrito(), getConteudoFinalizado());
    }

    public void inscreverBootcamp(Bootcamp bootcamp){
        //quando um Dev se inscreve no bootcamp, ele se inscreve em todos os conteúdos desse Bootcamp:
        this.conteudosInscritos.addAll(bootcamp.getConteudos());
        //Ao se increver, esse Dev é adicionado ao Set de DevsIncritos:
        bootcamp.getDevsInscritos().add(this);
    }

    //Para progredir em um Bootcamp, é necessário que o Dev finalize os conteúdos inscritos:
    public void progredirBootcamp(){
        Optional<Conteudo> conteudo = this.conteudosInscritos.stream().findFirst();
        if (conteudo.isPresent()){
            this.conteudoFinalizados.add(conteudo.get());
            this.conteudosInscritos.remove(conteudo.get());
        } else {
            System.err.println("Você não está inscrito em conteúdos!");
        }
    }

    public double calcularTotalXP(){
        //será feito a soma do XP de cada conteúdo contido no Set conteudoFinalizados
        return this.conteudoFinalizados.stream().mapToDouble(conteudo -> conteudo.calcularXP()).sum();
    }

    //métodos acessores:
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Set<Conteudo> getConteudosIncrito() {
        return conteudosInscritos;
    }

    public void setConteudosIncrito(Set<Conteudo> conteudosIncrito) {
        this.conteudosInscritos = conteudosIncrito;
    }

    public Set<Conteudo> getConteudoFinalizado() {
        return conteudoFinalizados;
    }

    public void setConteudoFinalizado(Set<Conteudo> conteudoFinalizado) {
        this.conteudoFinalizados = conteudoFinalizado;
    }
}
