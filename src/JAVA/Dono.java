package JAVA;

public class Dono {
    String nome;
    int idade;

    public Dono(String nome) {
        this.nome = nome;
    }

    public static void main(String[] args) {
        Cachorro bela = new Cachorro();
        bela.sentar();
        bela.raça = "pitbull";
        bela.nome = "bela";

        System.out.println(bela.raça);

        Dono Lucas = new Dono("Lucas");
        Lucas.idade = 24;

        System.out.println(Lucas.nome + " é dono da cachorrinha " + bela.nome);
        System.out.println(bela.nome);
       
    }
}
