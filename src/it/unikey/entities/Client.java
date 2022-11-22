package it.unikey.entities;

import java.util.List;

public class Client {
    private String fullName;
    private String clientType;
    private List<Order> orders;

    public Client(String fullName, String clientType, List<Order> orders) {
        this.fullName = fullName;
        this.clientType = clientType;
        this.orders = orders;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getClientType() {
        return clientType;
    }

    public void setClientType(String clientType) {
        this.clientType = clientType;
    }

    public List<Order> getOrders() {
        return orders;
    }

    public void setOrders(List<Order> orders) {
        this.orders = orders;
    }

    @Override
    public String toString() {
        return "Client{" +
                "fullName='" + fullName + '\'' +
                ", clientType='" + clientType + '\'' +
                ", orders=" + orders +
                '}';
    }
}
