public class CC extends Conta{

    public CC(Pessoa pessoa) {
        super(pessoa);
        this.tipo = 1;
    }

    public void imprimirSaldo() {

        System.out.println("Saldo Conta Corrente: " + this.saldo);

    }

    @Override
    public void imprimirExtrato() {

        System.out.println("Extranto Conta Corrente:");
        super.imprimirExtrato();

    }

}
