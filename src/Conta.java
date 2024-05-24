import java.time.Instant;
import java.util.ArrayList;
import java.util.List;

public abstract class Conta {

    private static int SEQUENCIAL = 1;

    public int tipo;
    public long numero;
    public double saldo;
    public Pessoa pessoa;

    Instant instant = Instant.now();
    List<Movimento> extrato = new ArrayList<>();

    public Conta(Pessoa pessoa) {

        this.numero = SEQUENCIAL++;
        this.saldo = 0;
        this.pessoa = pessoa;

    }

    public void depositar(double valor) {

        this.saldo += valor;
        registrarMovimento("Depósito", valor);

    }

    public void sacar(double valor) {

        this.saldo -= valor;
        registrarMovimento("Saque", valor);

    }

    public void tranferir(double valor, Conta destino) {

        this.sacar(valor);
        destino.depositar(valor);
        registrarMovimento("Transferência", valor);

    }

    public void registrarMovimento(String operacao, double valor) {

        Movimento mv = new Movimento();
        mv.tipo = this.tipo;
        mv.operacao = operacao;
        mv.numero = this.numero;
        mv.dt = instant;
        mv.valor = valor;
        extrato.addLast(mv);

    }

    public void imprimirExtrato() {

        for (Movimento movimento : extrato) {

            if (movimento.tipo == this.tipo) {

                System.out.println(
                    "Tipo Conta: " + movimento.tipo + " - " +
                    "Operação: " + movimento.operacao + " - " +
                    "Número Conta: " + movimento.numero + " - " +
                    "Data: " + movimento.dt + " - " +
                    "Valor: " + movimento.valor
                );

            }

        }

    }
}
