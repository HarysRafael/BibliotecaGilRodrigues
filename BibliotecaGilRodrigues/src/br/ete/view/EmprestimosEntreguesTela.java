package br.ete.view;

import br.ete.controller.EmprestimoController;
import br.ete.controller.LivroController;
import br.ete.dto.EmprestimoDto;
import br.ete.table.EmprestimoTableModel;
import br.ete.util.Conexao;
import br.ete.util.Corretores;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class EmprestimosEntreguesTela extends javax.swing.JFrame {

    private EmprestimoController emprestimoController = new EmprestimoController();
    private LivroController livroController = new LivroController();
    private EmprestimoDto emprestimo = new EmprestimoDto();

    public EmprestimosEntreguesTela() {
        super("Empréstimos Entregues");
        initComponents();
        listarTodosEntregues();

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel9 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        devolucaotb = new javax.swing.JTable();
        dataemprestimotf = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        expiradotf = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        titulolivrotf = new javax.swing.JTextField();
        devolucaotf = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        matriculatf = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        alunotf = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        idlivrotf = new javax.swing.JTextField();
        idtf = new javax.swing.JTextField();
        previsaodevolucaotf = new javax.swing.JTextField();
        sairbt = new javax.swing.JButton();
        apagarbt = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel9.setText("Previsão Devolução:");

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

        dataemprestimotf.setEditable(false);
        dataemprestimotf.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel8.setText("Data Empréstimo:");

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel7.setText("Expirado:");

        expiradotf.setEditable(false);
        expiradotf.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N

        jLabel12.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel12.setText("Devolução:");

        titulolivrotf.setEditable(false);
        titulolivrotf.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N

        devolucaotf.setEditable(false);
        devolucaotf.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel4.setText("Aluno:");

        matriculatf.setEditable(false);
        matriculatf.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel5.setText("Livro:");

        jLabel11.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel11.setText("Cód. Livro:");

        alunotf.setEditable(false);
        alunotf.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N

        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel10.setText("Matricula:");

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel6.setText("Código:");

        idlivrotf.setEditable(false);
        idlivrotf.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N

        idtf.setEditable(false);
        idtf.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N

        previsaodevolucaotf.setEditable(false);
        previsaodevolucaotf.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N

        sairbt.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        sairbt.setText("Sair");
        sairbt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sairbtActionPerformed(evt);
            }
        });

        apagarbt.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        apagarbt.setText("Apagar Registros");
        apagarbt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                apagarbtActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(266, 266, 266)
                .addComponent(apagarbt)
                .addGap(18, 18, 18)
                .addComponent(sairbt, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(330, Short.MAX_VALUE))
            .addComponent(jScrollPane1)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addContainerGap()
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
                    .addGap(20, 20, 20)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(206, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(19, 19, 19)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(apagarbt)
                    .addComponent(sairbt))
                .addGap(24, 24, 24))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(19, 19, 19)
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
                    .addContainerGap(189, Short.MAX_VALUE)))
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
        devolucaotf.setText(devolucaotb.getValueAt(devolucaotb.getSelectedRow(), EmprestimoTableModel.COL_DEVOLUCAO_EMPRESTIMO).toString());
    }//GEN-LAST:event_devolucaotbMouseClicked

    private void sairbtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sairbtActionPerformed
        dispose();
    }//GEN-LAST:event_sairbtActionPerformed

    private void apagarbtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_apagarbtActionPerformed
        int escolha = JOptionPane.showConfirmDialog(null, "Confirma a exclusão de todos os registros de empréstimos entregues?", "Empréstimos", JOptionPane.YES_NO_OPTION);
        if (escolha == 1) {
            listarTodosEntregues();

        } else {
            emprestimoController.deletarTodosEntregues();
            listarTodosEntregues();
        }
    }//GEN-LAST:event_apagarbtActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField alunotf;
    private javax.swing.JButton apagarbt;
    private javax.swing.JTextField dataemprestimotf;
    private javax.swing.JTable devolucaotb;
    private javax.swing.JTextField devolucaotf;
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
    private javax.swing.JTextField matriculatf;
    private javax.swing.JTextField previsaodevolucaotf;
    private javax.swing.JButton sairbt;
    private javax.swing.JTextField titulolivrotf;
    // End of variables declaration//GEN-END:variables

    public void listarTodosEntregues() {

        try {
            Connection conn = Conexao.getConnection();
            String sql = "SELECT * FROM emprestimo WHERE dataDeDevolucao IS NOT NULL ORDER BY id DESC";
            PreparedStatement stmt = conn.prepareStatement(sql);
            ResultSet rs = stmt.executeQuery();
            DefaultTableModel modeloTabela = (DefaultTableModel) devolucaotb.getModel();
            modeloTabela.setNumRows(0);

            while (rs.next()) {
                modeloTabela.addRow(new Object[]{rs.getString("id"), rs.getString("nomeAluno"), rs.getString("tituloLivro"), rs.getBoolean("atrasado"), Corretores.converterParaJava(rs.getString("dataDeEmprestimo")), Corretores.converterParaJava(rs.getString("dataDeDevolucaoPrevista")), Corretores.converterParaJava(rs.getString("dataDeDevolucao")), rs.getString("idLivro"), rs.getString("matricula")});
            }
            rs.close();
        } catch (SQLException e) {
            e.getMessage();
        }
    }

}
