package TreeMap;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class TreeTeste { //TreeMap é um Map mas as ordens fica em ordens crescentes

    public static void main(String[] args) {
        Map<Integer, String> Imap =  new TreeMap<>();
        Imap.put(12, "Lucas");
        Imap.put(2, "Beta");
        Imap.put(5, "matheus");
        Imap.put(8, "Mineiro");
        System.out.println(Imap);

    }
}
