
package aulapoo3classe;
public class AulaPOO3Classe {

   public static void main(String[] args) {
        //modelo,cor,ponta,carga,tampada
        Caneta c1 = new Caneta();
        c1.cor = "Azul";
        c1.ponta = 0.5f;
        c1.tampada = true;
        //c1.status();
        
        //cria um segundo objeto a partir da classe.
        Caneta c2 = new Caneta();
        c2.cor = "Vermelha";
        c2.ponta = 0.7f;
        c2.tampada = false;
        //c2.status();
        c2.destampar();
        c2.rabiscar();
        
        System.out.println(c2.toString());
        
    }
    
}
