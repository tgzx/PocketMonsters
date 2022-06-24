import java.util.Random;
import java.util.Scanner;

public class Main {
    public Main() {
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Gerador pokemon = new Gerador();
        boolean rep = true;
        Random random = new Random();

        while(rep) {
            System.out.println("1 - Procurar pokemons!");
            System.out.println("2 - Sair\n");
            int res = scanner.nextInt();
            System.out.println("\n*****************************************************");
            if (res == 1) {
                pokemon.createPokemons(random.nextInt(150)+1).status();
            } else if (res == 2) {
                System.out.println("Shutdown.");
                rep = false;
            } else {
                System.out.println(res + " não é um comando válido!\n");
            }
        }

    }
}