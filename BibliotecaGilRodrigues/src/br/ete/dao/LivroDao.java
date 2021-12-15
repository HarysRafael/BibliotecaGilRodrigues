package br.ete.dao;

import br.ete.model.Livro;
import br.ete.util.Conexao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class LivroDao {

    private ArrayList<Livro> lista = new ArrayList<Livro>();
    private Connection conn;
    private PreparedStatement stmt;
    private ResultSet rs;
    private Statement st;

    public LivroDao() {
        conn = new Conexao().getConnection();
    }

    public void criar(Livro livro) {
        String sql = "INSERT INTO livro (titulo, autor, quantidade, disponivel) VALUES (?,?,?,?)";
        try {
            stmt = conn.prepareStatement(sql);
            stmt.setString(1, livro.getTitulo());
            stmt.setString(2, livro.getAutor());
            stmt.setInt(3, livro.getQuantidade());
            stmt.setInt(4, livro.getDisponivel());
            stmt.execute();
            stmt.close();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro ao cadastrar Livro: " + e.getMessage());
        }

    }

    public void editar(Livro livro) {
        String sql = "UPDATE livro SET titulo = ?, autor = ?, quantidade = ?, disponivel = ? WHERE id = ?";
        try {
            stmt = conn.prepareStatement(sql);
            stmt.setString(1, livro.getTitulo());
            stmt.setString(2, livro.getAutor());
            stmt.setInt(3, livro.getQuantidade());
            stmt.setInt(4, livro.getDisponivel());
            stmt.setLong(5, livro.getId());
            stmt.execute();
            stmt.close();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro ao editar Livro: " + e.getMessage());
        }

    }

    public void deletar(Long id) {
        String sql = "DELETE FROM livro WHERE id =" + id;
        try {
            st = conn.createStatement();
            st.execute(sql);
            st.close();

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro ao deletar Livro: " + e.getMessage());
        }
    }

    public ArrayList<Livro> listarPorTitulo(String titulo) {
        String sql = "SELECT * FROM livro WHERE titulo LIKE '%" + titulo + "%'";
        try {
            st = conn.createStatement();
            rs = st.executeQuery(sql);
            while (rs.next()) {
                Livro livro = new Livro();
                livro.setId(rs.getLong("id"));
                livro.setTitulo(rs.getString("titulo"));
                livro.setAutor(rs.getString("autor"));
                livro.setDisponivel(rs.getInt("disponivel"));
                livro.setQuantidade(rs.getInt("quantidade"));
                lista.add(livro);
            }

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro ao listar Livros: " + e.getMessage());
        }

        return lista;
    }

}
