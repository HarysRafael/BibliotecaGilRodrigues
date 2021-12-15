package br.ete.view;

import br.ete.dto.AlunoIntegralDto;
import br.ete.controller.AlunoIntegralController;
import br.ete.table.AlunoIntegralTableModel;
import java.sql.SQLException;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Connection;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import br.ete.util.Conexao;
import javax.swing.JFormattedTextField;
import javax.swing.text.MaskFormatter;

public class AlunoIntegralTela extends javax.swing.JFrame {

    private AlunoIntegralController alunoController = new AlunoIntegralController();
    private AlunoIntegralDto aluno = new AlunoIntegralDto();
    private MaskFormatter formatoTel;
    
    public AlunoIntegralTela() {
        super("Aluno Integral");
        initComponents();
        setVisible(true);
        listarTodos();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel5 = new javax.swing.JLabel();
        nometf = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        try{
            formatoTel = new MaskFormatter ("(##) #####-####");

        }catch(Exception e){
            JOptionPane.showMessageDialog(null, "Erro ao Inserir Campo", "Ero", 0);
        }
        telefonetf = new JFormattedTextField(formatoTel);
        turmatf = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        matriculatf = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        emailtf = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        nomeresponsaveltf = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        try{
            formatoTel = new MaskFormatter ("(##) #####-####");

        }catch(Exception e){
            JOptionPane.showMessageDialog(null, "Erro ao Inserir Campo", "Ero", 0);
        }
        telefoneresponsaveltf = new JFormattedTextField(formatoTel);
        jLabel12 = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        excluirbt = new javax.swing.JButton();
        cancelarbt = new javax.swing.JButton();
        novobt = new javax.swing.JButton();
        okbt = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        alunotb = new javax.swing.JTable();
        pesquisatf = new javax.swing.JTextField();
        pesquisacb = new javax.swing.JComboBox<>();
        jLabel13 = new javax.swing.JLabel();
        idtf = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel5.setText("Turma:");

        nometf.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel6.setText("Matrícula:");

        telefonetf.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N

        turmatf.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel8.setText("Telefone:");

        matriculatf.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel4.setText("Nome:");

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel7.setText("E-mail:");

        emailtf.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N

        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel10.setText("Dados do Responsável");

        jLabel11.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel11.setText("Nome:");

        nomeresponsaveltf.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel9.setText("Telefone:");

        telefoneresponsaveltf.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N

        jLabel12.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel12.setText("Dados do Aluno");

        excluirbt.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        excluirbt.setText("Excluir");
        excluirbt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                excluirbtActionPerformed(evt);
            }
        });

        cancelarbt.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        cancelarbt.setText("Cancelar");
        cancelarbt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelarbtActionPerformed(evt);
            }
        });

        novobt.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        novobt.setText("Novo");
        novobt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                novobtActionPerformed(evt);
            }
        });

        okbt.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        okbt.setText("OK");
        okbt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                okbtActionPerformed(evt);
            }
        });

        alunotb.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Matrícula", "Nome", "Turma", "Telefone", "E-mail", "Responsável", "Tel. Respons.", "Código"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        alunotb.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                alunotbMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(alunotb);
        if (alunotb.getColumnModel().getColumnCount() > 0) {
            alunotb.getColumnModel().getColumn(0).setResizable(false);
            alunotb.getColumnModel().getColumn(1).setResizable(false);
            alunotb.getColumnModel().getColumn(2).setResizable(false);
            alunotb.getColumnModel().getColumn(3).setResizable(false);
            alunotb.getColumnModel().getColumn(4).setResizable(false);
            alunotb.getColumnModel().getColumn(5).setResizable(false);
            alunotb.getColumnModel().getColumn(6).setResizable(false);
            alunotb.getColumnModel().getColumn(7).setResizable(false);
        }

        pesquisatf.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        pesquisatf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pesquisatfActionPerformed(evt);
            }
        });

        pesquisacb.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        pesquisacb.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Escolha a opção de pesquisa:", "Nome", "Matrícula" }));

        jLabel13.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel13.setText("Código:");

        idtf.setEditable(false);
        idtf.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel6)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel5)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(jLabel7)
                                        .addComponent(jLabel4)))
                                .addGap(1, 1, 1)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(matriculatf, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel13)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(idtf, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(nometf, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(emailtf)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(turmatf, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel8)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(telefonetf)))
                        .addGap(32, 32, 32))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel9)
                            .addComponent(jLabel11))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(nomeresponsaveltf)
                                .addGap(34, 34, 34))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(telefoneresponsaveltf, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))))
            .addComponent(jSeparator2, javax.swing.GroupLayout.Alignment.TRAILING)
            .addComponent(jScrollPane1)
            .addGroup(layout.createSequentialGroup()
                .addGap(234, 234, 234)
                .addComponent(jLabel12)
                .addContainerGap(235, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(75, 75, 75)
                        .addComponent(novobt, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(okbt, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(cancelarbt, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(excluirbt, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(pesquisacb, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(pesquisatf, javax.swing.GroupLayout.PREFERRED_SIZE, 398, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel10)
                .addGap(198, 198, 198))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(matriculatf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6)
                    .addComponent(jLabel13)
                    .addComponent(idtf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(nometf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(emailtf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(turmatf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8)
                    .addComponent(telefonetf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel11)
                    .addComponent(nomeresponsaveltf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(telefoneresponsaveltf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(novobt)
                    .addComponent(okbt)
                    .addComponent(cancelarbt)
                    .addComponent(excluirbt))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(pesquisatf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pesquisacb, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 14, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void limparCampos() {
        nometf.setText("");
        matriculatf.setText("");
        turmatf.setText("");
        emailtf.setText("");
        telefonetf.setText("");
        nomeresponsaveltf.setText("");
        telefoneresponsaveltf.setText("");
        idtf.setText("");

    }
    private void excluirbtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_excluirbtActionPerformed
        if (idtf.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Campo de Código está vazio, escolha um Aluno!", "Aluno Integral", JOptionPane.WARNING_MESSAGE);
        } else {
            int escolha = JOptionPane.showConfirmDialog(null, "Confirma a exclusão?", "Aluno Integral", JOptionPane.YES_NO_OPTION);
            if (escolha == 0) {
                alunoController.deletar(Long.parseLong(idtf.getText()));
                this.limparCampos();
            }
        }
        listarTodos();
    }//GEN-LAST:event_excluirbtActionPerformed

    private void cancelarbtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelarbtActionPerformed
        dispose();
    }//GEN-LAST:event_cancelarbtActionPerformed

    private void novobtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_novobtActionPerformed
        limparCampos();
        listarTodos();
    }//GEN-LAST:event_novobtActionPerformed

    private void okbtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_okbtActionPerformed
        if (nometf.getText().equals("") || matriculatf.equals("") || turmatf.getText().equals("") || emailtf.getText().equals("") || telefonetf.getText().equals("") || nomeresponsaveltf.getText().equals("") || telefoneresponsaveltf.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Preencha Todos os Campos!", "Erro!", JOptionPane.WARNING_MESSAGE);
        } else {
            if (idtf.getText().equals("")) {
                aluno.setMatricula(matriculatf.getText());
                aluno.setNome(nometf.getText());
                aluno.setTurma(turmatf.getText());
                aluno.setEmail(emailtf.getText());
                aluno.setTelefone(telefonetf.getText());
                aluno.setTelefoneResponsavel(telefoneresponsaveltf.getText());
                aluno.setNomeResponsavel(nomeresponsaveltf.getText());
                alunoController.salvar(aluno);
                
            } else {
                aluno.setId(Long.parseLong(idtf.getText()));
                aluno.setMatricula(matriculatf.getText());
                aluno.setNome(nometf.getText());
                aluno.setTurma(turmatf.getText());
                aluno.setEmail(emailtf.getText());
                aluno.setTelefone(telefonetf.getText());
                aluno.setTelefoneResponsavel(telefoneresponsaveltf.getText());
                aluno.setNomeResponsavel(nomeresponsaveltf.getText());
                alunoController.editar(aluno);

            }
        }
        listarTodos();
    }//GEN-LAST:event_okbtActionPerformed

    private void pesquisatfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pesquisatfActionPerformed
        if (pesquisacb.getSelectedIndex() == 1) {
            listarTodosNome(pesquisatf.getText());
        }
        if (pesquisacb.getSelectedIndex() == 2) {
            listarTodosMatricula(pesquisatf.getText());
        }
    }//GEN-LAST:event_pesquisatfActionPerformed

    private void alunotbMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_alunotbMouseClicked
        
        matriculatf.setText(alunotb.getValueAt(alunotb.getSelectedRow(), AlunoIntegralTableModel.COL_MATRICULA_ALUNO).toString());
        nometf.setText(alunotb.getValueAt(alunotb.getSelectedRow(), AlunoIntegralTableModel.COL_NOME_ALUNO).toString());
        turmatf.setText(alunotb.getValueAt(alunotb.getSelectedRow(), AlunoIntegralTableModel.COL_TURMA_ALUNO).toString());
        telefonetf.setText(alunotb.getValueAt(alunotb.getSelectedRow(), AlunoIntegralTableModel.COL_TELEFONE_ALUNO).toString());
        emailtf.setText(alunotb.getValueAt(alunotb.getSelectedRow(), AlunoIntegralTableModel.COL_EMAIL_ALUNO).toString());                
        nomeresponsaveltf.setText(alunotb.getValueAt(alunotb.getSelectedRow(), AlunoIntegralTableModel.COL_NOMERESPONSAVEL_ALUNO).toString());
        telefoneresponsaveltf.setText(alunotb.getValueAt(alunotb.getSelectedRow(), AlunoIntegralTableModel.COL_TELEFONERESPONSAVEL_ALUNO).toString());
        idtf.setText(alunotb.getValueAt(alunotb.getSelectedRow(), AlunoIntegralTableModel.COL_ID_ALUNO).toString());
    }//GEN-LAST:event_alunotbMouseClicked

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable alunotb;
    private javax.swing.JButton cancelarbt;
    private javax.swing.JTextField emailtf;
    private javax.swing.JButton excluirbt;
    private javax.swing.JTextField idtf;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JTextField matriculatf;
    private javax.swing.JTextField nomeresponsaveltf;
    private javax.swing.JTextField nometf;
    private javax.swing.JButton novobt;
    private javax.swing.JButton okbt;
    private javax.swing.JComboBox<String> pesquisacb;
    private javax.swing.JTextField pesquisatf;
    private javax.swing.JTextField telefoneresponsaveltf;
    private javax.swing.JTextField telefonetf;
    private javax.swing.JTextField turmatf;
    // End of variables declaration//GEN-END:variables

    public void listarTodos() {

        try {
            Connection conn = Conexao.getConnection();
            String sql = "Select * from alunointegral";
            PreparedStatement stmt = conn.prepareStatement(sql);
            ResultSet rs = stmt.executeQuery();
            DefaultTableModel modeloTabela = (DefaultTableModel) alunotb.getModel();
            modeloTabela.setNumRows(0);

            while (rs.next()) {
                modeloTabela.addRow(new Object[]{rs.getString("matricula"), rs.getString("nome"), rs.getString("turma"), rs.getString("telefone"), rs.getString("email"), rs.getString("nomeResponsavel"), rs.getString("telefoneResponsavel"), rs.getString("id")});

            }
            rs.close();
        } catch (SQLException e) {
            e.getMessage();
        }

    }
    
        public void listarTodosMatricula(String matricula) {

        try {
            Connection conn = Conexao.getConnection();
            String sql = "SELECT * FROM alunoIntegral WHERE matricula LIKE ?";
            PreparedStatement stmt = conn.prepareStatement(sql);
            stmt.setString(1, matricula);
            stmt.execute();
            ResultSet rs = stmt.executeQuery();
            DefaultTableModel modeloTabela = (DefaultTableModel) alunotb.getModel();
            modeloTabela.setNumRows(0);

            while (rs.next()) {
                modeloTabela.addRow(new Object[]{rs.getString("matricula"), rs.getString("nome"), rs.getString("turma"), rs.getString("telefone"), rs.getString("email"), rs.getString("nomeResponsavel"), rs.getString("telefoneResponsavel"), rs.getString("id")});

            }
            rs.close();
        } catch (SQLException e) {
            e.getMessage();
        }

    }
        
        
        public void listarTodosNome(String nome) {

        try {
            Connection conn = Conexao.getConnection();
            String sql = "SELECT * FROM alunoIntegral WHERE nome LIKE ?";
            PreparedStatement stmt = conn.prepareStatement(sql);
            stmt.setString(1, nome);
            stmt.execute();
            ResultSet rs = stmt.executeQuery();
            DefaultTableModel modeloTabela = (DefaultTableModel) alunotb.getModel();
            modeloTabela.setNumRows(0);

            while (rs.next()) {
                modeloTabela.addRow(new Object[]{rs.getString("matricula"), rs.getString("nome"), rs.getString("turma"), rs.getString("telefone"), rs.getString("email"), rs.getString("nomeResponsavel"), rs.getString("telefoneResponsavel"), rs.getString("id")});

            }
            rs.close();
        } catch (SQLException e) {
            e.getMessage();
        }

    }
    
}
