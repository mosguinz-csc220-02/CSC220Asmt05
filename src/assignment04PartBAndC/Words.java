package assignment04PartBAndC;

import com.google.common.collect.ArrayListMultimap;

public enum DictEntry {

    BOOK_N("book", "A written work published in printed or electronic form.", PartOfSpeech.NOUN),
    BOOK_V("book", "To arrange for someone to have a seat on a plane.", PartOfSpeech.VERB),
    BOOKABLE("bookable", "Can be ordered in advance.", PartOfSpeech.ADJECTIVE),
    BOOKCASE("bookcase", "A piece of furniture with shelves.", PartOfSpeech.NOUN),
    BOOKBINDER("bookbinder", "A person who fastens the pages of books.", PartOfSpeech.NOUN),
    CSC220_A("CSC220", "Ready to create complex data structures.", PartOfSpeech.ADJECTIVE),
    CSC220_N("CSC220", "Data Structures.", PartOfSpeech.NOUN),
    CSC220_V("CSC220", "To create data structures.", PartOfSpeech.VERB);

    private final ArrayListMultimap<PartOfSpeech, String> entries = ArrayListMultimap.create();
    private String key, value;
    private PartOfSpeech partOfSpeech;

    DictEntry(String key, PartOfSpeech partOfSpeech, String definition) {
        this.key = key;
        this.entries.put(partOfSpeech, definition);
    }

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public PartOfSpeech getPartOfSpeech() {
        return partOfSpeech;
    }

    public void setPartOfSpeech(PartOfSpeech partOfSpeech) {
        this.partOfSpeech = partOfSpeech;
    }
}
