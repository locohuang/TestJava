package collection;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * Created by Administrator on 2017-5-26.
 */
public class TestMap {
    public static void main(String[] args) {
        Map<String,String> map = new HashMap<>();
        map.put("a","1");
        map.put("b","2");
        map.put("c","3");
        map.put("d","4");

        System.out.println(map);
        System.out.println(map.get("b"));
        System.out.println(map.containsKey("f"));
        System.out.println(map.containsValue("3"));

        Set<String> keySet = map.keySet();
        System.out.println(keySet);

        Collection<String> collection = map.values();
        System.out.println(collection);

        Set<Map.Entry<String,String>>  entries =  map.entrySet();
        System.out.println(entries);

        Student s1 = new Student("1001","li",20);
        Student s2 = new Student("1002","zhang",21);
        Student s3 = new Student("1003","wang",22);
        Map<String, Student> studentMap = new HashMap<>();
        studentMap.put(s1.getNo(),s1);
        studentMap.put(s2.getNo(),s2);
        studentMap.put(s3.getNo(),s3);
        System.out.println(studentMap);

    }
}
