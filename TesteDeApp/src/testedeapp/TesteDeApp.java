/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package testedeapp;

import java.util.Scanner;

/**
 *
 * @author Nicollas
 */
public class TesteDeApp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner teclado = new Scanner(System.in);
        
        System.out.println("Digite um nome: ");
        String nome = teclado.nextLine();
        System.out.println("Digite a idade: ");
        int idade = teclado.nextInt();
        System.out.println("O seu nome é " + nome + " e a sua idade é " + idade);
    }
    
}
