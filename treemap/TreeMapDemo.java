//when you enter element in a tree map will sort the in a needed folder
import java.util.TreeMap;
public class TreeMapDemo {
    public static void main(String[] args) {
        TreeMap<Integer, String> treeMap = new TreeMap<>();

        treeMap.put(3, "A");
        treeMap.put(2, "B");
        treeMap.put(1, "C");

        System.out.println(treeMap);

        TreeMap<String, Integer> treestring = new TreeMap<>();
        treestring.put("C", 1);
        treestring.put("B", 2);
        treestring.put("A", 0);

        System.out.println(treestring);

    }
}