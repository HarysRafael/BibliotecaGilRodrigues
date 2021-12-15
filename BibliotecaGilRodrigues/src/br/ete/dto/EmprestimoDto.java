package br.ete.dto;

import java.util.Objects;

public class EmprestimoDto {
    
    private Long id;
    private boolean atrasado = false;
    private String dataDeEmprestimo;
    private String dataDeDevolucaoPrevista;    
    private String dataDeDevolucao;
    private String nomeAluno;
    private String matricula;    
    private String tituloLivro;
    private Long idLivro;

    public EmprestimoDto() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public boolean isAtrasado() {
        return atrasado;
    }

    public void setAtrasado(boolean atrasado) {
        this.atrasado = atrasado;
    }

    public String getDataDeEmprestimo() {
        return dataDeEmprestimo;
    }

    public void setDataDeEmprestimo(String dataDeEmprestimo) {
        this.dataDeEmprestimo = dataDeEmprestimo;
    }

    public String getDataDeDevolucaoPrevista() {
        return dataDeDevolucaoPrevista;
    }

    public void setDataDeDevolucaoPrevista(String dataDeDevolucaoPrevista) {
        this.dataDeDevolucaoPrevista = dataDeDevolucaoPrevista;
    }

    public String getDataDeDevolucao() {
        return dataDeDevolucao;
    }

    public void setDataDeDevolucao(String dataDeDevolucao) {
        this.dataDeDevolucao = dataDeDevolucao;
    }

    public String getNomeAluno() {
        return nomeAluno;
    }

    public void setNomeAluno(String nomeAluno) {
        this.nomeAluno = nomeAluno;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getTituloLivro() {
        return tituloLivro;
    }

    public void setTituloLivro(String tituloLivro) {
        this.tituloLivro = tituloLivro;
    }

    public Long getIdLivro() {
        return idLivro;
    }

    public void setIdLivro(Long idLivro) {
        this.idLivro = idLivro;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 29 * hash + Objects.hashCode(this.id);
        hash = 29 * hash + (this.atrasado ? 1 : 0);
        hash = 29 * hash + Objects.hashCode(this.dataDeEmprestimo);
        hash = 29 * hash + Objects.hashCode(this.dataDeDevolucaoPrevista);
        hash = 29 * hash + Objects.hashCode(this.dataDeDevolucao);
        hash = 29 * hash + Objects.hashCode(this.nomeAluno);
        hash = 29 * hash + Objects.hashCode(this.matricula);
        hash = 29 * hash + Objects.hashCode(this.tituloLivro);
        hash = 29 * hash + Objects.hashCode(this.idLivro);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final EmprestimoDto other = (EmprestimoDto) obj;
        if (this.atrasado != other.atrasado) {
            return false;
        }
        if (!Objects.equals(this.dataDeEmprestimo, other.dataDeEmprestimo)) {
            return false;
        }
        if (!Objects.equals(this.dataDeDevolucaoPrevista, other.dataDeDevolucaoPrevista)) {
            return false;
        }
        if (!Objects.equals(this.dataDeDevolucao, other.dataDeDevolucao)) {
            return false;
        }
        if (!Objects.equals(this.nomeAluno, other.nomeAluno)) {
            return false;
        }
        if (!Objects.equals(this.matricula, other.matricula)) {
            return false;
        }
        if (!Objects.equals(this.tituloLivro, other.tituloLivro)) {
            return false;
        }
        if (!Objects.equals(this.id, other.id)) {
            return false;
        }
        if (!Objects.equals(this.idLivro, other.idLivro)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "EmprestimoDto{" + "id=" + id + ", atrasado=" + atrasado + ", dataDeEmprestimo=" + dataDeEmprestimo + ", dataDeDevolucaoPrevista=" + dataDeDevolucaoPrevista + ", dataDeDevolucao=" + dataDeDevolucao + ", nomeAluno=" + nomeAluno + ", matricula=" + matricula + ", tituloLivro=" + tituloLivro + ", idLivro=" + idLivro + '}';
    }        
    
}
