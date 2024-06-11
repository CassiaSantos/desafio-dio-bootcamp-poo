import br.com.dio.desafio.dominio.Conteudo;
import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Mentoria;

import java.time.LocalDate;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
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
        cursoJavaScript.setCargaHoraria(5);

        Mentoria mentoriaJava = new Mentoria();
        mentoriaJava.setTitulo("Mentoria Java");
        mentoriaJava.setDescricao("Nesta mentoria de Java você vai conhecer...");
        mentoriaJava.setData(LocalDate.now());

        Mentoria mentoriaJavaScript = new Mentoria();
        mentoriaJavaScript.setTitulo("Mentoria JavaScript");
        mentoriaJavaScript.setDescricao("Nesta mentoria de JavaScript você vai conhecer...");
        mentoriaJavaScript.setData(LocalDate.now());

        //impressões no console:
        System.out.println(cursoJava);
        System.out.println(cursoJavaScript);
        System.out.println(mentoriaJava);
        System.out.println(mentoriaJavaScript);
    }
}