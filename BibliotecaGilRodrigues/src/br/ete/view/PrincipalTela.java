package br.ete.view;

import br.ete.controller.EmprestimoController;


public class PrincipalTela extends javax.swing.JFrame {        

    private EmprestimoController emprestimoController = new EmprestimoController();
           
    public PrincipalTela() {
        super("Principal");
        initComponents();        
        setVisible(true);
        emprestimoController.atualizarStatusEmprestimo();
    }

    
            
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel3 = new javax.swing.JLabel();
        regularesbt = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        expiradosbt = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        entreguesbt = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        jSeparator3 = new javax.swing.JSeparator();
        alunointegralbt = new javax.swing.JButton();
        alunosubsequentebt = new javax.swing.JButton();
        livrosbt = new javax.swing.JButton();
        emprestimobt = new javax.swing.JButton();
        devolucaobt = new javax.swing.JButton();
        sairbt = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Principal");
        setResizable(false);

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("CADASTROS");

        regularesbt.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        regularesbt.setText("Regulares");
        regularesbt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                regularesbtActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("SOLICITAÇÕES");

        expiradosbt.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        expiradosbt.setText("Expirados");
        expiradosbt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                expiradosbtActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("EMPRÉSTIMOS");

        entreguesbt.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        entreguesbt.setText("Entregues");
        entreguesbt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                entreguesbtActionPerformed(evt);
            }
        });

        jSeparator1.setOrientation(javax.swing.SwingConstants.VERTICAL);

        jSeparator2.setOrientation(javax.swing.SwingConstants.VERTICAL);

        alunointegralbt.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        alunointegralbt.setText("Aluno Integral");
        alunointegralbt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                alunointegralbtActionPerformed(evt);
            }
        });

        alunosubsequentebt.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        alunosubsequentebt.setText("Aluno Subsequente");
        alunosubsequentebt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                alunosubsequentebtActionPerformed(evt);
            }
        });

        livrosbt.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        livrosbt.setText("Livros");
        livrosbt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                livrosbtActionPerformed(evt);
            }
        });

        emprestimobt.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        emprestimobt.setText("Empréstimo");
        emprestimobt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                emprestimobtActionPerformed(evt);
            }
        });

        devolucaobt.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        devolucaobt.setText("Devolução");
        devolucaobt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                devolucaobtActionPerformed(evt);
            }
        });

        sairbt.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        sairbt.setText("Sair");
        sairbt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sairbtActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(alunointegralbt, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(alunosubsequentebt, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(livrosbt, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(31, 31, 31)
                        .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(37, 37, 37)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(devolucaobt, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(emprestimobt, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(26, 26, 26)
                                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(56, 56, 56)
                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(expiradosbt, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(regularesbt, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(entreguesbt, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jSeparator3))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(290, 290, 290)
                .addComponent(sairbt, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel3)
                        .addGap(37, 37, 37)
                        .addComponent(alunointegralbt)
                        .addGap(18, 18, 18)
                        .addComponent(alunosubsequentebt)
                        .addGap(18, 18, 18)
                        .addComponent(livrosbt))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(jSeparator2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 232, Short.MAX_VALUE)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                            .addContainerGap()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel5)
                                .addComponent(jLabel4))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addGap(53, 53, 53)
                                    .addComponent(emprestimobt)
                                    .addGap(29, 29, 29)
                                    .addComponent(devolucaobt))
                                .addGroup(layout.createSequentialGroup()
                                    .addGap(37, 37, 37)
                                    .addComponent(regularesbt)
                                    .addGap(18, 18, 18)
                                    .addComponent(expiradosbt)
                                    .addGap(18, 18, 18)
                                    .addComponent(entreguesbt))))
                        .addComponent(jSeparator1, javax.swing.GroupLayout.Alignment.LEADING)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(sairbt)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void regularesbtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_regularesbtActionPerformed
        EmprestimosRegularesTela emprestimosRegularesTela = new EmprestimosRegularesTela();
        emprestimosRegularesTela.setVisible(true);
    }//GEN-LAST:event_regularesbtActionPerformed

    private void expiradosbtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_expiradosbtActionPerformed
        emprestimoController.atualizarStatusEmprestimo();
        EmprestimosExpiradosTela emprestimosExpiradosTela = new EmprestimosExpiradosTela();        
        emprestimosExpiradosTela.setVisible(true);
    }//GEN-LAST:event_expiradosbtActionPerformed

    private void entreguesbtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_entreguesbtActionPerformed
        EmprestimosEntreguesTela emprestimosEntreguesTela = new EmprestimosEntreguesTela();
        emprestimosEntreguesTela.setVisible(true);
    }//GEN-LAST:event_entreguesbtActionPerformed

    private void alunosubsequentebtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_alunosubsequentebtActionPerformed
        AlunoSubsequenteTela subsequente = new AlunoSubsequenteTela();        
        subsequente.setVisible(true);
    }//GEN-LAST:event_alunosubsequentebtActionPerformed

    private void livrosbtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_livrosbtActionPerformed
        LivroTela livro = new LivroTela();
        livro.setVisible(true);
    }//GEN-LAST:event_livrosbtActionPerformed

    private void alunointegralbtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_alunointegralbtActionPerformed
        AlunoIntegralTela integral = new AlunoIntegralTela();        
        integral.setVisible(true);
    }//GEN-LAST:event_alunointegralbtActionPerformed

    private void sairbtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sairbtActionPerformed
        dispose();
    }//GEN-LAST:event_sairbtActionPerformed

    private void emprestimobtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_emprestimobtActionPerformed
        OpcaoAlunoTelaEmprestimo opcaoAlunoTelaEmprestimo = new OpcaoAlunoTelaEmprestimo();
        opcaoAlunoTelaEmprestimo.setVisible(true);
    }//GEN-LAST:event_emprestimobtActionPerformed

    private void devolucaobtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_devolucaobtActionPerformed
        emprestimoController.atualizarStatusEmprestimo();
        DevolucaoTela devolucaoTela = new DevolucaoTela();
        devolucaoTela.setVisible(true);        
    }//GEN-LAST:event_devolucaobtActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PrincipalTela().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton alunointegralbt;
    private javax.swing.JButton alunosubsequentebt;
    private javax.swing.JButton devolucaobt;
    private javax.swing.JButton emprestimobt;
    private javax.swing.JButton entreguesbt;
    private javax.swing.JButton expiradosbt;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JButton livrosbt;
    private javax.swing.JButton regularesbt;
    private javax.swing.JButton sairbt;
    // End of variables declaration//GEN-END:variables
}
