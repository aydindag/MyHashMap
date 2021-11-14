import java.util.Arrays;

public class MyHashMap<K, V> {
    Object[] keys = new Object[0];
    Object[] values = new Object[0];

    public MyHashMap() {

    }

    public void put(K key, V value) {
        keys = Arrays.copyOf(keys, keys.length + 1);
        values= Arrays.copyOf(values, values.length + 1);
        keys[keys.length-1] = key;
        values[values.length - 1] = value;
    }

    public void remove(K key) {
        int index = getIndex(key);
        if (index != -1) {
            Object[] tempKeys = keys;
            Object[] tempValues = values;
            keys = new Object[keys.length - 1];
            values = new Object[values.length - 1];
            int count = 0;
            for (int i = 0; i < tempKeys.length; i++) {
                if (i == index) {
                    continue;
                }
                keys[count] = tempKeys[i];
                values[count] = tempValues[i];
                count++;
            }

        } else {
            System.out.println("Key bulunamadı");
        }
    }

    public Object get(K key) {
        int index = getIndex(key);
        if (index != -1) {
            return values[index];
        }
        System.out.println("Key bulunamadı");
        return null;
    }

    private int getIndex(K value) {
        int index = -1;
        for (int i = 0; i < keys.length; i++) {
            if (value == keys[i]) {
                return i;
            }
        }
        return index;
    }

    public void list() {
        for (int i = 0; i < keys.length; i++) {
            System.out.println(keys[i] + "=" + values[i] + " ");
        }
    }

    public int size() {
        return keys.length;
    }

    public void clear() {
        keys = new Object[0];
        values = new Object[0];
    }


    public Object[] values() {
        return values;
    }


}