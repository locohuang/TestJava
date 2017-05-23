package collection;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by Administrator on 2017-5-23.
 */
public class TestSet {
    public static void main(String[] args) {
        Set<Integer> hashSet1 = new HashSet<>();
        hashSet1.add(3);
        hashSet1.add(6);
        hashSet1.add(2);
        hashSet1.add(1);
        hashSet1.add(4);
        hashSet1.add(2);
        Set<String> hashSet2 = new HashSet<>();
        hashSet2.add("a");
        hashSet2.add("a");
        hashSet2.add("bc");
        hashSet2.add("ba");
        hashSet2.add("bd");
        hashSet2.add("e");
        Student s1 = new Student("zhang",21);
        Student s2 = new Student("wang",18);
        Student s3 = new Student("li",20);
        Student s4 = new Student("zhao",19);
        Student s5 = new Student("wang",18);
        Set<Student> hashSet3 = new HashSet<>();
        hashSet3.add(s1);
        hashSet3.add(s2);
        hashSet3.add(s3);
        hashSet3.add(s4);
        hashSet3.add(s5);
        System.out.println(hashSet1);
        System.out.println(hashSet2);
        System.out.println(hashSet3);
    }
}
