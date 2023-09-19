package StringBuilder;

public class Builder { //Éla não é uma safe thread

    public static void main(String[] args) {

        String nome = "Lucas";
        String sobreNome = "de Cassia";
        String nomeCompleto = nome + sobreNome;
        String nomeComBuilder;

        StringBuilder builder = new StringBuilder();
        builder.append(nome);
        builder.append(sobreNome);

        nomeComBuilder = builder.toString();

        System.out.println(nomeCompleto);
        System.out.println(nomeComBuilder);


    }
}
