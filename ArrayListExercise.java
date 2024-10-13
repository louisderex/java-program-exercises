import java.util.ArrayList;

public class ArrayListExercise {
    public static void main(String[] args) {
      ArrayList<String>list=new ArrayList<>();
      
      list.add("purple");
      list.add("blue");
      list.add("white");

      System.out.println("First element:" + list.get(0));

      list.remove("purple");

      System.out.println("ArrayList:" + list);
    }
}