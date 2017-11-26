
package ListaLPOO1;

import javax.swing.JOptionPane;
import javax.xml.bind.ParseConversionEvent;


public class TesteEmpregado {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Empregado e = new Empregado();
        
        e.setSalario(Double.parseDouble(JOptionPane.showInputDialog(null,"Digite o salario")));
        e.setNome(JOptionPane.showInputDialog(null,"Digite o nome"));
        e.setIdade(Integer.parseInt(JOptionPane.showInputDialog(null,"Digite a idade")));
        e.setAltura(JOptionPane.showInputDialog(null,"Digite a altura"));
        e.setSexo(JOptionPane.showInputDialog(null,"Digite o sexo"));
        
        JOptionPane.showMessageDialog(null, e);

    }
    
}
