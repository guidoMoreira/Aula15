package exe1;

public class ContaCorrente extends Conta implements IClient{
    private String nome;
    private float valor;
    public ContaCorrente(String nome){
        this.nome = nome;
    }
    public ContaCorrente(float valor){
        this.valor = valor;
    }
    @Override
    public String getClient() {
        return this.nome;
    }

    @Override
    public float getSaldo() {
        return this.Saldo;
    }

    @Override
    public void Imprimir() {
        System.out.println("Nome: "+this.nome+"\nValor do saque: "+this.valor);
    }
}
