package Contas;
import Conta.Conta;

public class Contas {
    public static void main(String[] args) {

        Conta c1 = new Conta();
        c1.setSaldo(100);

        Conta c2 = new Conta();
        c2.setSaldo(200);

        c1.sacar(60);
        c1.depositar(20);
        c1.sacar(80);
        c1.sacar(30);
        c1.depositar(30);
        c1.sacar(70);

        c2.transferir(50, c1);

        System.out.println(c1.getSaldo());
        System.out.println(c2.getSaldo());
    }
}