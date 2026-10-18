import java.util.*;

public class practice {
    public static void main(String[] args) {
        Map <String, Integer> ages = new HashMap<>();
        ages.put("ali",20);
        ages.put("sara",25);
        ages.put("ali",30);

        System.out.println(ages);
        System.out.println(ages.containsKey("ali"));
        System.out.println(ages.size());
    }
}
