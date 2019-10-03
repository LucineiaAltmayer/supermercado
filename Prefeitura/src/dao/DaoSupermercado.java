/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import modelo.Supermercado;
import java.sql.Date;
/**
 *
 * @author Administrador
 */
public class DaoSupermercado {
    public static boolean inserir(Supermercado objeto) {
        String sql = "INSERT INTO supermercado (nome_fantasia, razao_social, fundacao, nr_funcionario, valor_bolsa;) VALUES (?, ?, ?, ?, ?)";
        try {
            PreparedStatement ps = conexao.Conexao.getConexao().prepareStatement(sql);
            ps.setString(1, objeto.getNome_fantasia());
            ps.setString(2, objeto.getRazao_social());
            ps.setDate(3, Date.valueOf(objeto.getFundacao()));
            ps.setInt(4, objeto.getNr_funcionario());
            ps.setDouble(5, objeto.getValor_bolsa());
            ps.executeUpdate();
            return true;
        } catch (SQLException | ClassNotFoundException ex) {
            System.out.println(ex.getMessage());
            return false;
        }
    }
    public static boolean alterar(Supermercado objeto) {
        String sql = "UPDATE supermercado SET nome_fantasia = ?, razao_social = ?, fundacao = ?, nr_funcionar = ?, valor_colsa = ? WHERE codigo=?";
        try {
            PreparedStatement ps = conexao.Conexao.getConexao().prepareStatement(sql);
            ps.setString(1, objeto.getNome_fantasia()); 
            ps.setString(2, objeto.getRazao_social());
            ps.setDate(3, Date.valueOf(objeto.getFundacao()));
            
            ps.setInt(6, objeto.getCodigo());
            ps.executeUpdate();
            return true;
        } catch (SQLException | ClassNotFoundException ex) {
            System.out.println(ex.getMessage());
            return false;
        }
    }

}
