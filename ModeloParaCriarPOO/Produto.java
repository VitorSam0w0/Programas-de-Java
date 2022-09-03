package ModeloParaCriarPOO;

public class Produto {

    //Atributos

    String nome;
    String marca;
    float valor;

     
    //Construtor Padrão

    Produto() {

    }

    //Construtores

    Produto (String nome) {
        this.nome = nome;
    }

    Produto (String marca, String nome) {
        this.marca = marca;
        this.nome = nome;
    }

    Produto (String marca, String nome, float valor) {
        this.marca = marca;
        this.nome = nome;
        this.valor = valor;
    }




}