/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ListaLPOO1;

import javax.swing.JOptionPane;

/**
 *
 * @author EDUARDO
 */
public class TesteCocker {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Cocker c=new Cocker(true, null, null, null, null);
        c.setNome(JOptionPane.showInputDialog(null,"Digite o nome"));
        c.setCor(JOptionPane.showInputDialog(null,"Digite a cor"));
        c.setRaca(JOptionPane.showInputDialog(null,"Digite a raça"));
        c.setTipo(JOptionPane.showInputDialog(null,"Digite o tipo"));
        c.setTosa(true);
        JOptionPane.showMessageDialog(null, c);

        
                
    }
    
}
