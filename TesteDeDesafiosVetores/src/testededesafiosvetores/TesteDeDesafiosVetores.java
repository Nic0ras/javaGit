/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package testededesafiosvetores;

/**
 *
 * @author Nicollas
 */
public class TesteDeDesafiosVetores {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String n[] = {"Jan", "Fev", "Mar", "Abr", "Mai", "Jun", "Jul", "Ago", "Set", "Out", "Nov", "Dez"};
        int dias[] = {31,28,31,30,31,30,31,31,30,31,30,31};
        for(int i=0; i<n.length; i++){
            System.out.println("O mês " + n[i] + " possui " + dias[i] + " dias");
        }
    }
    
}
