import java.time.LocalDate;

public class Principal {
    public static void main(String[] args) {
        Curso curso1 = new Curso();
        curso1.setTitulo("curso java");
        curso1.setdescricao("descriçãp curso java");
        curso1.setCargaHoraria(10);
        
        Curso curso2 = new Curso();
        curso2.setTitulo("curso java");
        curso2.setdescricao("descrição curso javascript");
        curso2.setCargaHoraria(10);


        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("mentoria de java");
        mentoria.setdescricao("descrição mentoria java");
        mentoria.setData(LocalDate.now()); 

        System.out.println(curso1);
        System.out.println(curso2);
        System.out.println(mentoria);

    }
}