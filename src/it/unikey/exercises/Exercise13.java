package it.unikey.exercises;

import it.unikey.entities.Product;
import it.unikey.utils.Mocks;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Exercise13 {

    public static void main(String[] args) {
        //Esercizio 13 - Ottieni una mappa con le liste di prodotti, raggruppate per nome della categoria

        Mocks.createMocks();

        Map<String, List<Product>> mappaListaProdottiPerNomeCategoria = Mocks.store.getProducts()
                .stream()
                .collect(Collectors.groupingBy(Product::getCategory));


        for(Map.Entry<String, List<Product>> entry : mappaListaProdottiPerNomeCategoria.entrySet())
            System.out.println(entry.getKey() + "\n" + entry.getValue().toString());
    }
}
