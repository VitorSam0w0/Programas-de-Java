package AtividadesparaTreino.Get_Set;

public class AlunoTestar {
    public static void main(String[] args) {

        Aluno a1 = new Aluno();

        a1.setNome("Vitor");
        a1.setIdade(20);

        System.out.println("Idade: "+ a1.getIdade(30));
    }
}
