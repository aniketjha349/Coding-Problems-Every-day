import java.util.Scanner;

class DiamondPattern {
    public static void diamondpattern(int n) {
        int i, j;
        
        for (i = 0; i < n; i++) {
            for (j = 0; j < n - i - 1; j++) {
                System.out.print(" ");
            }
            for (j = 0; j <= i; j++) {
                System.out.print(" *");
            }
            System.out.println();
        }
        
        for (i = n - 2; i >= 0; i--) {
            for (j = 0; j < n - i - 1; j++) {
                System.out.print(" ");
            }
            for (j = 0; j <= i; j++) {
                System.out.print(" *");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        diamondpattern(n);
        sc.close();
    }
}
