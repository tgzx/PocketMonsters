import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Gerador pokemon = new Gerador();
        boolean rep = true;
        int cont = 1;
        int teste = 1;
        Pokemon[] pkmn = new Pokemon[999999];
        Pokemon[] pkmnAnt = new Pokemon[999999];
        int[] uniqueID = new int[999999];

        //******************************************** CRIA POKEMONS ************************************************//

        while (rep) {
            Random random = new Random();
            int lvlLend = random.nextInt(20) + 40;
            System.out.println("1 - Procurar pokemons!");
            System.out.println("2 - Procurar treinador.");
            System.out.println("3 - Sair\n");
            int res = scanner.nextInt();
            System.out.println("\n*****************************************************");
            if (res == 1) {
                pkmn[cont] = new Pokemon();
                pkmn[cont] = pokemon.createPokemons(random.nextInt(150)+1);

                //************************************** POKEMONS LENDARIOS ****************************************//

                if (pkmn[cont].getNome().equals("Mew")) {                   // Este container de IF/ELSE's verifica //
                    pkmn[cont].setNivel(lvlLend);                           // se o pokemon criado está repetido.   //
                    Comparador.lendario(pkmn, pkmnAnt, cont);               // Se estiver repetido, é criado um     //
                } else if (pkmn[cont].getNome().equals("Mewtwo")) {         // novo pokemon para substituir o slot. //
                    pkmn[cont].setNivel(lvlLend);
                    Comparador.lendario(pkmn, pkmnAnt, cont);
                } else if (pkmn[cont].getNome().equals("Zapdos")) {
                    pkmn[cont].setNivel(lvlLend);
                    Comparador.lendario(pkmn, pkmnAnt, cont);
                } else if (pkmn[cont].getNome().equals("Articuno")) {
                    pkmn[cont].setNivel(lvlLend);
                    Comparador.lendario(pkmn, pkmnAnt, cont);
                } else if (pkmn[cont].getNome().equals("Moltres")) {
                    pkmn[cont].setNivel(lvlLend);
                    Comparador.lendario(pkmn, pkmnAnt, cont);
                }
                pkmn[cont].status();
                cont++;

                //**************************************************************************************************//

            } else if (res == 2) {                                              // Procurar um treinador.           //
                Trainer trainer = new Trainer("Brock", 1);
                trainer.status();
            } else if (res == 3) {                                              // Fecha o programa.                //
                System.out.println("Shutdown.");
                rep = false;
            } else {                                                            // Impede o usuário de inserir      //
                System.out.println(res + " não é um comando válido!\n");        // um caractere sem função.         //
            }
        }
    }
}