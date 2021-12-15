package br.ete.view;

import br.ete.controller.LivroController;
import br.ete.dto.LivroDto;
import br.ete.table.LivroTableModel;
import br.ete.util.Conexao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class LivroTela extends javax.swing.JFrame {

    LivroController livroController = new LivroController();
    LivroDto livro = new LivroDto();

    public LivroTela() {
        super("Livro");
        initComponents();
        setVisible(true);
        listarTodos();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        cancelarbt = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        excluirbt = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        titulotf = new javax.swing.JTextField();
        idtf = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        novobt = new javax.swing.JButton();
        okbt = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        autortf = new javax.swing.JTextField();
        quantidadetf = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        disponiveistf = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        pesquisartf = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        livrotb = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);

        cancelarbt.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        cancelarbt.setText("Cancelar");
        cancelarbt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelarbtActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel5.setText("Autores:");

        excluirbt.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        excluirbt.setText("Excluir");
        excluirbt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                excluirbtActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel6.setText("Código:");

        titulotf.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N

        idtf.setEditable(false);
        idtf.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N

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

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel4.setText("Título:");

        autortf.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N

        quantidadetf.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel7.setText("Pesquisar: (Título)");

        disponiveistf.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel8.setText("Disponíveis:");

        pesquisartf.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        pesquisartf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pesquisartfActionPerformed(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel9.setText("Quantidade:");

        livrotb.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Código", "Título", "Autor", "Quantidade", "Dispoíveis"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        livrotb.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                livrotbMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(livrotb);
        if (livrotb.getColumnModel().getColumnCount() > 0) {
            livrotb.getColumnModel().getColumn(0).setResizable(false);
            livrotb.getColumnModel().getColumn(1).setResizable(false);
            livrotb.getColumnModel().getColumn(2).setResizable(false);
            livrotb.getColumnModel().getColumn(4).setResizable(false);
        }

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSeparator1, javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel9)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(quantidadetf, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel8)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(disponiveistf, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel6)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel4))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(titulotf)
                                    .addComponent(autortf)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(idtf, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(0, 0, Short.MAX_VALUE))))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(novobt, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(okbt, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(cancelarbt, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(excluirbt, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(pesquisartf, javax.swing.GroupLayout.PREFERRED_SIZE, 352, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
            .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.TRAILING)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(42, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(idtf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(titulotf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(autortf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(quantidadetf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(disponiveistf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel8))
                    .addComponent(jLabel9, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(novobt)
                    .addComponent(okbt)
                    .addComponent(cancelarbt)
                    .addComponent(excluirbt))
                .addGap(18, 18, 18)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(14, 14, 14)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(pesquisartf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void limparCampos() {
        titulotf.setText("");
        autortf.setText("");
        disponiveistf.setText("");
        quantidadetf.setText("");
        idtf.setText("");
    }

    private void cancelarbtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelarbtActionPerformed
        dispose();
    }//GEN-LAST:event_cancelarbtActionPerformed

    private void excluirbtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_excluirbtActionPerformed
        if (idtf.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Campo de Código está vazio, escolha um Livro!", "Livro", JOptionPane.WARNING_MESSAGE);
        } else {
            int escolha = JOptionPane.showConfirmDialog(null, "Confirma a exclusão?", "Administrador", JOptionPane.YES_NO_OPTION);
            if (escolha == 0) {
                livroController.deletar(Long.parseLong(idtf.getText()));
                this.limparCampos();
            }
        }
        listarTodos();
    }//GEN-LAST:event_excluirbtActionPerformed

    private void novobtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_novobtActionPerformed
        limparCampos();
        listarTodos();
    }//GEN-LAST:event_novobtActionPerformed

    private void okbtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_okbtActionPerformed

        if (titulotf.getText().equals("") || autortf.getText().equals("") || quantidadetf.getText().equals("") || disponiveistf.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Preencha Todos os Campos!", "Erro!", JOptionPane.WARNING_MESSAGE);

        } else if (Integer.parseInt(disponiveistf.getText()) > Integer.parseInt(quantidadetf.getText())) {
            JOptionPane.showMessageDialog(null, "Livros disponíveis acima da quantidade total!", "Erro!", JOptionPane.WARNING_MESSAGE);

        } else {
            if (idtf.getText().equals("")) {
                livro.setTitulo(titulotf.getText());
                livro.setAutor(autortf.getText());
                livro.setQuantidade(Integer.parseInt(quantidadetf.getText()));
                livro.setDisponivel(Integer.parseInt(disponiveistf.getText()));
                livroController.salvar(livro);

            } else {
                livro.setId(Long.parseLong(idtf.getText()));
                livro.setTitulo(titulotf.getText());
                livro.setAutor(autortf.getText());
                livro.setQuantidade(Integer.parseInt(quantidadetf.getText()));
                livro.setDisponivel(Integer.parseInt(disponiveistf.getText()));
                livroController.editar(livro);
            }
        }
        limparCampos();
        listarTodos();
    }//GEN-LAST:event_okbtActionPerformed

    private void livrotbMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_livrotbMouseClicked
        idtf.setText(livrotb.getValueAt(livrotb.getSelectedRow(), LivroTableModel.COL_ID_LIVRO).toString());
        titulotf.setText(livrotb.getValueAt(livrotb.getSelectedRow(), LivroTableModel.COL_TITULO_LIVRO).toString());
        autortf.setText(livrotb.getValueAt(livrotb.getSelectedRow(), LivroTableModel.COL_AUTOR_LIVRO).toString());
        quantidadetf.setText(livrotb.getValueAt(livrotb.getSelectedRow(), LivroTableModel.COL_QUANTIDADE_LIVRO).toString());
        disponiveistf.setText(livrotb.getValueAt(livrotb.getSelectedRow(), LivroTableModel.COL_DISPONIVEIS_LIVRO).toString());
    }//GEN-LAST:event_livrotbMouseClicked

    private void pesquisartfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pesquisartfActionPerformed
        listarTodosPorTitulo(pesquisartf.getText());
    }//GEN-LAST:event_pesquisartfActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField autortf;
    private javax.swing.JButton cancelarbt;
    private javax.swing.JTextField disponiveistf;
    private javax.swing.JButton excluirbt;
    private javax.swing.JTextField idtf;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTable livrotb;
    private javax.swing.JButton novobt;
    private javax.swing.JButton okbt;
    private javax.swing.JTextField pesquisartf;
    private javax.swing.JTextField quantidadetf;
    private javax.swing.JTextField titulotf;
    // End of variables declaration//GEN-END:variables

    public void listarTodos() {

        try {
            Connection conn = Conexao.getConnection();
            String sql = "Select * from livro";
            PreparedStatement stmt = conn.prepareStatement(sql);
            ResultSet rs = stmt.executeQuery();
            DefaultTableModel modeloTabela = (DefaultTableModel) livrotb.getModel();
            modeloTabela.setNumRows(0);

            while (rs.next()) {
                modeloTabela.addRow(new Object[]{rs.getString("id"), rs.getString("titulo"), rs.getString("autor"), rs.getInt("quantidade"), rs.getInt("disponivel")});

            }
            rs.close();
        } catch (SQLException e) {
            e.getMessage();
        }

    }

    public void listarTodosPorTitulo(String titulo) {

        try {
            Connection conn = Conexao.getConnection();
            String sql = "Select * from livro WHERE titulo LIKE ?";
            PreparedStatement stmt = conn.prepareStatement(sql);
            stmt.setString(1, titulo);
            stmt.execute();
            ResultSet rs = stmt.executeQuery();
            DefaultTableModel modeloTabela = (DefaultTableModel) livrotb.getModel();
            modeloTabela.setNumRows(0);

            while (rs.next()) {
                modeloTabela.addRow(new Object[]{rs.getString("id"), rs.getString("titulo"), rs.getString("autor"), rs.getInt("quantidade"), rs.getInt("disponivel")});

            }
            rs.close();
        } catch (SQLException e) {
            e.getMessage();
        }

    }

}
