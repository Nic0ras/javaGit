package javapoo05;

public class JavaPoo05 {

    public static void main(String[] args) {
        // TODO code application logic here
        ContaBanco p1 = new ContaBanco();
        
        //criação de um novo instanciamento do objeto ContaBanco:
        p1.abrirConta("CC");
        p1.setNumConta(1375);
        p1.setDono("Nic Henric");
        p1.estadoAtual();
        p1.sacar(55.0f); //precisa do f no final do número do parametro
    }
    
}
