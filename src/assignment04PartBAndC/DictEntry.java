package assignment04PartBAndC;

import com.google.common.collect.ArrayListMultimap;

public class DictEntry {

    private final ArrayListMultimap<PartOfSpeech, String> entries = ArrayListMultimap.create();

    DictEntry(PartOfSpeech pos, String definition) {
        entries.put(pos, definition);
    }

    public ArrayListMultimap<PartOfSpeech, String> addDefinition(PartOfSpeech pos,
            String definition) {
        entries.put(pos, definition);
        return entries;
    }

    enum PartOfSpeech {
        VERB, NOUN, ADJECTIVE;
    }

}

