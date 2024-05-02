/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exforfibonacci;

/**
 *
 * @author Nicollas
 */
public class ExForFibonacci {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int n1 = 1, n2 = 1, a;
        System.out.println(n1);
        System.out.println(n2);
        for (int i = 3; i<=20; i++){
            a = n1 + n2;
            System.out.print(a + "\t");
            n1 = n2;
            n2 = a;
        }
    }
    
}
