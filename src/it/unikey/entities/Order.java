package it.unikey.entities;

import it.unikey.utils.Formatters;

import java.time.LocalDate;
import java.util.List;

public class Order {

    private static Integer idCounter = 1;
    private Integer id;
    private LocalDate date;
    private List<Product> products;

    public Order(LocalDate date, List<Product> products) {
        this.id = idCounter++;
        this.date = date;
        this.products = products;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public List<Product> getProducts() {
        return products;
    }

    public void setProducts(List<Product> products) {
        this.products = products;
    }

    @Override
    public String toString() {
        return "Order{" +
                "id=" + id +
                ", date=" + date.format(Formatters.dateFormatter) +
                '}';
    }
}
