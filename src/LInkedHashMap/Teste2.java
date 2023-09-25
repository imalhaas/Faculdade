package LInkedHashMap;

import java.util.LinkedHashMap;

public class Teste2 {

    public static void main(String[] args) {
        LinkedHashMap<String, String> listaNomes = new LinkedHashMap<>();
        listaNomes.put("Lm", "Lucas");
        listaNomes.put("AL", "Alcaraz");
        listaNomes.put("DJ", "Djokovic");
        listaNomes.put("HAM", "Lewis");
        listaNomes.put("NEY", "Neymar");

        System.out.println(listaNomes);

        LinkedHashMap<String, String> novaLista = new LinkedHashMap<>(listaNomes);
        novaLista.put("BT", "Beta");
        System.out.println("NOva LinkedHashMap: " + novaLista);

    }
}
