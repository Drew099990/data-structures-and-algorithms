//non method
import java.util.Scanner;
import  static java.lang.System.*;

public class binary_search {
    public static void main(String[] args) {
     Scanner scan = new Scanner(System.in);
     out.println("please insert your integer of choice :");
     int num = scan.nextInt();
     
     //creating array
     int list [] = new int[5];
     for (int i = 0;i < list.length;i++){
      out.println("insert value for dataset :");
      list[i] = scan.nextInt();
     }
     //binary search 
    for (int j = 0;j < 1;j++){
        int min = 0;
        int max  = list.length;
        int mid = (max + min)/2;
        int number = 0;
        for (int k = 0;k < list.length;k++){
            if (num == list[k]){
                out.println("value "+ num + " found at index "+ k );
                number = num;
            }
            else{
                if (num > mid){
                    min = mid;
                    mid = (max + min)/2;
                }else{
                    max = mid;
                    mid = (max + min)/2;
                }

            }//end of if
        }
        
        if (num !=number )
        out.print("does not exist");
    }
    


    }
    
}
