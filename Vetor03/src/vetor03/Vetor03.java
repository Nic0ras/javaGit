
package vetor03;

import java.util.Arrays;


public class Vetor03 {


    public static void main(String[] args) {
        double v[] = {5, 0, 30, -4.6,};
       // Arrays.sort(v); //o método sort da biblioteca Arrays faz com que o vetor seja organizado do menor número para o maior
       //método de busca de elementos em um vetor com pesquisa binária:
        for(double valor: v){
            System.out.print(valor + " ");
        }
        
    }
    
}
