package lesson160426;

import java.util.*;

import static java.util.Comparator.*;
import static java.util.Comparator.comparing;
import static java.util.stream.Collectors.*;

public class Practice {
    public static void main(String... args) {
        Trader raoul = new Trader("Raoul", "Cambridge");
        Trader mario = new Trader("Mario", "Milan");
        Trader alan = new Trader("Alan", "Cambridge");
        Trader brian = new Trader("Brian", "Cambridge");

        List<Transaction> transactions = Arrays.asList(
                new Transaction(brian, 2011, 300),
                new Transaction(raoul, 2012, 1000),
                new Transaction(raoul, 2011, 400),
                new Transaction(mario, 2012, 710),
                new Transaction(mario, 2012, 700),
                new Transaction(alan, 2012, 950)
        );
        // Query 1: Find all transactions from year 2011 and sort them by value (small to high).
        System.out.println("1." + transactions.stream()
                .filter(transaction -> transaction.getYear() == 2011)
                .sorted(comparing(Transaction::getValue))
                .collect(toList()));
        // Query 2: What are all the unique cities where the traders work?
        System.out.println("2." + transactions.stream()
                .map(t -> t.getTrader().getCity())
                .distinct()
                .collect(toList()));
        // Query 3: Find all traders from Cambridge and sort them by name.
        System.out.println("3." + transactions.stream()
                .map(Transaction::getTrader)
                .filter(trader -> trader.getCity().equals("Cambridge"))
                .sorted(comparing(Trader::getName))
                .collect(toList()));
        // Query 4: Return a string of all traders’ names sorted alphabetically.
        System.out.println("4." + transactions.stream()
                .map(t -> t.getTrader().getName())
                .distinct()
                .sorted()
                .collect(joining(" ")));
        // Query 5: Are there any trader based in Milan?
        System.out.println("5." + transactions.stream()
                .anyMatch(transaction -> transaction.getTrader().getCity().equals("Milan")));
        // Query 6: Update all transactions so that the traders from Milan are set to Cambridge.
        transactions.stream()
                .map(Transaction::getTrader)
                .filter(trader -> trader.getCity().equals("Milan"))
                .forEach(trader -> trader.setCity("Cambridge"));
        System.out.println(transactions);

        transactions.stream().filter(transaction -> transaction.getTrader().getCity().equals("Cambridge"))
                .map(Transaction::getValue).forEach(System.out::println);
        // Query 7: What's the highest value in all the transactions?
        System.out.println("7." + transactions.stream()
                .map(Transaction::getValue)
                .reduce(Integer::max));
        // Query 8: Find transaction with a minimum value
        System.out.println(transactions.stream().min(comparing(Transaction::getValue)));
//        transactions.stream().reduce()
        // TODO: 28.04.2016 greed gane 
    }
}
