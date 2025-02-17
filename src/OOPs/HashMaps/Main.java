package OOPs.HashMaps;

import java.util.HashMap;

public class Main {
    // HashMap - stores key value pairs , key is unique,
    // value can be duplicated , does not maintain any order
    // but memory efficient
    // HashMap<Key,value>
    public static void main(String[] args) {
        HashMap<String,Double> hashMap = new HashMap<>();
        hashMap.put("A",1.0);
        hashMap.put("B",2.0);
        hashMap.put("C",3.0);
        hashMap.put("A",4.0); //key-value override

        // hashMap.remove("C");

        System.out.println(hashMap.values()); // . keyset() for keys
        System.out.println(hashMap.containsKey("B"));
        System.out.println(hashMap.containsValue(4.0));
        System.out.println(hashMap.keySet());
        System.out.println(hashMap.get("A")); // last overRidden value

        System.out.println(hashMap.size());

        for(String key :hashMap.keySet()){
            System.out.println(key + " : " + hashMap.get(key));
        }



    }
}
