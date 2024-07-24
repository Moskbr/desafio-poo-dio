package br.com.dio.desafio.dominio;

public abstract class Conteudo {

    protected static final double XP_PADRAO = 10d;

    private String titulo;
    private String descricao;
    // Recurso de PRJETO FINAL
    private boolean temProjetoFinal; // indica se o Conteúdo requer a entrega de um Projeto Final
    private String projetoFinal;    // para progredir, esse atributo não pode ser 'null' caso 'temProjetoFinal' for True

    public abstract double calcularXp();

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    // Métodos de Projeto Final
    public String getProjetoFinal() {
        return projetoFinal;
    }
    public void setTemProjetoFinal(boolean temProjetoFinal) {
        this.temProjetoFinal = temProjetoFinal;
    }
    public boolean isTemProjetoFinal() {
        return temProjetoFinal;
    }
    public void entregarProjetoFinal(String projeto){
        this.projetoFinal = projeto;
    }
}
