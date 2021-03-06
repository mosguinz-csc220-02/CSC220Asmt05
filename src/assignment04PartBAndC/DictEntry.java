package assignment04PartBAndC;

import java.util.Map;

enum POS {
    VERB, NOUN, ADJECTIVE;

    public static POS get(String s) {
        try {
            return POS.valueOf(s.toUpperCase());
        } catch (IllegalArgumentException ignored) {
            return null;
        }
    }

    @Override
    public String toString() {
        return super.toString().toLowerCase();
    }
}

public class DictEntry implements Map.Entry<POS, String> {

    private final POS pos;
    private final String definition;

    DictEntry(POS pos, String definition) {
        this.pos = pos;
        this.definition = definition;
    }

    @Override
    public POS getKey() {
        return pos;
    }

    @Override
    public String getValue() {
        return definition;
    }

    @Override
    public String setValue(String value) {
        throw new UnsupportedOperationException();
    }

}