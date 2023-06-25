import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Hash {
    public static void main(String[] args) {
        HashMap<String, Integer> student = new HashMap<>();
        student.put("Arya", 3);
        student.put("Avik", 2);
        student.put("Akash", 6);

        Set<String> data = student.keySet();
        // for each loop
        for (String i : data) {
            System.out.println(student.get(i));
            System.out.println(i.hashCode());
            System.out.println(i.hashCode()%10);
        }
        // creating an entry set
        Set<Map.Entry<String, Integer>> data1 = student.entrySet();
        for (Map.Entry<String, Integer> i : data1) {
            System.out.println(i.getKey() + "  " + i.getValue());
        }
        System.out.println();
        //we can always generate hashcode without hashmap or hashtable
        String x = "hello";
        System.out.println(x.hashCode());
    }
}
