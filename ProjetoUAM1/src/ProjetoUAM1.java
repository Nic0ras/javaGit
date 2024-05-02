
import java.util.Scanner;




/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author Nicollas
 */
public class ProjetoUAM1 {
    
    //o programa consiste em ler um número e mostrar o seu antecessor e seu sucessor:
6
6
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Digite um número: ");
        Scanner teclado = new Scanner (System.in);
        int numero = teclado.nextInt();
        System.out.println("O número digitado foi: " + numero);
        int ant = numero - 1;
        int suc = numero +1;
        System.out.println("o seu antecessor é: " + ant);
        System.out.println("o seu sucessor é: " + suc );
    }
    
}
