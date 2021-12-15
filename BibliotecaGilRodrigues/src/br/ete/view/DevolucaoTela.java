package br.ete.view;

import br.ete.controller.EmprestimoController;
import br.ete.controller.LivroController;
import br.ete.dto.EmprestimoDto;
import br.ete.dto.LivroDto;
import br.ete.table.EmprestimoTableModel;
import br.ete.util.Conexao;
import br.ete.util.Corretores;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class DevolucaoTela extends javax.swing.JFrame {

    private EmprestimoController emprestimoController = new EmprestimoController();
    private LivroController livroController = new LivroController();
    private EmprestimoDto emprestimo = new EmprestimoDto();

    public DevolucaoTela() {
        super("Devolução");
        initComponents();
        listarTodosEmprestimos();

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        devolucaotb = new javax.swing.JTable();
        idtf = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        alunotf = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        titulolivrotf = new javax.swing.JTextField();
        expiradotf = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        dataemprestimotf = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        previsaodevolucaotf = new javax.swing.JTextField();
        idlivrotf = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        matriculatf = new javax.swing.JTextField();
        devolucaotf = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        devolverbt = new javax.swing.JButton();
        devolverbt1 = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        pesquisacb = new javax.swing.JComboBox<>();
        pesquisatf2 = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);

        devolucaotb.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Código", "Aluno", "Livro", "Atrasado", "Data Empréstimo", "Previsão Devol.", "Devolução", "Cód. Livro", "Matrícula"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        devolucaotb.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                devolucaotbMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(devolucaotb);
        if (devolucaotb.getColumnModel().getColumnCount() > 0) {
            devolucaotb.getColumnModel().getColumn(0).setResizable(false);
            devolucaotb.getColumnModel().getColumn(1).setResizable(false);
            devolucaotb.getColumnModel().getColumn(2).setResizable(false);
            devolucaotb.getColumnModel().getColumn(3).setResizable(false);
            devolucaotb.getColumnModel().getColumn(4).setResizable(false);
            devolucaotb.getColumnModel().getColumn(5).setResizable(false);
            devolucaotb.getColumnModel().getColumn(6).setResizable(false);
            devolucaotb.getColumnModel().getColumn(7).setResizable(false);
            devolucaotb.getColumnModel().getColumn(8).setResizable(false);
        }

        idtf.setEditable(false);
        idtf.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel6.setText("Código:");

        alunotf.setEditable(false);
        alunotf.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel5.setText("Livro:");

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel4.setText("Aluno:");

        titulolivrotf.setEditable(false);
        titulolivrotf.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N

        expiradotf.setEditable(false);
        expiradotf.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel7.setText("Expirado:");

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel8.setText("Data Empréstimo:");

        dataemprestimotf.setEditable(false);
        dataemprestimotf.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel9.setText("Previsão Devolução:");

        previsaodevolucaotf.setEditable(false);
        previsaodevolucaotf.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N

        idlivrotf.setEditable(false);
        idlivrotf.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N

        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel10.setText("Matricula:");

        jLabel11.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel11.setText("Cód. Livro:");

        matriculatf.setEditable(false);
        matriculatf.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N

        devolucaotf.setEditable(false);
        devolucaotf.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N

        jLabel12.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel12.setText("Devolução:");

        devolverbt.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        devolverbt.setText("Devolver");
        devolverbt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                devolverbtActionPerformed(evt);
            }
        });

        devolverbt1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        devolverbt1.setText("Sair");
        devolverbt1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                devolverbt1ActionPerformed(evt);
            }
        });

        pesquisacb.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        pesquisacb.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Escolha a opção de pesquisa:", "Nome Aluno", "Matrícula Aluno", "Título Livro" }));

        pesquisatf2.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        pesquisatf2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pesquisatf2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(devolverbt1, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(devolverbt, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(325, 325, 325))
            .addComponent(jScrollPane1)
            .addComponent(jSeparator1)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel6))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(alunotf)
                                    .addComponent(titulolivrotf)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(idtf, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(0, 0, Short.MAX_VALUE))))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel9)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(previsaodevolucaotf, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(32, 32, 32)
                                .addComponent(jLabel8)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(dataemprestimotf, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addGap(34, 34, 34)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel10)
                                    .addComponent(jLabel11))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(matriculatf)
                                    .addComponent(idlivrotf, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel12)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(devolucaotf, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel7)
                                        .addGap(18, 18, 18)
                                        .addComponent(expiradotf, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(81, 81, 81)))
                        .addGap(20, 20, 20))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(pesquisacb, javax.swing.GroupLayout.PREFERRED_SIZE, 223, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(pesquisatf2, javax.swing.GroupLayout.PREFERRED_SIZE, 433, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(idtf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(alunotf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(titulolivrotf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel9)
                            .addComponent(previsaodevolucaotf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(dataemprestimotf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel8)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(expiradotf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(jLabel10)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel11)
                            .addComponent(idlivrotf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(devolucaotf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel12)))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(matriculatf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 28, Short.MAX_VALUE)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(pesquisacb, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pesquisatf2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(14, 14, 14)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(devolverbt)
                    .addComponent(devolverbt1))
                .addGap(22, 22, 22))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void devolucaotbMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_devolucaotbMouseClicked
        idtf.setText(devolucaotb.getValueAt(devolucaotb.getSelectedRow(), EmprestimoTableModel.COL_ID_EMPRESTIMO).toString());
        alunotf.setText(devolucaotb.getValueAt(devolucaotb.getSelectedRow(), EmprestimoTableModel.COL_ALUNO_EMPRESTIMO).toString());
        titulolivrotf.setText(devolucaotb.getValueAt(devolucaotb.getSelectedRow(), EmprestimoTableModel.COL_TITULO_EMPRESTIMO).toString());
        matriculatf.setText(devolucaotb.getValueAt(devolucaotb.getSelectedRow(), EmprestimoTableModel.COL_MATRICULA_EMPRESTIMO).toString());
        idlivrotf.setText(devolucaotb.getValueAt(devolucaotb.getSelectedRow(), EmprestimoTableModel.COL_IDLIVRO_EMPRESTIMO).toString());
        expiradotf.setText(devolucaotb.getValueAt(devolucaotb.getSelectedRow(), EmprestimoTableModel.COL_ATRASADO_EMPRESTIMO).toString());
        dataemprestimotf.setText(devolucaotb.getValueAt(devolucaotb.getSelectedRow(), EmprestimoTableModel.COL_INICIO_EMPRESTIMO).toString());
        previsaodevolucaotf.setText(devolucaotb.getValueAt(devolucaotb.getSelectedRow(), EmprestimoTableModel.COL_PREVISAO_EMPRESTIMO).toString());
    }//GEN-LAST:event_devolucaotbMouseClicked

    private void devolverbtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_devolverbtActionPerformed
        if (titulolivrotf.getText().equals("") || idtf.equals("")) {
            JOptionPane.showMessageDialog(null, "É preciso selecionar algum livro para realizar o empréstimo.", "Empréstimo", JOptionPane.WARNING_MESSAGE);
        } else {
            emprestimo.setId(Long.parseLong(idtf.getText()));
            emprestimo.setNomeAluno(alunotf.getText());
            emprestimo.setTituloLivro(titulolivrotf.getText());
            emprestimo.setMatricula(matriculatf.getText());
            emprestimo.setIdLivro(Long.parseLong(idlivrotf.getText()));
            emprestimo.setAtrasado(Boolean.parseBoolean(expiradotf.getText()));
            emprestimo.setDataDeEmprestimo(dataemprestimotf.getText());
            emprestimo.setDataDeDevolucaoPrevista(previsaodevolucaotf.getText());
            confirmarDevolucao(emprestimo);
        }
    }//GEN-LAST:event_devolverbtActionPerformed

    private void devolverbt1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_devolverbt1ActionPerformed
        dispose();
    }//GEN-LAST:event_devolverbt1ActionPerformed

    private void pesquisatf2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pesquisatf2ActionPerformed
        if (pesquisacb.getSelectedIndex() == 0) {
            listarTodosEmprestimos();
        }        
        if (pesquisacb.getSelectedIndex() == 1) {
            listarTodosPorNomeAluno(pesquisatf2.getText());            
        }
        if (pesquisacb.getSelectedIndex() == 2) {
            listarTodosPorMatricula(pesquisatf2.getText());            
        }
        if(pesquisacb.getSelectedIndex() == 3){
            listarTodosPorTituloLivro(pesquisatf2.getText());
        }
    }//GEN-LAST:event_pesquisatf2ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField alunotf;
    private javax.swing.JTextField dataemprestimotf;
    private javax.swing.JTable devolucaotb;
    private javax.swing.JTextField devolucaotf;
    private javax.swing.JButton devolverbt;
    private javax.swing.JButton devolverbt1;
    private javax.swing.JTextField expiradotf;
    private javax.swing.JTextField idlivrotf;
    private javax.swing.JTextField idtf;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTextField matriculatf;
    private javax.swing.JComboBox<String> pesquisacb;
    private javax.swing.JTextField pesquisatf;
    private javax.swing.JTextField pesquisatf1;
    private javax.swing.JTextField pesquisatf2;
    private javax.swing.JTextField previsaodevolucaotf;
    private javax.swing.JTextField titulolivrotf;
    // End of variables declaration//GEN-END:variables

    public void listarTodosEmprestimos() {

        try {
            Connection conn = Conexao.getConnection();
            String sql = "SELECT * FROM EMPRESTIMO WHERE dataDeDevolucao is null ORDER BY id DESC";
            PreparedStatement stmt = conn.prepareStatement(sql);
            ResultSet rs = stmt.executeQuery();
            DefaultTableModel modeloTabela = (DefaultTableModel) devolucaotb.getModel();
            modeloTabela.setNumRows(0);

            while (rs.next()) {
                modeloTabela.addRow(new Object[]{rs.getString("id"), rs.getString("nomeAluno"), rs.getString("tituloLivro"), rs.getBoolean("atrasado"), Corretores.converterParaJava(rs.getString("dataDeEmprestimo")), Corretores.converterParaJava(rs.getString("dataDeDevolucaoPrevista")), rs.getString("dataDeDevolucao"), rs.getString("idLivro"), rs.getString("matricula")});
            }
            rs.close();
        } catch (SQLException e) {
            e.getMessage();
        }
    }
    
        public void listarTodosPorNomeAluno(String nomeAluno) {

        try {
            Connection conn = Conexao.getConnection();
            String sql = "SELECT * FROM EMPRESTIMO WHERE dataDeDevolucao is null AND nomeAluno = ? ";
            PreparedStatement stmt = conn.prepareStatement(sql);
            stmt.setString(1, nomeAluno);
            ResultSet rs = stmt.executeQuery();
            DefaultTableModel modeloTabela = (DefaultTableModel) devolucaotb.getModel();
            modeloTabela.setNumRows(0);

            while (rs.next()) {
                modeloTabela.addRow(new Object[]{rs.getString("id"), rs.getString("nomeAluno"), rs.getString("tituloLivro"), rs.getBoolean("atrasado"), Corretores.converterParaJava(rs.getString("dataDeEmprestimo")), Corretores.converterParaJava(rs.getString("dataDeDevolucaoPrevista")), rs.getString("dataDeDevolucao"), rs.getString("idLivro"), rs.getString("matricula")});
            }
            rs.close();
        } catch (SQLException e) {
            e.getMessage();
        }
    }
        
        public void listarTodosPorMatricula(String matricula) {

        try {
            Connection conn = Conexao.getConnection();
            String sql = "SELECT * FROM EMPRESTIMO WHERE dataDeDevolucao is null AND matricula = ?";
            PreparedStatement stmt = conn.prepareStatement(sql);
            stmt.setString(1, matricula);
            ResultSet rs = stmt.executeQuery();
            DefaultTableModel modeloTabela = (DefaultTableModel) devolucaotb.getModel();
            modeloTabela.setNumRows(0);

            while (rs.next()) {
                modeloTabela.addRow(new Object[]{rs.getString("id"), rs.getString("nomeAluno"), rs.getString("tituloLivro"), rs.getBoolean("atrasado"), Corretores.converterParaJava(rs.getString("dataDeEmprestimo")), Corretores.converterParaJava(rs.getString("dataDeDevolucaoPrevista")), rs.getString("dataDeDevolucao"), rs.getString("idLivro"), rs.getString("matricula")});
            }
            rs.close();
        } catch (SQLException e) {
            e.getMessage();
        }
    }
        
        public void listarTodosPorTituloLivro(String tituloLivro) {

        try {
            Connection conn = Conexao.getConnection();
            String sql = "SELECT * FROM EMPRESTIMO WHERE dataDeDevolucao is null AND tituloLivro = ?";
            PreparedStatement stmt = conn.prepareStatement(sql);
            stmt.setString(1, tituloLivro);
            ResultSet rs = stmt.executeQuery();
            DefaultTableModel modeloTabela = (DefaultTableModel) devolucaotb.getModel();
            modeloTabela.setNumRows(0);

            while (rs.next()) {
                modeloTabela.addRow(new Object[]{rs.getString("id"), rs.getString("nomeAluno"), rs.getString("tituloLivro"), rs.getBoolean("atrasado"), Corretores.converterParaJava(rs.getString("dataDeEmprestimo")), Corretores.converterParaJava(rs.getString("dataDeDevolucaoPrevista")), rs.getString("dataDeDevolucao"), rs.getString("idLivro"), rs.getString("matricula")});
            }
            rs.close();
        } catch (SQLException e) {
            e.getMessage();
        }
    }

    private void confirmarDevolucao(EmprestimoDto emprestimo) {
        ArrayList<LivroDto> livro = livroController.buscarPorTitulo(titulolivrotf.getText());
        int escolha = JOptionPane.showConfirmDialog(null, "Confirma a devolução? \n" + "Aluno: " + emprestimo.getNomeAluno() + "\n Matrícula: " + emprestimo.getMatricula() + "\n Livro: " + emprestimo.getTituloLivro(), "Empréstimo", JOptionPane.YES_NO_OPTION);
        if (escolha == 0) {
            if (livro.get(0).getDisponivel() >= livro.get(0).getQuantidade()) {
                JOptionPane.showMessageDialog(null, "Arcevo Completo!");
                dispose();

            } else {
                livro.get(0).setDisponivel(livro.get(0).getDisponivel() + 1);
                livroController.editar(livro.get(0));
                emprestimoController.devolverLivro(emprestimo);
                dispose();
            }
        }
    }
}
