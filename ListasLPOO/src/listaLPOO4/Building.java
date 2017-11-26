/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package listaLPOO4;

/**
 *
 * @author R
 */
public class Building implements CarbonFootprint{
	
	int numPessoas;
	boolean EnergiaRenovalvel;
	int numLampadas;
	boolean arCondicionado;
	
	public Building(int numPessoas, boolean EnergiaRenovalvel, int numLampadas, boolean arCondicionado) {
		super();
		this.numPessoas = numPessoas;
		this.EnergiaRenovalvel = EnergiaRenovalvel;
		this.numLampadas = numLampadas;
		this.arCondicionado = arCondicionado;
	}

	/**
	 * @return the numeroPessoas
	 */
	public int getNumPessoas() {
		return numPessoas;
	}

	/**
	 * @param nPessoas the numeroPessoas to set
	 */
	public void setNumPessoas(int numPessoas) {
		this.numPessoas = numPessoas;
	}

	/**
	 * @return the usoEnergiaRenov
	 */
	public boolean getEnergiaRenovalvel() {
		return EnergiaRenovalvel;
	}

	/**
	 * @param usoEnergiaRenov the usoEnergiaRenov to set
	 */
	public void setEnergiaRenovalvel(boolean EnergiaRenovalvel) {
		this.EnergiaRenovalvel = EnergiaRenovalvel;
	}

	/**
	 * @return the numeroLampadas
	 */
	public int getNumLampadas() {
		return numLampadas;
	}

	/**
	 * @param numeroLampadas the numeroLampadas to set
	 */
	public void setNumLampadas(int numLampadas) {
		this.numLampadas = numLampadas;
	}

	/**
	 * @return the usoArCond
	 */
	public boolean getArCondicionado() {
		return arCondicionado;
	}

	/**
	 * @param usoArCond the usoArCond to set
	 */
	public void setArCondicionado(boolean arCondicionado) {
		this.arCondicionado = arCondicionado;
	}

	@Override
        public float getCarbonFootprint() {
		// TODO Auto-generated method stub
		return 0;
	}
	
}
