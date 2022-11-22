package it.unikey.exercises;

import it.unikey.entities.Product;
import it.unikey.utils.Mocks;

import java.util.Comparator;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

public class Exercise14 {

    public static void main(String[] args) {
        //Esercizio 14 - Ottieni il prodotto più costoso per categoria

        Mocks.createMocks();

        Map<String, Optional<Product>> mappaProdottoPiuCostosoPerCategoria = Mocks.store.getProducts()
                .stream()
                .collect(Collectors.groupingBy(
                        Product::getCategory,
                        Collectors.maxBy(Comparator.comparing(Product::getPrice))
                ));

        for(Map.Entry<String, Optional<Product>> entry : mappaProdottoPiuCostosoPerCategoria.entrySet()) {
            System.out.println(entry.getKey() + " ");
            entry.getValue().ifPresentOrElse(
                    System.out::println,
                    () -> System.out.println("Nessun valore massimo trovato")
            );
        }

    }
}
