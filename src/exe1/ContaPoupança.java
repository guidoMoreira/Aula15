package exe1;

public class ContaPoupança extends Conta implements IClient{
    private String nome;
    public String Data;
    public ContaPoupança(String nome,float saldo){
        this.nome = nome;
        this.Saldo = saldo;
    }
    public ContaPoupança(String data){
        this.Data = data;
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
        System.out.println("Nome: "+this.nome+"\nSaldo: "+this.getSaldo()+"\nData de consulta: "+this.Data);
    }
}
