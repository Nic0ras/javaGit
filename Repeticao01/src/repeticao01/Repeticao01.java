/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package repeticao01;

/**
 *
 * @author Nicollas
 */
public class Repeticao01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int cc = 1; // variavel que inicia e  controla o valor;
        do { //estrutura de repetição com teste lógico no final
            System.out.println(cc); //manda imprimir o valor atualizado da varivel cc
            cc++; //soma ao valor da variavel que garante que a condição se tornará falsa.
            
        } while (cc < 4 ); //avalia a condição que deve se tornar falsa
    }
    
}
