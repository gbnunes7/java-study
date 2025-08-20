package je04_conta_corrente_ex;

public class ContaCorrenteApp {
    public static void main(String[] args) {
        ContaCorrente conta = new ContaCorrente();

        System.out.println(conta.numeroDaConta);
        System.out.println(conta.nomeCliente);
        System.out.println(conta.saldo);
        conta.cancelarConta("Não quero mais");
        conta.sacar(89);
        System.out.println(conta.saldo);
        conta.depositar(98);
        System.out.println(conta.saldo);

    }

}
