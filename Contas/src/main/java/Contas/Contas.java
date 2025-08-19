package Contas;
import Conta.Conta;

public class Contas {
    public static void main(String[] args) {

        Conta c1 = new Conta();
        c1.conta = 10000;
        c1.saldo = 1000;

        Conta c2 = new Conta();
        c2.conta = 20000;
        c2.saldo = 1000;

        c1.transferir(200, c2);
        System.out.println(c1.saldo);
        System.out.println(c2.saldo);
    }
}