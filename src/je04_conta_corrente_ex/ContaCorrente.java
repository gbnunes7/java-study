package je04_conta_corrente_ex;

import java.util.Date;

public class ContaCorrente {
    String numeroDaConta = "00001";
    String numeroDaAgencia = "00003";
    String nomeCliente = "Gabriel";
    Date dataNascimento;
    double saldo;

    public void sacar(double valor){
        saldo = saldo - valor;
    }

    public void transferenciaEntreContas(String numeroDaContaDestino, String numeroDaAgenciaDestino, double valor) {
        saldo = saldo - valor;
        System.out.println("Transferiu da conta" +
                numeroDaConta +
                numeroDaAgencia + "Para" + numeroDaContaDestino + numeroDaAgenciaDestino + "o valor de" +
                valor);

    }

    public void cancelarConta(String justificativa) {
        System.out.println("Cancelando conta " + justificativa);
    }

    public void consultaSaldo() {
        System.out.println("Saldo da conta: " + saldo);
    }

    public void depositar(double valor) {
        saldo = saldo + valor;
    }
}
