package vetor01;

public class Vetor01 {

    public static void main(String[] args) {
        // TODO code application logic here
        int teste[] = new int[5]; //declaração de um vetor com 4 posições
        int n[] = {3, 2, 8, 7, 5}; //outra maneira de declarar os vetoes.
        System.out.println("O total de casas de N é: " + n.length);

        for (int c = 0; c <=5; c++) {;
            System.out.println("Na posição " + c + " temos o valor: " + n[c]+ " "); 
        }
        System.out.println(teste.length-1 );
    }

}
