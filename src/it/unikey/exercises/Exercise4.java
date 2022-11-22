package it.unikey.exercises;

import it.unikey.entities.Product;
import it.unikey.utils.Mocks;

import java.time.LocalDate;
import java.util.List;
import java.util.stream.Collectors;

public class Exercise4 {

    public static void main(String[] args) {
        //Esercizio 4 - Ottieni una lista di prodotti ordinati da clienti di tipo "Premium"
        // (i tipi a disposizione sono "Base", "Premium", "VIP") tra il 01/02/21 ed il 01/04/21

        Mocks.createMocks();

        List<Product> productsOrderedByPremiumClients = Mocks.store.getClients()
                .stream()
                .filter(client -> client.getClientType().equalsIgnoreCase("Premium"))
                .flatMap(client -> client.getOrders().stream())
                .filter(order -> order.getDate().isAfter(LocalDate.of(2021, 2, 1)) &&
                        order.getDate().isBefore(LocalDate.of(2021, 4, 1)))
                .flatMap(order -> order.getProducts().stream())
                .distinct()
                .collect(Collectors.toList());

        productsOrderedByPremiumClients.forEach(System.out::println);
    }
}
