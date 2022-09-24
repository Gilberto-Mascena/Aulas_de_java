public class TesteFuncionario {
    public static void main(String[] args) {

        Cliente cliente = new Cliente();

        Gerente gilberto = new Gerente();
        gilberto.setNome("Gilberto Mascena");
        gilberto.setCpf("11122233344");
        gilberto.setSalario(2500.00);

        System.out.println(gilberto.getNome());
        System.out.println(gilberto.getBonificacao());

    }
}
