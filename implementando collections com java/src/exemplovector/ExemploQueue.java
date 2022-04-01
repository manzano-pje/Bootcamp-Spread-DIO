package exemplovector;

import java.util.*;

public class ExemploQueue {

    public static void main(String[] args) {
        Queue<String> nomes = new LinkedList<>();

        nomes.add("Juliana");
        nomes.add("Pedro");
        nomes.add("Carlos");
        nomes.add("Larissa");
        nomes.add("João");


        System.out.println("");
        // navegando com for each
        for(String cliente:nomes){
            System.out.println("Fila com for each --> " + cliente);
        }
        System.out.println("");

        // navegando com Iterator
        Iterator<String> clientes = nomes.iterator();
        {
            while (clientes.hasNext()) {
                System.out.println("Fila com Iterator ---> " + clientes.next());
            }
        }
        System.out.println("");

        // Retornar o 1 nome da fila sem excluir
        String primeiroNome = nomes.peek();
        System.out.println("Primeiro nome da fila sem excluir--> " + primeiroNome);

        // Retornar o 1 nome da fila apagando ele
        String primeiroNomeApagado = nomes.poll();
        System.out.println("Primeiro nome da fila excluindo --> " + primeiroNomeApagado);
        System.out.println("");

        // Adicionar novo nome Daniel
        nomes.add("Daniel");

        // navegando com for each
        for (String cliente : nomes) {
            System.out.println("Nova Fila com Daniel for each --> " + cliente);
        }
        System.out.println("");

        //Retorna tamanho da fila
        System.out.println("Tamanho da fila = " + nomes.size());
        System.out.println("");

        // Verifica se a Fila está vazia
        System.out.println("Lista está vazia? " + nomes.isEmpty());
        System.out.println("");

        // Verificar se o nome Carlos está na fila
        boolean verificaNome = nomes.contains("Carlos");
        System.out.println("Carlos está na fila? " + verificaNome);

    }
}
