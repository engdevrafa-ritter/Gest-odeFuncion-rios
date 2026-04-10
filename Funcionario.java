public class Funcionario {
    protected String nome;
    protected String cargo;
    protected double salario;
    protected String matricula;

    public Funcionario(String nome, String cargo, double salario, String matricula) {
        this.nome = nome;
        this.cargo = cargo;
        this.salario = salario;
        this.matricula = matricula;
    }

    public String getNome() { return nome; }
    public String getCargo() { return cargo; }
    public double getSalario() { return salario; }
    public String getMatricula() { return matricula; }

    @Override
    public String toString() {
        return "Funcionario [Nome=" + nome + ", Cargo=" + cargo +
        ", Salario=" + salario + ", Matricula=" + matricula + "]";
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (!(obj instanceof Funcionario)) return false;
        Funcionario f = (Funcionario) obj;
        return this.matricula.equals(f.matricula);
    }

    @Override
    public int hashCode() {
        return matricula.hashCode();
    }
}
