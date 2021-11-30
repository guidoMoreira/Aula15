package exe1;

public class ContaSalário extends Conta implements IClient{
    private String nome;
    private float salario;
    public int CPF;

    public ContaSalário(float Salario,String Nome){
        this.salario = Salario;
        this.nome = Nome;
    }
    public ContaSalário(int CPF){
        this.CPF = CPF;
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
        System.out.println("Nome: "+this.nome+"\nValor salario: "+this.salario+"\nCPF: "+this.CPF);
    }
}
