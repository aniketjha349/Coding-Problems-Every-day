import java.util.Scanner;

public class TrianglePattern {
    public static void numberTriangle(int n) {
        for (int i = 0; i < n; i++) {
            
            for (int j = 0; j < n - i - 1; j++) {
                System.out.print(" ");  
            }
            
            
            for (int j = 0; j <= i; j++) {
                System.out.print((j + 1) + " ");  
            }

            
            System.out.println();
        }
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();  
        numberTriangle(n);    
        sc.close();
    }
}

