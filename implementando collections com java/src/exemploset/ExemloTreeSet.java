package exemploset;

import java.util.TreeSet;

public class ExemloTreeSet {
    public static void main(String[] args) {

        TreeSet<Integer> numeros = new TreeSet<>();
        numeros.add(3);
        numeros.add(88);
        numeros.add(20);
        numeros.add(44);
        numeros.add(3);

        for(int relacao:numeros){
            System.out.println("relação de numeros ->" + relacao);
        }
        // remover primeiro numero
        int primeiro = numeros.first();
        System.out.println("Primeiro numero: " + primeiro);
        System.out.println("Remover numero da cabeça "+ numeros.remove(primeiro));

        System.out.println(numeros);
        //adicionar numero 23
        numeros.add(23);
        System.out.println(numeros);
        System.out.println("Tamanho: " + numeros.size());
        System.out.println("Vazio " + numeros.isEmpty());
    }
}
