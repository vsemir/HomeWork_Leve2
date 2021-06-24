package Lesson3;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class Phonebook {

    private Map<String, HashSet<String>> map;

    public Phonebook() {
        this.map = new HashMap<>();
    }

    void add(String name, String number){
        HashSet<String> numbers;
        if (map.containsKey(name)) {
            numbers = map.get(name);
        } else {
            numbers = new HashSet<>();
        }
        numbers.add(number);
        map.put(name, numbers);
        numbers.add(number);
        map.put(name, numbers);
    }

    String get(String name) {
        return name + " " + map.get(name);
    }

}
