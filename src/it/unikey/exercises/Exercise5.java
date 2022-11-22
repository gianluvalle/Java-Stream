package it.unikey.exercises;

import it.unikey.entities.Product;
import it.unikey.utils.Mocks;

import java.util.Comparator;
import java.util.Optional;

public class Exercise5 {

    public static void main(String[] args) {
        //Esercizio 5 - Ottieni il prodotto più economico della categoria "Libri"

        Mocks.createMocks();

        Optional<Product> cheapestProduct = Mocks.store.getProducts()
                .stream()
                .filter(product -> product.getCategory().equalsIgnoreCase("Libri"))
                .min(Comparator.comparing(Product::getPrice));

        cheapestProduct.ifPresentOrElse(System.out::println, () -> System.out.println("Non è presente un prodotto col prezzo minimo?"));
    }
}
