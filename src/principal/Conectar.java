/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package principal;


import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;

public class Conectar {
    
     Connection conect = null;

    
     //CONEXAO LOCAL
//    public Connection conexao() {
//        try {
//            Class.forName("com.mysql.jdbc.Driver");
//            conect = DriverManager.getConnection("jdbc:mysql://localhost/pontovenda", "root", "root"); 
//        } catch (Exception e) {
//            JOptionPane.showMessageDialog(null, "Erro ao conectar!!" + e);
//        }
//        return conect;
//    }   
    
    
    //CONEXAO HOSPEDADA
    public Connection conexao() {
        try {
            Class.forName("com.mysql.jdbc.Driver");
           return DriverManager.getConnection("jdbc:mysql://34.136.245.0:3306/pontovenda", "root", "4i]*Zh2]FPn12/%)");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erro ao conectar!!" + e);
        }
        return conect;
    }   
    
}
