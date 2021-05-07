package assignment04PartBAndC;

import com.google.common.collect.ImmutableListMultimap;
import java.util.Map.Entry;
import java.util.Scanner;

public class DictClient {

    private static final Scanner scan = new Scanner(System.in);
    private static final CSC220Dictionary DICTIONARY = new CSC220Dictionary();
    private final VERSION APP_VERSION;

    public DictClient(VERSION version) {
        APP_VERSION = version;
        System.out.printf("%n- DICTIONARY 220 JAVA %s -----%n"
                + "-----      powered by Google Guava -%n%n", APP_VERSION);
    }

    public static void main(String[] args) {
        new DictClient(VERSION.Standard).run();
    }

    public void run() {
        String input;
        while (true) {
            input = promptInput();

            if (input.equals("!q")) {
                break;
            }
            displayResults(DICTIONARY.lookup(input));
        }
    }

    private String promptInput() {
        System.out.print("Search: ");
        return scan.nextLine().trim();
    }

    private void displayResults(Entry<String, ImmutableListMultimap<POS, String>> res) {
        System.out.print("|".indent(4));
        if (res != null) {
            displayDefinitions(res.getKey(), res.getValue());
        } else {
            System.out.print("<Not found>".indent(5));
        }
        System.out.print("|".indent(4));
    }

    private void displayDefinitions(String word, ImmutableListMultimap<POS, String> definition) {
        definition.forEach((__, def) -> System.out.printf("%s: %s".indent(5), word, def));
    }

    enum VERSION {
        Standard, Professional
    }

}
