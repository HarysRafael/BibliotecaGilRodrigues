package br.ete.table;

import br.ete.dto.AlunoSubsequenteDto;
import java.util.ArrayList;
import javax.swing.table.AbstractTableModel;

public class AlunoSubsequenteTableModel extends AbstractTableModel {

    public static final int COL_MATRICULA_ALUNO = 0;
    public static final int COL_NOME_ALUNO = 1;
    public static final int COL_TURMA_ALUNO = 2;
    public static final int COL_TELEFONE_ALUNO = 3;
    public static final int COL_EMAIL_ALUNO = 4;
    public static final int COL_CPF_ALUNO = 5;
    public static final int COL_ID_ALUNO = 6;
    public ArrayList<AlunoSubsequenteDto> lista;
    AlunoSubsequenteDto aluno = new AlunoSubsequenteDto();

    public AlunoSubsequenteTableModel(ArrayList<AlunoSubsequenteDto> listaAluno) {
        lista = new ArrayList<AlunoSubsequenteDto>(listaAluno);
    }

    @Override
    public int getRowCount() {
        return lista.size();
    }

    @Override
    public int getColumnCount() {
        return 7;
    }

    @Override
    public Object getValueAt(int linhas, int colunas) {
        aluno = lista.get(linhas);
        switch (colunas) {

            case COL_NOME_ALUNO:
                return aluno.getNome();

            case COL_MATRICULA_ALUNO:
                return aluno.getMatricula();

            case COL_EMAIL_ALUNO:
                return aluno.getEmail();

            case COL_TURMA_ALUNO:
                return aluno.getTurma();

            case COL_TELEFONE_ALUNO:
                return aluno.getTelefone();

            case COL_CPF_ALUNO:
                return aluno.getCpf();

            case COL_ID_ALUNO:
                return aluno.getId();

        }

        return "";
    }

    @Override
    public String getColumnName(int colunas) {
        switch (colunas) {

            case COL_NOME_ALUNO:
                return "Nome";

            case COL_MATRICULA_ALUNO:
                return "Matrícula";

            case COL_EMAIL_ALUNO:
                return "E-mail";

            case COL_TURMA_ALUNO:
                return "Turma";

            case COL_TELEFONE_ALUNO:
                return "Telefone";

            case COL_CPF_ALUNO:
                return "CPF";

            case COL_ID_ALUNO:
                return "Código";

        }

        return "";

    }

}
