package ModeloParaCriarPOO;

public class Loja {

    public static void main(String[] args) {

        //Construtor Padrão

        Produto p1 = new Produto();
        p1.nome = "Caneta";
        p1.marca ="Bic";
        p1.valor = 1.50f;


        //Construto de Dois Parametros

        Produto p2 = new Produto("Faber", "Caneta");
        p2.valor = 1.89f;

        //Construtor de Três Parametros

        Produto p3 = new Produto("Faber", "Caneta", 1.89f);

        //Construtor p1

        System.out.println("Nome: " + p1.nome + " Marca: " + p1.marca + " Valor: " + p1.valor);

        System.out.println("Nome: " + p2.nome + " Marca: " + p2.marca + " Valor: " + p2.valor);

        System.out.println("Nome: " + p3.nome + " Marca: " + p3.marca + " Valor: " + p3.valor);


    }
    
}
