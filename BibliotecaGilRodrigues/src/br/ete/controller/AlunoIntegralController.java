package br.ete.controller;

import br.ete.dao.AlunoIntegralDao;
import br.ete.dto.AlunoIntegralDto;
import br.ete.model.AlunoIntegral;
import java.util.ArrayList;
import java.util.stream.Collectors;

public class AlunoIntegralController {

    AlunoIntegral aluno = new AlunoIntegral();
    AlunoIntegralDao alunoDao = new AlunoIntegralDao();
    AlunoIntegralDto alunoDto = new AlunoIntegralDto();

    public AlunoIntegralDto salvar(AlunoIntegralDto alunoDto) {
        aluno = converterDtoEmAluno(alunoDto);
        alunoDao.criar(aluno);
        return alunoDto;
    }

    public AlunoIntegralDto editar(AlunoIntegralDto alunoDto) {
        aluno = converterDtoEmAluno(alunoDto);
        alunoDao.editar(aluno);
        return alunoDto;
    }

    public ArrayList<AlunoIntegralDto> buscarPorNome(String nome) {
        return (ArrayList<AlunoIntegralDto>) alunoDao.buscarPorNome(nome).stream()
                .map(aluno -> {
                    return converterAlunoEmDto(aluno);
                })
                .collect(Collectors.toList());

    }

    public ArrayList<AlunoIntegralDto> buscarPorMatricula(String matricula) {
        return (ArrayList<AlunoIntegralDto>) alunoDao.buscarPorMatricula(matricula).stream()
                .map(aluno -> {
                    return converterAlunoEmDto(aluno);
                })
                .collect(Collectors.toList());
    }    

    public void deletar(Long id) {
        alunoDao.deletar(id);
    }

    public AlunoIntegral converterDtoEmAluno(AlunoIntegralDto alunoDto) {
        aluno.setId(alunoDto.getId());
        aluno.setNome(alunoDto.getNome());
        aluno.setTurma(alunoDto.getTurma());
        aluno.setMatricula(alunoDto.getMatricula());
        aluno.setTelefone(alunoDto.getTelefone());
        aluno.setEmail(alunoDto.getEmail());
        aluno.setNomeResponsavel(alunoDto.getNomeResponsavel());
        aluno.setTelefoneResponsavel(alunoDto.getTelefoneResponsavel());
        return aluno;

    }

    public AlunoIntegralDto converterAlunoEmDto(AlunoIntegral aluno) {
        alunoDto.setId(aluno.getId());
        alunoDto.setNome(aluno.getNome());
        alunoDto.setTurma(aluno.getTurma());
        alunoDto.setMatricula(aluno.getMatricula());
        alunoDto.setTelefone(aluno.getTelefone());
        alunoDto.setEmail(aluno.getEmail());
        alunoDto.setNomeResponsavel(aluno.getNomeResponsavel());
        alunoDto.setTelefoneResponsavel(aluno.getTelefoneResponsavel());
        return alunoDto;

    }
}
