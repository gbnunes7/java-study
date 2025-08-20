package je01_sintaxe_sematnica;

public class Conta {
    double saldo = 25.0;

    public void sacar(double valor) {
        double novoSaldo = saldo - valor;
        saldo = novoSaldo;
    }

    public void getSaldo() {
        System.out.println("Saldo: " + saldo);
    }
}


