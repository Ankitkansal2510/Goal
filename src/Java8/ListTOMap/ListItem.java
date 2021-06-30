package Java8.ListTOMap;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**This program is used to take a list and store it in a map
 *
 * We are using the existing forEach method whicch accepts a consumer functional interface
 */

public class ListItem {

    public Integer key;
    public String value;

    public ListItem(Integer key,String value){
        this.key=key;
        this.value=value;
    }

    public Integer getKey() {
        return key;
    }

    public void setKey(Integer key) {
        this.key = key;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return "ListItem{" +
                "key=" + key +
                ", value='" + value + '\'' +
                '}';
    }

    /**there are two way of converting list to map ,
 *
 * 1. we can use existing forEch method from java api , which accepts constumer functional interface
 * 2. we can write our own consumer functional interface like we did below
 */

    public interface Consumer<T>{
        void accept(T t);
    }

    public static <T> void  map(List<T> list,Consumer<T> consumer){
        for(T s:list){
            consumer.accept(s);
        }
    }

    public static void main(String[] args) {
        List<ListItem> list=new ArrayList<>();
        list.add(new ListItem(10,"Ankit"));
        list.add(new ListItem(20,"Ram"));
        list.add(new ListItem(30,"Sham"));
        Map<Integer,String> map=new HashMap<>();
        list.forEach((n)->map.put(n.getKey(),n.getValue()));
        System.out.println(map);

        Map<Integer,String> map1=new HashMap<>();
        //or
        map1=list.stream().collect(Collectors.toMap(m->m.getKey(),n->n.getValue()));
        Map<Integer,String> map2=new HashMap<>();
        //or
        map2=list.stream().collect(Collectors.toMap(ListItem::getKey,ListItem::getValue));

        System.out.println("Converting list to map by custom predicate");
        Map<Integer,String> customHashmap=new HashMap<>();
        map(list,(n)->customHashmap.put(n.getKey(),n.getValue()));
        System.out.println(customHashmap);
    }
}
