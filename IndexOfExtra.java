package ZohoArrays2;

import java.util.Scanner;

public class IndexOfExtra {

    public static int indexOfExtraEle(int[] arr,int[] brr,int n1){
        //logic
        for(int i=0;i<n1;i++){
            if(arr[i]!=brr[i]){
               return i;

            }

        }
return n1;
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
        System.out.println("enter the number of second array elements");
        int n1 = sc.nextInt();
        int[] brr = new int[n1];
        System.out.println("enter the array elements");
        for (int i = 0; i < n1; i++) {
            brr[i] = sc.nextInt();
        }


        System.out.println(indexOfExtraEle(arr,brr,n1));
    }

}
