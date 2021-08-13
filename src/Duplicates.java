import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class Duplicates {


    private  static String reverseString(String str){
        if (str.isEmpty())
            return str;
        //Calling Function Recursively
        return reverseString(str.substring(1)) + str.charAt(0);

    }

    private static Optional<String> getName(){
        String name="naved";

        Optional<String> nameoptional=Optional.ofNullable(name);
        return nameoptional;
    }

    public static void main(String[] args) {



        String name="navedalukhan";


        char[] ch=new char[name.length()];

        for(int i=0;i<name.length();i++){
            ch[i]=name.charAt(i);

        }

        HashMap<Character,Integer> mymap=new HashMap<Character, Integer>();

        for(int i=0;i<ch.length;i++){
            if(!mymap.containsKey(ch[i])){
                mymap.put(ch[i],1);
            } else {
                Integer val=mymap.get(ch[i]);
                val++;
                mymap.put(ch[i],val);

            }
        }

        mymap.entrySet().stream().forEach(c->System.out.println("char  is "+c.getKey()+"count is "+c.getValue()));








    }
}
