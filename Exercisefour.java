import java.util.HashMap;
public class Exercisefour {
    public static void main(String[] args){
        HashMap<String, String> map = new HashMap<String, String>();

        map.put("Key1", "Value1");
        map.put("key2", "Value2");

        for(String key : map.keySet()){

            System.out.println("Key:" + key +",Value:" + map.get(key));
        }
    }
}