package ZohoArrays2;

import java.util.Scanner;

public class SearchInsert {
    public static int searchInsert(int[] arr, int target) {
        int n=arr.length;
        int ind=0;
        for(int i=0;i<n;i++){
            if(arr[i]==target){
                ind=i;
            }
            if(i>0&&i<n&&arr[i]!=target&&arr[i]>target&&target>arr[i-1]){
                ind=i;
            }

            if(i==0&&arr[i]!=target&&target<arr[i]){
                ind=i;
            }

            if(i==n-1&&arr[n-1]!=target&&target>arr[n-1]){
                ind=n;
            }
        }
        return ind;
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
        System.out.println("enter the target");
        int target=sc.nextInt();
        System.out.println(searchInsert(arr,target));
    }
}