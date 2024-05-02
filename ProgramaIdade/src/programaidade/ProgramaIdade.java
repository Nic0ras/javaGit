package programaidade;

import java.util.Scanner;

public class ProgramaIdade {
    public static void main(String[] args) {
       Scanner teclado = new Scanner (System.in);
      /*   System.out.print("Digite o ano de nascimento: ");
        int anoNasc = teclado.nextInt();
        System.out.println("Digite o ano em que estamos: ");
        int anoAtual = teclado.nextInt();
        int idade = anoAtual - anoNasc;
        System.out.println("A sua idade é:  "+ idade);
                if (idade >= 18){
            System.out.println("Está na maior idade!");
        } else {
                    System.out.println("Está na menor idade");
                }*/
      
    /*//calcula se um número é par ou impar:
        System.out.print("Digite o numero a ser avaliado:");
        int numero = teclado.nextInt();
        if (numero %2==0){
            System.out.print("O número é par");
        } else {
            System.out.print("O número é impar!");

        }
*/
    //realiza o calculo para votação e avalia se a pessoa pode votar ou não:
        System.out.println("digite o ano autal");
        int anoAtual = teclado.nextInt();
        System.out.println("Digite o ano de nascimento");
        int anoNasc = teclado.nextInt();
        int idade = anoAtual - anoNasc;
        System.out.println(idade);
        if (idade < 16){
            System.out.println("Nao pode votar");
        } else{
            if (idade >= 16 && idade < 18 || (idade>70)){
                System.out.println("Voto Opcional");
            }else{
                System.out.println("Obrigatorio");
            }
        }
    }

        
    
}
