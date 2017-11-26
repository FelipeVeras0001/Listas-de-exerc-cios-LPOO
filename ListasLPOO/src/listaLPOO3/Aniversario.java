package listaLPOO3;

public class Aniversario extends CartaoWeb{

	public Aniversario(String destinatario) {
		super(destinatario);
	}
	public String retornarMensagem(String remetente) {
		String mensagem = "Feliz aniversario, " + this.destinatario
				+ "!\nQue todos os seus desejos se realizem e voce seja muito feliz!\n"
				+ "Com carinho, " + remetente + ".";
		return mensagem;
	}
}
