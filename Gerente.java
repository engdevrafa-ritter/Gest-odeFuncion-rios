public class Gerente extends Funcionario {
    private String departamento;
    private double bonusPercentual;

    public Gerente(String nome, String cargo, double salario, String matricula,
            String departamento, double bonusPercentual) {
        super(nome, cargo, salario, matricula);
        this.departamento = departamento;
        this.bonusPercentual = bonusPercentual;
    }

    @Override
    public String toString() {
        return super.toString() + " | Departamento=" + departamento +
        ", Bonus=" + bonusPercentual + "%";
    }

    public double calcularSalarioTotal() {
        return salario + (salario * bonusPercentual / 100);
    }
}
