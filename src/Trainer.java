import java.util.Random;

public class Trainer extends Pokemon{
    String nome;
    int dificuldade;                                                // multiplicador de dificuldade //
    Pokemon[] time = new Gerador[999999];
    Random random = new Random();

    // ***************************************** CRIA UM TREINADOR *************************************************//
    public Trainer(String nome, int dificuldade) {
        Pokemon[] time = new Pokemon[4];
        this.nome = nome;
        this.dificuldade = dificuldade;
        this.time = time();

        // ***************************** DEFINE A DIFICULDADE DO TREINADOR *****************************************//
        if (dificuldade == 1){
            for (int i = 0; i < this.time.length; i++) {
                if (this.time[i].getNivel() < 10 + dificuldade || this.time[i].getNivel() != 4) {
                    this.time[i].setNivel(((this.time[i].getNivel() * 2) - 3) * dificuldade);
                } else if (this.time[i].getNivel() < 10 + dificuldade) {
                    this.time[i].setNivel(((this.time[i].getNivel() - random.nextInt(5)+1)* 2) * dificuldade);
                } else {
                    this.time[i].setNivel((this.time[i].getNivel() + 8) * dificuldade);
                }
            }
        } else if (dificuldade == 2){
            for (int i = 0; i < this.time.length; i++) {
                if (this.time[i].getNivel() < 10 + dificuldade || this.time[i].getNivel() != 4) {
                    this.time[i].setNivel(((this.time[i].getNivel() + 8) - 3) * dificuldade);
                } else if (this.time[i].getNivel() > 10 + dificuldade || this.time[i].getNivel() != 4) {
                    this.time[i].setNivel((this.time[i].getNivel() - 4) * dificuldade);
                }
            }
        } else if (dificuldade == 3){
            for (int i = 0; i < this.time.length; i++) {
                if (this.time[i].getNivel() < 20 + dificuldade || this.time[i].getNivel() != 4) {
                    this.time[i].setNivel(((this.time[i].getNivel() + 8) - 3) * dificuldade);
                } else if (this.time[i].getNivel() > 20 + dificuldade || this.time[i].getNivel() != 4) {
                    this.time[i].setNivel((this.time[i].getNivel() - 4) * dificuldade);
                }
            }
        } else if (dificuldade >= 4){
            for (int i = 0; i < this.time.length; i++) {
                if (this.time[i].getNivel() < 20 + dificuldade || this.time[i].getNivel() != 4) {
                    this.time[i].setNivel((this.time[i].getNivel() + (random.nextInt(8)+1)) * dificuldade);
                } else if (this.time[i].getNivel() > 20 + dificuldade || this.time[i].getNivel() != 4) {
                    this.time[i].setNivel((this.time[i].getNivel() - (random.nextInt(8)+1)) * dificuldade);
                }
            }
        }
    }

    // **************************************** CRIA UM TIME DE POKEMONS *******************************************//
    public Pokemon[] time(){
        Pokemon[] pokebolas = new Pokemon[4];
        Gerador pkmn = new Gerador();
        for (int i = 0; i < 4; i++) {
            pokebolas[i] = pkmn.createPokemons(random.nextInt(150)+1);

            //********************************** IMPEDE SURGIMENTO DE LENDARIOS ************************************//
            while (pokebolas[i].getNome().equals("Mew") || pokebolas[i].getNome().equals("Mewtwo")
                    || pokebolas[i].getNome().equals("Zapdos") || pokebolas[i].getNome().equals("Articuno")
                    || pokebolas[i].getNome().equals("Moltres")){
                if (pokebolas[i].getNome().equals("Mew")) {
                    pokebolas[i] = pkmn.createPokemons(random.nextInt(150)+1);
                } else if (pokebolas[i].getNome().equals("Mewtwo")) {
                    pokebolas[i] = pkmn.createPokemons(random.nextInt(150)+1);
                } else if (pokebolas[i].getNome().equals("Zapdos")) {
                    pokebolas[i] = pkmn.createPokemons(random.nextInt(150)+1);
                } else if (pokebolas[i].getNome().equals("Articuno")) {
                    pokebolas[i] = pkmn.createPokemons(random.nextInt(150)+1);
                } else if (pokebolas[i].getNome().equals("Moltres")) {
                    pokebolas[i] = pkmn.createPokemons(random.nextInt(150)+1);
                }
            }
            pokebolas[i].status();
        }
        return pokebolas;
    }

    // **************************************** MOSTRA O TREINADOR *************************************************//
    protected void status() {
        if (this.nome != null) {
            System.out.println("Treinador " + this.nome + " disse olá! Dificuldade: " + this.dificuldade + "\n");
            System.out.println("Seu time: \n");
            for (int i = 0; i < this.time.length; i++) {
                System.out.println(time[i].getNome() + " Lvl-" + time[i].getNivel());
            }
        }
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public float getDificuldade() {
        return dificuldade;
    }

    public void setDificuldade(int dificuldade) {
        this.dificuldade = dificuldade;
    }

    public Pokemon[] getTime() {
        return time;
    }

    public void setTime(Pokemon[] time) {
        this.time = time;
    }
}
