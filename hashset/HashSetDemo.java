import java.util.*;
//hashset is the class that stores values in hashtable
public class HashSetDemo{
    public static void main(String[] args) {
        HashSet<String> hashSet = new HashSet<>();

        hashSet.add("A");
        hashSet.add("B");
        hashSet.add("C");
        hashSet.add("C");

        System.out.println(hashSet);

        System.out.println("Set contains C or not? " + hashSet.contains("C"));
//
       hashSet.remove("A");
       System.out.println("Set after removing A: " + hashSet);

       for(String item: hashSet){
           System.out.println(item);
       }
    }
    
}