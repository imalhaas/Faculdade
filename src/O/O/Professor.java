package O.O;

public class Professor extends Pessoa{

    String materia;

    double salario;

    double getInss(){
        return salario * 0.11;
    }

    double salarioLiquido(){
        return salario = getInss();
    }


    public String getMateria() {
        return materia;
    }

    public void setMateria(String materia) {
        this.materia = materia;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
}
