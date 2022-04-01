package exemplomap;

import java.util.HashMap;
import java.util.Map;

public class ExemploHashMap {
    public static void main(String[] args) {
        Map<String,Integer> campeoesMundiaisFifa = new HashMap<>();

        campeoesMundiaisFifa.put("Brasil", 5);
        campeoesMundiaisFifa.put("Alemanha", 4);
        campeoesMundiaisFifa.put("Itália",4);
        campeoesMundiaisFifa.put("Uruguai",2);
        campeoesMundiaisFifa.put("Argentina",2);
        campeoesMundiaisFifa.put("França",2);
        campeoesMundiaisFifa.put("Inglaterra",1);
        campeoesMundiaisFifa.put("Espanha",1);

        System.out.println(campeoesMundiaisFifa);

        //altera dados Brasil
        campeoesMundiaisFifa.put("Brasil", 6);
        System.out.println(campeoesMundiaisFifa);

        //busca valor da Argentina
        System.out.println(campeoesMundiaisFifa.get("Argentina"));

        //Verifica se existe ou não uma chave (França)
        System.out.println(campeoesMundiaisFifa.containsKey("França"));

        // Remove o Campeão França
        campeoesMundiaisFifa.remove("França");

        //Verifica se existe ou não uma chave (França)
        System.out.println(campeoesMundiaisFifa.containsKey("França"));

        System.out.println(campeoesMundiaisFifa);

        //Retorna se existe ou não alguma seleção Hexacampeã
        System.out.println(campeoesMundiaisFifa.containsValue(6));

        // Retorna o tamanho do mapa
        System.out.println(campeoesMundiaisFifa.size());

        System.out.println(campeoesMundiaisFifa);

        // Navega nos registros do mapa
        for(Map.Entry<String,Integer> entry: campeoesMundiaisFifa.entrySet()){
            System.out.println(entry.getKey() + " --- " + entry.getValue());
        }
        System.out.println("");

        for (String key: campeoesMundiaisFifa.keySet()){
            System.out.println(key + " --- " + campeoesMundiaisFifa.get(key));
        }
        System.out.println("");

    }

}
