package modelo;

public class Paciente {

    //Atributos = características/propriedades
    private String nome, situacao;
    private float peso, altura, imc;
    private int id;

    //Construtores de Objetos
    public Paciente() {

    }

    public Paciente(String nome, float altura, float peso) {
        this.nome = nome;
        this.altura = altura;
        this.peso = peso;
    }

    //metodos acessores getters / setters
    //setter:
    public void setNome() {
        this.nome = nome;
    }

    //getters:
    public String getNome() {
        return nome;
    }

    public float getPeso() {
        return peso;
    }

    public void setPeso(float peso) {
        if(this.peso > 0){
                  this.peso = peso;
        }
  
    }

    public float getAltura() {
        return altura;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }
}
