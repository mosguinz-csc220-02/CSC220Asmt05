package assignment04PartBAndC;

import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableListMultimap;
import com.google.common.collect.Maps;
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
        return entries.subMap(query, true, query, true).firstEntry();
    }

    public Entry<String, ImmutableList<String>> lookup(String query, POS pos) {
        Entry<String, ImmutableListMultimap<POS, String>> def = lookup(query);
        ImmutableList<String> v = def.getValue().get(pos);
        return (def == null || v.size() == 0) ? null
                : Maps.immutableEntry(def.getKey(), def.getValue().get(pos));
    }

}
