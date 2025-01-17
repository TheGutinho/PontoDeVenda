/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package produtos;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;
import principal.Conectar;
import principal.GerarCodigos;
import usuarios.Usuarios;
import usuarios.UsuariosSql;

public class ProdutosSql {

    static Conectar cc = new Conectar();
    static Connection cn = cc.conexao();
    static PreparedStatement ps;

    public static void listar(String busca) {
        DefaultTableModel modelo = (DefaultTableModel) produtos.FrmProdutos.tabela.getModel();

        while (modelo.getRowCount() > 0) {
            modelo.removeRow(0);
        }
        String sql = "";
        if (busca.equals("")) {
            sql = Produtos.LISTAR;
        } else {
            sql = "SELECT * FROM produtos WHERE (codigo_pro like'" + busca + "%' or nome_pro like'" + busca + "%') "
                    + " order by nome_pro";

        }
        String dados[] = new String[5];
        try {
            Statement st = cn.createStatement();
            ResultSet rs = st.executeQuery(sql);
            while (rs.next()) {
                dados[0] = rs.getString("codigo_pro");
                dados[1] = rs.getString("tipo_pro");
                dados[2] = rs.getString("nome_pro");
                dados[3] = rs.getString("valor_pro");
                dados[4] = rs.getString("estoque");

                modelo.addRow(dados);
            }
        } catch (SQLException ex) {
            Logger.getLogger(Produtos.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public static int registrar(Produtos prod) {
        int rsu = 0;
        String sql = Produtos.REGISTRAR;
        try {
            ps = cn.prepareStatement(sql);
            ps.setString(1, prod.getPrimaryKey());
            ps.setString(2, prod.getTipo());
            ps.setString(3, prod.getNome());
            ps.setString(4, prod.getValor());
            ps.setString(5, prod.getEstoque());

            rsu = ps.executeUpdate();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        System.out.println(sql);
        return rsu;
    }

    public static void gerarId() {
        int j;
        int cont = 1;
        String num = "";
        String c = "";
        String SQL = "SELECT MAX(codigo_pro) FROM produtos";

        try {
            Statement st = cn.createStatement();
            ResultSet rs = st.executeQuery(SQL);
            while (rs.next()) {
                c = rs.getString(1);
            }

            if (c == null) {
                produtos.FrmProdutos.codigo.setText("PRO0001");
            } else {
                char r1 = c.charAt(3);
                char r2 = c.charAt(4);
                char r3 = c.charAt(5);
                char r4 = c.charAt(6);
                String r = "";
                r = "" + r1 + r2 + r3 + r4;
                j = Integer.parseInt(r);
                GerarCodigos gen = new GerarCodigos();
                gen.gerar(j);
                produtos.FrmProdutos.codigo.setText("PRO" + gen.serie());

            }

        } catch (SQLException ex) {
            Logger.getLogger(ProdutosSql.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public static int atualizar(Produtos prod) {
        int rsu = 0;
        String sql = Produtos.ATUALIZAR;
        try {
            ps = cn.prepareStatement(sql);
            ps.setString(1, prod.getTipo());
            ps.setString(2, prod.getNome());
            ps.setString(3, prod.getValor());
            ps.setString(4, prod.getEstoque());
            ps.setString(5, prod.getPrimaryKey());
            rsu = ps.executeUpdate();
        } catch (SQLException ex) {
        }
        System.out.println(sql);
        return rsu;
    }

    public static int atualizarEstoque(String quantidade, String codigoProd) {
        int rsu = 0;
        String sql = Produtos.ATUALIZARESTOQUE;
        try {
            ps = cn.prepareStatement(sql);
            ps.setString(1, quantidade);
            ps.setString(2, codigoProd);
            rsu = ps.executeUpdate();
        } catch (SQLException ex) {
        }
        System.out.println(sql);
        return rsu;
    }

    public static int eliminar(String id) {
        int rsu = 0;
        String sql = Produtos.ELIMINAR;

        try {
            ps = cn.prepareStatement(sql);
            ps.setString(1, id);
            rsu = ps.executeUpdate();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        System.out.println(sql);
        return rsu;
    }

    public static int eliminaTodos() {
        int rsu = 0;
        String sql = Produtos.ELIMINAR_TUDO;
        try {
            ps = cn.prepareStatement(sql);
            rsu = ps.executeUpdate();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        System.out.println(sql);
        return rsu;
    }

    public static void listarCat(String busca) {
        DefaultTableModel modelo = (DefaultTableModel) produtos.FrmListaProd.tabela.getModel();

        while (modelo.getRowCount() > 0) {
            modelo.removeRow(0);
        }
        String sql = "";
        if (busca.equals("")) {
            sql = Produtos.LISTAR;
        } else {
            sql = "SELECT * FROM produtos WHERE (codigo_pro like'" + busca + "%' or nome_pro like'" + busca + "%') "
                    + "or tipo_pro='" + busca + "' ORDER BY nome_pro";

        }
        String dados[] = new String[5];
        try {
            Statement st = cn.createStatement();
            ResultSet rs = st.executeQuery(sql);
            while (rs.next()) {
                dados[0] = rs.getString("codigo_pro");
                dados[1] = rs.getString("tipo_pro");
                dados[2] = rs.getString("nome_pro");
                dados[3] = rs.getString("valor_pro");
                dados[4] = rs.getString("estoque");

                modelo.addRow(dados);
            }
        } catch (SQLException ex) {
            Logger.getLogger(Produtos.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public static boolean isNumber(String n) {
        try {
            if (Integer.parseInt(n) > 0) {
                return true;
            } else {
                return false;
            }
        } catch (NumberFormatException nfe) {
            return false;
        }
    }

}
