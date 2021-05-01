package assignment04PartBAndC;

import assignment04PartBAndC.DictEntry.POS;
import com.google.common.collect.ArrayListMultimap;

public class Dictionary {

    ArrayListMultimap<String, ArrayListMultimap<POS, String>> entries;

    private void loadEntries() {
        for (Words word : Words.values()) {
            entries.put(word.getKey(), word.getDefinitions());
        }
    }

}
