//
class Coded {
    
    public void sort(int x[]){
        for (int k = 0; k < x.length - 1; k++) {
            for (int i = 0; i < x.length-1; i++) {
                if (x[i] > x[i + 1]) {
                   int temp = x[i];
                    x[i] = x[i + 1];
                    x[i + 1] = temp;
                    
                }
            }
            
        }
   //iterating elements of  array
        for (int i : x) {
            System.out.println("\n"+i); 
        }
         

    
   }

    
}

public class bubble_sort {
    
    public static void main(String[] args) {
        Coded code = new Coded();
        //testing
       int values[] = {19,5,6,4,2,9,0};
         code.sort(values);
        
      
    }}
