package it.unikey.entities;

import java.util.List;

public class Store {
    private List<Client> clients;
    private List<Product> products;
    private List<Order> orders;

    public List<Client> getClients() {
        return clients;
    }

    public List<Product> getProducts() {
        return products;
    }

    public List<Order> getOrders() {
        return orders;
    }

    public void setClients(List<Client> clients) {
        this.clients = clients;
    }

    public void setProducts(List<Product> products) {
        this.products = products;
    }

    public void setOrders(List<Order> orders) {
        this.orders = orders;
    }
}
