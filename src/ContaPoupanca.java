public class ContaPoupanca extends ContaBancaria {
    public int diasDeRendimento;
    public float saldo;

    public ContaPoupanca(int diasDeRendimento, float saldo) {
        this.diasDeRendimento = diasDeRendimento;
        this.saldo = saldo;
    }

    public void calcularNovoSaldo(float taxaRendimento) {
        float rendimento = saldo * (taxaRendimento / 100) * (diasDeRendimento / 365);
        saldo += rendimento;
    }

    public float getSaldo() {
        return saldo;
    }

    public int getDiasDeRendimento() {
        return diasDeRendimento;
    }

    public void setDiasDeRendimento(int diasDeRendimento) {
        this.diasDeRendimento = diasDeRendimento;
    }
}








