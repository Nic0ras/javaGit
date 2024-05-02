/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package projetouam2;

import java.util.Scanner;

/**
 *
 * @author Nicollas
 */
public class ProjetoUAM2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //o programa consiste em converter graus celsius digitados por graus fareheint
        Scanner teclado = new Scanner (System.in);
        System.out.println("Digite os graus celsius: ");
        double cel = teclado.nextDouble();
        double fah = cel * 1.8 + 32;
        System.out.println(fah);
    }
    
}
