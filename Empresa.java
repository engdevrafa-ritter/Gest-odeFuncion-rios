import java.util.*;

public class Empresa {
    private SortedSet<Funcionario> equipe;

    public Empresa() {
        this.equipe = new TreeSet<>(Comparator.comparingDouble(Funcionario::getSalario));
    }

    public void contratarFuncionario(Funcionario f) {
        equipe.add(f);
    }

    public void listarEquipe() {
        for (Funcionario f : equipe) {
            System.out.println(f.toString());
            if (f instanceof Gerente) {
                Gerente g = (Gerente) f;
                System.out.println("   Salário total com bônus: " + g.calcularSalarioTotal());
            }
        }
    }
}
