import java.util.Arrays;

public class BubbleSort {


    public static void main(String[] args) {
        int[] myarray={10,23,45,62,2};

        int jtemp;
        int itemp;

   boolean swap=false;
        for(int i=0;i<myarray.length;i++){
             for(int j=0;j<myarray.length-1;j++){
                if(myarray[j]>myarray[j+1]){
                   jtemp= myarray[j+1];
                    myarray[j]=myarray[j+1];
                    myarray[j+1]=jtemp;

                }
            }
         }

       Arrays.stream(myarray).forEach(x-> System.out.println(x));
    }
}
