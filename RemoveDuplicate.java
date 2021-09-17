package ZohoArrays2;

import java.util.Scanner;

public class RemoveDuplicate {
    public static int  removeDup(int[] arr,int n){
        int i=0;
        for(int j=0;j<n;j++){
            if(arr[i]!=arr[j]){
                i++;
                arr[i]=arr[j];
            }
        }
        return i+1;
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
        int size=removeDup(arr,n);
        for(int i=0;i<size;i++){
            System.out.print(arr[i]+" ");
        }

    }
}