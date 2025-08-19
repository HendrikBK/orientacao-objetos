package Conta;

public class Conta {

    public int agencia;
    public int conta;
    public double saldo;
    public String titular;
    public String banco;

    private String errorMsgInicial = "Não é possível atribuir saldo inicial menor que zero!";
    private String errorMsgSaque = "Valor do saque maior que o saldo.";
    private String errorMsgTrans = "Sem valor para transferência.";

    public void sacar(double valor) {
        if (valor > saldo) {
            System.out.println(errorMsgSaque);
        } else {
            saldo -= valor;
        }
    }

    public void depositar(double valor) {
        saldo += valor;
    }

    public void transferir(double valor, Conta ContaIn) {
        if (valor > saldo) {
            System.out.println(errorMsgTrans);
        } else {
            saldo -= valor;
            ContaIn.saldo += valor;
        }
    }
}
