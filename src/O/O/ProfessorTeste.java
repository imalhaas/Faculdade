package O.O;

public class ProfessorTeste {
    public static void main(String[] args) {
         Professor professor = new Professor();


         professor.setMateria("Tecnologia");
         professor.setSalario(5000);
         professor.setNome("Lucas");

        System.out.println(professor.materia);
        System.out.println(professor.getNome());
        System.out.println(professor.salarioLiquido());
    }
}
