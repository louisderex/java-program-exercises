import java.util.HashSet;

public class Exercisethree {
    public static void main(String[] args){
        HashSet<String> set = new HashSet<String>();

        set.add("Element1");
        set.add("Element2");

        boolean isAdded = set.add("Element1");

        if(!isAdded){
            System.out.println("Duplicate Element not added");
        }

        for(String element : set){

            System.out.println(element);

        }


    }
}