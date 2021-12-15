package br.ete.model;

import java.util.Objects;

public class AlunoIntegral{

    private static final long serialVersionUID = 1L;
    private Long id;    
    private String nome;
    private String matricula;
    private String email;
    private String turma;
    private String telefone;
    private String nomeResponsavel;
    private String telefoneResponsavel;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTurma() {
        return turma;
    }

    public void setTurma(String turma) {
        this.turma = turma;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getNomeResponsavel() {
        return nomeResponsavel;
    }

    public void setNomeResponsavel(String nomeResponsavel) {
        this.nomeResponsavel = nomeResponsavel;
    }

    public String getTelefoneResponsavel() {
        return telefoneResponsavel;
    }

    public void setTelefoneResponsavel(String telefoneResponsavel) {
        this.telefoneResponsavel = telefoneResponsavel;
    }

    public AlunoIntegral() {
    }
  
    @Override
    public String toString() {
        return "AlunoIntegral{" + "id=" + id + ", nome=" + nome + ", matricula=" + matricula + ", email=" + email + ", turma=" + turma + ", telefone=" + telefone + ", nomeResponsavel=" + nomeResponsavel + ", telefoneResponsavel=" + telefoneResponsavel + '}';
    }

}
