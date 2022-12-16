package collections;

import java.util.Comparator;
import java.util.HashMap;
import java.util.TreeSet;

public class HashMapTest {

    public static void main(String[] args) {
        HashMap<Person,Integer> m = new HashMap<>();

        System.out.println(new Person(12,"test"));
        System.out.println(new Person(12,"test"));
        System.out.println(new Person(12,"test"));
        m.put(new Person(12,"test"),23);
        m.put(new Person(12,"test"),23);

        System.out.println( m.get(new Person(12,"test")));

        TreeSet <Person> p = new TreeSet<>(new MyComparator());
        p.add(new Person(12,"test"));
        p.add(new Person(13,"test"));
        p.add(new Person(11,"test"));
        p.add(new Person(14,"test"));
        p.add(new Person(12,"test"));
        p.add(new Person(12,"test"));
        System.out.println();
    }
}

class MyComparator implements Comparator<Person> {

    @Override
    public int compare(Person o1, Person o2) {
        int i=0;
        if(o1.age>o2.age){
            i=1;
        }
        if(o1.age<o2.age) {
            i = -1;
        }
        return i;
    }
}
