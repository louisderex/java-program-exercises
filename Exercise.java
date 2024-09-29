import java.util.Arrays;
import java.util.Collections;
public class Exercise {
    public static void main(String[] args){
     Integer[] numbers = {5, 3, 8, 1, 2};
     //sort numbers in descending order
     Arrays.sort(numbers, Collections.reverseOrder());  
     System.out.println("Array elements in descending order: " + Arrays.toString(numbers));
 }
}