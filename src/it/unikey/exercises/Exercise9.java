package it.unikey.exercises;

import it.unikey.entities.Product;
import it.unikey.utils.Mocks;

import java.util.DoubleSummaryStatistics;

public class Exercise9 {

    public static void main(String[] args) {
        //Esercizio 9 - Ottieni un insieme di statistiche riassuntive per tutti i prodotti di categoria "Libri"
        // (utilizza il metodo summaryStatistics() e la classe SummaryStatistics)

        Mocks.createMocks();

        DoubleSummaryStatistics summaryStatistics = Mocks.store.getProducts()
                .stream()
                .filter(product -> product.getCategory().equalsIgnoreCase("Libri"))
                .mapToDouble(Product::getPrice)
                .summaryStatistics();

        System.out.println("Statistiche riassuntive dei prodotti di categoria 'Libri':" +
                            "\nTotale: " + summaryStatistics.getCount() +
                            "\nMax: " + summaryStatistics.getMax() +
                            "\nMin: " + summaryStatistics.getMin() +
                            "\nMedia: " + summaryStatistics.getAverage() +
                            "\nSomma: " + summaryStatistics.getSum());
    }
}
