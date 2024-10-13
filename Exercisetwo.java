import java.util.ArrayList;

public class Exercisetwo {
    public static void main(String[] args){
        ArrayList<String> list = new ArrayList<String>();

        list.add("component 1");
        list.add("component 2");
        list.add("component 3");

        for(String element : list) {
            System.out.println(element);
        }
    }
}