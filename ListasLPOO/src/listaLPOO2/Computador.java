package listaLPOO2;



public class Computador extends Telecomunicador{
	private String processador;
	private String placaVideo;
	private int memoria;
	private int disco;
	private float tamanhoTela;
	
	
        public Computador(String tiposConexao, String cor, float peso, float preco, String processador, String placaVideo,
		int memoria, int disco, float tamanhoTela) {
		super(tiposConexao, cor, peso, preco);
		this.processador = processador;
		this.placaVideo = placaVideo;
		this.memoria = memoria;
		this.disco = disco;
		this.tamanhoTela = tamanhoTela;
	}
	
	public String getProcessador() {
		return processador;
	}
	
        public void setProcessador(String processador) {
		this.processador = processador;
	}
	
        public String getPlacaVideo() {
		return placaVideo;
	}
	
        public void setPlacaVideo(String placaVideo) {
		this.placaVideo = placaVideo;
	}
	
        public int getMemoria() {
		return memoria;
	}
	
        public void setMemoria(int memoria) {
		this.memoria = memoria;
	}
	
        public int getDisco() {
		return disco;
	}
	
        public void setDisco(int disco) {
		this.disco = disco;
	}
	
        public float getTamanhoTela() {
		return tamanhoTela;
	}
	
        public void setTamanhoTela(float tamanhoTela) {
		this.tamanhoTela = tamanhoTela;
	}
	
}
