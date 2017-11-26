package listaLPOO3;



public abstract class CartaoWeb {
	protected String destinatario;
	
	
        public String retornarMensagem(String remetente) {
		return null;
		
	}

	public CartaoWeb(String destinatario) {
		this.destinatario = destinatario;
	}
}
