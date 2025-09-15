package View;

import Model.Banco;
import Model.Cliente;
import Model.Conta;

public class TestarConstrutores {

    public static void main(String[] args) {

        Cliente cliente = new Cliente("Hendrik", "Rua A");

        Conta cc = new Conta(101, 10000, cliente);

        Banco banco = new Banco(789, "Sicredi", cc);

        System.out.println("Código: " + banco.getCodigo());
        System.out.println("Nome: " + banco.getNome());

    }
}
