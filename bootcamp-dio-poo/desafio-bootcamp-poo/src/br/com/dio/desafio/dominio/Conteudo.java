package br.com.dio.desafio.dominio;

public abstract class Conteudo { //Não é possível criar objeto desta classe;
    private String titulo;
    private String descricao;

    protected static final double XP_PADRAO = 10d;

    public abstract double calcularXP();

    //métodos acessores:

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descrocao) {
        this.descricao = descrocao;
    }
}
