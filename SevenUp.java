package ZohoArrays2;

import java.util.Scanner;

public class SevenUp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number of array elements");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("enter the array elements");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.print(arr[0]+" ");
        for(int i=1;i<n-1;i++){
            if(arr[i]%7==0){
                System.out.print(arr[i+1]+" ");
            }
        }
    }
}