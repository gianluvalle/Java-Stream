package it.unikey.exercises;

import it.unikey.entities.Product;
import it.unikey.utils.Formatters;
import it.unikey.utils.Mocks;

import java.time.LocalDate;
import java.util.OptionalDouble;

public class Exercise8 {

    public static void main(String[] args) {
        //Esercizio 8 - Calcola il pagamento medio degli ordini piazzati il 14/03/21

        Mocks.createMocks();

        OptionalDouble averageOrdersPaymentPlacedIn14_03_21 = Mocks.store.getOrders()
                .stream()
                .filter(order -> order.getDate().isEqual(LocalDate.of(2021, 3, 14)))
                .flatMap(order -> order.getProducts().stream())
                .mapToDouble(Product::getPrice)
                .average();

        averageOrdersPaymentPlacedIn14_03_21.ifPresentOrElse(average ->
                System.out.println("Pagamento medio degli ordini piazzati il 14/03/21: " + Formatters.decimalFormatter.format(average)),
                () -> System.out.println("Non sono stati piazzati ordini il 14/03/21"));
    }
}
