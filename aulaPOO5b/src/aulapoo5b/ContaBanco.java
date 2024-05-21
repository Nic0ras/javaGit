package aulapoo5b;

public class ContaBanco {

    //atributos
    public int numConta;
    protected String tipo;
    private String dono;
    private float saldo;
    private boolean status;

    //Método construtor: (seta valores padrões para cada nova instancia da classe).
    public ContaBanco() {
        this.saldo = 0;
        this.status = false;
    }

    //métodos personalizados
    public void abrirConta(String tipo) {
        this.setTipo(tipo);
        this.setStatus(true);
        if (tipo == "CC") {
            this.setSaldo(50);
        } else if (tipo == "CP") {
            this.setSaldo(150);
        }
    }

    public void fecharConta() {
        if (this.getSaldo() > 0) {
            System.out.println("Conta com dinheiro");
        } else if (this.getSaldo() < 0) {
            System.out.println("Conta em debito");
        } else {
            this.setStatus(false);
            System.out.println("Conta fechada com sucesso!");
        }
    }

    public void depositar(float valor) {
        //também podemos fazer a linha abaixo assim: this.getStatus(){}, pois ele avalia se o retrono do método getStatus é verdadeiro.
        if (this.status == true) {
            //this.saldo = this.saldo +v;
            this.setSaldo(this.getSaldo() + valor);
            System.out.println("Deposito realizado na conta de " + this.getDono());
        } else {
            System.out.println("Impossivel depositar em uma conta fechada :( ");
        }
    }

    public void sacar(float valor) {
        if (this.getStatus()) { //verifica se a conta está aberta
            if (this.getSaldo() >= valor) { //se o valor da conta for maior ou igual ao valor do saque
                this.setSaldo(this.getSaldo() - valor); //pega o valor da conta e subtrai o valor do saldo.
            } else {
                System.out.println("Saldo insuficiente");
            }
        } else {
            System.out.println("Impossivel sacar dinheiro de conta fechada.");
        }
    }

    public void pagarMensal() {
        float v = 0;
        if (this.getTipo() == "CC") {
            v = 12;
        } else if (this.getTipo() == "CP") {
            v = 20;
        }
        if (this.getStatus()) {
            this.setSaldo(this.getSaldo() - v);
            System.out.println("Mensalidade paga com sucesso por: " + this.getDono());
        } else {
            System.out.println("Impossivel pagar com conta fechada");
        }
    }

    public int getNumConta() {
        return numConta;
    }

    public void setNumConta(int numConta) {
        this.numConta = numConta;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getDono() {
        return dono;
    }

    public void setDono(String dono) {
        this.dono = dono;
    }

    public float getSaldo() {
        return saldo;
    }

    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }

    public boolean getStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "ContaBanco{" + "numConta=" + numConta + ", tipo=" + tipo + ", dono=" + dono + ", saldo=" + saldo + ", status=" + status + '}';
    }
    
    

}
