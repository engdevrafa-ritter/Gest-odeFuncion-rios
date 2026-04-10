public class main {
    public static void main(String[] args) {
        Empresa empresa = new Empresa();

        Funcionario f1 = new Funcionario("Ana", "Analista", 3000, "F001");
        Funcionario f2 = new Funcionario("Bruno", "Desenvolvedor", 4000, "F002");
        Funcionario f3 = new Funcionario("Carla", "Tester", 3500, "F003");

        Gerente g1 = new Gerente("Daniel", "Gerente de TI", 6000, "G001", "TI", 20);
        Gerente g2 = new Gerente("Eduarda", "Gerente de RH", 5500, "G002", "RH", 15);

        empresa.contratarFuncionario(f1);
        empresa.contratarFuncionario(f2);
        empresa.contratarFuncionario(f3);
        empresa.contratarFuncionario(g1);
        empresa.contratarFuncionario(g2);

        empresa.listarEquipe();
    }
}
