package AtividadesparaTreino.Carro;

public class AceleraçãodoCarro {

    public static void main(String[] args) {

        Config c1 = new Config();

        c1.nome = "Uno";
        c1.marca = "Fiat";
        c1.modelo = (float) 12.5;
        c1.vel = 100;

        c1.acelerar(20);

        c1.parar(100);

        System.out.println("Velocidade do Carro: "+c1.vel);
        

    }

}