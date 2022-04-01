package exemplomap;

import java.util.HashMap;
import java.util.Map;

public class MapEstados {
    public static void main(String[] args) {
        Map<String, String> estado = new HashMap<>();

        estado.put("SP", "São Paulo");
        estado.put("RS", "Rio Grande do Sul");
        estado.put("SC", "Santa Catarina");
        estado.put("PR", "Paraná");
        estado.put("RJ", "Rio de Janeiro");
        estado.put("ES", "Espírito Santo");
        estado.put("MG", "Minas Gerais");
        estado.put("MS", "Mato Grosso do Sul");
        estado.put("MT", "Mato Grosso");
        estado.put("BA", "Bahia");
        estado.put("PE", "Pernambuco");
        estado.put("TO", "Tocantins");
        estado.put("MA", "Maranhão");
        estado.put("PA", "Pará");
        estado.put("CE", "Ceará");
        estado.put("SE", "Sergipe");
        estado.put("RO", "Rondônia");
        estado.put("RR", "Roraima");
        estado.put("AM", "Amazonas");
        estado.put("AC", "Acre");
        estado.put("AL", "Alagoas");
        estado.put("AP", "Amapá");
        estado.put("GO", "Goiás");
        estado.put("PB", "Paraíba");
        estado.put("RN", "Rio Grande do Norte");
        estado.put("PI", "Piauí");

        // relação estados cadastrados
        System.out.println(estado);
        System.out.println("");

        // apagar estado de Minas Gerais
        estado.remove("MG");
        System.out.println(estado);
        System.out.println("");

        //Adicionar Distrito Federal
        estado.put("DF","Distrito Federal");
        System.out.println("");

        // verificar tamanho do mapa
        System.out.println("Tamanho do mapa: " + estado.size());
        System.out.println("");

        // remover o estado de Mato Grosso do Sul pelo nome
        estado.remove("Mato Grosso do Sul");
        System.out.println("");

        // navegue por todos os estados mostrando a configuração: Estado - Sigla
        for(String key: estado.keySet()){
            System.out.println(estado.get(key) + " - " + key);
        }
        System.out.println("");

        //Verifique se o Estado de Santa Catarina esta no mapa pela sigle
        System.out.println("Santa Catarina está no mapa : " + estado.containsKey("SC"));
        System.out.println("");

        // Verifique se o Estado do Maranhãoestá no mapa pelo nome
        System.out.println("Maranhão está no mapa : " + estado.containsValue("Maranhão"));
    }
}
