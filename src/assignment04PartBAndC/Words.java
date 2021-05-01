package assignment04PartBAndC;

import assignment04PartBAndC.DictEntry.POS;
import com.google.common.collect.ArrayListMultimap;

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
    private final ArrayListMultimap<POS, String> definitions;

    Words(String key, DictEntry... entries) {
        this.key = key;
        definitions = ArrayListMultimap.create();
        for (DictEntry entry : entries) {
            definitions.put(entry.getPos(), entry.getDefinition());
        }
    }

}
