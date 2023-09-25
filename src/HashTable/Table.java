package HashTable;

import java.util.HashMap;
import java.util.Hashtable;

public class Table {

    public static void main(String[] args) {

        Hashtable<Integer, String> linguagensDeProgramacao = new Hashtable<>();
        linguagensDeProgramacao.put(1, "Java");
        linguagensDeProgramacao.put(2, "C ++");
        linguagensDeProgramacao.put(3, "Cobol");
        System.out.println("Conteudo do HashTable: " + linguagensDeProgramacao);

        String valor = linguagensDeProgramacao.get(1);
        System.out.println("Elemento 1: " + valor);
    }
}
