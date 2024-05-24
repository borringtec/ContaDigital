public class CP extends Conta{

    public CP(Pessoa pessoa) {
        super(pessoa);
        this.tipo = 3;
    }

    public void imprimirSaldo() {

        System.out.println("Saldo Conta Poupança: " + this.saldo);

    }

    @Override
    public void imprimirExtrato() {

        System.out.println("Extranto Conta Poupança:");
        super.imprimirExtrato();

    }

}
