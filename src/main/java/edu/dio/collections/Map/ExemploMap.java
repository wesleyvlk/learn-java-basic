package edu.dio.collections.Map;

import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

/*
 * Dada os modelos dos carros e seus respectivos consumos na estrada, faça:
 * modelo = gol - consumo = 14,4km/l
 * modelo = uno - consumo = 15,6 km/l
 * modelo = mobi - consumo = 16,1 km/l
 * modelo = hb20 - consumo = 14,5 km/l
 * modelo = kwid - consumo = 15,6 km/l
 */
public class ExemploMap {
    public static void main(final String[] args) {
        final Map<String, Double> cars = new HashMap<>() {
            {
                put("gol", 14.4);
                put("uno", 15.6);
                put("mobi", 16.1);
                put("hb20", 14.5);
                put("kwid", 15.6);
            }
        };
        System.out.println("Crie um dicionário que relacione os modelos e seus respectivos consumos: " + cars
                .toString());

        cars.put("gol", 15.2);
        System.out.println("Substitua o consumo do gol por 15,2 km/l: " + cars);

        System.out.println("Confira se o modelo tucson está no dicionário: " + cars.containsKey("tucson"));

        System.out.println("Exiba o consumo do uno: " + cars.get("uno"));

        // System.out.println("Exiba o terceiro modelo adicionado: "); não é possivel,
        // rash map é aleatorio e Map não localiza por index e sim por key

        final Set<String> models = cars.keySet();
        System.out.println("Exiba os modelos: " + models);

        final Collection<Double> consume = cars.values();
        System.out.println("Exiba os consumos dos carros: " + consume);

        final Double consumeEco = Collections.max(cars.values());
        String modelEco = "";
        final Set<Entry<String, Double>> entryCarsEco = cars.entrySet();
        for (final Entry<String, Double> entry : entryCarsEco) {
            if (entry.getValue().equals(consumeEco)) {
                modelEco = entry.getKey();
                System.out.println("Exiba o modelo mais econômico e seu consumo: " + modelEco + " - " + consumeEco);
            }
        }

        final Double consumeNotEco = Collections.min(cars.values());
        String modelNotEco = "";
        final Set<Entry<String, Double>> entryCarsNotEco = cars.entrySet();
        for (final Entry<String, Double> entry : entryCarsNotEco) {
            if (entry.getValue().equals(consumeNotEco)) {
                modelNotEco = entry.getKey();
                System.out.println(
                        "Exiba o modelo menos econômico e seu consumo: " + modelNotEco + " - " + consumeNotEco);
            }
        }

        final Iterator<Double> iterator = cars.values().iterator();
        double sum = 0d;
        while (iterator.hasNext())
            sum += iterator.next();

        System.out.println("Exiba a soma dos consumos: " + sum);

        System.out.println("Exiba a média dos consumos deste dicionário de carros: " + (sum / cars.size()));

        final Iterator<Double> iterator1 = cars.values().iterator();
        while (iterator1.hasNext())
            if (iterator1.next().equals(15.6))
                iterator1.remove();

        System.out.println("Remova os modelos com o consumo igual a 15,6 km/l: " + cars);

        final Map<String, Double> cars1 = new LinkedHashMap<>() {
            {
                put("gol", 14.4);
                put("uno", 15.6);
                put("mobi", 16.1);
                put("hb20", 14.5);
                put("kwid", 15.6);
            }
        };
        System.out.println("Exiba todos os carros na ordem em que foram informados: " + cars1.toString());

        final Map<String, Double> cars2 = new TreeMap<>(cars1);
        System.out.println("Exiba o dicionário ordenado pelo modelo: " + cars2.toString());

        cars.clear();
        System.out.println("Apague o dicionario de carros: ");

        System.out.println("Confira se o dicionário está vazio: " + cars.isEmpty() + " " + cars.toString());
        System.out.println("Confira se o dicionário 1 está vazio: " + cars1.isEmpty() + " " + cars1.toString());
        System.out.println("Confira se o dicionário 2 está vazio: " + cars2.isEmpty() + " " + cars2.toString());

    }
}
