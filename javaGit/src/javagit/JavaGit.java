/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javagit;

import java.util.Scanner;

/**
 *
 * @author Nicollas
 */
public class JavaGit {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //algoritmo que calcula a media de um aluno sem interatividade
       /* float n1 = 5;
        float n2 = 9;
        float media = (n1 + n2) / 2;
        
        System.out.printf("A media do aluno é: %.2f \n", media);*/
       
       //algoritmo que calcula a media de um usuário com interativiade
       Scanner teclado = new Scanner(System.in);    //importa o método scanner da biblioteca .util\
        System.out.println("Digite o seu nome: \n");
       String nome = teclado.nextLine();
        System.out.println("Digite o seu RA (somente numeros): \n");
       Double ra = teclado.nextDouble();
        System.out.println("Digite a primeira nota: ");
       Float n1 = teclado.nextFloat();
        System.out.println("Digite a segunda nota: ");
       Float n2 = teclado.nextFloat();
       Float media = (n1 + n2) /2;
        System.out.printf("A media de %s é %.2f", nome, media);
       
    
    }
    
    
}
