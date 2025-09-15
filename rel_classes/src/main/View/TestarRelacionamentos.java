package View;

import Model.Cliente;
import Model.Conta;
import Model.Dependente;



public class TestarRelacionamentos {

    public static void main(String[] args) {
        Cliente cliente = new Cliente("Alencar", "Rua ZYZ");

        Conta cc = new Conta(200, 598000, cliente);

        Dependente pietra = new Dependente("Pietra");
        Dependente pierre = new Dependente("Pierre");
        Dependente giovana = new Dependente("Giovana");
        Dependente silvia = new Dependente("Silvia");

        cliente.getDependente()[0] =  pietra;
        cliente.getDependente()[1] =  pierre;
        cliente.getDependente()[2] =  giovana;
        cliente.getDependente()[3] =  silvia;

        imprimirConta(cc);

    }

    private static void imprimirConta(Conta c){
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
    }

}
