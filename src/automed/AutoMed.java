/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package automed;

import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;
import tela.JanelaPrincipal;

/**
 *
 * @author arthur.siqueira
 */
public class AutoMed {
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        if(ConexaoBD.getInstance() != null){
            JanelaPrincipal janela = new JanelaPrincipal();
            janela.setVisible(true);
        }else{
            JOptionPane.showMessageDialog(null, "erro ao conectar no banco");
        }
    }
}
