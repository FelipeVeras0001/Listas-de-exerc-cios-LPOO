package listaLPOO2;


public class Smartphone extends Telecomunicador{
	private float tamanhoTela;
	private float resolucaoCamera;
	private float resolucaoCameraFrontal;
	private int bateria;
	private int memoria;
	
	
        public Smartphone(String tiposConexao, String cor, float peso, float preco, float tamanhoTela, float resolucaoCamera,
		float resolucaoCameraFrontal, int bateria, int memoria) {
		super(tiposConexao, cor, peso, preco);
		this.tamanhoTela = tamanhoTela;
		this.resolucaoCamera = resolucaoCamera;
		this.resolucaoCameraFrontal = resolucaoCameraFrontal;
		this.bateria = bateria;
		this.memoria = memoria;
	}
	
	public float getTamanhoTela() {
		return tamanhoTela;
	}
	
        public void setTamanhoTela(float tamanhoTela) {
		this.tamanhoTela = tamanhoTela;
	}
	
        public float getResolucaoCamera() {
		return resolucaoCamera;
	}
	
        public void setResolucaoCamera(float resolucaoCamera) {
		this.resolucaoCamera = resolucaoCamera;
	}
	
        public float getResolucaoCameraFrontal() {
		return resolucaoCameraFrontal;
	}
	
        public void setResolucaoCameraFrontal(float resolucaoCameraFrontal) {
		this.resolucaoCameraFrontal = resolucaoCameraFrontal;
	}
	
        public int getBateria() {
		return bateria;
	}
	
        public void setBateria(int bateria) {
		this.bateria = bateria;
	}
	
        public int getMemoria() {
		return memoria;
	}
	
        public void setMemoria(int memoria) {
		this.memoria = memoria;
	}
}
