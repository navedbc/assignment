import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class SwapNumbers {


    public static void main(String[] args) {


        String name="Hello";

        List<String> vowels= Arrays.asList("a","e","i","o","u");

       List<String> newlist= vowels.stream().filter(x->name.contains(x)).collect(Collectors.toList());

       newlist.stream().forEach(x-> System.out.println(x));



    }
}
