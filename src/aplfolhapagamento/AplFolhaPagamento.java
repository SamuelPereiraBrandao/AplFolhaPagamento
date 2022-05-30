/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aplfolhapagamento;

import funcionarios.Funcionarios;
import funcionarios.Gerente;
import java.util.Scanner;

/**
 *
 * @author 00250205
 */
public class AplFolhaPagamento {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        System.out.println("Qual o tipo do funcionario?");
        System.out.println("Digite 'G' Para Gerente e 'F' para Funcionario");
        
        char tipo = scan.next().toUpperCase().charAt(0);
        
        Funcionarios emp;
        
        switch(tipo){
            case 'G': emp = new Gerente("Gerente: Samuel Pereira",11);
            System.out.println(emp);
                break;
            case 'F': emp = new Funcionarios ("Funcionario: Jose da Silva",10);
            System.out.println(emp);
                break;
            default: emp = new Funcionarios("Funcionario Desconhecido",0);
            System.out.println(emp);
                break;
        }
        
        
    }
    
}
