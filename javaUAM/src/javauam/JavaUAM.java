package javauam;

import java.util.*;

public class JavaUAM {

    
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        //instancia o objeto:
        Cao c1 = new Cao();
        c1.nome = "Budweiser";
        c1.raca = "Shitzu";
        c1.peso = 7.5f;
        
        System.out.println(c1.peso);
        
        teclado.close();
        
    }
    
}
