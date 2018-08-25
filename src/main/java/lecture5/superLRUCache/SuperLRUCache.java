package lecture5.superLRUCache;

import java.util.LinkedHashMap;
import java.util.Map;


public class SuperLRUCache<K, V> extends LinkedHashMap<K, V> {
    private static int capacity = 100;

    SuperLRUCache() {
        super(capacity, 1, true);
    }

    @Override
    protected boolean removeEldestEntry(Map.Entry<K, V> eldest) {
        return size() > capacity;
    }
}
