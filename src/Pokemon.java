import java.util.Random;

public class Pokemon {
    private int id;
    private String nome;
    private String tipo;
    private String tipo2;
    private String[] nomeAtaque = new String[4];
    private String nomeAtq;
    private int velocidade;
    private int nivel;
    public static String[] tmov = new String[17];

    public Pokemon(int id, String nome, String tipo, String tipo2) {
        Random random = new Random();
        String[] ataque = new String[4];
        this.setId(id);
        this.setNome(nome);
        this.setTipo(tipo);
        this.setTipo2(tipo2);
        this.setNivel(random.nextInt(49)+1);
        for(int i = 0; i < 4; ++i) {
            this.nomeAtq = movimentos(random.nextInt(15)+1);
            ataque[i] = this.nomeAtq;
        }
        this.setAtaque(ataque);
    }

    public Pokemon() {
    }

    protected void status() {
        if (this.nome != null) {
            System.out.println("Pokemon " + this.nome + " Lvl " + this.nivel + "\n");
            System.out.println("Tipo 1: " + this.tipo + " || Tipo 2: " + this.tipo2);
            String res = this.nomeAtaque[3] != null ? "Ataques: " + this.nomeAtaque[0] + ", " + this.nomeAtaque[1] + ", " + this.nomeAtaque[2] + ", " + this.nomeAtaque[3] : (this.nomeAtaque[2] != null ? "Ataques: " + this.nomeAtaque[0] + ", " + this.nomeAtaque[1] + ", " + this.nomeAtaque[2] : (this.nomeAtaque[1] != null ? "Ataques: " + this.nomeAtaque[0] + ", " + this.nomeAtaque[1] : "Ataques: " + this.nomeAtaque[0]));
            System.out.println(res + "\n*****************************************************\n");
        }

    }

    void atacar() {
    }

    void esquivar() {
    }

    void evoluir(String nome, String ataque3, String ataque4) {
        System.out.println("O pokemon evoluiu!");
        String[] slotAtaque = this.nomeAtaque;
        if (ataque3 != "") {
            slotAtaque[2] = ataque3;
            slotAtaque[3] = ataque4;
        } else {
            slotAtaque[3] = ataque4;
        }

        this.setNome(nome);
        this.setAtaque(slotAtaque);
    }

    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTipo() {
        return this.tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getTipo2() {
        return this.tipo2;
    }

    public void setTipo2(String tipo2) {
        this.tipo2 = tipo2;
    }

    public String[] getNomeAtaque() {
        return this.nomeAtaque;
    }

    public void setAtaque(String[] nomeAtq) {
        this.nomeAtaque = nomeAtq;
    }

    public int getVelocidade() {
        return this.velocidade;
    }

    public void setVelocidade(int velocidade) {
        this.velocidade = velocidade;
    }

    public int getNivel() {
        return this.nivel;
    }

    public void setNivel(int nivel) {
        this.nivel = nivel;
    }

    public static String movimentos(int index) {
        tmov[1] = "Tackle";
        tmov[2] = "Ember";
        tmov[3] = "Thundershock";
        tmov[4] = "Gust";
        tmov[5] = "Pound";
        tmov[6] = "Bite";
        tmov[7] = "Thunder";
        tmov[8] = "Bind";
        tmov[9] = "Protect";
        tmov[10] = "Tailwhip";
        tmov[11] = "Lowkick";
        tmov[12] = "Ice Punch";
        tmov[13] = "Fire Punch";
        tmov[14] = "Dynamic Punch";
        tmov[15] = "Fury";
        tmov[16] = "Swipe";
        return tmov[index];
    }
}
