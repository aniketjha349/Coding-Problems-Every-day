
import java.util.Arrays;

class SortMethodArray{
    public static void main(String[] args){
        int arr[] = {1,22,3,22,8585,43,222,22,200,24322,35435,6,5444};
        Arrays.sort(arr);
        System.out.println("The sorted array is :");
        for (int num :arr){
        System.out.print(num + " ");
        }


    }
}