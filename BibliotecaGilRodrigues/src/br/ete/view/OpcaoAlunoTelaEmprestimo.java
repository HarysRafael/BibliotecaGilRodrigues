package br.ete.view;

public class OpcaoAlunoTelaEmprestimo extends javax.swing.JFrame {

    public OpcaoAlunoTelaEmprestimo() {
        super("Empréstimo");       
        initComponents();
        setVisible(true);
        
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        subsequentebt = new javax.swing.JButton();
        integralbt = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        sairbtn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);

        subsequentebt.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        subsequentebt.setText("Subsequente");
        subsequentebt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                subsequentebtActionPerformed(evt);
            }
        });

        integralbt.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        integralbt.setText("Integral");
        integralbt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                integralbtActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Categoria do Aluno");

        sairbtn.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        sairbtn.setText("Sair");
        sairbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sairbtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(76, 76, 76)
                .addComponent(integralbt, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 92, Short.MAX_VALUE)
                .addComponent(subsequentebt, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(76, 76, 76))
            .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(214, 214, 214)
                .addComponent(sairbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 41, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(subsequentebt)
                    .addComponent(integralbt))
                .addGap(41, 41, 41)
                .addComponent(sairbtn)
                .addGap(34, 34, 34))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void subsequentebtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_subsequentebtActionPerformed
        EmprestimoAlunoSubsequenteTela emprestimoSubsequenteTela = new EmprestimoAlunoSubsequenteTela();
        emprestimoSubsequenteTela.setVisible(true);
        dispose();
        
    }//GEN-LAST:event_subsequentebtActionPerformed

    private void integralbtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_integralbtActionPerformed
        EmprestimoAlunoIntegralTela emprestimoAlunointegralTela  = new EmprestimoAlunoIntegralTela();
        emprestimoAlunointegralTela.setVisible(true);
        dispose();
    }//GEN-LAST:event_integralbtActionPerformed

    private void sairbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sairbtnActionPerformed
        dispose();
    }//GEN-LAST:event_sairbtnActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton integralbt;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JButton sairbt;
    private javax.swing.JButton sairbt1;
    private javax.swing.JButton sairbtn;
    private javax.swing.JButton subsequentebt;
    // End of variables declaration//GEN-END:variables
}
