public abstract interface Autenticavel {

   //interfaces é comparado a um contrato..
   //Precisa ser assinado.
   //Implementar metodos: setSenha.
   //Implementar metodos: autentica

    public abstract void setSenha(int senha);    
    
    public abstract boolean autentica(int senha);
}
