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
public class Pessoa {
    private String nome;
    private int idade;
    private String altura;
    private String sexo;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getAltura() {
        return altura;
    }

    public void setAltura(String altura) {
        this.altura = altura;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public Pessoa(String nome, int idade, String altura, String sexo) {
        this.nome = nome;
        this.idade = idade;
        this.altura = altura;
        this.sexo = sexo;
    }

    public Pessoa() {
    }

    @Override
    public String toString() {
        return "\nPessoa" + 
                "\n nome=" + getNome() + 
                "\n idade=" + getIdade() + 
                "\n altura=" + getAltura() + 
                "\n sexo=" + getSexo();
    }    
}
