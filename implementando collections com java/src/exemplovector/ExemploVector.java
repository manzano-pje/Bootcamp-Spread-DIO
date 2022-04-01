package exemplovector;

import java.util.*;

public class ExemploVector {
    static public void main(String[] args) {

        List<String> esportes = new Vector<>();

        // adiciona 4 esports no vector
        esportes.add("Futebol");
        esportes.add("Basqueteball");
        esportes.add("Tênis de Mesa");
        esportes.add("Handeboll");

        System.out.println(esportes);

        //altera a posição 2 do vector
        esportes.set(2, "Ping Pong");
        System.out.println(esportes);

        // Remove esporte na posição 2
        esportes.remove(2);
        System.out.println(esportes);

        // Remove esporte item handeball
        esportes.remove("Handeball");
        System.out.println(esportes);

        // Retorna o primeiro valor do vector
        String esporteZero = esportes.get(0);
        System.out.println(esporteZero);

        // Navega nos esportes
        for (String esporte : esportes) {
            System.out.println(esporte);
        }

    }
}
