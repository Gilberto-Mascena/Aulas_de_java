public class Cliente implements Autenticavel {

    private Autenticador autd;

    public Cliente() {
        this.autd = new Autenticador();
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
