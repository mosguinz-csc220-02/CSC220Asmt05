package assignment04PartBAndC;

import com.google.common.collect.ImmutableListMultimap;
import java.util.HashMap;

public class CSC220Dictionary {

    HashMap<String, ImmutableListMultimap<POS, String>> entries = new HashMap<>();

    public CSC220Dictionary() {
        for (Words word : Words.values()) {
            entries.put(word.getKey(), word.getDefinitions());
        }
    }
}
