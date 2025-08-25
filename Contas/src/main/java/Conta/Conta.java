package Conta;

public class Conta {

    public int agencia;
    public int conta;
    private double saldo;
    public String titular;
    public String banco;

    private String errorMsgInicial = "Não é possível atribuir saldo inicial menor que zero!";
    private String errorMsgSaque = "Valor do saque maior que o saldo. Foram sacados apenas R$ ";
    private String errorSaqueSemFundos = "Não há fundos para saque. Nada foi sacado";
    private String errorMsgTrans = "Sem valor para transferência.";
    private String errorMsgValorNeg = "Não é possível fazer operações com números negativos.";

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        if (saldo < 0) {
            System.out.println(errorMsgInicial);
        } else {
            this.saldo = saldo;
        }
    }

    public void sacar(double valor) {
        if (valor < 0) {
            System.out.println(errorMsgValorNeg);
        } else if (valor > saldo && saldo > 0) {
            System.out.println(errorMsgSaque+saldo);
            this.saldo -= saldo;
        } else if (saldo == 0){
            System.out.println(errorSaqueSemFundos);
        } else {
            this.saldo -= valor;
        }
    }

    public void depositar(double valor) {
        if (valor < 0) {
            System.out.println(errorMsgValorNeg);
        } else {
            this.saldo += valor;
        }
    }

    public void transferir(double valor, Conta ContaIn) {
        if (valor < 0) {
            System.out.println(errorMsgValorNeg);
        } else if (valor > saldo) {
            System.out.println(errorMsgTrans);
        } else {
            this.saldo -= valor;
            ContaIn.saldo += valor;
        }
    }
}
