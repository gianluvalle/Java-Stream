package it.unikey.exercises;

import it.unikey.entities.Order;
import it.unikey.entities.Product;
import it.unikey.utils.Mocks;

import java.util.List;
import java.util.stream.Collectors;

public class Exercise2 {

    public static void main(String[] args) {
        //Esercizio 2 - Ottieni una lista di ordini con prodotti che appartiene alla categoria "Neonati"

        Mocks.createMocks();

        /*List<Order> ordersWithProductForBabies = Mocks.store.getOrders()
                .stream()
                .filter(order -> {
                    for(Product product : order.getProducts()) {
                        if(product.getCategory().equalsIgnoreCase("Neonati"))
                            return true;
                    }
                    return false;
                })
                .collect(Collectors.toList());*/

        List<Order> ordersWithProductForBabies = Mocks.store.getOrders()
                .stream()
                .filter(order ->
                    order.getProducts()
                    .stream()
                    .anyMatch(product -> product.getCategory().equalsIgnoreCase("Neonati"))
                )
                .collect(Collectors.toList());

        ordersWithProductForBabies.forEach(System.out::println);

    }
}
