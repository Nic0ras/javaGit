package aulapoo3classe;


public class Caneta {
     String modelo;
      String cor;
     float ponta;
     int carga;
     boolean tampada;
    /* void status() {
        System.out.println("Modelo: "+ this.modelo);
        System.out.println("Uma caneta " + this.cor);
        System.out.println("Sua ponta e: " + this.ponta);
        System.out.println("Carga: "+ this.carga);
        System.out.println("Esta tampada? " + this.tampada);
        
        }*/
        
         void rabiscar(){
            if (this.tampada == true){
                System.out.println("Erro, não posso rabiscar pq ta fechada a tampa porra -.-");
            }else{
                System.out.println("Parabens meu irmao, toma aqui sua rabiscada kkk");
            }
        }
        
         void tampar() {
        this.tampada = true;
    }
         void destampar() {
        this.tampada = false;    
        }

    @Override
    public String toString() {
        return "Caneta{" + "modelo=" + modelo + ", cor=" + cor + ", ponta=" + ponta + ", carga=" + carga + ", tampada=" + tampada + '}';
    }
        
         
    }
    

