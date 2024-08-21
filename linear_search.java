//non method
import java.util.Scanner;
import static java.lang.System.*;
class linear_search{
    public static void main(String[]args){
    Scanner scan = new Scanner(System.in);
    out.println("\ninsert integer of choice :");
    int value = scan.nextInt();

    //initializing array
    int values[] = new int[5];

    // creating an array
    for (int i = 0;i<values.length;i++){
        out.println("insert value values for dataset :");
        values[i] = scan.nextInt();
    }
//linear search
         int v = 0;
         for (int j = 0;j < values.length;j++){
            if (value == values[j]){
                out.println("found value "+ value +" at index " + j);
                v = values[j];//stores matched value
            }}
            //checks whether any value matched
            if (v != value){
                out.println(-1);
            } else {
                out.println(":)");
            }

     
    
        
    }
}