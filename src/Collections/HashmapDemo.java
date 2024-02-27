package Collections;

import java.sql.SQLOutput;
import java.util.HashMap;

public class HashmapDemo {
    public static void main(String[] args) {
        HashMap <Integer,String> EmpdataMap2=new HashMap();
        EmpdataMap2.put(127,"Sudheer");
        EmpdataMap2.put(1255,"Srinivas");
        System.out.println(EmpdataMap2);
        HashMap <Integer,String> EmpdataMap=new HashMap();
        EmpdataMap.putAll(EmpdataMap2);// Adds all the values to the Another hashmap
        System.out.println(EmpdataMap.size());
        EmpdataMap.put(125,"Krish");// to Add entry to the map
        EmpdataMap.put(1,"Nani");
        EmpdataMap.put(123,"Sai");
        EmpdataMap.put(12,"Reddi");
        EmpdataMap.put(1234,"Krishna");// No duplicates keys , Values can be duplicated
        EmpdataMap.put(1234,"Krishna");
        EmpdataMap.put(143,"Krishna");

        System.out.println(EmpdataMap.size());
        System.out.println(EmpdataMap);
        System.out.println(EmpdataMap.get(125));// get is used to get value of object key
        System.out.println(EmpdataMap.get(1255));

        System.out.println(EmpdataMap.get(125424322));// gives null If it Doesnt have a key value

        EmpdataMap2.remove(1255);// removing  the Object key Value pair
        System.out.println(EmpdataMap);
        System.out.println(EmpdataMap2);

        System.out.println(EmpdataMap2.containsKey(1255));
        System.out.println(EmpdataMap2.containsValue("Sudheer"));
        System.out.println(EmpdataMap2.isEmpty());
        System.out.println(EmpdataMap2.clone());
        System.out.println(EmpdataMap.keySet());
        System.out.println(EmpdataMap.values());
        System.out.println(EmpdataMap.entrySet());





    }
}
