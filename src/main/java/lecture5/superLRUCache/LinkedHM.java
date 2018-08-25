package lecture5.superLRUCache;

public class LinkedHM {
    public static void main(String[] args) {
        SuperLRUCache<Integer, String> superLRUCache = new SuperLRUCache<>();
        superLRUCache.put(5, "e");
        superLRUCache.put(4, "d");
        superLRUCache.put(3, "c");
        superLRUCache.put(2, "b");
        superLRUCache.put(1, "a");

        System.out.println(superLRUCache);

        superLRUCache.get(3);
        superLRUCache.get(5);
        superLRUCache.get(1);

        System.out.println(superLRUCache);

        superLRUCache.put(6, "f");

        System.out.println(superLRUCache);


    }
}
