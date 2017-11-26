package ListaLPOO1;

import javax.swing.JOptionPane;

/**
 *
 * @author EDUARDO
 */
public class TesteAdministrador {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Administrador ad=new Administrador();
        
        ad.setAltura(JOptionPane.showInputDialog(null,"Digite a altura"));
        ad.setNome(JOptionPane.showInputDialog(null,"Digite o nome"));
        ad.setSexo(JOptionPane.showInputDialog(null,"Digite o sexo"));
        ad.setIdade(Integer.parseInt(JOptionPane.showInputDialog(null,"Digite a idade")));
        ad.setSalario(Double.parseDouble(JOptionPane.showInputDialog(null,"Digite o salario")));
        ad.setAjudaCusto(Double.parseDouble(JOptionPane.showInputDialog(null,"Digite a ajuda custo")));
        
        JOptionPane.showMessageDialog(null, ad);
    }
    
}
