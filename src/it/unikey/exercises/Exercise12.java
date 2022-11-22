package it.unikey.exercises;

import it.unikey.entities.Order;
import it.unikey.entities.Product;
import it.unikey.utils.Mocks;

import java.util.Map;
import java.util.stream.Collectors;

public class Exercise12 {

    public static void main(String[] args) {
        //Esercizio 12 - Ottieni una mappa con le somme dei prodotti, raggruppate per ordine

        Mocks.createMocks();

        Map<Order, Double> mappaSommaCostoProdottiRaggruppatePerOrdini = Mocks.store.getOrders()
                .stream()
                .collect(Collectors.toMap(
                        order -> order,
                        order -> order.getProducts()
                                .stream()
                                .mapToDouble(Product::getPrice)
                                .sum())
                );

        for(Map.Entry<Order, Double> entry : mappaSommaCostoProdottiRaggruppatePerOrdini.entrySet())
            System.out.println(entry.getKey() + "\n" + entry.getValue().toString());
    }
}
