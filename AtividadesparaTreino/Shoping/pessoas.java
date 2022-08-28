package AtividadesparaTreino.Shoping;

public class pessoas {
    
    public static void main(String[] args) {

        saidaeentrada aspessoas = new saidaeentrada();

        aspessoas.saida = 0;
        aspessoas.entrada = 600;

        aspessoas.sairao(300);

        aspessoas.entrarao(1000);

        System.out.println("A Quantidade de pessoas que permaneceram no Shoping foi de:" + aspessoas.valorfinal);

    }
}
