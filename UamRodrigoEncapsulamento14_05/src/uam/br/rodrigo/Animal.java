/*crie um método construtor que receba por parametro os valores iniciais de cada um dos atributos e
atribua-os aos seus respectivos atributos.*/
/*crie os métodos get e set para cada um dos atributos*/
/*crie um método dados, sem parametros e do tipo void que quando chamado, imprime na tela uma espécie
de relatório  informando os dados do animal
*/

package uam.br.rodrigo;


public class Animal {
    
    public String nome;
    public float comprimento;
    public int nPatas;
    public String cor;
    public String ambiente;
    public float velMedia;
    
    public Animal(String nome, float comprimento, int nPatas, String cor, String ambiente, float velMedia){
        this.nome = nome;
        this.comprimento = comprimento;
        this.nPatas = nPatas;
        this.cor = cor;
        this.ambiente = ambiente;
        this.velMedia = velMedia;
    }
    
    public void dados(){
        System.out.println(toString() + " passou aqui");
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public float getComprimento() {
        return comprimento;
    }

    public void setComprimento(float comprimento) {
        this.comprimento = comprimento;
    }

    public int getnPatas() {
        return nPatas;
    }

    public void setnPatas(int nPatas) {
        this.nPatas = nPatas;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public String getAmbiente() {
        return ambiente;
    }

    public void setAmbiente(String ambiente) {
        this.ambiente = ambiente;
    }

    public float getVelMedia() {
        return velMedia;
    }

    public void setVelMedia(float velMedia) {
        this.velMedia = velMedia;
    }

    @Override
    public String toString() {
        return  "nome: " + nome + "\n comprimento: " + comprimento + "\n Numero de patas: " + nPatas + "\n cor: " + cor + "\n ambiente: " + ambiente + "\n velocidade media: " + velMedia;
    }
    
    
}
