package model;

public class Conta {

    private int numero;
    private double saldo;
    private Cliente cliente;

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public void imprimirConta() {
        int tamanhoVetor = this.getCliente().getDependente().length;
        System.out.println("Conta: " + this.numero);
        System.out.println("Saldo: " + this.saldo);
        System.out.println("Cliente: " + this.cliente.getNome());
        for(int i = 0; i < tamanhoVetor; i++) {
            if (this.getCliente().dependente[i] != null) {
                System.out.println("Dependente: " + this.getCliente().dependente[i].getNome());
            }
        }
    }
}
