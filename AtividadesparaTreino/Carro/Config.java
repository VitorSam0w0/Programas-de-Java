package AtividadesparaTreino.Carro;

public class Config {

    String nome;
    String marca;
    int vel;
    int ano;
    float modelo;

    void acelerar (int aceleracao) {
        vel+=aceleracao;
    }

    void parar (int reduzir) {
        vel-=reduzir;
    }

    void buzinar (String buzina) {
        System.out.println("Bibibi");
        
    }

}