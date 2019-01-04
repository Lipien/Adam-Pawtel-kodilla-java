package com.kodilla.good.patterns.challenges;

public class Application {
    public static void main(String[] args) {

        // zadanie 13.1 funkcyjna iteracja po tytułach

       /* MovieStore movieStore = new MovieStore();
        Map <String, List <String>> movieMap = movieStore.getMovies();
        final String movies = movieMap.entrySet()
                .stream()
                .flatMap(entry -> entry.getValue().stream())
                .collect(Collectors.joining(" ! "));
        System.out.println(movies);*/

        // zadanie 13.2 stworzenie serwisu zamówień produktów

        CustomerProductOrdersCollector customerProductOrdersCollector = new CustomerProductOrdersCollector();
        CustomerProductOrder customerProductOrder = customerProductOrdersCollector.orderToBeProcessed();

        OrderProcessor orderProcessor = new OrderProcessor(
                new MailService(), new ToothBrushOrderService(), new ToothbrushOrdersRepository());

        orderProcessor.process(customerProductOrder);

    }
}
