package br.ete.dao;

import br.ete.model.Admin;
import br.ete.util.Conexao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class AdminDao {

    private ArrayList<Admin> lista = new ArrayList<Admin>();
    private Connection conn;    
    private PreparedStatement stmt;
    private ResultSet rs;
    private Statement st;

    public AdminDao() {
        conn = new Conexao().getConnection();
    }

    public void criar(Admin admin) {
        String sql = "INSERT INTO admin (login, senha) VALUES (?,?)";
        try {
            stmt = conn.prepareStatement(sql);
            stmt.setString(1, admin.getLogin());
            stmt.setString(2, admin.getSenha());
            stmt.execute();
            stmt.close();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro ao cadastrar Administrador: " + e.getMessage());

        }

    }

    public void editar(Admin admin) {
        String sql = "UPDATE admin SET login = ?, senha = ? WHERE id = ?";
        try {
            stmt = conn.prepareStatement(sql);
            stmt.setString(1, admin.getLogin());
            stmt.setString(2, admin.getSenha());
            stmt.setLong(3, admin.getId());
            stmt.execute();
            stmt.close();

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro ao editar Administrador: " + e.getMessage());
        }

    }

    public void deletar(Long id) {
        String sql = "DELETE FROM admin WHERE id =" + id;
        try {
            st = conn.createStatement();
            st.execute(sql);
            st.close();

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro ao deletar Administrador: " + e.getMessage());
        }
    }

    public ArrayList<Admin> listarTodos() {

        String sql = "SELECT * FROM admin";
        try {
            st = conn.createStatement();
            rs = st.executeQuery(sql);
            while (rs.next()) {
                Admin admin = new Admin();
                admin.setId(rs.getLong("id"));
                admin.setLogin(rs.getString("login"));
                admin.setSenha(rs.getString("senha"));
                lista.add(admin);
            }

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro ao listar Administradores: " + e.getMessage());
        }

        return lista;
    }

    public ArrayList<Admin> listarPorLogin(String login) {

        String sql = "SELECT * FROM admin WHERE login LIKE '%" + login + "%'";
        try {
            st = conn.createStatement();
            rs = st.executeQuery(sql);
            while (rs.next()) {
                Admin admin = new Admin();
                admin.setId(rs.getLong("id"));
                admin.setLogin(rs.getString("login"));
                admin.setSenha(rs.getString("senha"));
                lista.add(admin);
            }

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro ao listar Administradores: " + e.getMessage());
        }

        return lista;
    }

    public Admin buscarLoginSenha(String login, String senha) {
        Admin admin = new Admin();
        String sql = "SELECT * FROM admin WHERE login LIKE '%" + login + "%' AND senha LIKE'%" + senha + "%'";
        try {
            st = conn.createStatement();
            rs = st.executeQuery(sql);
            while (rs.next()) {
                admin.setId(rs.getLong("id"));
                admin.setLogin(rs.getString("login"));
                admin.setSenha(rs.getString("senha"));
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro ao buscar Administrador: " + e.getMessage());
        }
        return admin;

    }

}
