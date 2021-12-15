package br.ete.table;

import br.ete.dto.LivroDto;
import java.util.ArrayList;
import javax.swing.table.AbstractTableModel;

public class LivroTableModel extends AbstractTableModel {

    public static final int COL_ID_LIVRO = 0;
    public static final int COL_TITULO_LIVRO = 1;
    public static final int COL_AUTOR_LIVRO = 2;
    public static final int COL_QUANTIDADE_LIVRO = 3;
    public static final int COL_DISPONIVEIS_LIVRO = 4;
    public ArrayList<LivroDto> lista;
    LivroDto livro = new LivroDto();

    public LivroTableModel(ArrayList<LivroDto> listaLivro) {
        lista = new ArrayList<LivroDto>(listaLivro);
    }

    @Override
    public int getRowCount() {
        return lista.size();
    }

    @Override
    public int getColumnCount() {
        return 5;
    }

    @Override
    public Object getValueAt(int linhas, int colunas) {
        livro = lista.get(linhas);
        switch (colunas) {
            case COL_ID_LIVRO:
                return livro.getId();

            case COL_TITULO_LIVRO:
                return livro.getTitulo();

            case COL_AUTOR_LIVRO:
                return livro.getAutor();

            case COL_DISPONIVEIS_LIVRO:
                return livro.getDisponivel();

            case COL_QUANTIDADE_LIVRO:
                return livro.getQuantidade();

        }
        return "";
    }

    @Override
    public String getColumnName(int colunas) {
        switch (colunas) {
            case COL_ID_LIVRO:
                return "Id";

            case COL_TITULO_LIVRO:
                return "Titulo";

            case COL_AUTOR_LIVRO:
                return "Autor";

            case COL_DISPONIVEIS_LIVRO:
                return "Disponíveis";

            case COL_QUANTIDADE_LIVRO:
                return "Quantidade";

        }
        return "";
    }

}
