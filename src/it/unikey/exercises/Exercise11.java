package it.unikey.exercises;

import it.unikey.entities.Client;
import it.unikey.entities.Order;
import it.unikey.utils.Mocks;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Exercise11 {

    public static void main(String[] args) {
        //Esercizio 11 - Ottieni una Map con le liste degli ordini raggruppate per cliente

        Mocks.createMocks();

        Map<Client, List<Order>> mappaOrdiniPerCliente = Mocks.store.getClients()
                .stream()
                .collect(Collectors.toMap(client -> client, Client::getOrders));

        for(Map.Entry<Client, List<Order>> entry : mappaOrdiniPerCliente.entrySet())
            System.out.println(entry.getKey() + "\n" + entry.getValue().toString());
    }
}
