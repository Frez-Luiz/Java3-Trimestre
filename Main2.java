public class Main2 {
    public static void main(String[] args) {
        ContaBancaria minhaConta = new ContaBancaria("Luiz Frez", 900.0);

        System.out.println("Titular: " + minhaConta.getTitular());
        System.out.println("Saldo: R$ " + minhaConta.getSaldo());

        minhaConta.depositar(200.0);
        minhaConta.sacar(100.0);
        minhaConta.sacar(200.0);

        System.out.println("Saldo final: R$ " + minhaConta.getSaldo());
    }
}
