
import java.util.*;

public class practice {
    public static void main(String[] args) {
        Set<Integer> set = new HashSet<>(); // Creates a Set that stores unique integer values using a HashSet.


        // Adds values to the Set, but duplicate values are not allowed.
        set.add(10);
        set.add(20);
        set.add(10);

        // Printing the Set and we are also checking whether specific values exist in it.
        System.out.println(set);
        System.out.println(set.contains(10));
        System.out.println(set.contains(99));

        // checking the size
        System.out.println(set.size());

        // removing 10 from set
        set.remove(10);
        System.out.println(set);


// Takes each value from the Set one by one and prints it.
        for (int x : set) {
            System.out.println(x);
    
        }

        int[] nums = {1, 2, 3, 1};
        System.out.println(hasDuplicate(nums));
    }
    
// Create a method that returns true if a duplicate is found, otherwise false.
// Create a HashSet to store values we have already seen.
// Use a for-each loop to take each value from the array one by one.
// Check if the current value already exists in the Set using contains().
// If it exists, return true because a duplicate is found.
// Otherwise, add the current value to the Set using add().
// Repeat the process for the remaining values.
// If the loop finishes without finding a duplicate, return false.

    public static boolean hasDuplicate(int[] nums) {
        Set<Integer> seen = new HashSet<>();

        for (int x : nums) {
            if (seen.contains(x)) {
                return true;
            }
            seen.add(x);
        }

        return false;
    }
}
