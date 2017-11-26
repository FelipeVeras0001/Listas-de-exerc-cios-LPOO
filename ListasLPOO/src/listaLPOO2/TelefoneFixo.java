package listaLPOO2;


public class TelefoneFixo extends Telecomunicador{
	private boolean caixaPostal;
	private int contatosAgenda;
	
	
        public TelefoneFixo(String tiposConexao, String cor, float peso, float preco, boolean caixaPostal,
			int contatosAgenda) {
		super(tiposConexao, cor, peso, preco);
		this.caixaPostal = caixaPostal;
		this.contatosAgenda = contatosAgenda;
	}

	
        public boolean isCaixaPostal() {
		return caixaPostal;
	}

	
        public void setCaixaPostal(boolean caixaPostal) {
		this.caixaPostal = caixaPostal;
	}

	
        public int getContatosAgenda() {
		return contatosAgenda;
	}

	
        public void setContatosAgenda(int contatosAgenda) {
		this.contatosAgenda = contatosAgenda;
	}
}
