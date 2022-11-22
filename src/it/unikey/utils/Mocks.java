package it.unikey.utils;

import it.unikey.entities.Client;
import it.unikey.entities.Order;
import it.unikey.entities.Product;
import it.unikey.entities.Store;

import java.time.LocalDate;
import java.util.List;

public class Mocks {

    public static Store store = new Store();

    public static void createMocks() {

        store.setProducts(List.of(
                new Product("Il Fu Mattia Pascal", "Libri", 19.70),
                new Product("Girello", "Neonati", 123.45),
                new Product("PS5", "Giocattoli", 399.99),
                new Product("Snoop Dog: Tips For Your Plants", "Libri", 420.0)
        ));

        store.setOrders(List.of(
                new Order(LocalDate.of(2021, 2, 24), List.of(
                        store.getProducts().get(0),
                        store.getProducts().get(3)
                )),
                new Order(LocalDate.of(2022, 5, 21), List.of(
                        store.getProducts().get(1),
                        store.getProducts().get(2)
                )),
                new Order(LocalDate.of(2021, 2, 3), List.of(
                        store.getProducts().get(0),
                        store.getProducts().get(2),
                        store.getProducts().get(3)
                )),
                new Order(LocalDate.of(2020, 1, 1), List.of(
                        store.getProducts().get(1)
                )),
                new Order(LocalDate.of(2021, 3, 14), List.of(
                        store.getProducts().get(0),
                        store.getProducts().get(1),
                        store.getProducts().get(2),
                        store.getProducts().get(3)
                ))
        ));

        store.setClients(List.of(
                new Client("Edoardo Carradori", "Premium", List.of(
                        store.getOrders().get(0),
                        store.getOrders().get(2)
                        )),
                new Client("Jeff Bezos", "Basic", List.of(
                        store.getOrders().get(0),
                        store.getOrders().get(1)
                        )),
                new Client("Moike", "VIP", List.of(
                        store.getOrders().get(0),
                        store.getOrders().get(1),
                        store.getOrders().get(2)
                        ))
        ));

    }
}
