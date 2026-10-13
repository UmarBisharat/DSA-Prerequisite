public class practice {
    public static void main(String[] args) {
        int[] nums = {2,4,6,8}; // array syntax
        System.out.println(nums[0]);  // printing first index
        System.out.println(nums.length); // printing whole array
        nums[0] = 10; // updating index element
        System.out.println(nums[0]); // printing the updated element on index 0

//*********************** printing using loop and index ***********************

        for(int i = 0; i < nums.length;i++){ 
            System.out.println(nums[i]);
        }

//*********************** printing using loop and without index ***********************

for(int x : nums){
    System.out.println(x);
}

//*********************** printing using Nested loop and index ***********************

for(int i = 0; i < nums.length; i++){
    for( int j = i+1; j < nums.length ; j++){
        System.out.println(i + " " + j);
    }
}

// The outer loop runs first, then the inner loop starts.
// The inner loop starts from the next index (i + 1).
// After the inner loop finishes, the outer loop moves to the next index.

    }
}
