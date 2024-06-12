package br.com.dio.desafio.dominio;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Objects;
import java.util.Set;

public class Bootcamp {
    private String nome;
    private String descricao;
    private final LocalDate dataDeInicio = LocalDate.now();
    private final LocalDate dataDeTermino = dataDeInicio.plusDays(45);

    //Set porque cada dev não pode se inscrever mais de uma vez no mesmo Bootcamp:
    private Set<Dev> devsInscritos = new HashSet<>(); //HashSet porque a ordem dos Devs é irrelevante;
    private Set<Conteudo> conteudos = new LinkedHashSet<>();

    //métodos acessores:
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public LocalDate getDataDeInicio() {
        return dataDeInicio;
    }

    public LocalDate getDataDeTermino() {
        return dataDeTermino;
    }

    public Set<Dev> getDevsInscritos() {
        return devsInscritos;
    }

    public void setDevsInscritos(Set<Dev> devsIncritos) {
        this.devsInscritos = devsIncritos;
    }

    public Set<Conteudo> getConteudos() {
        return conteudos;
    }

    public void setConteudos(Set<Conteudo> conteudos) {
        this.conteudos = conteudos;
    }

    //Método equals() e hashCode() - por estar sendo trabalhado com HashSet e LinkedHashSet:

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Bootcamp bootcamp = (Bootcamp) o;
        return Objects.equals(getNome(), bootcamp.getNome()) && Objects.equals(getDescricao(), bootcamp.getDescricao()) && Objects.equals(getDataDeInicio(), bootcamp.getDataDeInicio()) && Objects.equals(getDataDeTermino(), bootcamp.getDataDeTermino()) && Objects.equals(getDevsInscritos(), bootcamp.getDevsInscritos()) && Objects.equals(getConteudos(), bootcamp.getConteudos());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getNome(), getDescricao(), getDataDeInicio(), getDataDeTermino(), getDevsInscritos(), getConteudos());
    }
}
