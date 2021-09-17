package ZohoArrays2;

import java.util.Scanner;

public class JumpGame {
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number of array elements");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("enter the array elements");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        //logic

        int farthest=0; int jump=0; int end=0;
        for(int i=0;i<n-1;i++){
            farthest=Math.max(farthest,i+arr[i]);
            if(i==end){
                jump++;
                end =farthest;
            }
        }
        System.out.println("min jump: "+jump);
    }
}