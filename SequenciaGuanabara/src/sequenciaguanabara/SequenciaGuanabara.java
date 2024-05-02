
package sequenciaguanabara;


public class SequenciaGuanabara {


    public static void main(String[] args) {
        // TODO code application logic here
        //maneiras de declarar variaveis:
        
        /*//padrões (normais):
        int idade = 3;
        float salario = 2000.0f; //necessário utilizar o f no fim dos números
        char letra = 'G'; //aceita somente uma letra e precisa de aspas simples
        boolean dia = true; //armazena um valor verdadeiro ou falso.*/
        
      /*  //typecast: especifica os tipos de valores específicos
        int idade = (int) 3; //pede pra considerar o número 3 como inteiro
        float salario = (float) 2000.0; //como existe o typecast antes do número, não é necessário utilizar o f no final.
        char letra = (char) 'G';
        boolean casado = (boolean) false;
        */
      
      //Conversão entre tipos:
      /* // inteiro para string:
      int idade = 30;
      String valorConvertido = Integer.toString(idade);
        System.out.println(valorConvertido);*/
      
   /*   //string para inteiro:
      String idade = "30";
      int valor = Integer.parseInt(idade);
        System.out.println(valor);*/
      
    /*  //String para float
      String idade = "30";
      float valor = Float.parseFloat(idade);
        System.out.printf("valor: %.2f \n",valor);*/
      
      //operador ternário:
     /* int n1, n2, r;
      n1 = 15;
      n2 = 6;
      r = (n1 > n2)?1:0;
        System.out.println(r);*/
      //também podemos realizar operações dentro do if ternário:
      
      int n1,n2,r;
      n1 = 6;
      n2 = 10;
      r = (n1 > n2)?n1+n2:n1-n2;
        System.out.println(r);
      
      
      
    }
    
}
