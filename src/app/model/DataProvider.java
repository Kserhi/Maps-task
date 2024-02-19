package app.model;

import app.entitis.ProductEntiti;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class DataProvider {
    public Map<Integer, ProductEntiti> getData() {
        Map<Integer, ProductEntiti> map = new HashMap<>();
        map.put(1, new ProductEntiti("banana", 100, 2));
        map.put(224, new ProductEntiti("apple", 20, 20));
        map.put(443, new ProductEntiti("milk", 200, 5));
        map.put(432, new ProductEntiti("viski", 1000, 1));
        return map;
    }

    public ProductEntiti getItemByKey(Map<Integer, ProductEntiti> map, Integer key) {
        return map.get(key);
    }
}
