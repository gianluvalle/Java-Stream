package it.unikey.exercises;

import it.unikey.entities.Product;
import it.unikey.utils.Formatters;
import it.unikey.utils.Mocks;

import java.time.Month;

public class Exercise7 {

    public static void main(String[] args) {
        //Esercizio 7 - Calcola la somma totale di tutti gli ordini effettuati a Febbraio 2021

        Mocks.createMocks();

        Double ordersFromFebrary2021Sum = Mocks.store.getOrders()
                .stream()
                .filter(order -> order.getDate().getYear() == 2021 && order.getDate().getMonth().equals(Month.FEBRUARY))
                .flatMap(order -> order.getProducts().stream())
                .mapToDouble(Product::getPrice)
                .sum();

        System.out.println("Somma totale dei prodotti negli ordini effettuati a Febbraio 2021: " +
                Formatters.decimalFormatter.format(ordersFromFebrary2021Sum) +
                " euro");
    }
}
