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
public class Gerente extends Funcionarios{
    private final int fator;
    
    public Gerente(String nome, int cp) {
        super(nome, cp);
        this.fator = 2;
        this.setSalario(fator*Referencia.SALARIO_MINIMO);
    }

    /**
     * @return the fator
     */
    public int getFator() {
        return fator;
    }
    
}
