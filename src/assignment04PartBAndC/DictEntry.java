package assignment04PartBAndC;

public class DictEntry {

    private final POS pos;
    private final String definition;

    DictEntry(POS pos, String definition) {
        this.pos = pos;
        this.definition = definition;
    }

    enum POS {
        VERB, NOUN, ADJECTIVE;
    }

}
