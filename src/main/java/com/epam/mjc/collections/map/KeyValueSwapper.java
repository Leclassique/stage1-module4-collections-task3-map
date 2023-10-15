package com.epam.mjc.collections.map;

import java.util.HashMap;
import java.util.Map;

public class KeyValueSwapper {
    public Map<String, Integer> swap(Map<Integer, String> sourceMap) {
        Map<String, Integer> result = new HashMap<>();
        for (Map.Entry<Integer, String> e : sourceMap.entrySet()) {
            Integer newValue = e.getKey();
            String newKey = e.getValue();
        if (result.get(newKey) == null){
            result.put(newKey, newValue);
        }else {
            Integer value = result.get(newKey);
            if (value < newValue){
                break;
            }else {
                result.put(newKey, newValue);
            }
        }
    }
        return result;
}
}