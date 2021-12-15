package br.ete.table;

import br.ete.dto.EmprestimoDto;
import br.ete.util.Corretores;
import java.util.ArrayList;
import javax.swing.table.AbstractTableModel;

public class EmprestimoTableModel extends AbstractTableModel {

    public static final int COL_ID_EMPRESTIMO = 0;
    public static final int COL_ALUNO_EMPRESTIMO = 1;
    public static final int COL_TITULO_EMPRESTIMO = 2;
    public static final int COL_ATRASADO_EMPRESTIMO = 3;
    public static final int COL_INICIO_EMPRESTIMO = 4;
    public static final int COL_PREVISAO_EMPRESTIMO = 5;    
    public static final int COL_DEVOLUCAO_EMPRESTIMO = 6;
    public static final int COL_IDLIVRO_EMPRESTIMO = 7;
    public static final int COL_MATRICULA_EMPRESTIMO = 8;
    public ArrayList<EmprestimoDto> lista;
    EmprestimoDto emprestimo = new EmprestimoDto();

    public EmprestimoTableModel(ArrayList<EmprestimoDto> listaEmprestimo) {
        lista = new ArrayList<EmprestimoDto>(listaEmprestimo);
    }

    @Override
    public int getRowCount() {
        return lista.size();
    }

    @Override
    public int getColumnCount() {
        return 9;
    }

    @Override
    public Object getValueAt(int linhas, int colunas) {
        emprestimo = lista.get(linhas);
        switch (colunas) {

            case COL_ID_EMPRESTIMO:
                return emprestimo.getId();

            case COL_ALUNO_EMPRESTIMO:
                return emprestimo.getNomeAluno();

            case COL_TITULO_EMPRESTIMO:
                return emprestimo.getTituloLivro();

            case COL_ATRASADO_EMPRESTIMO:
                return emprestimo.isAtrasado();

            case COL_INICIO_EMPRESTIMO:
                return emprestimo.getDataDeEmprestimo();

            case COL_PREVISAO_EMPRESTIMO:
                return emprestimo.getDataDeDevolucaoPrevista();

            case COL_DEVOLUCAO_EMPRESTIMO:
                return Corretores.converterParaJava(emprestimo.getDataDeDevolucao());

            case COL_IDLIVRO_EMPRESTIMO:
                return emprestimo.getIdLivro();

            case COL_MATRICULA_EMPRESTIMO:
                return emprestimo.getMatricula();

        }

        return "";
    }

    @Override
    public String getColumnName(int colunas) {
        switch (colunas) {

            case COL_ID_EMPRESTIMO:
                return "Código";

            case COL_ALUNO_EMPRESTIMO:
                return "Aluno";

            case COL_ATRASADO_EMPRESTIMO:
                return "Expirado";

            case COL_TITULO_EMPRESTIMO:
                return "Livro";

            case COL_INICIO_EMPRESTIMO:
                return "Data Empréstimo";

            case COL_PREVISAO_EMPRESTIMO:
                return "Previsão Devol.";

            case COL_DEVOLUCAO_EMPRESTIMO:
                return "Devolução";

            case COL_IDLIVRO_EMPRESTIMO:
                return "Cód. Livro";

            case COL_MATRICULA_EMPRESTIMO:
                return "Matrícula";

        }
        return "";

    }

}
