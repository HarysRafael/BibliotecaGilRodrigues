package br.ete.dao;

import br.ete.model.Emprestimo;
import br.ete.util.Conexao;
import br.ete.util.Corretores;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class EmprestimoDao {

    private ArrayList<Emprestimo> lista = new ArrayList<Emprestimo>();
    private Connection conn;
    private Corretores corretores;
    private PreparedStatement stmt;
    private ResultSet rs;
    private Statement st;
    private LocalDate dataAtual;
    private DateTimeFormatter formatoData = DateTimeFormatter.ofPattern("dd/MM/yyyy");

    public EmprestimoDao() {
        conn = new Conexao().getConnection();
        this.dataAtual = LocalDate.now();
    }

    public void criar(Emprestimo emprestimo) {
        String sql = "INSERT INTO emprestimo (dataDeDevolucaoPrevista, dataDeEmprestimo, nomeAluno, idLivro, tituloLivro, matricula, atrasado) VALUES (?,?,?,?,?,?,?)";
        try {
            stmt = conn.prepareStatement(sql);
            stmt.setString(1, corretores.converterParaSql(formatoData.format(this.dataAtual.plusDays(7))));
            stmt.setString(2, corretores.converterParaSql(formatoData.format(this.dataAtual)));
            stmt.setString(3, emprestimo.getNomeAluno());
            stmt.setLong(4, emprestimo.getIdLivro());
            stmt.setString(5, emprestimo.getTituloLivro());
            stmt.setString(6, emprestimo.getMatricula());
            stmt.setBoolean(7, emprestimo.isAtrasado());
            stmt.execute();
            stmt.close();

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro ao cadastrar Empréstimo: " + e.getMessage());

        }

    }

    public void atualizaStatusEmprestimo() {
        String sql = "UPDATE emprestimo SET atrasado = 1 WHERE dataDeDevolucao IS NULL AND dataDeDevolucaoPrevista < ?";
        try {
            stmt = conn.prepareStatement(sql);
            stmt.setString(1, corretores.converterParaSql(formatoData.format(this.dataAtual)));
            stmt.execute();
            stmt.close();

        } catch (SQLException e) {

        }
    }

    public void devolverLivro(Emprestimo emprestimo) {
        String sql = "UPDATE emprestimo SET dataDeDevolucao = ? WHERE id = ?";
        try {
            stmt = conn.prepareStatement(sql);
            stmt.setString(1, corretores.converterParaSql(formatoData.format(this.dataAtual)));
            stmt.setLong(2, emprestimo.getId());
            stmt.execute();
            stmt.close();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro devolver Livro: " + e.getMessage());
        }
    }

    public void deletar(Long id) {
        String sql = "DELETE FROM emprestimo WHERE id =" + id;
        try {
            st = conn.createStatement();
            st.execute(sql);
            st.close();

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro ao deletar Empréstimo: " + e.getMessage());
        }
    }


    public void deletarTodosEntregues() {

        String sql = "DELETE FROM emprestimo WHERE dataDeDevolucao IS NOT NULL";
        try {
            stmt = conn.prepareStatement(sql);            
            stmt.execute(sql);
            stmt.close();

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro ao deletar Empréstimos: " + e.getMessage());
        }
    }

}
