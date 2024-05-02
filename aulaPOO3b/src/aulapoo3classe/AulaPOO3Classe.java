
package aulapoo3classe;
public class AulaPOO3Classe {

   public static void main(String[] args) {
        //modelo,cor,ponta,carga,tampada
        Caneta c1 = new Caneta();
        c1.modelo = "BIC cristal";
        c1.cor = "Azul";
        //c1.ponta = 0.7f;
        c1.carga = 80;
        c1.status();
        c1.tampada = false;
        c1.rabiscar();
        
    }
    
}
