public class Main {

    public static void main(String[] args) {
        PF pf = new PF();
        pf.nome = "Primeira PF";
        pf.cpf = 123456;

        CC cc = new CC(pf);
        CP cp = new CP(pf);

        cc.depositar(100);
        cc.sacar(10);
        cc.tranferir(25, cp);

        cc.imprimirSaldo();
        cp.imprimirSaldo();
        cc.imprimirExtrato();
        cp.imprimirExtrato();
    }

}
