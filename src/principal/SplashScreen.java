/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package principal;

import javax.swing.JLabel;
import javax.swing.JProgressBar;

public class SplashScreen extends javax.swing.JFrame {
    
    SplashScreen spl = this;
    
    public SplashScreen() {
        initComponents();
        startThread();
        }
    
    
    void startThread(){
        Thread hi = new Thread(new Runnable() { 
          @Override
          public void run(){
              Login log = new Login(spl);
              log.setLocationRelativeTo(null);
              log.setVisible(true);
              dispose();
          }

        });

        hi.start();
    
    }
    
    
    public JProgressBar getJProgressBar(){
        return progresso;
    }
    
     public JLabel getJLabel(){
        return lblText;
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        painelProgress = new javax.swing.JPanel();
        lblText = new javax.swing.JLabel();
        progresso = new javax.swing.JProgressBar();
        painelGeral = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Ponto de Vendas");
        setLocationByPlatform(true);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        painelProgress.setOpaque(false);

        lblText.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lblText.setText("Carregando Sistema");
        lblText.setName("lblText"); // NOI18N
        lblText.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblTextMouseClicked(evt);
            }
        });

        progresso.setName("progresso"); // NOI18N

        javax.swing.GroupLayout painelProgressLayout = new javax.swing.GroupLayout(painelProgress);
        painelProgress.setLayout(painelProgressLayout);
        painelProgressLayout.setHorizontalGroup(
            painelProgressLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelProgressLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(painelProgressLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(progresso, javax.swing.GroupLayout.DEFAULT_SIZE, 290, Short.MAX_VALUE)
                    .addGroup(painelProgressLayout.createSequentialGroup()
                        .addComponent(lblText)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        painelProgressLayout.setVerticalGroup(
            painelProgressLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelProgressLayout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(lblText)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(progresso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        getContentPane().add(painelProgress, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 360, 310, 60));

        painelGeral.setLayout(new java.awt.GridLayout(1, 0));
        getContentPane().add(painelGeral, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 150, -1, -1));

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/principal/splash1.jpg"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 430));

        jLabel2.setText("jLabel2");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 190, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void lblTextMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblTextMouseClicked
        Login tela = new Login();
        tela.setLocationRelativeTo(null);
        tela.setVisible(true);
    }//GEN-LAST:event_lblTextMouseClicked
    
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(SplashScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SplashScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SplashScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SplashScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                SplashScreen tela = new SplashScreen();
                tela.setLocationRelativeTo(null);
                tela.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel lblText;
    private javax.swing.JPanel painelGeral;
    private javax.swing.JPanel painelProgress;
    private javax.swing.JProgressBar progresso;
    // End of variables declaration//GEN-END:variables
}
