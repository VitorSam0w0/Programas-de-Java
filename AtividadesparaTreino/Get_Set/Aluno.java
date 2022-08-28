package AtividadesparaTreino.Get_Set;

public class Aluno {

    private String nome;
    private int idade;

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNome(String nome) {
        return nome;
    }

    public void setIdade(int idade) {
        if (idade>0 && idade<120) {
            this.idade = idade;
            System.out.println("Idade Registrada!");
        } 
        else {
            System.out.println("Erro!");
        }
    }
    public int getIdade(int idade) {
        return idade;
    }
        
    
    
}
