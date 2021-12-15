package br.ete.dto;

import java.util.Objects;

public class LivroDto {

    private Long id;
    private String titulo;
    private String autor;
    private int quantidade;
    private int disponivel;

    public LivroDto() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public int getDisponivel() {
        return disponivel;
    }

    public void setDisponivel(int disponivel) {
        this.disponivel = disponivel;
    }


    @Override
    public String toString() {
        return "LivroDto{" + "id=" + id + ", titulo=" + titulo + ", autor=" + autor + ", quantidade=" + quantidade + ", disponivel=" + disponivel + '}';
    }        

}
