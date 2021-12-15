package br.ete.dao;

import br.ete.model.AlunoIntegral;
import br.ete.util.Conexao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class AlunoIntegralDao {

    private ArrayList<AlunoIntegral> lista = new ArrayList<AlunoIntegral>();
    private Connection conn;
    private PreparedStatement stmt;
    private ResultSet rs;
    private Statement st;

    public AlunoIntegralDao() {
        conn = new Conexao().getConnection();
    }

    public void criar(AlunoIntegral aluno) {
        String sql = "INSERT INTO alunoIntegral (matricula, nome, turma, email, telefone, nomeResponsavel, telefoneResponsavel) VALUES (?,?,?,?,?,?,?)";
        try {
            stmt = conn.prepareStatement(sql);
            stmt.setString(1, aluno.getMatricula());
            stmt.setString(2, aluno.getNome());
            stmt.setString(3, aluno.getTurma());
            stmt.setString(4, aluno.getEmail());
            stmt.setString(5, aluno.getTelefone());
            stmt.setString(6, aluno.getNomeResponsavel());
            stmt.setString(7, aluno.getTelefoneResponsavel());
            stmt.execute();
            stmt.close();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro ao cadastrar Aluno: " + e.getMessage());

        }

    }

    public void editar(AlunoIntegral aluno) {
        String sql = "UPDATE alunoIntegral SET matricula = ?, nome = ?, turma = ?, email = ?, telefone = ?, nomeResponsavel = ?, telefoneResponsavel = ? WHERE id = ?";
        try {
            stmt = conn.prepareStatement(sql);
            stmt.setString(1, aluno.getMatricula());
            stmt.setString(2, aluno.getNome());
            stmt.setString(3, aluno.getTurma());
            stmt.setString(4, aluno.getEmail());
            stmt.setString(5, aluno.getTelefone());
            stmt.setString(6, aluno.getNomeResponsavel());
            stmt.setString(7, aluno.getTelefoneResponsavel());
            stmt.setLong(8, aluno.getId());
            stmt.execute();
            stmt.close();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro ao editar Aluno: " + e.getMessage());
        }

    }

    public void deletar(Long id) {
        String sql = "DELETE FROM alunoIntegral WHERE id =" + id;
        try {
            st = conn.createStatement();
            st.execute(sql);
            st.close();

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro ao deletar Aluno: " + e.getMessage());
        }
    }


    public ArrayList<AlunoIntegral> buscarPorMatricula(String matricula) {

        String sql = "SELECT * FROM alunoIntegral WHERE matricula LIKE '%" + matricula + "%'";
        try {
            st = conn.createStatement();
            rs = st.executeQuery(sql);
            while (rs.next()) {
                AlunoIntegral aluno = new AlunoIntegral();
                aluno.setId(rs.getLong("id"));
                aluno.setMatricula(rs.getString("matricula"));
                aluno.setNome(rs.getString("nome"));
                aluno.setTurma(rs.getString("turma"));
                aluno.setTelefone(rs.getString("telefone"));
                aluno.setEmail(rs.getString("email"));
                aluno.setNomeResponsavel(rs.getString("nomeResponsavel"));
                aluno.setTelefoneResponsavel(rs.getString("telefoneResponsavel"));
                lista.add(aluno);
            }

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro ao buscar Aluno: " + e.getMessage());
        }

        return lista;
    }

    public ArrayList<AlunoIntegral> buscarPorNome(String nome) {

        String sql = "SELECT * FROM alunoIntegral WHERE nome LIKE '%" + nome + "%'";
        try {
            st = conn.createStatement();
            rs = st.executeQuery(sql);
            while (rs.next()) {
                AlunoIntegral aluno = new AlunoIntegral();
                aluno.setId(rs.getLong("id"));
                aluno.setMatricula(rs.getString("matricula"));
                aluno.setNome(rs.getString("nome"));
                aluno.setTurma(rs.getString("turma"));
                aluno.setTelefone(rs.getString("telefone"));
                aluno.setEmail(rs.getString("email"));
                aluno.setNomeResponsavel(rs.getString("nomeResponsavel"));
                aluno.setTelefoneResponsavel(rs.getString("telefoneResponsavel"));
                lista.add(aluno);
            }

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro ao buscar Aluno: " + e.getMessage());
        }

        return lista;
    }

}
