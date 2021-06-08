package Comparable;

import java.time.temporal.ValueRange;
import java.util.*;

public class HashMapSortValue {

    public static void main(String[] args) {
        Map<String,Integer> map=new HashMap<>();
        map.put("A",2);
        map.put("C",3);
        map.put("B",1);
        map.put("D",24);

        sortMapByValue(map);

    }

    private static void sortMapByValue(Map<String, Integer> map) {

        List<Map.Entry<String,Integer>> list=new ArrayList<>(map.entrySet());
        Collections.sort(list, new Comparator<Map.Entry<String, Integer>>() {
            @Override
                public int compare(Map.Entry<String, Integer> o1, Map.Entry<String, Integer> o2) {
                return (o1.getValue()).compareTo(o2.getValue());
            }
        });

        Map<String, Integer> sortedMap=new LinkedHashMap<>();
      for(Map.Entry<String,Integer> m:list){
          sortedMap.put(m.getKey(),m.getValue());
      }
        for(Map.Entry<String,Integer> m:sortedMap.entrySet()){
            System.out.println(String.format("%s %s",m.getKey(),m.getValue()));
        }
    }
}
