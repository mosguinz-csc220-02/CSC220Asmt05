package assignment04PartBAndC;

public class DictEntry {

    private final PartOfSpeech pos;
    private final String definition;

    DictEntry(PartOfSpeech pos, String definition) {
        this.pos = pos;
        this.definition = definition;
    }

    enum PartOfSpeech {
        VERB, NOUN, ADJECTIVE;
    }

}
