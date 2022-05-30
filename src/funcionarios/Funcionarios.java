/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package funcionarios;

import referencia.Referencia;

/**
 *
 * @author 00250205
 */
public class Funcionarios {
    
    //atributos
    private String nome;
    private final int funcional;
    private float salario;
    
    // construtor
    public Funcionarios(String nome, int cp){
        this.nome = nome;
        this.funcional = cp;
        this.salario = Referencia.SALARIO_MINIMO;
    }
    
        public Funcionarios(int cp,String nome){
        this.nome = nome;
        this.funcional = cp;
        this.salario = Referencia.SALARIO_MINIMO;
    }
        
        //Metodos get e set

    /**
     * @return the nome
     */
    public String getNome() {
        return nome;
    }

    /**
     * @param nome the nome to set
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

    /**
     * @return the funcional
     */
    public int getFuncional() {
        return funcional;
    }

    /**
     * @return the salario
     */
    public float getSalario() {
        return salario;
    }

    /**
     * @param salario the salario to set
     */
    public void setSalario(float salario) {
        this.salario = salario;
    }
        @Override
       public String toString(){
           return "CP: " +  this.getFuncional() + "\t" + this.getNome() + "\tR$:" + this.getSalario();
       }
}
