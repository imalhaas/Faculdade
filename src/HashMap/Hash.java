package HashMap;

import java.util.HashMap;

public class Hash {  // tem a implementação baseada na tabela hash. Fornece um mapa não classificado e não ordenado.

    public static void main(String[] args) {

        HashMap<Integer, String> linguagensDeProgramacao = new HashMap<>();
        linguagensDeProgramacao.put(1, "Java");
        linguagensDeProgramacao.put(2, "C ++");
        linguagensDeProgramacao.put(3, "Cobol");
        System.out.println("Conteudo do Hash: " + linguagensDeProgramacao);


        System.out.println(linguagensDeProgramacao.keySet());
        System.out.println(linguagensDeProgramacao.values());
        System.out.println(linguagensDeProgramacao.entrySet());
        System.out.println(linguagensDeProgramacao.size());

    }

}
