/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javapoovera0204;

import javax.swing.JOptionPane;

/**
 *
 * @author Nicollas
 */
public class JavaPooVera0204 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    /*  String valor1,valor2;
        double n1, n2;
        valor1 = JOptionPane.showInputDialog("Digite a primeira nota: ");
        n1 = Float.parseFloat(valor1);
        System.out.print("Digite a segunda nota: ");
        valor2 = JOptionPane.showInputDialog("Digite a primeira nota: ");
        n2 = Float.parseFloat(valor2);
        
        JOptionPane.showMessageDialog(null, (n1 + n2) / 2  );
        */
    
    //salario, idade e nome, e recebe mais 10 por cento do salario:
    // pede nome do usuário
    /*String idade,nome, salario;
    int idadef;
    float salariof;
    nome = JOptionPane.showInputDialog("Digite o seu nome: ");
    idade = JOptionPane.showInputDialog("Digite a sua idade : ");
    idadef= Integer.parseInt(idade);
    salario = JOptionPane.showInputDialog("Digite o seu salario: ");
    salariof = Float.parseFloat(salario);
    salariof = salariof * 0.10f;
    JOptionPane.showMessageDialog(null, salariof);
    */
    
    // Entrar com nome de funcionario, idade e salario, se idade maior que 45 ele terá um bonus de 5%
    //no salario
    /*
    String nome,idade, salario;
    int idadef;
    float salariof;
    nome = JOptionPane.showInputDialog("Digite o seu nome: ");
    idade = JOptionPane.showInputDialog("Digite a sua idade : ");
    idadef= Integer.parseInt(idade);
    salario = JOptionPane.showInputDialog("Digite o seu salario: ");
    salariof = Float.parseFloat(salario);
    salariof = salariof * 0.10f;
    if (idadef >= 45){
        salariof = salariof  * 0.10f;
        
    }
    JOptionPane.showMessageDialog(null, salariof);
*/
    
    /*//entre com o ano de nascimento, ano atual e caulcule a idade, mostre na tela o nome e a idade:
    String nome, anoNasc,anoAtual;
    int anoNascf,anoAtualf, idade;
    nome = JOptionPane.showInputDialog("Digite o seu nome: ");
    anoNasc = JOptionPane.showInputDialog("Digite o ano de nascimento: "); 
    anoNascf = Integer.parseInt(anoNasc);
    anoAtual = JOptionPane.showInputDialog("Digite o ano atual: "); 
    anoAtualf = Integer.parseInt(anoAtual);
    idade = anoAtualf - anoNascf;
    JOptionPane.showMessageDialog(null, "Seu nome é " + nome + " e sua idade é: " + idade);*/
    
    //some cinco numeros inteiros e mostre na tela a somatória:
    /*String n1, n2, n3, n4, n5;
    int n1f, n2f, n3f, n4f, n5f, soma;
    n1 = JOptionPane.showInputDialog("Digite o primeiro número ");
    n1f = Integer.parseInt(n1);
    n2 = JOptionPane.showInputDialog("Digite o segundo número ");
    n2f = Integer.parseInt(n1);
    n3 = JOptionPane.showInputDialog("Digite o terceiro numero ");
    n3f = Integer.parseInt(n1);
    n4 = JOptionPane.showInputDialog("Digite o quarto ");
    n4f = Integer.parseInt(n1);
    n5 = JOptionPane.showInputDialog("Digite o quinto ");
    n5f = Integer.parseInt(n1);
    
    soma = n1f + n2f+ n3f+ n4f+ n5f;
    JOptionPane.showMessageDialog(null, "A soma de todos os números é: " + soma);*/
    
    // mostre na tela o maior dos dois numeros digitados:
    String n1, n2;
    int n1f, n2f;
    n1 = JOptionPane.showInputDialog("Digite o primeiro número ");
    n1f = Integer.parseInt(n1);
    n2 = JOptionPane.showInputDialog("Digite o segundo número ");
    n2f = Integer.parseInt(n2); 
    if (n1f > n2f){
    JOptionPane.showMessageDialog(null, "O maior numero foi o primeiro digitado, que é: " + n1f);
    }else {
      JOptionPane.showMessageDialog(null, "O maior numero foi o segundo digitado, que é : " + n2f);  
    }
    }
    
}
