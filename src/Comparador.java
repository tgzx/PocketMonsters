
public class Comparador extends Gerador{

    public static void lendario (Pokemon[] poke, Pokemon[] pokeAnt, int cont) {
        if (poke[cont - 1] != null) {
            pokeAnt[cont] = new Pokemon();
            pokeAnt[cont] = poke[cont];
            poke[cont] = Gerador.lendarioComparador(poke[cont], pokeAnt[cont], cont);
        }
    }
}
