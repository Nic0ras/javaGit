package aulapoo5b;

public class AulaPOO5b {
    public static void main(String[] args) {
        ContaBanco p1 = new ContaBanco();
        p1.setNumConta(1111);
        p1.setDono("Nic");
        p1.abrirConta("CC");
        
        
        ContaBanco p2 = new ContaBanco();
        p2.setNumConta(2222);
        p2.setDono("Isa");
        p2.abrirConta("CP");
        
        
        p1.depositar(100);
        p2.depositar(500);
        p2.sacar(650);
        p2.fecharConta();
        
        
        System.out.println(p1.toString());
        System.out.println(p2.toString());
        
        
    }

}
