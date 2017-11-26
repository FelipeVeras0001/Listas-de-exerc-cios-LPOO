package listaLPOO3;




public class Natal extends CartaoWeb{

	public Natal(String destinatario) {
		super(destinatario);
	}
	
        public String retornarMensagem(String remetente) {
		String mensagem ="Feliz natal, " + this.destinatario
				+ "!\nQue Deus te aben�oes e sua familia seja muito feliz!\n"
				+ "Com carinho, " + remetente + ".";
		return mensagem;
	}
}
