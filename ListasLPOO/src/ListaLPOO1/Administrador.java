
package ListaLPOO1;

/**
 *
 * @author EDUARDO
 */
public class Administrador extends Empregado {
    private Double ajudaCusto;

    public Double getAjudaCusto() {
        return ajudaCusto;
    }

    public void setAjudaCusto(Double ajudaCusto) {
        this.ajudaCusto = ajudaCusto;
    }

    public Administrador() {
    }

    public Administrador(Double ajudaCusto, double salario, String nome, int idade, String altura, String sexo) {
        super(salario, nome, idade, altura, sexo);
        this.ajudaCusto = ajudaCusto;
    }

    
    
    public Double obterLucros() {
        return (getSalario()+getAjudaCusto());
    }
    
    
    
}
