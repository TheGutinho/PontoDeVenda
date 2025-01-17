/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package principal;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;


public class Login extends javax.swing.JFrame {
    
    SplashScreen inicio;

    /**
     * Creates new form Login
     */
    public Login() {
        initComponents();
        
        
    }
    
    
    public Login(SplashScreen inicio){
        this.inicio = inicio;
        setProgress(0, "Carregando componentes do sistema");
        initComponents();
        setProgress(20, "Conectando ao banco de dados!");
        setProgress(40, "Carregando os módulos");
        setProgress(60, "Carregamento de módulos concluidos");
        setProgress(80, "Carregando interfaces");
        setProgress(90, "Interface carregada");
        setProgress(100,"Bem vindo ao sistema!!");
        //this.setSize(410,500);
        
    }
    
    void setProgress(int percent, String informacao){
        inicio.getJLabel().setText(informacao);
        inicio.getJProgressBar().setValue(percent);
        try {
            Thread.sleep(200);
        } catch (InterruptedException e) {
            JOptionPane.showMessageDialog(this, "Não foi possível carregar a inicialização");
        }
    }
    
    
    //INICIANDO A CONEXAO
    Conectar con = new Conectar();
    Connection cn = con.conexao();
    
    public void Logar(String id, String senha){
        String dado = null;
        try {
            String sql = "SELECT nome_us FROM usuarios WHERE nome_us = '" +id+ "' ";
            Statement st = cn.createStatement();
            ResultSet rs = st.executeQuery(sql);
            
            if(rs.first()){
                String sql1 = "SELECT senha FROM usuarios WHERE senha = '" +senha+ "' ";
                Statement st1 = cn.createStatement();
                ResultSet rs1 = st1.executeQuery(sql1);
                if(rs1.first()){
                    String sql2 = "SELECT tipo_us FROM usuarios WHERE nome_us = '" +id+ "' "
                            + "and senha = '" +senha+ "' ";
                    Statement st2 = cn.createStatement();
                    ResultSet rs2 = st2.executeQuery(sql2);
                    
                    while(rs2.next()){
                        dado = rs2.getString(1);
                        
                    }
                    
                    if (dado.equals("ADM")){
                        String sql3 = "SELECT nome_us FROM usuarios WHERE nome_us = '" +id+ "' ";
                        Statement st3 = cn.createStatement();
                        ResultSet rs3 = st3.executeQuery(sql3);
                        
                         while(rs3.next()){
                         dado = rs3.getString(1);                            
                         }
                         
                         dispose();
                         MenuPrincipal menu = new MenuPrincipal();
                          JOptionPane.showMessageDialog(this, "Bem vindo ao Sistema " + dado, "Administrador", 0,
                    new ImageIcon(getClass().getResource("/imagens/usuarios/info.png")));
                          
                          menu.userConect.setText(dado);
                          menu.setLocationRelativeTo(null);
                          menu.setVisible(true);
                          
                    }else{
                        String sql4 = "SELECT nome_us FROM usuarios WHERE nome_us = '" +id+ "' ";
                        Statement st4 = cn.createStatement();
                        ResultSet rs4 = st4.executeQuery(sql4);
                        
                         while(rs4.next()){
                         dado = rs4.getString(1);                            
                         }
                         
                         dispose();
                         MenuPrincipalP menuP = new MenuPrincipalP();
                          JOptionPane.showMessageDialog(this, "Bem vindo ao Sistema " + dado, "Usuário Padrão", 0,
                    new ImageIcon(getClass().getResource("/imagens/usuarios/info.png")));
                          
                          menuP.userConect.setText(dado);
                          menuP.setLocationRelativeTo(null);
                          menuP.setVisible(true);
                          
                    }
                    
                    
                }else{
                     JOptionPane.showMessageDialog(this, "Senha Incorreta!", "Login", 0,
                    new ImageIcon(getClass().getResource("/imagens/usuarios/info.png")));
                }
                
            }else{
                JOptionPane.showMessageDialog(this, "O usuário não existe no banco de dados!", "Login", 0,
                    new ImageIcon(getClass().getResource("/imagens/usuarios/info.png")));
            }
            
            
            
        } catch (Exception e) {
        }
    }
  

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        painelLogin = new javax.swing.JPanel();
        painelImgCab = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        painelCentral = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        usuario = new app.bolivia.swing.JCTextField();
        senha = new jpass.JRPasswordField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        painelRodape = new javax.swing.JPanel();
        btnEntrar = new javax.swing.JButton();
        btnSair = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Login");
        setLocation(new java.awt.Point(0, 0));
        setName("telaPrincipal"); // NOI18N
        setPreferredSize(new java.awt.Dimension(410, 520));
        setResizable(false);
        getContentPane().setLayout(new java.awt.GridLayout(1, 0));

        painelLogin.setLayout(new java.awt.BorderLayout());

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/principal/imagemLogin.jpg"))); // NOI18N
        jLabel1.setPreferredSize(new java.awt.Dimension(400, 300));

        javax.swing.GroupLayout painelImgCabLayout = new javax.swing.GroupLayout(painelImgCab);
        painelImgCab.setLayout(painelImgCabLayout);
        painelImgCabLayout.setHorizontalGroup(
            painelImgCabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelImgCabLayout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 65, Short.MAX_VALUE))
        );
        painelImgCabLayout.setVerticalGroup(
            painelImgCabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelImgCabLayout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 227, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        painelLogin.add(painelImgCab, java.awt.BorderLayout.PAGE_START);

        painelCentral.setLayout(new java.awt.BorderLayout());

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/principal/user.png"))); // NOI18N
        painelCentral.add(jLabel3, java.awt.BorderLayout.LINE_START);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        usuario.setBackground(new java.awt.Color(34, 102, 145));
        usuario.setBorder(null);
        usuario.setForeground(new java.awt.Color(255, 255, 255));
        usuario.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        usuario.setName("txtUsuario"); // NOI18N
        usuario.setPhColor(new java.awt.Color(255, 255, 255));
        usuario.setPlaceholder("USUARIO");
        usuario.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                usuarioKeyReleased(evt);
            }
        });
        jPanel1.add(usuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 40, 180, -1));

        senha.setBackground(new java.awt.Color(34, 102, 145));
        senha.setBorder(null);
        senha.setForeground(new java.awt.Color(255, 255, 255));
        senha.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        senha.setName("txtSenha"); // NOI18N
        senha.setPhColor(new java.awt.Color(255, 255, 255));
        senha.setPlaceholder("SENHA");
        senha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                senhaActionPerformed(evt);
            }
        });
        jPanel1.add(senha, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 100, 180, -1));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/principal/campoLoginUs.png"))); // NOI18N
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 30, -1, -1));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/principal/campoLoginPass.png"))); // NOI18N
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 90, -1, -1));

        painelCentral.add(jPanel1, java.awt.BorderLayout.CENTER);

        painelRodape.setPreferredSize(new java.awt.Dimension(635, 60));
        painelRodape.setLayout(new java.awt.FlowLayout(1, 20, 5));

        btnEntrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/principal/entrar2.png"))); // NOI18N
        btnEntrar.setBorder(null);
        btnEntrar.setBorderPainted(false);
        btnEntrar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnEntrar.setName("btnEntrar"); // NOI18N
        btnEntrar.setPreferredSize(new java.awt.Dimension(135, 45));
        btnEntrar.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/principal/entrar1.png"))); // NOI18N
        btnEntrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEntrarActionPerformed(evt);
            }
        });
        painelRodape.add(btnEntrar);

        btnSair.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/principal/sair2.png"))); // NOI18N
        btnSair.setBorder(null);
        btnSair.setBorderPainted(false);
        btnSair.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnSair.setName("btnSair"); // NOI18N
        btnSair.setPreferredSize(new java.awt.Dimension(135, 45));
        btnSair.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/principal/sair1.png"))); // NOI18N
        btnSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSairActionPerformed(evt);
            }
        });
        painelRodape.add(btnSair);

        painelCentral.add(painelRodape, java.awt.BorderLayout.PAGE_END);

        painelLogin.add(painelCentral, java.awt.BorderLayout.CENTER);

        getContentPane().add(painelLogin);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void usuarioKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_usuarioKeyReleased
        usuario.setText(usuario.getText().toUpperCase());
    }//GEN-LAST:event_usuarioKeyReleased

    private void senhaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_senhaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_senhaActionPerformed

    private void btnEntrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEntrarActionPerformed
        String us = usuario.getText();
        String pass = senha.getText();
        if(us.equals("") || pass.equals("")){
             JOptionPane.showMessageDialog(this, "Preencha os Campos", "Login", 0,
                    new ImageIcon(getClass().getResource("/imagens/usuarios/info.png")));
        }else{
            Logar(us, pass);
        }
    }//GEN-LAST:event_btnEntrarActionPerformed

    private void btnSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSairActionPerformed
        if (JOptionPane.showConfirmDialog(this, "Tem certeza que deseja sair?", "Sair", JOptionPane.YES_NO_OPTION, 0,
                new ImageIcon(getClass().getResource("/imagens/principal/info.png"))) == JOptionPane.YES_OPTION) {
            System.exit(0);
        }
    }//GEN-LAST:event_btnSairActionPerformed

    /**
     * @param args the command line arguments
     */
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
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                Login tela = new Login();
                tela.setLocationRelativeTo(null);
                tela.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnEntrar;
    private javax.swing.JButton btnSair;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel painelCentral;
    private javax.swing.JPanel painelImgCab;
    private javax.swing.JPanel painelLogin;
    private javax.swing.JPanel painelRodape;
    private jpass.JRPasswordField senha;
    private app.bolivia.swing.JCTextField usuario;
    // End of variables declaration//GEN-END:variables
}
