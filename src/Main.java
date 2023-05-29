public class Main {
    public static void main(String[] args) {
        ContaPoupanca num_conta = new ContaPoupanca(730,1000);
        System.out.println("Saldo inicial: " + num_conta.getSaldo());


        num_conta.calcularNovoSaldo(0.5f); // Taxa de rendimento de 0.5%
        System.out.println("Saldo após o rendimento: " + num_conta.getSaldo());

        num_conta.setDiasDeRendimento(60);
        num_conta.calcularNovoSaldo(0.5f);
        System.out.println("Saldo após o segundo rendimento: " + num_conta.getSaldo());
    }
}