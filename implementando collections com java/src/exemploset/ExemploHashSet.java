package exemploset;

import java.util.HashSet;

public class ExemploHashSet {
    public static void main(String[] args) {

        HashSet<Integer> numeros = new HashSet<>();

        numeros.add(3);
        numeros.add(88);
        numeros.add(20);
        numeros.add(44);
        numeros.add(3);

        for(int relacaoNumeros: numeros){
            System.out.println(relacaoNumeros);
        }

        System.out.println("Remove o primeiro item (3) -> "+numeros.remove(3));

        numeros.add(23);
        System.out.println(numeros);

        System.out.println("tamanho "+ numeros.size());
        System.out.println(numeros.isEmpty());
    }
}
