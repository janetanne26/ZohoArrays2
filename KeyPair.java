package ZohoArrays2;

import java.util.Arrays;
import java.util.Scanner;

public class KeyPair {

    public static boolean hasArrayTwoCandidates(int arr[], int n, int x) {
        // code here

        Arrays.sort(arr);
        int l=0;
        int r=n-1;
        while(l<r){
            if(arr[l]+arr[r]==x){
                return true;
            }
            else if(arr[l]+arr[r]<x){
                l++;
            }
            else{
                r--;
            }

        }
        return false;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number of array elements");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("enter the array elements");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("enter the sum");
        int sum=sc.nextInt();
        boolean b=hasArrayTwoCandidates(arr,n,sum);
        if(b){
            System.out.println("yes");
        }
        else{
            System.out.println("false");
        }

    }
}
