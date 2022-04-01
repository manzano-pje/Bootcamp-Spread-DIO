import br.com.pjem.dominio.*;

import java.net.ContentHandler;
import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Curso curso1 = new Curso();
        curso1.setTitulo("Curso Java");
        curso1.setDescricao("Descrição curso Java");
        curso1.setCargaHoraria(8);

        Curso curso2 = new Curso();
        curso2.setTitulo("Curso Js");
        curso2.setDescricao("Descrição curso Js");
        curso2.setCargaHoraria(4);

        Mentoria mentoria1 = new Mentoria();
        mentoria1.setTitulo("Mentoria de Java");
        mentoria1.setDescricao("Descrição mentoria Java");
        mentoria1.setData(LocalDate.now());

        Conteudo conteudo = new Curso();

 //  System.out.println(curso1);
  //      System.out.println(curso2);
  //      System.out.println(mentoria1);

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Curso Java Developer");
        bootcamp.setDescricao("DescriçãoCurso Java Developer");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria1);

        Dev devPaulo = new Dev();
        devPaulo.setNome("Paulo Manzano");
        devPaulo.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos inscritos : "+ devPaulo.getConteudoInscritos());

        devPaulo.progredir();

        System.out.println("-- Conteúdos concluidos : "+ devPaulo.getConteudoConcluidos());
        System.out.println("---- Conteúdos inscritos : "+ devPaulo.getConteudoInscritos());
        System.out.println(">>>>>>>> XP total <<<<<<<< " + devPaulo.calcularTodoXp());

        System.out.println("\n");

        Dev devJoao = new Dev();
        devJoao.setNome("João");
        devJoao.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos inscritos : "+ devJoao.getConteudoInscritos());

        devJoao.progredir();
        devJoao.progredir();

        System.out.println("-- Conteúdos concluídos : "+ devJoao.getConteudoConcluidos());
        System.out.println("---- Conteúdos inscritos : "+ devJoao.getConteudoInscritos());
        System.out.println(">>>>>>>> XP total <<<<<<<< " + devJoao.calcularTodoXp());

        System.out.println("\n");

        Dev devMaria = new Dev();
        devMaria.setNome("Maria");
        devMaria.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos inscritos : "+ devMaria.getConteudoInscritos());

        devMaria.progredir();
        devMaria.progredir();
        devMaria.progredir();

        System.out.println("-- Conteúdos concluídos : "+ devMaria.getConteudoConcluidos());
        System.out.println("---- Conteúdos inscritos : "+ devMaria.getConteudoInscritos());
        System.out.println(">>>>>>>> XP total <<<<<<<< " + devMaria.calcularTodoXp());

    }
}
