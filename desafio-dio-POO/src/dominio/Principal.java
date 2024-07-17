public class Principal {
    public static void main(String[] args) {
        Curso curso1 = new Curso();
        curso1.setTitulo("curso java");
        curso1.setDescricao("descriçãp curso java");
        curso1.setCargaHoraria(10);
        
        Curso curso2 = new Curso();
        curso2.setTitulo("curso java");
        curso2.setDescricao("descrição curso javascript");
        curso2.setCargaHoraria(10);

        System.out.println(curso1);
        System.out.println(curso2);
    }
}