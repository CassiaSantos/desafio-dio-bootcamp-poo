import br.com.dio.desafio.dominio.*;
import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

        //Criação de objetos:
        Curso cursoJava = new Curso();
        cursoJava.setTitulo("Curso Java");
        cursoJava.setDescricao("Neste curso de Java você vai aprender...");
        cursoJava.setCargaHoraria(10);

        Curso cursoJavaScript = new Curso();
        cursoJavaScript.setTitulo("Curso JavaScript");
        cursoJavaScript.setDescricao("Neste curso de JavaScript você vai aprender...");
        cursoJavaScript.setCargaHoraria(10);

        Mentoria mentoriaJava = new Mentoria();
        mentoriaJava.setTitulo("Mentoria Java");
        mentoriaJava.setDescricao("Nesta mentoria de Java você vai conhecer...");
        mentoriaJava.setData(LocalDate.now());

        Mentoria mentoriaJavaScript = new Mentoria();
        mentoriaJavaScript.setTitulo("Mentoria JavaScript");
        mentoriaJavaScript.setDescricao("Nesta mentoria de JavaScript você vai conhecer...");
        mentoriaJavaScript.setData(LocalDate.now());

        Bootcamp bootcampJava = new Bootcamp();
        bootcampJava.setNome("Bootcamp de Java Back-end");
        bootcampJava.setDescricao("Neste Bootcamp você vai aprender...");
        bootcampJava.getConteudos().add(cursoJava);
        bootcampJava.getConteudos().add(mentoriaJava);

        Bootcamp bootcampJavaScript = new Bootcamp();
        bootcampJavaScript.setNome("Bootcamp de Javascript para Front-end");
        bootcampJavaScript.setDescricao("Neste Bootcamp você vai aprender...");
        bootcampJavaScript.getConteudos().add(cursoJavaScript);
        bootcampJavaScript.getConteudos().add(mentoriaJavaScript);

        Dev devCassia = new Dev();
        devCassia.setNome("Cássia Santos");
        System.out.println("---------------------------------------");
        devCassia.inscreverBootcamp(bootcampJava);
        System.out.println("Cássia Santos se inscreveu no Bootcamp Java Back-end");
        System.out.println("Conteúdos em que Cássia Santos está inscrita: " + devCassia.getConteudosIncrito());
        devCassia.progredirBootcamp();
        System.out.println("Cássia progrediu!");
        System.out.println("Conteúdos em que Cássia Santos está inscrita: " + devCassia.getConteudosIncrito());
        System.out.println("Conteúdos que Cássia Santos concluiu: " + devCassia.getConteudoFinalizado());
        devCassia.progredirBootcamp();
        System.out.println("Cássia progrediu novamente!");
        System.out.println("Conteúdos em que Cássia Santos está inscrita: " + devCassia.getConteudosIncrito());
        System.out.println("Conteúdos que Cássia Santos concluiu: " + devCassia.getConteudoFinalizado());
        System.out.println("XP total: " + devCassia.calcularTotalXP());

        Dev devHelena = new Dev();
        devHelena.setNome("Helena Oliveira");
        System.out.println("---------------------------------------");
        devHelena.inscreverBootcamp(bootcampJavaScript);
        System.out.println("Helena Oliveira se inscreveu no Bootcamp JavaScript para Front-end");
        System.out.println("Conteúdos em que Helena Oliveira está inscrita: " + devHelena.getConteudosIncrito());
        devHelena.progredirBootcamp();
        System.out.println("Helena progrediu!");
        System.out.println("Conteúdos em que Helena Oliveira está inscrita: " + devHelena.getConteudosIncrito());
        System.out.println("Conteúdos que Helena Oliveira concluiu: " + devHelena.getConteudoFinalizado());
        System.out.println("XP total: " + devHelena.calcularTotalXP());
    }
}
