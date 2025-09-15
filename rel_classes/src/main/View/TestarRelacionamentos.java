package view;

import model.Banco;
import model.Cliente;
import model.Conta;
import model.Dependente;



public class TestarRelacionamentos {

    public static void main(String[] args) {
        model.Cliente cliente = new Cliente();
        cliente.setNome("Alencar");
        cliente.setEndereco("Rua ZYZ");

        Cliente cliente1 = new Cliente();
        cliente1.setNome("Paula");
        cliente1.setEndereco("Rua N");

        Conta cc = new Conta();
        cc.setNumero(200);
        cc.setSaldo(598000);
        cc.setCliente(cliente1);

        Dependente pietra = new Dependente();
        pietra.setNome("Pietra");
        Dependente pierre = new Dependente();
        pierre.setNome("Pierre");
        Dependente giovana = new Dependente();
        giovana.setNome("giovana");

        cliente1.getDependente()[0] =  pietra;
        cliente1.getDependente()[1] =  pierre;
        cliente1.getDependente()[2] =  giovana;

        imprirConta(cc);

    }

    private static void imprirConta(Conta c){
        System.out.println("Número: "+c.getNumero());
        System.out.println("Saldo: "+c.getSaldo());
        System.out.println("Cliente: "+c.getCliente().getNome());

    System.out.println("Dependentes ....");
    int tamVetor = c.getCliente().getDependente().length;

    for(int i = 0; i < tamVetor; i++){
        if(c.getCliente().getDependente()[i] != null){
            System.out.println("Depente: "
                    +c.getCliente().getDependente()[i].getNome());

        }
    }

       /* System.out.println("Depente: "
                +c.getCliente().getDependente()[0].getNome());
        System.out.println("Depente: "
                +c.getCliente().getDependente()[1].getNome());
        System.out.println("Depente: "
                +c.getCliente().getDependente()[2].getNome());*/
    }

}
