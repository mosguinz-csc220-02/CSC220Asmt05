package assignment04PartBAndC;

import com.google.common.collect.ImmutableListMultimap;
import java.util.Arrays;

public enum CSC220Definition {

    BOOK("Book",
            new DictEntry(POS.NOUN, "A written work published in printed or electronic form."),
            new DictEntry(POS.VERB, "To arrange for someone to have a seat on a plane.")
    ),
    BOOKABLE("Bookable",
            new DictEntry(POS.ADJECTIVE, "Can be ordered in advance.")
    ),
    BOOKCASE("Bookcase",
            new DictEntry(POS.NOUN, "A piece of furniture with shelves.")
    ),
    BOOKBINDER("Bookbinder",
            new DictEntry(POS.NOUN, "A person who fastens the pages of books.")
    ),
    CSC220("CSC220",
            new DictEntry(POS.NOUN, "Data Structures."),
            new DictEntry(POS.ADJECTIVE, "Ready to create complex data structures."),
            new DictEntry(POS.VERB, "To create data structures.")
    );

    private final String word;
    private final ImmutableListMultimap<POS, String> definitions;

    CSC220Definition(String word, DictEntry... entries) {
        this.word = word;
        definitions = new ImmutableListMultimap.Builder<POS, String>()
                .putAll(Arrays.asList(entries))
                .build();
    }

    public String getWord() {
        return word;
    }

    public ImmutableListMultimap<POS, String> getDefinitions() {
        return definitions;
    }

}
