package br.ete.table;

import br.ete.dto.AlunoIntegralDto;
import br.ete.model.AlunoIntegral;
import java.util.ArrayList;
import javax.swing.table.AbstractTableModel;

public class AlunoIntegralTableModel extends AbstractTableModel {

    public static final int COL_MATRICULA_ALUNO = 0;
    public static final int COL_NOME_ALUNO = 1;    
    public static final int COL_TURMA_ALUNO = 2;
    public static final int COL_TELEFONE_ALUNO = 3;
    public static final int COL_EMAIL_ALUNO = 4;
    public static final int COL_NOMERESPONSAVEL_ALUNO = 5;
    public static final int COL_TELEFONERESPONSAVEL_ALUNO = 6;
    public static final int COL_ID_ALUNO = 7;
    public ArrayList<AlunoIntegralDto> lista;
    AlunoIntegralDto aluno = new AlunoIntegralDto();
    
    public AlunoIntegralTableModel(ArrayList<AlunoIntegralDto> listaAluno) {
        lista = new ArrayList<AlunoIntegralDto>(listaAluno);
    }

    public AlunoIntegralTableModel() {
    }
    
    

    @Override
    public int getRowCount() {
        return lista.size();
    }

    @Override
    public int getColumnCount() {
        return 8;
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

            case COL_NOMERESPONSAVEL_ALUNO:
                return aluno.getNomeResponsavel();

            case COL_TELEFONERESPONSAVEL_ALUNO:
                return aluno.getTelefoneResponsavel();
                
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

            case COL_NOMERESPONSAVEL_ALUNO:
                return "NomeResponsavel";

            case COL_TELEFONERESPONSAVEL_ALUNO:
                return "Tel. Resp.";
                
            case COL_ID_ALUNO:
                return "Código";
                
        }

        return "";

    }

}
