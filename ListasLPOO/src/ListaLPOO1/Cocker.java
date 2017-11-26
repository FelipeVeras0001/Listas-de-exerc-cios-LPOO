/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ListaLPOO1;

/**
 *
 * @author EDUARDO
 */
public class Cocker extends Cachorro {
    private boolean tosa;

   
    public void setTosa(boolean tosa) {
        this.tosa = tosa;
    }

    public boolean precisaTosa() {
        return tosa;
    }

    public Cocker() {
    }
    

    public Cocker(boolean tosa, String nome, String raca, String tipo, String cor) {
        super(nome, raca, tipo, cor);
        this.tosa = tosa;
    }

    @Override
    public String toString() {
        return "Cocker"  +
                "\ntosa=" + precisaTosa();
    }    
    
    
    
    
}
