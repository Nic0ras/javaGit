/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication15;

import java.util.Scanner;

/**
 *
 * @author Nicollas
 */
public class JavaApplication15 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner teclado = new Scanner(System.in);
        // ler duas notas e realizar a média entre as duas:
        /*
        float n1 = 7f;
        float n2 = 6.5f;
        float media = (n1 + n2) / 2;
        System.out.println(media);*/
        
        // o mesmo que acima, com interatividade:
        System.out.print("Escreva seu nome: ");
        String nome = teclado.nextLine();
        System.out.print("Digite seu RA: ");
        double ra = teclado.nextDouble();
        System.out.print("Digite a primeira nota: ");
        float n1 = teclado.nextFloat();
        System.out.print("Digite a segunda nota: ");
        float n2 = teclado.nextFloat();
        double media = (n1 + n2) / 2; 
        System.out.printf("A media do aluno %s e: %.2f \n", nome, media);
        
    }
    
}
