package aulapoo3classe;


public class Caneta {
    public String modelo;
    public String cor;
    private float ponta;
    protected int carga;
    private boolean tampada;
    public void status() {
        System.out.println("Modelo: "+ this.modelo);
        System.out.println("Uma caneta " + this.cor);
        System.out.println("Sua ponta e: " + this.ponta);
        System.out.println("Carga: "+ this.carga);
        System.out.println("Esta tampada? " + this.tampada);
        
        }
        
        protected void rabiscar(){
            if (this.tampada == true){
                System.out.println("Erro, nao posso rabiscar pq ta fechada a tampa porra -.-");
            }else{
                System.out.println("Parabens meu irmao, toma aqui sua rabiscada kkk");
            }
        }
        
        protected void tampar() {
        this.tampada = true;
    }
        protected void destampar() {
        this.tampada = false;    
        }
        
    }
    

