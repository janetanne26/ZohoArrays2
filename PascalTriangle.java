package ZohoArrays2;

import java.util.Scanner;

public class PascalTriangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the size");
        int n=sc.nextInt();
        int prev=1;
        System.out.print(prev);
        for(int i=1;i<=n;i++){
            int curr=(prev*(n-i+1))/i;
            System.out.print(","+curr);
            prev=curr;
        }
    }
}
