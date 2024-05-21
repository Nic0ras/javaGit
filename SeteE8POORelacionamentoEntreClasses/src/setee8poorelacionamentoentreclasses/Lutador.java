package setee8poorelacionamentoentreclasses;

public class Lutador {

    //atributos
    private String nome;
    private String nascionalidade;
    private int idade;
    private float altura;
    private float peso;
    private String categoria;
    private int vitorias, derrotas, empates;

    //métodos
    public void apresentar() {
        System.out.println("##########");
        System.out.println("Chegou a hora! Apresentamos o lutador: " + this.getNome());
        System.out.println("Diretamente de : " + this.getNascionalidade());
        System.out.println("com " + this.getIdade() + " anos e " + this.getAltura() + "m de altura");
        System.out.println("Ganhou " + this.getVitorias());
        System.out.println("Perdeu: " + this.getDerrotas());
        System.out.println("Empatou " + this.getEmpates());
    }

    public void status() {
        System.out.println(this.getNome());
        System.out.println(this.getNome() +"E um peso" + this.getCategoria());
        System.out.println(this.getVitorias() + " vitorias");
        System.out.println(this.getDerrotas() + " derrotas");
        System.out.println(this.getEmpates() + "empates");

    }

    public void ganharLuta() {
        this.setVitorias(this.getVitorias() + 1);

    }

    public void perderLuta() {
        this.setDerrotas(this.getDerrotas() + 1);

    }

    public void empatarLuta() {
        this.setEmpates(this.getEmpates() + 1);

    }

    //método construtor (métodos que setam configurações iniciais a cada nova instancia da classe)
    public Lutador(String no, String na, int id, float al, float pe, int vi, int de, int em) {
        this.nome = no;
        this.nascionalidade = na;
        this.idade = id;
        this.altura = al;
        this.setPeso(pe);
        this.vitorias = vi;
        this.derrotas = de;
        this.empates = em;
    }

    //Getters e Setters
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNascionalidade() {
        return nascionalidade;
    }

    public void setNascionalidade(String nascionalidade) {
        this.nascionalidade = nascionalidade;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public float getAltura() {
        return altura;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }

    public float getPeso() {
        return peso;
    }

    public void setPeso(float pe) {
        this.peso = pe;
        setCategoria();
    }

    public String getCategoria() {
        return categoria;
    }

    private void setCategoria() {
        this.categoria = categoria;
    }

    public int getVitorias() {
        return vitorias;
    }

    public void setVitorias(int vitorias) {
        this.vitorias = vitorias;
    }

    public int getDerrotas() {
        return derrotas;
    }

    public void setDerrotas(int derrotas) {
        this.derrotas = derrotas;
    }

    public int getEmpates() {
        return empates;
    }

    public void setEmpates(int empates) {
        this.empates = empates;
    }

}
