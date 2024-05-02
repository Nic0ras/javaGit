/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package repeticao02;

import java.util.Scanner;

/**
 *
 * @author Nicollas
 */
public class Repeticao02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner teclado = new Scanner (System.in);
        int n, s = 0;
        String resp;
        do {
        System.out.print("Digite um número:");
        n = teclado.nextInt();
        s += n; //s = s + n
        System.out.print("Quer continuar? [S/N] ");
        resp = teclado.next();
        
        } while (resp.equals("S")); //executa tudo isso enquanto a resposta for "S"
        System.out.println("A soma de todos os valores é " + s);
             
    } 
    
}
