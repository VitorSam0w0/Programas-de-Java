import java.util.Random;

public class RandomStringTest {
    public static void main(String[] args) {
        // Cria um gerador de números aleatórios
        Random random = new Random();

        // Cria uma string com todos os caracteres alfanuméricos possíveis
        String alphanumeric = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ";

        // Usa o gerador de números aleatórios para criar 15 caracteres aleatórios da string alfanumérica
        String randomString = "";
        for (int i = 0; i < 15; i++) {
            int index = random.nextInt(alphanumeric.length());
            randomString += alphanumeric.charAt(index);
        }

        // Imprime a string aleatória
        System.out.println(randomString);
    }
}
