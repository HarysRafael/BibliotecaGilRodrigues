package br.ete.dao;

import br.ete.model.AlunoSubsequente;
import br.ete.util.Conexao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class AlunoSubsequenteDao {
    
    
    private ArrayList<AlunoSubsequente> lista = new ArrayList<AlunoSubsequente>();
    private Connection conn;
    private PreparedStatement stmt;
    private ResultSet rs;
    private Statement st;

    public AlunoSubsequenteDao() {
        conn = new Conexao().getConnection();
    }

    public void criar(AlunoSubsequente aluno) {
        String sql = "INSERT INTO alunoSubsequente (matricula, nome, turma, email, telefone, cpf) VALUES (?,?,?,?,?,?)";
        try {
            stmt = conn.prepareStatement(sql);
            stmt.setString(1, aluno.getMatricula());
            stmt.setString(2, aluno.getNome());
            stmt.setString(3, aluno.getTurma());
            stmt.setString(4, aluno.getEmail());
            stmt.setString(5, aluno.getTelefone());
            stmt.setString(6, aluno.getCpf());            
            stmt.execute();
            stmt.close();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro ao cadastrar Aluno: " + e.getMessage());

        }

    }

    public void editar(AlunoSubsequente aluno) {
        String sql = "UPDATE alunoSubsequente SET matricula = ?, nome = ?, turma = ?, email = ?, telefone = ?, cpf = ? WHERE id = ?";
        try {
            stmt = conn.prepareStatement(sql);
            stmt.setString(1, aluno.getMatricula());
            stmt.setString(2, aluno.getNome());
            stmt.setString(3, aluno.getTurma());
            stmt.setString(4, aluno.getEmail());
            stmt.setString(5, aluno.getTelefone());
            stmt.setString(6, aluno.getCpf());            
            stmt.setLong(7, aluno.getId());
            stmt.execute();
            stmt.close();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro ao editar Aluno: " + e.getMessage());
        }

    }

    public void deletar(Long id) {
        String sql = "DELETE FROM alunoSubsequente WHERE id =" + id;
        try {
            st = conn.createStatement();
            st.execute(sql);
            st.close();

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro ao deletar Aluno: " + e.getMessage());
        }
    }


    public ArrayList<AlunoSubsequente> buscarPorMatricula(String matricula) {

        String sql = "SELECT * FROM alunoSubsequente WHERE matricula LIKE '%" + matricula + "%'";
        try {
            st = conn.createStatement();
            rs = st.executeQuery(sql);
            while (rs.next()) {
                AlunoSubsequente aluno = new AlunoSubsequente();
                aluno.setId(rs.getLong("id"));
                aluno.setMatricula(rs.getString("matricula"));
                aluno.setNome(rs.getString("nome"));
                aluno.setTurma(rs.getString("turma"));
                aluno.setTelefone(rs.getString("telefone"));
                aluno.setEmail(rs.getString("email"));
                aluno.setCpf(rs.getString("cpf"));                
                lista.add(aluno);
            }

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro ao buscar Aluno: " + e.getMessage());
        }

        return lista;
    }

    public ArrayList<AlunoSubsequente> buscarPorNome(String nome) {

        String sql = "SELECT * FROM alunoSubsequente WHERE nome LIKE '%" + nome + "%'";
        try {
            st = conn.createStatement();
            rs = st.executeQuery(sql);
            while (rs.next()) {
                AlunoSubsequente aluno = new AlunoSubsequente();
                aluno.setId(rs.getLong("id"));
                aluno.setMatricula(rs.getString("matricula"));
                aluno.setNome(rs.getString("nome"));
                aluno.setTurma(rs.getString("turma"));
                aluno.setTelefone(rs.getString("telefone"));
                aluno.setEmail(rs.getString("email"));                
                aluno.setCpf(rs.getString("cpf"));                
                lista.add(aluno);
            }

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro ao buscar Aluno: " + e.getMessage());
        }

        return lista;
    }

    
}
