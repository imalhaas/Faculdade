package StringBuffer;

public class Buffer { //StringBuffer é como se fosse um vetor dinamico na memoria. strings que são modificáveis.
    // Seu uso é altamente recomendado em programas onde as strings são frequentemente concatenadas ou sofrem algum outro tipo de manipulação.

    public static void main(String[] args) {

        String nome = "Lucas";
        String sobreNome = "de Cassia";
        String nomeCompleto = nome + sobreNome;
        String nomeComBuffer;

        StringBuffer buffer = new StringBuffer();
        buffer.append(nome);
        buffer.append(sobreNome);

        nomeComBuffer = buffer.toString();

        System.out.println(nomeCompleto);
        System.out.println(nomeComBuffer);


    }
}
