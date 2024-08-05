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

       /* System.out.println(curso1);
        System.out.println(curso2);
        System.out.println(mentoria);*/

        // criando o bootcamp:
        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Descrição Bootcamp Java Developer");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        // criando os dev:
        Dev devCamila = new Dev();
        devCamila.setNome("Camila");//dei um nome pra dev, que é Camila
        devCamila.inscreverBootcamp(bootcamp);// inscrivi a dev em um bootcamp
        System.out.println("Conteudos Inscritos Camila:" + devCamila.getConteudosInscritos());
        devCamila.progredir();//conclui os conteudos do bootcamp
        devCamila.progredir();//conclui mais outro conteudo do bootcamp
        //são 3 conteudos: java, javascript e mais outro
        System.out.println("--");
        System.out.println("Conteudos Inscritos Camila:" + devCamila.getConteudosInscritos());
        System.out.println("Conteudos Concluidos Camila:" + devCamila.getConteudosConcluidos());
        System.out.println("XP:" + devCamila.calcularTotalXp());
        System.out.println("..........");

        Dev devJoao = new Dev();
        devJoao.setNome("Joao");
        devJoao.inscreverBootcamp(bootcamp);
        System.out.println("Conteudos Inscritos João:" + devJoao.getConteudosInscritos());
        devJoao.progredir();
        System.out.println("--");
        System.out.println("Conteudos Inscritos João:" + devJoao.getConteudosInscritos());
        System.out.println("Conteudos Concluidos João:" + devJoao.getConteudosConcluidos());
        System.out.println("XP:" + devJoao.calcularTotalXp());
        System.out.println("..........");
    }
}