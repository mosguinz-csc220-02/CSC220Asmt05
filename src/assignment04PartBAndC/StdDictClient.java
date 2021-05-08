package assignment04PartBAndC;

import com.google.common.collect.ImmutableListMultimap;
import java.util.Map.Entry;
import java.util.Scanner;

public class StdDictClient {

    public static final CSC220Dictionary DICTIONARY = new CSC220Dictionary();
    private static final Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.printf("%n- DICTIONARY 220 JAVA Standard -----%n"
                + "-----      powered by Google Guava -%n%n");
        new StdDictClient().run();
    }

    public void run() {
        while (true) {
            String input = promptInput();

            if (input.equals("!q")) {
                break;
            }
            displayResults(DICTIONARY.lookup(input));
        }
    }

    public String promptInput() {
        System.out.print("Search: ");
        return scan.nextLine().trim();
    }

    private void displayResults(Entry<String, ImmutableListMultimap<POS, String>> res) {
        System.out.print("|".indent(4));
        if (res == null) {
            System.out.print("<Not found>".indent(5));
        } else {
            displayDefinitions(res.getKey(), res.getValue());
        }
        System.out.print("|".indent(4));
    }

    private void displayDefinitions(String word, ImmutableListMultimap<POS, String> definition) {
        definition.forEach((__, def) -> System.out.printf("%s: %s".indent(5), word, def));
    }

}
