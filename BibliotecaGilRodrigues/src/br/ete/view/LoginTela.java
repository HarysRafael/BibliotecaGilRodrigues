package br.ete.view;

import br.ete.controller.AdminController;
import br.ete.dto.AdminDto;
import br.ete.util.FundoTela;
import javax.swing.JOptionPane;

public class LoginTela extends javax.swing.JFrame {

    private AdminController adminController = new AdminController();
    private FundoTela tela;

    public LoginTela() {
        super("Login");
        initComponents();
        setLocationRelativeTo(null);
        tela = new FundoTela("/br/ete/image/logoete.png");
        getContentPane().add(tela);

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        javax.swing.JPanel logoETE = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        logintf = new javax.swing.JTextField();
        senhatf = new javax.swing.JPasswordField();
        okbt = new javax.swing.JButton();
        cancelarbt = new javax.swing.JButton();
        cadastrarnovobt = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setBackground(new java.awt.Color(204, 204, 204));
        setResizable(false);

        logoETE.addContainerListener(new java.awt.event.ContainerAdapter() {
            public void componentAdded(java.awt.event.ContainerEvent evt) {
                logoETEComponentAdded(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("BIBLIOTECA GIL RODRIGUES");

        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/ete/image/logoete.png"))); // NOI18N

        javax.swing.GroupLayout logoETELayout = new javax.swing.GroupLayout(logoETE);
        logoETE.setLayout(logoETELayout);
        logoETELayout.setHorizontalGroup(
            logoETELayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(logoETELayout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addGroup(logoETELayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(logoETELayout.createSequentialGroup()
                        .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(276, 276, 276))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, logoETELayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabel1)
                        .addGap(79, 79, 79))
                    .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jSeparator1, javax.swing.GroupLayout.Alignment.TRAILING)))
        );
        logoETELayout.setVerticalGroup(
            logoETELayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(logoETELayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(logoETELayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, logoETELayout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(36, 36, 36))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, logoETELayout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addGap(18, 18, 18)))
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addGap(82, 82, 82))
        );

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel4.setText("Login:");

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel5.setText("Senha:");

        logintf.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N

        senhatf.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N

        okbt.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        okbt.setText("OK");
        okbt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                okbtActionPerformed(evt);
            }
        });

        cancelarbt.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        cancelarbt.setText("Cancelar");
        cancelarbt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelarbtActionPerformed(evt);
            }
        });

        cadastrarnovobt.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        cadastrarnovobt.setText("Cadastrar Novo");
        cadastrarnovobt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cadastrarnovobtActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(logoETE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(78, 78, 78)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel5)
                            .addComponent(jLabel4))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(senhatf, javax.swing.GroupLayout.DEFAULT_SIZE, 329, Short.MAX_VALUE)
                            .addComponent(logintf)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(58, 58, 58)
                        .addComponent(okbt, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(cancelarbt, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(cadastrarnovobt, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(77, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(logoETE, javax.swing.GroupLayout.PREFERRED_SIZE, 218, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(logintf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(senhatf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cadastrarnovobt)
                    .addComponent(cancelarbt)
                    .addComponent(okbt))
                .addContainerGap(39, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cancelarbtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelarbtActionPerformed
        dispose();
    }//GEN-LAST:event_cancelarbtActionPerformed

    private void okbtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_okbtActionPerformed
        String login = logintf.getText();
        String senha = new String(senhatf.getPassword());

        try {
            AdminDto adminVerificado = adminController.buscarPorLoginSenha(login, senha);
            if (adminVerificado.getLogin().equals(login) && adminVerificado.getSenha().equals(senha)) {
                JOptionPane.showMessageDialog(null, "Login Autorizado!");
                PrincipalTela principalTela = new PrincipalTela();
                principalTela.setVisible(true);
                dispose();
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Login e (ou) senha incorretos!");
            limparCampos();
        }

    }//GEN-LAST:event_okbtActionPerformed

    private void limparCampos() {
        logintf.setText("");
        senhatf.setText("");

    }
    private void cadastrarnovobtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cadastrarnovobtActionPerformed

        String login = logintf.getText();
        String senha = new String(senhatf.getPassword());

        try {
            AdminDto adminVerificado = adminController.buscarPorLoginSenha(login, senha);
            if (adminVerificado.getLogin().equals(login) && adminVerificado.getSenha().equals(senha)) {
                JOptionPane.showMessageDialog(null, "Login Autorizado!");
                AdminTela adminTela = new AdminTela();
                adminTela.setVisible(true);                
                limparCampos();
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Login e (ou) senha incorretos!");
            limparCampos();
        }
    }//GEN-LAST:event_cadastrarnovobtActionPerformed

    private void logoETEComponentAdded(java.awt.event.ContainerEvent evt) {//GEN-FIRST:event_logoETEComponentAdded

    }//GEN-LAST:event_logoETEComponentAdded

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LoginTela().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton cadastrarnovobt;
    private javax.swing.JButton cancelarbt;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTextField logintf;
    private javax.swing.JButton okbt;
    private javax.swing.JPasswordField senhatf;
    // End of variables declaration//GEN-END:variables
}
