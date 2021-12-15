package br.ete.table;

import br.ete.dto.AdminDto;
import java.util.ArrayList;
import javax.swing.table.AbstractTableModel;

public class AdminTableModel extends AbstractTableModel {

    public static final int COL_ID_ADMIN = 0;
    public static final int COL_LOGIN_ADMIN = 1;
    public ArrayList<AdminDto> lista;

    public AdminTableModel(ArrayList<AdminDto> listaAdmin) {
        lista = new ArrayList<AdminDto>(listaAdmin);
    }

    public AdminTableModel() {
        
    }

    @Override
    public int getRowCount() {
        return lista.size();
    }

    @Override
    public int getColumnCount() {
        return 2;
    }

    @Override
    public Object getValueAt(int linhas, int colunas) {
        AdminDto admin = lista.get(linhas);
        if (colunas == COL_ID_ADMIN) {
            return admin.getId();
        }
        if (colunas == COL_LOGIN_ADMIN) {
            return admin.getLogin();
        }
        return "";
    }

    @Override
    public String getColumnName(int colunas) {
        if (colunas == COL_ID_ADMIN) {
            return "Código";
        }
        if (colunas == COL_LOGIN_ADMIN) {
            return "Login";

        }
        return "";

    }

}
