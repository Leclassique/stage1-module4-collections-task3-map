package com.epam.mjc.collections.map;

import java.util.HashMap;
import java.util.Map;

public class WordRepetitionMapCreator {
    public Map<String, Integer> createWordRepetitionMap(String sentence) {
        Map<String, Integer> result = new HashMap<>();
        if (!sentence.isEmpty()){
            String[] strings = sentence.split("[ ,.]+");
            for (String str : strings) {
                Integer value = result.get(str.toLowerCase());
                if (value == null) {
                    value = 0;
                }
                result.put(str.toLowerCase(), value + 1);
            }
        }
        return result;
        }
}
