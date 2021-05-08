package assignment04PartBAndC;

import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableListMultimap;
import com.google.common.collect.Ordering;
import java.util.Map.Entry;
import java.util.Scanner;

public class ProDictClient {

    private static final CSC220Dictionary DICTIONARY = new CSC220Dictionary();
    private static final Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.printf("%n- DICTIONARY 220 JAVA Professional -----%n"
                + "-----          powered by Google Guava -%n%n");
        new ProDictClient().run();
    }

    public void run() {
        while (true) {
            String input = promptInput();

            if (input.equals("!q")) {
                break;
            }

            String[] args = input.split("\\s+", 2);
            if (args.length < 2) {
                displayResults(DICTIONARY.lookup(input));
                continue;
            }

            POS pos = POS.get(args[1]);
            displayResults(DICTIONARY.lookup(args[0], pos), pos);
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
            displayDefinitions(res.getKey(), new ImmutableListMultimap.Builder<POS, String>()
                    .orderKeysBy(Ordering.usingToString())
                    .putAll(res.getValue())
                    .build());
        }
        System.out.print("|".indent(4));
    }

    private void displayResults(Entry<String, ImmutableList<String>> res, POS pos) {
        System.out.print("|".indent(4));
        if (pos == null) {
            System.out.print("<2nd argument must be a part of speech or \"distinct\">".indent(5));
        } else if (res == null) {
            System.out.print("<Not found>".indent(5));
        } else {
            String word = res.getKey();
            res.getValue()
                    .forEach(def -> System.out.printf("%s [%s] : %s".indent(5), word, pos, def));
        }
        System.out.print("|".indent(4));
    }

    private void displayDefinitions(String word, ImmutableListMultimap<POS, String> definition) {
        definition
                .forEach((pos, def) -> System.out.printf("%s [%s] : %s".indent(5), word, pos, def));
    }

}
