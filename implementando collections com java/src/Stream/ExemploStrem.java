package Stream;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class ExemploStrem {
    public static void main(String[] args) {
        List<String> estudantes = new ArrayList<>();
        estudantes.add("Pedro");
        estudantes.add("Thayse");
        estudantes.add("Marcelo");
        estudantes.add("Carla");
        estudantes.add("Thiago");
        estudantes.add("Rafael");
        //Retorna a contagem dos elementos stream
        System.out.println("Contagem = "+ estudantes.stream().count());

        // Retorna o elemento com o maior numero de letras
        System.out.println("Maior numero de letras = "+ estudantes.stream()
                          .max(Comparator.comparingInt(String::length)));

        //Retorna o elemento com o menor numero de letras
        System.out.println("Maior numero de letras = "+ estudantes.stream()
                .min(Comparator.comparingInt(String::length)));

        //Retorna os elementos que tem a letra R no meio
        System.out.println("Elementos com letra R - " + estudantes.stream().filter((estudante) ->
            estudante.toLowerCase().contains("r")).collect(Collectors.toList()));

        //Retorna uma nova coleção com os nomes concatenados a quantidade de letras de cada nome
        System.out.println("Nomes concatenados - " + estudantes.stream().map(estudante -> estudante
                .concat(" - ").concat(String.valueOf(estudante.length()))).collect(Collectors.toList()));

        //Retorna somente os 3 primeiros elementos da coleção
        System.out.println("Retorna somente os 3 primeiros elementos da coleção - " + estudantes.stream()
                .limit(3).collect(Collectors.toList()));

        // Exibe cada elemento no console e depois retorna a mesma coleção
        System.out.println("Retorna elementos- " + estudantes.stream().peek(System.out::println)
                .collect(Collectors.toList()));

        //Exibe cada elemento no console sem retornar outra coleção
        System.out.println("Retorna elementos- ");
        estudantes.stream().forEach(System.out::println);

        //Retorna true se todos os elementos possuem a letra W no nome
        System.out.println("Retorna true se tem W no nomw  " + estudantes.stream()
                .allMatch((elemento)-> elemento.contains("w")));

        // Exemplo de operação concatenada
        System.out.println("Operação concatenada");
        System.out.println(estudantes.stream()
                .peek(System.out::println)
                .map(estudante ->
                        estudante.concat(" - ").concat(String.valueOf(estudante.length())))
                .peek(System.out::println)
                .filter(estudante ->
                        estudante.toLowerCase().contains("r"))
                .collect(Collectors.toList()));
                //.collect(Collectors.joining(", ")));
                //.collect(Collectors.toSet()));
                //.collect(Collectors.groupingBy(estudante -> estudante.substring(estudante.indexOf(" - ")+1))));


    }
}
