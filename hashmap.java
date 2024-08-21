import java.util.HashMap;

public class hashmap {
    public static void main(String[] args) {
        HashMap <String,Integer> records = new HashMap<>();
          records.put("mon",200);
          records.put("tue",300);
          records.put("wen",3508);
          System.out.println("");
          System.out.print(records.toString());
          System.out.println("\n"+records.values());
          System.out.println("\n the amount recorded on monday is $"+records.get("mon") );
    }
    
}
