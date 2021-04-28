package pkg17;

import com.google.common.collect.ArrayListMultimap;
import com.google.common.collect.Multimap;

public class DB220 { // Dictionary220

    private enum Entry {

        BOOK("book", "A set of pages.");

        private String key;
        private String value;

        private Entry() {
        }

        private Entry(String key, String value) {
            this.key = key;
            this.value = value;
        }

        public String getKey() {
            return this.key;
        }

        public String getValue() {
            return this.value;
        }
    }

    public static void main(String[] args) {

        Multimap<String, String> dictionary = ArrayListMultimap.create();

        // Adding some key/value
        dictionary.put(DB220.Entry.BOOK.getKey(), DB220.Entry.BOOK.getValue());

        // Search
        String searchKey = "book";
        if (dictionary.containsKey(searchKey)) {
            System.out.println(searchKey + "\t <Found>");
        } else {
            System.out.println(searchKey + "\t <Not found>");
        }
    }
}

// book	 <Found>