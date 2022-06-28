import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Gerador pokemon = new Gerador();
        int infinito = 2;
        boolean rep = true;
        Random random = new Random();
        int cont = 1;
        int teste = 1;
        Pokemon[] pkmn = new Pokemon[999999];
        Pokemon[] pkmnAnt = new Pokemon[999999];
        int[] uniqueID = new int[999999];

        //******************************************** CRIA POKEMONS ************************************************//

        while (rep) {
            System.out.println("1 - Procurar pokemons!");
            System.out.println("2 - Sair\n");
            int res = scanner.nextInt();
            System.out.println("\n*****************************************************");
            if (res == 1) {
                pkmn[cont] = new Pokemon();
                pkmn[cont] = pokemon.createPokemons(151);

                //************************************** POKEMONS LENDARIOS ****************************************//

                if (pkmn[cont].getNome().equals("Mew")) {                   // Este container de IF/ELSE verifica   //
                    Comparador.lendario(pkmn, pkmnAnt, cont);               // se o pokemon criado está repetido.   //
                } else if (pkmn[cont].getNome().equals("Mewtwo")) {         // Se estiver repetido, é criado um     //
                    Comparador.lendario(pkmn, pkmnAnt, cont);               // novo pokemon para substituir o slot. //
                } else if (pkmn[cont].getNome().equals("Zapdos")) {
                    Comparador.lendario(pkmn, pkmnAnt, cont);
                } else if (pkmn[cont].getNome().equals("Articuno")) {
                    Comparador.lendario(pkmn, pkmnAnt, cont);
                } else if (pkmn[cont].getNome().equals("Moltres")) {
                    Comparador.lendario(pkmn, pkmnAnt, cont);
                }
                pkmn[cont].status();
                cont++;
            } else if (res == 2) {
                System.out.println("Shutdown.");
                rep = false;
            } else {
                System.out.println(res + " não é um comando válido!\n");
            }
            infinito++;
        }
    }
}