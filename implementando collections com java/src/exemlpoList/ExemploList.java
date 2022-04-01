package exemlpoList;
// Exercícios de utilização de Collectins

import java.util.*;

public class ExemploList {
    static public void main(String[] args) {

        List<String> nomes = new ArrayList<>();

        // adicionado 5 nomes a lista nomes
        nomes.add("Juliana");
        nomes.add("Pedro");
        nomes.add("Carlos");
        nomes.add("Larissa");
        nomes.add("João");

        // navegação e impressão da lista nomes
        for (String nome : nomes) {
            System.out.println("nomes lista :" + nome);
        }

        // alteração do nome Carlos por Roberto
        nomes.set(2, "Roberto");

        // retorna nome na posição 1
        String nomePosicaoUm = nomes.get(1);
        System.out.println("Nome na posição 1: "+nomePosicaoUm);

        // remove nome da posição 4
        nomes.remove(4);
        System.out.println("Removido nome posição 4: " + nomes);

        // remove o nome João
        nomes.remove("João");

        // mostra o tamanho da lista
        int tamanho = nomes.size();
        System.out.println("Mostra o tamanho da lista: "+tamanho);

        // verificar se o nome Juliana consta na lista
        boolean juliana = nomes.contains("Juliana");
        System.out.println("Verifica se Juliana consta na lista: "+juliana);

        // crie uma nova lista com os nomes Ismael e Rodrigo
        List<String> nomes2 = new ArrayList<>();

        nomes2.add("Ismael");
        nomes2.add("Rodrigo");
        nomes2.addAll(nomes);
        System.out.println("Criada nova lista de nomes adicionada da lista antiga: "+ nomes2);

        // organizar a lista por ordem alfabética
        Collections.sort(nomes2);
        System.out.println("Lista organizada em ordem alfabética: "+ nomes2);

        // verificar se a lista está vazia
        boolean vazia = nomes.isEmpty();
        System.out.println("Verificar se a lista está vazia:"+vazia);
    }

}
