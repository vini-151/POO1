package model;

public class ContaCorrente {
    public int numero;
    public String cliente;
    public double saldo;
     public double limite;


    public void saque(double quantidade){
        if (quantidade <= saldo){
            double novoSaldo = saldo - quantidade;
            saldo = novoSaldo;
            System.out.println("Novo saldo: " +saldo);
        }else {
            System.out.println("Valor inserido maior que o saldo");
        }
    }

    public void depositar(double valor){
        saldo = saldo + valor;
        System.out.println("Novo saldo: " +saldo);
    }


    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public double getLimite() {
        return limite;
    }

    public void setLimite(double limite) {
        this.limite = limite;
    }

    public String getCliente() {
        return cliente;
    }

    public void setCliente(String cliente) {
        this.cliente = cliente;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }


}



