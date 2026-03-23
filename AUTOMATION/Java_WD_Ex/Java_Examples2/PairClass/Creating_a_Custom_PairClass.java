package PairClass;

class Pair<K, V> {
    private K key;
    private V value;

    // Constructor
    public Pair(K key, V value) {
        this.key = key;
        this.value = value;
    }

    // Getters
    public K getKey() {
        return key;
    }

    public V getValue() {
        return value;
    }

    // Setters (optional)
    public void setKey(K key) {
        this.key = key;
    }

    public void setValue(V value) {
        this.value = value;
    }

    // toString()
    @Override
    public String toString() {
        return key + " = " + value;
    }
}

public class Creating_a_Custom_PairClass {
	public static void main(String[] args) {
        Pair<Integer, String> p1 = new Pair<>(1, "Apple");
        Pair<String, Double> p2 = new Pair<>("Price", 99.99);

        System.out.println(p1);
        System.out.println(p2);
    }
}
