//Tentar Arrumar o Erro quando tiver Tempo

package AtividadesparaTreino.Poo.Imc;
import java.util.Scanner;

public class imc {
    public double peso;
    public double altura;
    public double imc;

    public class scanner {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Peso: ");
        peso = scanner.nextDouble();
    
        System.out.println("Altura: ");
        altura = scanner.nextDouble();
        
        
    }

    public imc(double peso, double altura) {
        this.peso = peso;
        this.altura = altura;
    }

    public void calcularimc() {
        this.imc = (this.peso/( this.altura * this.altura ));

    }
}
