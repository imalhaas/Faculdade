package LInkedHashMap;

import java.util.LinkedHashMap;
import java.util.Map;

public class LinkedMap {

    public static void main(String[] args) {
        Map<Integer, String> Imap =  new LinkedHashMap<Integer, String>();
        Imap.put(12, "Lucas");
        Imap.put(2, "Beta");
        Imap.put(5, "matheus");
        Imap.put(8, "Mineiro");
        System.out.println("Antes da modificação " + Imap);
        System.out.println("Funcionario da posição 2: " + Imap.containsKey(2));
        System.out.println("Funcionario Mineiro existe? " + Imap.containsValue("Mineiro"));
        System.out.println("Numero total de funcionarios: " + Imap.size());
        System.out.println("Removendo funcionario com ID 8: " + Imap.remove(8));
        System.out.println("Removendo funcionario do ID 3 (o qual nao existe): " + Imap.remove(3));
        System.out.println("Depois das modificações " + Imap);
    }
}
