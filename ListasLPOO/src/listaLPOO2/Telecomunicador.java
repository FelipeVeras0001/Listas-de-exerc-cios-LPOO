package listaLPOO2;


public class Telecomunicador {
	private String tiposConexao;
	private String cor;
	private float peso;
	private float preco;
	
	
        public Telecomunicador(String tiposConexao, String cor, float peso, float preco) {
		super();
		this.tiposConexao = tiposConexao;
		this.cor = cor;
		this.peso = peso;
		this.preco = preco;
	}
	
	
        public String getTipoConexao() {
		return tiposConexao;
	}
	
        public void setTipoConexao(String tipoConexao) {
		this.tiposConexao = tipoConexao;
	}
	
        public String getCor() {
		return cor;
	}
	
        public void setCor(String cor) {
		this.cor = cor;
	}
	
        public float getPeso() {
		return peso;
	}
	
        public void setPeso(float peso) {
		this.peso = peso;
	}
	
        public float getPreco() {
		return preco;
	}
	
        public void setPreco(float preco) {
		this.preco = preco;
	}
	
}
