/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package execiciosparaprova;

import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author Nicollas
 */
public class ExeciciosParaProva {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner teclado = new Scanner(System.in);
        /*//peça a idade de um usuário e a exiba na tela utilizando o JOptionPane:
        int idade = Integer.parseInt(JOptionPane.showInputDialog("Digite um número"));   
        JOptionPane.showMessageDialog(null, idade);*/

 /*//Peça um número float para um usuário e o exiba utilizando SOUT:
        System.out.print("Digite um número com casas decimais: ");
        float n = teclado.nextFloat();
        System.out.print("O número digitado foi: " + n);*/
 /*Peça ao usuário uma frase e a exiba na tela com uma mensagem de saudação: 
        System.out.println("Digite uma frase: ");
        String frase = teclado.nextLine();
        System.out.println("A frase digitada foi: " + frase); */
 /* Realiza a conversão de um valor inteiro para string:
        int idade = 30;
        String valor = Integer.toString(idade);
        System.out.println(valor);*/
 /* //Realiza o processo de converter caractere para inteiro:
        String valor = "30";
        int convert = Integer.parseInt(valor);
        System.out.println(convert);*/
 /*//Realiza o processo de converter caractere para float:
       String valor = "27";
       float convert = Float.parseFloat(valor);
        System.out.println(convert);*/
 /* //realize o calculo de média de duas notas:
       float n1 = 7;
       float n2 = 9;
       float media = (n1 + n2) / 2;
        System.out.println(media);*/
 /*//realiza a verificação de uma expressão ternária:
      int n1 = 14, n2 = 8, r;
      r = (n1<n2)?0:1;
        System.out.print(r);*/
 /*//realize operações dentro do ternário:
        int n1 = 10, n2 = 5, r;
        r = (n1<n2?n1/n2:n1*n2);
        System.out.println(r);*/
 /*//realize comparação com ternário utilizando strings:
        String nome1 = "Nic";
        String nome2 = "Nic";
        String nome3 = new String("Nic");
        String res;
        res = (nome1.equals(nome3))?"É igual":"É diferente";
        System.out.println(res);*/
 /*   //verifique relações com ternário:
        int a, b, c;
        a = 5;
        b = 10;
        c = 11;
        boolean r;
        r = (a<b != c>a)?false:true;
        System.out.println(r);*/
        //condicionais:
        /* //verifica se a nota é maior que 9 para que o aluno seja aprovado e retorne a mensagem para o aluno:
        int n1 = 10;
        int n2 = 6;
        float media = (n1 + n2) / 2;
        if (media > 9){
            System.out.println("Parabens que tu foi aprovado!");
        } else {
            System.out.println("Deu ruim meu companheiro kkk");
        }*/
 /*//verifica se a pessoa é maior de idade ou não:
        System.out.print("Digite a data de nascimento: ");
       int dataNasc = teclado.nextInt();
        System.out.print("Digite o ano atual: ");
       int anoAtual = teclado.nextInt();
       int idade = anoAtual - dataNasc;
       if (idade < 18){
           System.out.println("Menor de idade " + idade);
       } else 
       if (idade > 18){
           System.out.println("Maior de idade " + idade);
       }*/
 /*  //Verifica se um numero é par ou impar:
        System.out.println("Digite o numero para verificar se eh par ou impar:");
       int n = teclado.nextInt();
       if (n%2==0){
           System.out.println("eh par");
       } else {
           System.out.println("eh impar");
       }*/
 /* //verifica as possibilidades de idade para voto opcional ou obrigatório realcionado as idades:
        System.out.print("Digite a sua idade: ");
        int idadeUsuario = teclado.nextInt();
        if (idadeUsuario >= 18 && idadeUsuario < 60) {
            System.out.println("voto obrigatorio");
        } else {
            if (idadeUsuario >= 16 && idadeUsuario< 18 || idadeUsuario>=60) {
                System.out.println("Voto Opcional");
            }else{
                System.out.println("Não vota");
            }
        }*/
 /* //utilizando o switch case, verifique a quantidade de pernas do usuário:
        System.out.println("Digite o numero de pernas");
       int pernas = teclado.nextInt();
       String tipo;
       switch (pernas){ // escolhe a variavel que receberá o valor a ser avaliado
           //cada case (cada valor inserido pelo usuário retorna o que foi configurado na atribuição da variavel)
           case 1:
               tipo = "Saci";
               break;
           case 2:
               tipo = "Bípede";
               break;
           case 4:
               tipo = "Quadrupede";
               break;
           case 6,8:
               tipo = "Aranha";
               break;
           default:
               tipo = "ET";                       
       }
        sout relacionado ao switch case System.out.println(tipo);//*/
        //Estrutura de repetição:
        //while
        /*//algoritmo que conte de 1 a 4 escrevendo a palavra cambalhota:
      int cc = 1;
      while (cc<=4){
          System.out.println("Cambalhota " + cc);
          cc++;
      }*/
 /* contiue: //modifique o fluxo de um laço para que seja retornado para o inicio do laço, mesmo tendo mais condições à serem realizadas.
        int cc = 0;
        while (cc < 10) {
            cc++;

            if (cc == 5 || cc == 7 || cc == 9) {
                continue; //se a condição for atendida, ignora o fluxo da estrutura e retorna para a condição
            }
            System.out.println("Cambalhota" + cc);
        }*/
        //break:
       /* int cc = 0;
        while (cc < 10) {
            cc++;
            if (cc == 3) {
                break; //encerra todo o fluxo do algoritmo assim que a condição for atendida.
            }
            System.out.println("Cambalhota" + cc);
        }*/
       
       //do while
       /*int cc = 1;
        do {            
            System.out.println("Cambalhota " +cc);
            cc++;
        } while (cc<=4);*/
       
      /* //faça um algoritmo que leia a entrada de numeros de um usuário, some todos e os exbiba até que o user não queria mais informar outro número.      
        int n,s = 0;
        String resp;
        do {            
            System.out.println("Digite o numero para somar: ");
            n = teclado.nextInt();
            s += n; //s = s + n
            System.out.println("Deseja continuar?");
            resp = teclado.next();
        } while (resp.equals ("s"));
        System.out.println("A soma de todos os números digitados é: " + s);*/
      
      //laço for:
      //sintaxe:
    /*  for(int cc = 2; cc<=10; cc+=2){
          System.out.println(cc);
      }*/
    
    //arrays:
    //sintaxe:
   /* float n[] = new float[4];
    n[0] = 0;
    n[1] = 1;
    n[2] = 2;
    n[3] = 3;*/
   
  /* //outra maneira de declaração: (declaramos dessa maneira quando sabemos os valores que serão inseridos em cada posição)
   int n[] = {0,1,2,3};
   System.out.println("O total de casas de n eh:" + n.length);
   for(int i = 0; i <n.length; i++){
        System.out.println("Na posicao "+ i + " temos o valor " + n[i]); //maneira de iterar sob o array
   }
*/
   //percorre o array:
   /*for(int i = 0; i<n.length; i++){
            System.out.println(n[i]);
        }*/
   
   
    }
}
