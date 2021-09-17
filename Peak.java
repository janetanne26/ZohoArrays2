package ZohoArrays2;

import java.util.Scanner;

public class Peak {
    public static int findPeakElement(int[] arr) {
        int n=arr.length;
        int peak=0;
        for(int i=1;i<n;i++){
            if(arr[0]>=arr[n-1]&&arr[0]>=arr[1]){    //start element
                peak=0;

            }

            if(i<n-1&&arr[i]>=arr[i+1]&&arr[i]>=arr[i-1]){
                peak=i;                                   //middle
            }

            if(arr[n-1]>=arr[n-2]&&arr[n-1]>=arr[0]){
                peak=i;
            }

        }

        return peak;

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
        System.out.println("Peak: "+findPeakElement(arr));
    }
}
