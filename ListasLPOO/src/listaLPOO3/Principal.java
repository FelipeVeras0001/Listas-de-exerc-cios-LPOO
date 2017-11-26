package listaLPOO3;

import javax.swing.JOptionPane;

public class Principal {
	static CartaoWeb[] cartoes;
	
	public static void main(String[] args) {
		cartoes = new CartaoWeb[3];
		DiaDosNamorados cartao1 = new DiaDosNamorados("Fulana");
		cartoes [0] = cartao1;
		Natal cartao2 = new Natal("Cicrano");
		cartoes[1] = cartao2;
		Aniversario cartao3 = new Aniversario("Deltrano");
		cartoes[2] = cartao3;
		for(int i = 0; i < cartoes.length; i++) {
			JOptionPane.showMessageDialog(null, cartoes[i].retornarMensagem("Marcelo"));
		}
	}

}
