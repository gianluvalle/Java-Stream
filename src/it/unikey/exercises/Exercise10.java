package it.unikey.exercises;

import it.unikey.entities.Order;
import it.unikey.utils.Mocks;

import java.util.Map;
import java.util.stream.Collectors;

public class Exercise10 {

    public static void main(String[] args) {
        //Esercizio 10 - Ottieni una Map con chiave id ordine e valore conteggio dei prodotti nell'ordine

        Mocks.createMocks();

        Map<Integer, Integer> mappaProdottiPerIdOrdine = Mocks.store.getOrders()
                .stream()
                .collect(Collectors.toMap(Order::getId, order -> order.getProducts().size()));

        System.out.println(mappaProdottiPerIdOrdine);
    }
}
