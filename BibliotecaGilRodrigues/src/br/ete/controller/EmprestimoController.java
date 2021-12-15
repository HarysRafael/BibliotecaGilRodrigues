package br.ete.controller;

import br.ete.dao.EmprestimoDao;
import br.ete.dto.EmprestimoDto;
import br.ete.model.Emprestimo;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.stream.Collectors;

public class EmprestimoController {

    private EmprestimoDto emprestimoDto = new EmprestimoDto();
    private Emprestimo emprestimo = new Emprestimo();
    private EmprestimoDao emprestimoDao = new EmprestimoDao();
    private DateTimeFormatter formatoData = DateTimeFormatter.ofPattern("dd/MM/yyyy");
    private LocalDate dataAtual = LocalDate.now();

    public EmprestimoDto salvar(EmprestimoDto emprestimoDto) {
        emprestimo = converterDtoEmEmprestimo(emprestimoDto);
        emprestimoDao.criar(emprestimo);
        return emprestimoDto;                
    }
    
    public void devolverLivro(EmprestimoDto emprestimoDto){
        emprestimo = converterDtoEmEmprestimo(emprestimoDto);
        emprestimoDao.devolverLivro(emprestimo);
    }
    
    public void atualizarStatusEmprestimo() {
        emprestimoDao.atualizaStatusEmprestimo();

    }                
       
    public void deletarTodosEntregues(){
        emprestimoDao.deletarTodosEntregues();
    }
    
    public Emprestimo converterDtoEmEmprestimo(EmprestimoDto emprestimoDto) {
        emprestimo.setId(emprestimoDto.getId());
        emprestimo.setAtrasado(emprestimoDto.isAtrasado());
        emprestimo.setDataDeDevolucao(emprestimoDto.getDataDeDevolucao());
        emprestimo.setDataDeDevolucaoPrevista(emprestimoDto.getDataDeDevolucaoPrevista());
        emprestimo.setDataDeEmprestimo(emprestimoDto.getDataDeDevolucaoPrevista());
        emprestimo.setIdLivro(emprestimoDto.getIdLivro());
        emprestimo.setMatricula(emprestimoDto.getMatricula());
        emprestimo.setNomeAluno(emprestimoDto.getNomeAluno());
        emprestimo.setTituloLivro(emprestimoDto.getTituloLivro());
        return emprestimo;

    }
    
        public EmprestimoDto converterEmprestimoEmDto(Emprestimo emprestimo) {
        emprestimoDto.setId(emprestimo.getId());
        emprestimoDto.setAtrasado(emprestimo.isAtrasado());
        emprestimoDto.setDataDeDevolucao(emprestimo.getDataDeDevolucao());
        emprestimoDto.setDataDeDevolucaoPrevista(emprestimo.getDataDeDevolucaoPrevista());
        emprestimoDto.setDataDeEmprestimo(emprestimo.getDataDeDevolucaoPrevista());
        emprestimoDto.setIdLivro(emprestimo.getIdLivro());
        emprestimoDto.setMatricula(emprestimo.getMatricula());
        emprestimoDto.setNomeAluno(emprestimo.getNomeAluno());
        emprestimoDto.setTituloLivro(emprestimo.getTituloLivro());
        return emprestimoDto;

    }

}
