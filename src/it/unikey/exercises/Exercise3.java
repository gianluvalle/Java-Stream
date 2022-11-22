package it.unikey.exercises;

import it.unikey.entities.Product;
import it.unikey.utils.Mocks;

import java.util.List;
import java.util.stream.Collectors;


public class Exercise3 {

    public static void main(String[] args) {
        //Esercizio 3 - Ottieni una lista di prodotti con categoria "Giocattoli" e poi applica il 10% di sconto

        Mocks.createMocks();

        List<Product> toysWithDiscount = Mocks.store.getProducts()
                .stream()
                .filter(product -> product.getCategory().equalsIgnoreCase("Giocattoli"))
                .peek(product -> product.setPrice(product.getPrice()*0.9))
                .collect(Collectors.toList());

        toysWithDiscount.forEach(System.out::println);

    }

}
