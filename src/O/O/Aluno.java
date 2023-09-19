package O.O;

public class Aluno extends Pessoa{

    public String nome;
    public double teste, prova;

    double obterMedia(){
        return (teste + prova)/2;
    }
}
