package StringFuncionalidades;

public class TesteString {

    public static void main(TesteString[] args) {

        String nome = "Lucas";

        System.out.println(nome);


        System.out.println(nome.length());  //Mostrara a quantidade de letras.
        System.out.println(nome.toLowerCase()); // Mostrara o nome com as letras minusculas.
        System.out.println(nome.toUpperCase());  //Mostrara o nome com as letras MAIUSCULAS.
        System.out.println(nome.charAt(2));  //Mostrara a letra que está na posição 2.
        System.out.println(nome.isEmpty());  //Mostrara se está vazio ou nao.
        System.out.println(nome.indexOf("ca")); //Mostrara o indice do CA.
        System.out.println(nome.contains("ca"));  //Mostrara se contém as letras CA.
        System.out.println(nome.concat("de Cassia")); //Ira concatenar(Juntar) com "lucas".
        System.out.println(nome.equals("Lucas"));  //Mostrara se nome é igual a Lucas.
        System.out.println(nome.equalsIgnoreCase("lucas")); //Mostrara o retorno tudo em minusculo.



    }
}
