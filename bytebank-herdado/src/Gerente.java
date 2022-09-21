// (extends)-> significa que a classe Gerente herda caracteristicas da classe Funcionario..

public class Gerente extends Funcionario {
    
    private int senha;
    public void setSenha(int senha) {
        this.senha = senha;
    }

    public boolean autentica(int senha) {
        if(this.senha == senha) {
            return true;
        } else {
            return false;
        }
    }

    // A palavra super em "super.salario" abaixo indica que o atributo salario, vem da classe Mãe ou Super, desse modo não seria uma boa pratica escrever "this.salario", pois esta classe não possui esse atributo. (Isso significa REESCRITA.)

    

    public double getBonificacao() {
        return super.getBonificacao() + super.getSalario();
    }

}
   