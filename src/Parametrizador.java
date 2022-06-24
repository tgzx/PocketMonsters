import java.util.Locale;
import java.util.Random;
import java.util.Scanner;

public class Parametrizador {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        /*File arquivo = new File("C:\\rdpwrap.txt");                       // ler arquivo do PC
        BufferedReader buff = null;
        try {
            FileReader reader = new FileReader(arquivo);
            buff = new BufferedReader(reader);
            String linha = buff.readLine();
            while ( linha != null){
                System.out.println(linha);
                linha = buff.readLine();
            }
        } catch (Exception e){
            System.out.println("Erro durante a leitura");
        } finally {
            if (buff != null){
                try {
                    buff.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }*/

        /*Random random = new Random();                 //variavel random para conseguir numeros aleatorios
        int numero = 0, numero2 = 0;
        for (int i = 0; i < 10; i++) {
            numero = random.nextInt(3);
            numero2 = random.nextInt(3);
            System.out.println(numero + " " + numero2);
        }*/
        int loop = 50;
        String[] res = new String[loop];
        String tipo;
        int poder;
        String id = "", tipo1 = "", tipo2 = "";
        //int id =1;
        for (int i = 0; i < loop; i++) {
            id = scanner.next();
            String nome = scanner.next();
            //tipo = scanner.next();
            //poder = scanner.nextInt();
            //tipo1 = scanner.next();
            //tipo2 = scanner.next();
            //String resultado = "pkmn["+ id+ "] = pkmn" + id +" = new Pokemon("+id+", "+"\""+nome+"\""+", "+"\""+tipo1+"\""+", "+"\""+tipo2+"\""+");";
            //String resultado = "tm["+ id+ "] = tm" + id +" = new TM("+id+", "+"\""+nome+"\""+", "+"\""+tipo+"\""+", "+poder+");";
            String resultado = "tmov["+id+"] = \""+nome+"\";";
            res[i] = resultado;
        }
        for (int i = 0; i <loop; i++) {
            System.out.println(res[i]);
        }
    }
}
