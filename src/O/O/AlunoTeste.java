package O.O;

public class AlunoTeste {

    public static void main(String[] args) {

        Aluno objeto = new Aluno();

        objeto.nome = "Lucas";
        objeto.prova = 10;
        objeto.teste = 9;

        System.out.println(objeto.obterMedia());
    }
}
