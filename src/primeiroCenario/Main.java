package primeiroCenario;

import primeiroCenario.model.Adress;
import primeiroCenario.model.Student;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        Adress firtAdress = new Adress(1, "Rua um", "São Luís", "MA",
                65000000, "Brasil");
        Adress secondAdress = new Adress(2, "Rua dois", "São Luís", "MA",
                65035000, "Brasil");

        Student firstStudent = new Student(1,"Vitor", 23,
                "vitor.maverick@acad.ifma.edu.br");
        firstStudent.addAdress(firtAdress);
        firstStudent.addAdress(secondAdress);

        List<Adress> listaDeEnderecos = firstStudent.getAdress();
        listaDeEnderecos.stream().forEach(adress -> System.out.println(adress.toString()));


    }
}
