package assignment04PartBAndC;

import java.util.Scanner;

public class DictClient {

    private static final Scanner scan = new Scanner(System.in);
    private final VERSION APP_VERSION;

    public DictClient(VERSION version) {
        APP_VERSION = version;
        System.out.printf("%n- DICTIONARY 220 JAVA %s -----%n"
                + "-----     powered by Google Guava -%n", APP_VERSION);
    }

    private String promptInput() {
        System.out.print("Search: ");
        return "";
    }

    enum VERSION {
        Standard, Professional
    }

}
