package exemplooptional;

import java.util.Optional;

public class ExemploOptionalEstados {
    public static void main(String[] args) {
        Optional<String> optionalString = Optional.of("ValorPresente");

        System.out.println("Valor Opcional que está presente ");
        optionalString.ifPresentOrElse(System.out::println, ()-> System.out.println("não está presente"));

        Optional<String> optionalNull = Optional.ofNullable(null);

        System.out.println("Valor Opcional que não está presente ");
        optionalNull.ifPresentOrElse(System.out::println, ()-> System.out.println("null = não está presente"));

        Optional<String> emptyOptional = Optional.empty();

        System.out.println("Valor Opcional que não está presente ");
        emptyOptional.ifPresentOrElse(System.out::println, ()-> System.out.println("empty = não está presente"));

        Optional<String> optionalNullError = Optional.of(null);

        System.out.println("Valor Opcional que lança erro nullPointerException");
        optionalNullError.ifPresentOrElse(System.out::println, ()-> System.out.println("erro = não está presente"));
    }
}
