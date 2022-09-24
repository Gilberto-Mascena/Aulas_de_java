// (extends)-> significa que a classe Gerente herda caracteristicas da classe Funcionario que assina o contrato Autenticavel.. E é autenticavel.

public class Gerente extends Funcionario implements Autenticavel {

    private Administrador autd;

    public Gerente() {
        this.autd = new Administrador();
    }

    
    
    @Override
    public void setSenha(int senha) {     
        this.autd.setSenha(senha);
    }

    @Override
    public boolean autentica(int senha) {
        return this.autd.autentica(senha);

    }

    // A palavra super em "super.salario" abaixo indica que o atributo salario, vem da classe Mãe ou Super, desse modo não seria uma boa pratica escrever "this.salario", pois esta classe não possui esse atributo. (Isso significa REESCRITA.)

    

    public double getBonificacao() {
        return super.getSalario();
    }    

}
   