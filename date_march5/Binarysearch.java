import java.util.Scanner;

public class Binarysearch {
    public static int binary(int[] arr, int n, int l, int r) {
        while (l <= r) { 
            int m = l + (r - l) / 2;  

            if (arr[m] == n) {
                return m;
            } 
            else if (n < arr[m]) {
                return binary(arr, n, l, m - 1);  
            } 
            else {
                return binary(arr, n, m + 1, r);  
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int arr[] = {1, 2, 34, 44, 56, 67, 134, 178};
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the target:");
        int n = sc.nextInt();
        int l = 0, r = arr.length - 1;
        
        int result = binary(arr, n, l, r);

        if (result == -1) {
            System.out.print("Element does not exist");
        } else {
            System.out.print("Element found at index: " + result);
        }
        sc.close();
    }
}

