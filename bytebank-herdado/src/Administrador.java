public class Administrador extends Funcionario implements Autenticavel{

    private Administrador autd;

    public Administrador() {
        this.autd = new Administrador();
    }


    @Override
    public double getBonificacao() {
        return 50;
    }

    @Override
    public void setSenha(int senha) {     
        this.autd.setSenha(senha);
    }

    @Override
    public boolean autentica(int senha) {
        return this.autd.autentica(senha);

    }
    
}
