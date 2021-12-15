package br.ete.controller;

import br.ete.dao.AlunoSubsequenteDao;
import br.ete.dto.AlunoSubsequenteDto;
import br.ete.model.AlunoSubsequente;
import java.util.ArrayList;
import java.util.stream.Collectors;

public class AlunoSubsequenteController {

    AlunoSubsequente aluno = new AlunoSubsequente();
    AlunoSubsequenteDao alunoDao = new AlunoSubsequenteDao();
    AlunoSubsequenteDto alunoDto = new AlunoSubsequenteDto();

    public AlunoSubsequenteDto salvar(AlunoSubsequenteDto alunoDto) {
        aluno = converterDtoEmAluno(alunoDto);
        alunoDao.criar(aluno);
        return alunoDto;
    }

    public AlunoSubsequenteDto editar(AlunoSubsequenteDto alunoDto) {
        aluno = converterDtoEmAluno(alunoDto);
        alunoDao.editar(aluno);
        return alunoDto;
    }

    public ArrayList<AlunoSubsequenteDto> buscarPorNome(String nome) {
        return (ArrayList<AlunoSubsequenteDto>) alunoDao.buscarPorNome(nome).stream()
                .map(aluno -> {
                    return converterAlunoEmDto(aluno);
                })
                .collect(Collectors.toList());

    }

    public ArrayList<AlunoSubsequenteDto> buscarPorMatricula(String matricula) {
        return (ArrayList<AlunoSubsequenteDto>) alunoDao.buscarPorMatricula(matricula).stream()
                .map(aluno -> {
                    return converterAlunoEmDto(aluno);
                })
                .collect(Collectors.toList());
    }

    public void deletar(Long id) {
        alunoDao.deletar(id);
    }

    public AlunoSubsequente converterDtoEmAluno(AlunoSubsequenteDto alunoDto) {
        aluno.setId(alunoDto.getId());
        aluno.setNome(alunoDto.getNome());
        aluno.setTurma(alunoDto.getTurma());
        aluno.setMatricula(alunoDto.getMatricula());
        aluno.setTelefone(alunoDto.getTelefone());
        aluno.setEmail(alunoDto.getEmail());
        aluno.setCpf(alunoDto.getCpf());
        return aluno;

    }

    public AlunoSubsequenteDto converterAlunoEmDto(AlunoSubsequente aluno) {
        alunoDto.setId(aluno.getId());
        alunoDto.setNome(aluno.getNome());
        alunoDto.setTurma(aluno.getTurma());
        alunoDto.setMatricula(aluno.getMatricula());
        alunoDto.setTelefone(aluno.getTelefone());
        alunoDto.setEmail(aluno.getEmail());
        alunoDto.setCpf(aluno.getCpf());
        return alunoDto;

    }

}
