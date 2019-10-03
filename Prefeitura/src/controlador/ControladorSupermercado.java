/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;
import dao.DaoSupermercado;
import javax.swing.JOptionPane;
import modelo.Supermercado;
import tela.manutencao.ManutencaoSupermercado;
import tela.manutencao.ManutencaoSupermercado;
import java.time.LocalDate; 
import java.time.format.DateTimeFormatter;

/**
 *
 * @author Administrador
 */
public class ControladorSupermercado {

   public static void inserir(ManutencaoSupermercado man){
        Supermercado objeto = new Supermercado();
        objeto.setRazao_social(man.jtfRazaoSocial.getText());
        objeto.setNome_fantasia(man.jtfNomeFantasia.getText());
        objeto.setFundacao(LocalDate.parse(man.jtfFundacao.getText(), DateTimeFormatter.ofPattern("dd/MM/yyyy")));
        objeto.setNr_funcionario(Integer.parseInt(man.jtfNrFuncionario.getText()));
        objeto.setValor_bolsa(Double.parseDouble(man.jtfValorBolsa.getText()));
        
        boolean resultado = DaoSupermercado.inserir(objeto);
        if (resultado) {
            JOptionPane.showMessageDialog(null, "Inserido com sucesso!");
        } else {
            JOptionPane.showMessageDialog(null, "Erro!");
        }
}

    public static void alterar(ManutencaoSupermercado aThis) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    
}
