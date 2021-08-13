import java.util.HashSet;
import java.util.Set;

public class RepeatTest {
    public static void main(String args[]){
        int arr[] = {1,2,3,4,2};
        printDuplicate(arr);

    }
    private static void printDuplicate(int[] arr){
        int min =-1;
        Set<Integer> data = new HashSet<Integer>();
        for(int i=arr.length-1; i>=0; i--){
            if(data.contains(arr[i])){
                min = i;
            }else{
                data.add(arr[i]);
            }
        }
        if(min !=-1){
            System.out.println("Repeated integers are "+arr[min]);
        }else{
            System.out.println("No Repeated Integers Found");
        }
    }
}