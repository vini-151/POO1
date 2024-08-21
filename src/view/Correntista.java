package view;

import model.ContaCorrente;

public class Correntista {
    public static void main(String[] args) {
        ContaCorrente Cliente = new ContaCorrente(); //criou o objeto "cliente"
        Cliente.setNumero(503040);
        Cliente.setCliente("Pedro");
        Cliente.setSaldo(1000.00);
        Cliente.setLimite(1500.00);
        System.out.println("Número da conta: "+Cliente.getNumero());
        System.out.println("Cliente: "+Cliente.getCliente());
        System.out.println("Saldo: "+Cliente.getSaldo());
        System.out.println("Limite: "+Cliente.getLimite());
        Cliente.saque(100);

        ContaCorrente Cliente1 = new ContaCorrente();
        Cliente1.setNumero(123456);
        Cliente1.setCliente("João");
        Cliente1.setSaldo(1060.00);
        Cliente1.setLimite(2000);
        Cliente1.depositar(3500);

    }

}
