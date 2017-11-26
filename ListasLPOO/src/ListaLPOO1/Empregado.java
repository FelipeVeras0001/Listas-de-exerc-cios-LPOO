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
public class Empregado extends Pessoa {
    private double salario;

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public Empregado() {
    }

    public Empregado(double salario, String nome, int idade, String altura, String sexo) {
        super(nome, idade, altura, sexo);
        this.salario = salario;
    }
    
    public double ObterLucro() {
        return salario;
    }

    @Override
    public String toString() {
        return "\nEmpregado" + 
                "\nsalario=" + getSalario();
    }
    
    
}
