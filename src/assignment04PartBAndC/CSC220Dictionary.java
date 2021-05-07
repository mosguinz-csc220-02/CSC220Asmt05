package assignment04PartBAndC;

import com.google.common.collect.ImmutableListMultimap;
import java.util.Map.Entry;
import java.util.TreeMap;

public class CSC220Dictionary {


    TreeMap<String, ImmutableListMultimap<POS, String>> entries = new TreeMap<>(
            String.CASE_INSENSITIVE_ORDER);

    public CSC220Dictionary() {
        for (CSC220Definition definition : CSC220Definition.values()) {
            entries.put(definition.getWord(), definition.getDefinitions());
        }
    }

    public Entry<String, ImmutableListMultimap<POS, String>> lookup(String query) {
        return entries.ceilingEntry(query);
    }

}
