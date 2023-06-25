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
        }
        // creating an entry set
        Set<Map.Entry<String, Integer>> data1 = student.entrySet();
        for (Map.Entry<String, Integer> i : data1) {
            System.out.println(i.getKey() + "  " + i.getValue());
        }
    }
}
