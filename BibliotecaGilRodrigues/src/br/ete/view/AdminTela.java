package br.ete.view;

import br.ete.controller.AdminController;

import br.ete.dto.AdminDto;
import br.ete.table.AdminTableModel;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class AdminTela extends javax.swing.JFrame {

    private AdminController adminController = new AdminController();
    private AdminDto admin = new AdminDto();

    public AdminTela() {
        super("Administrador");
        initComponents();
        setVisible(true);
        admintb.setModel(new AdminTableModel((ArrayList<AdminDto>) adminController.buscarTodos()));                
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        senhatf = new javax.swing.JPasswordField();
        jLabel6 = new javax.swing.JLabel();
        idtf = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        jScrollPane1 = new javax.swing.JScrollPane();
        admintb = new javax.swing.JTable();
        novobt = new javax.swing.JButton();
        okbt = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        cancelarbt = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        excluirbt = new javax.swing.JButton();
        logintf = new javax.swing.JTextField();

        setResizable(false);

        senhatf.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        senhatf.setText("0000000000");
        senhatf.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                senhatfMouseClicked(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel6.setText("Código:");

        idtf.setEditable(false);
        idtf.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N

        admintb.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, true, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        admintb.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                admintbMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(admintb);
        if (admintb.getColumnModel().getColumnCount() > 0) {
            admintb.getColumnModel().getColumn(0).setResizable(false);
            admintb.getColumnModel().getColumn(1).setResizable(false);
            admintb.getColumnModel().getColumn(2).setResizable(false);
            admintb.getColumnModel().getColumn(3).setResizable(false);
        }

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
        jLabel4.setText("Login:");

        cancelarbt.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        cancelarbt.setText("Cancelar");
        cancelarbt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelarbtActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel5.setText("Senha:");

        excluirbt.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        excluirbt.setText("Excluir");
        excluirbt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                excluirbtActionPerformed(evt);
            }
        });

        logintf.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        logintf.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                logintfMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSeparator1, javax.swing.GroupLayout.Alignment.TRAILING)
            .addComponent(jScrollPane1)
            .addGroup(layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel6)
                    .addComponent(jLabel5)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(logintf)
                    .addComponent(senhatf)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(idtf, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addGap(31, 31, 31))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(novobt, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(okbt, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(cancelarbt, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(excluirbt, javax.swing.GroupLayout.DEFAULT_SIZE, 139, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(idtf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(logintf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(senhatf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 22, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(novobt)
                    .addComponent(okbt)
                    .addComponent(cancelarbt)
                    .addComponent(excluirbt))
                .addGap(18, 18, 18)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(22, 22, 22)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void senhatfMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_senhatfMouseClicked
        senhatf.setText("");
    }//GEN-LAST:event_senhatfMouseClicked

    private void admintbMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_admintbMouseClicked
        idtf.setText(admintb.getValueAt(admintb.getSelectedRow(), AdminTableModel.COL_ID_ADMIN).toString());
        logintf.setText(admintb.getValueAt(admintb.getSelectedRow(), AdminTableModel.COL_LOGIN_ADMIN).toString());
    }//GEN-LAST:event_admintbMouseClicked

    private void novobtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_novobtActionPerformed
        limparCampos();
        admintb.setModel(new AdminTableModel((ArrayList<AdminDto>) new AdminController().buscarTodos()));
    }//GEN-LAST:event_novobtActionPerformed

    private void okbtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_okbtActionPerformed
        String senha = new String(senhatf.getPassword());
        if (logintf.getText().equals("") || senhatf.getPassword().equals("")) {
            JOptionPane.showMessageDialog(null, "Preencha Todos os Campos!", "Erro!", JOptionPane.WARNING_MESSAGE);
        } else {
            if (idtf.getText().equals("")) {
                admin.setLogin(logintf.getText());
                admin.setSenha(senha);
                adminController.salvar(admin);

            } else {
                admin.setId(Long.parseLong(idtf.getText()));
                admin.setLogin(logintf.getText());
                admin.setSenha(senha);
                adminController.editar(admin);
            }
        }
        limparCampos();
        admintb.setModel(new AdminTableModel((ArrayList<AdminDto>) new AdminController().buscarTodos()));
    }//GEN-LAST:event_okbtActionPerformed

    private void cancelarbtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelarbtActionPerformed
        dispose();
    }//GEN-LAST:event_cancelarbtActionPerformed

    private void excluirbtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_excluirbtActionPerformed
        if (idtf.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Campo de Código está vazio, escolha um Administrador!", "Administrador", JOptionPane.WARNING_MESSAGE);
        } else {
            int escolha = JOptionPane.showConfirmDialog(null, "Confirma a exclusão?", "Administrador", JOptionPane.YES_NO_OPTION);
            if (escolha == 0) {
                adminController.deletar(Long.parseLong(idtf.getText()));
                this.limparCampos();
                admintb.setModel(new AdminTableModel((ArrayList<AdminDto>) new AdminController().buscarTodos()));
            }
        }
    }//GEN-LAST:event_excluirbtActionPerformed

    private void logintfMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_logintfMouseClicked
        senhatf.setText("");
    }//GEN-LAST:event_logintfMouseClicked

    private void limparCampos() {
        idtf.setText("");
        logintf.setText("");
        senhatf.setText("");
    }

    


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable admintb;
    private javax.swing.JButton cancelarbt;
    private javax.swing.JButton excluirbt;
    private javax.swing.JTextField idtf;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTextField logintf;
    private javax.swing.JButton novobt;
    private javax.swing.JButton okbt;
    private javax.swing.JPasswordField senhatf;
    // End of variables declaration//GEN-END:variables
}
