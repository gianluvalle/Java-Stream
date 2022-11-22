package it.unikey.exercises;

import it.unikey.entities.Product;
import it.unikey.utils.Mocks;

import java.util.List;
import java.util.stream.Collectors;

public class Exercise1 {

    public static void main(String[] args) {
        //Esercizio 1 — Ottieni una lista di prodotti appartenente alla categoria "Libri" con prezzo maggiore di 100 euro

        Mocks.createMocks();

        List<Product> booksWithPriceGreaterThan100 = Mocks.store.getProducts()
                .stream()
                .filter(product -> product.getCategory().equalsIgnoreCase("Libri") &&
                        product.getPrice() > 100)
                .collect(Collectors.toList());

        booksWithPriceGreaterThan100.forEach(System.out::println);
    }

}
