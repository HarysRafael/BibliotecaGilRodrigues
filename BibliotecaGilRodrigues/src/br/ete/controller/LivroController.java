package br.ete.controller;

import br.ete.dao.LivroDao;
import br.ete.dto.LivroDto;
import br.ete.model.Livro;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class LivroController {

    public LivroController() {
    }

    private Livro livro = new Livro();
    private LivroDto livroDto = new LivroDto();
    private LivroDao livroDao = new LivroDao();

    public LivroDto salvar(LivroDto livroDto) {
        Livro livro = converterDtoEmLivro(livroDto);
        livroDao.criar(livro);
        return livroDto;
    }

    public LivroDto editar(LivroDto livroDto) {
        Livro livro = converterDtoEmLivro(livroDto);
        livroDao.editar(livro);
        return livroDto;
    }    

    public ArrayList<LivroDto> buscarPorTitulo(String titulo) {
        return (ArrayList<LivroDto>) livroDao.listarPorTitulo(titulo).stream()
                .map(livro -> {
                    return converterLivroEmDto(livro);
                })
                .collect(Collectors.toList());
    }

    public void deletar(Long id) {
        livroDao.deletar(id);
    }

    public Livro converterDtoEmLivro(LivroDto livroDto) {
        livro.setId(livroDto.getId());
        livro.setAutor(livroDto.getAutor());
        livro.setDisponivel(livroDto.getDisponivel());
        livro.setQuantidade(livroDto.getQuantidade());
        livro.setTitulo(livroDto.getTitulo());
        return livro;
    }

    public LivroDto converterLivroEmDto(Livro livro) {
        livroDto.setId(livro.getId());
        livroDto.setAutor(livro.getAutor());
        livroDto.setTitulo(livro.getTitulo());
        livroDto.setDisponivel(livro.getDisponivel());
        livroDto.setQuantidade(livro.getQuantidade());
        return livroDto;
    }

}
