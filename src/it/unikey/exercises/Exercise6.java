package it.unikey.exercises;

import it.unikey.entities.Order;
import it.unikey.utils.Mocks;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Exercise6 {

    public static void main(String[] args) {
        //Esercizio 6 - Ottieni gli ultimi 3 ordini effettuati

        Mocks.createMocks();

        List<Order> lastThreeOrders = Mocks.store.getOrders()
                .stream()
                .sorted(Comparator.comparing(Order::getDate).reversed())
                .limit(3)
                .collect(Collectors.toList());

        lastThreeOrders.forEach(System.out::println);
    }
}
