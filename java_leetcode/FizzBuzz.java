
import java.util.List;     // Import List interface
import java.util.ArrayList;
class Solution {
    public List<String> fizzBuzz(int n) {
        List<String> result =new ArrayList<>();
        for ( int i = 1 ; i <= n ; i++ ) {
            if ( i % 3 == 0 && i % 5 == 0) {
                result.add("FizzBuzz");
            }
            else if ( i % 3 == 0 ) {
                result.add("fizz");
            }
            else if ( i % 5 == 0) {
                result.add("Buzz");
            }
            else {
                result.add(Integer.toString(i));
            }
        }
       

        return result; // Return the populated array of strings
    }
}

public class FizzBuzz {
    public static void main(String[] args) {
        Solution s = new Solution(); // Corrected class name to Solution

        List<String> str = s.fizzBuzz(3);
        for (String element :str) {
            System.out.println(element);
        }
        
    }
}
