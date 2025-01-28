
class LRUCache {
    
    private static int capacity;
    private static LinkedHashMap<Integer, Integer> cache;

    
    LRUCache(int cap) {
        capacity = cap;
        cache = new LinkedHashMap<>(cap, 0.75f, true) {
            @Override
            protected boolean removeEldestEntry(Map.Entry<Integer, Integer> eldest) {
                return size() > capacity;
            }
        };
    }

    
    public static int get(int key) {
        return cache.getOrDefault(key, -1);
    }

    
    public static void put(int key, int value) {
        cache.put(key, value);
    }
}
