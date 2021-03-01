package task3;

import java.util.HashMap;
import java.util.Map;

public class MyDictionary <TKey, TValue> {
    Map<TKey, TValue> dictionary = new HashMap<>();

    public Map<TKey, TValue> getDictionary() {
        return dictionary;
    }

    public void add(TKey key, TValue value) {
        dictionary.put(key, value);
    }

    public TValue indexOfMeth(TKey key) {
        return dictionary.get(key);
    }

    public int counter () {
        return dictionary.size();
    }
}

