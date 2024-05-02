package exerciciosdequartalogica;

import java.util.Scanner;

public class ExerciciosDeQuartaLogica {

    public static void main(String[] args) {
        // TODO code application logic here
        Scanner teclado = new Scanner(System.in);
        /* //crie um algoritmo que leia um número e mostre o seu antecessor e sucessor.
        
        //pede um número ao usuário:

        System.out.println("Digite um número");
        int n = teclado.nextInt();
        //atribui às variáveis os antecessores e sucessores:
        int ant = n -1;
        int suc = n +1;
        System.out.println("O antecessor de " + n + "é: " + ant);
        System.out.println("O sucessor de " + n + "é: " + suc);*/

       /* //Fazer um programa que imprima a média aritmética dos números 8,9 e 7. A média dosnúmeros 4, 5 e 6. A soma das duas médias. A média das médias.
        //realiza o calculo da média dos números 8, 9, 7:
        float media1, media2,sm, mm;
        float n1 = 8, n2 = 9, n3 = 7, n4 = 4, n5 = 5, n6 = 6;
        media1 = (n1 + n2 + n3) / 3;
        media2 = (n4 + n5 + n6) / 3;
        sm = media1 + media2;
        mm = (media1 + media2) / 2;
        System.out.printf("A primeira média é: \n" + media1 
                + "A segunda média é:\n" + media2
                + "A soma das duas médias é: \n" +sm
                + "A média das médias é: " + mm);*/
       
       //Informar um saldo e imprimir o saldo com reajuste de 1%.
        System.out.println("Digite um saldo:");
        double saldo = teclado.nextFloat();
        double saldof;
        saldof = saldo * 0.1f;
        System.out.printf("Saldo atualizado %.2f", saldo);
    }

}
