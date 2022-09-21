public class TesteFuncionario {
    public static void main(String[] args) {

        Funcionario gilberto = new Funcionario();
        gilberto.setNome("Gilberto Mascena");
        gilberto.setCpf("11122233344");
        gilberto.setSalario(2500.00);

        System.out.println(gilberto.getNome());
        System.out.println(gilberto.getBonificacao());

    }
}
