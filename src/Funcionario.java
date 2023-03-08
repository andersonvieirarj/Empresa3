
/* CLASSE ABSTRATA
    É uma classe em que identificamos, dentro do código, como
    uma classe que jamais poderá ser instanciada, ou seja, essa
    classe não pode gerar objetos.
    O intuito disso é evitar criar objetos desnecessários para
    o código
 */
public abstract class Funcionario {
    private String nome;
    private String bairro;
    private int idade;
    // Inserir os métodos de acesso para os atributos encapsulados
    // set -> para alteração    ; get -> acessar apenas
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getBairro() {
        return bairro;
    }
    public void setBairro(String bairro) {
        this.bairro = bairro;
    }
    public int getIdade() {
        return idade;
    }
    public void setIdade(int idade) {
        this.idade = idade;
    }
    public double calcular(){
        double n1 =0;
        n1= n1* 2;
        return n1;
    }
}
