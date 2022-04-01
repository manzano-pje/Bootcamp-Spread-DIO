package exemploset;

import java.util.LinkedHashSet;

public class ExemploLinkedSet {
    public static void main(String[] args) {
        LinkedHashSet<Integer> numeros = new LinkedHashSet<>();

        numeros.add(3);
        numeros.add(88);
        numeros.add(20);
        numeros.add(44);
        numeros.add(3);

        System.out.println(numeros);
        for(int ordemNumeros:numeros){
            System.out.println(ordemNumeros);
        }
        System.out.println("");

        System.out.println("remove o item 3 -> " + numeros.remove(3));

        numeros.add(23);
        System.out.println(numeros);

        System.out.println("Tamanho = " + numeros.size());
        System.out.println("vazia? = " + numeros.isEmpty());
    }
}
