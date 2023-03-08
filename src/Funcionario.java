public class Funcionario {
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
}
