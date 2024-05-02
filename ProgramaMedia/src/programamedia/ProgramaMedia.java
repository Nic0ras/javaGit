/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package programamedia;

import java.util.Scanner;

/**
 *
 * @author Nicollas
 */
public class ProgramaMedia {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner teclado = new Scanner(System.in);
     /*   System.out.print("Digite a primeira nota: ");
        float n1 = teclado.nextFloat();
        System.out.println("Digite a segunda nota: ");
        float n2 = teclado.nextFloat();
        float m = (n1 + n2) / 2;
        if (m >=9){
            System.out.println("Parabéns!" + m);
        }*/
        System.out.print("Digite o ano de nascimento: ");
     int anoNasc = teclado.nextInt();
        System.out.print("Digite o ano atual: ");
     int anoAtual = teclado.nextInt();
     int idade = anoAtual - anoNasc;
        System.out.println("A idade é: "+ idade);
        if (idade >=18){
            System.out.println("Maior de idade!");
        } else {
            System.out.println("Menor de idade!");
        }
    }
    
}
