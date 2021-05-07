package assignment04PartBAndC;

import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableListMultimap;
import java.util.HashMap;

public class CSC220Dictionary {

    HashMap<String, ImmutableListMultimap<POS, String>> entries = new HashMap<>();

    public CSC220Dictionary() {
        for (CSC220Definition definition : CSC220Definition.values()) {
            entries.put(definition.getWord(), definition.getDefinitions());
        }
    }

    public ImmutableListMultimap<POS, String> lookup(String query) {
        return entries.get(query);
    }

    public ImmutableList<String> lookup(String query, POS pos) {
        return entries.get(query).get(pos);
    }

}
