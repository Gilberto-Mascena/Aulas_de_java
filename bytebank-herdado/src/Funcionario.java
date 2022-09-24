
    // (protected)= está entre private e public, desse modo só as classes filhas da classe mãe tem acesso.

    // Classes mãe também são chamadas de Super classe, e Classe Base.

    // Não pode mais instanciar ou criar objeto dessa classe pois é abstrata = "abstract".
    
public abstract class  Funcionario {

    private String nome;
    private String cpf;
    private double salario;

    // Metodo sem corpo, não há implementação, "abstract".
    public abstract double getBonificacao(); 
        
    

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getCpf() {
        return cpf;
    }
    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
    public double getSalario() {
        return salario;
    }
    public void setSalario(double salario) {
        this.salario = salario;
    }
}
