/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package vetor04;

import java.util.Arrays;

/**
 *
 * @author Nicollas
 */
public class Vetor04 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        double n[] = {32, 90, -5.6};
        
        for(double valor: n){
            System.out.println(valor + " ");
            
        }
        double search = Arrays.binarySearch(n, -5.6);
        System.out.println("Encontrei o valor na posição: " + search);
    }
    
    }
