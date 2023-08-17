package Sistema;

public class Conta {

    //DEFININDO VARIAVEIS
    private int numero;
    private String agencia;
    private String nomeCliente;
    private double saldo;

    //DEFININDO METODOS GET E SET
    public void SetNumero(int num){
        this.numero = num;
    }
    public int GetNumero(){
        return this.numero;
    }
    public void SetAgencia(String agencia){
        this.agencia = agencia;
    }
    public String GetAgencia(){
        return this.agencia;
    }
    public void SetNomeCliente(String nomeCliente){
        this.nomeCliente = nomeCliente;
    }
    public String GetNomeCliente(){
        return this.nomeCliente;
    }
    public void SetSaldo(double saldo){
        this.saldo = saldo;
    }
    public double GetSaldo(){
        return this.saldo;
    }

    //METODO DE RETORNO DAS INFORMAÇÕES
    public String ExibirConta(){
        return String.format("Olá %s, obrigado por criar uma conta em nosso banco, sua agência é %s, conta %d e seu saldo %.2f já está disponível para saque.", GetNomeCliente(), GetAgencia(), GetNumero(),GetSaldo());
    }

}
