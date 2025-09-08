package view;

import model.Cliente;
import model.Conta;
import model.Dependente;

public class TestarRelacionamentos {

    public static void main(String[] args) {

        Cliente cliente = new Cliente();
        cliente.setNome("Hendrik");
        cliente.setEndereco("Rua Silva Jardim");

        Cliente cliente1 = new Cliente();
        cliente1.setNome("Paula");
        cliente1.setEndereco("Rua A");

        Dependente ana = new Dependente();
        ana.setNome("Ana");
        Dependente maria = new Dependente();
        maria.setNome("Maria");
        Dependente joana = new Dependente();
        joana.setNome("Joana");

        cliente.getDependente()[0] = ana;
        cliente.getDependente()[1] = maria;
        cliente.getDependente()[2] = joana;

        Conta cc = new Conta();
        cc.setNumero(100);
        cc.setSaldo(1000);
        cc.setCliente(cliente);

        cc.imprimirConta();
    }
}
