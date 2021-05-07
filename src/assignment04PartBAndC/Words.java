package assignment04PartBAndC;

import com.google.common.collect.ImmutableListMultimap;
import java.util.Arrays;

public enum Words {

    BOOK("book",
            new DictEntry(POS.NOUN, "A written work published in printed or electronic form."),
            new DictEntry(POS.VERB, "To arrange for someone to have a seat on a plane.")
    ),
    BOOKABLE("bookable",
            new DictEntry(POS.ADJECTIVE, "Can be ordered in advance.")
    ),
    BOOKCASE("bookcase",
            new DictEntry(POS.NOUN, "A piece of furniture with shelves.")
    ),
    BOOKBINDER("bookbinder",
            new DictEntry(POS.NOUN, "A person who fastens the pages of books.")
    ),
    CSC220("CSC220",
            new DictEntry(POS.ADJECTIVE, "Ready to create complex data structures."),
            new DictEntry(POS.NOUN, "Data Structures."),
            new DictEntry(POS.VERB, "To create data structures.")
    );

    private final String key;
    private final ImmutableListMultimap<POS, String> definitions;

    Words(String key, DictEntry... entries) {
        this.key = key;
        definitions = new ImmutableListMultimap.Builder<POS, String>()
                .putAll(Arrays.asList(entries))
                .build();
    }

    public String getKey() {
        return key;
    }

    public ImmutableListMultimap<POS, String> getDefinitions() {
        return definitions;
    }

}
