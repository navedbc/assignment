import java.util.Arrays;

public class ArrayReverse {

    public String[] reverse(String [] array){

        if(array == null || array.length <= 1){
            System.out.println(" array is invalid.");
        }
        for (int i = 0; i < array.length / 2; i++) {
            String temp = array[i];
            array[i] = array[array.length - 1 - i];
            array[array.length - 1 - i] = temp;
        }
        return array;
    }

    public static void main(String[] args){
        ArrayReverse arrayReverse = new ArrayReverse();
        String[] input = {"h","e","l","l","o"};
        System.out.println("Original array" + Arrays.toString(input));
        System.out.println("Reversed array" + Arrays.toString(arrayReverse.reverse(input)));
    }
}
