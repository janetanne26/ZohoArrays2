/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zohoarrays;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class SubArraySum {
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number of array elements");
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("enter the sum");
        int sum=sc.nextInt();
        int left=0;
        int right=0;
        int startind=0;
        int endind=0;
        int temp=0;
     for(int i=0;i<n;i++){
       temp=temp+arr[i];
       if(temp<sum){
           right++;
       }
       if(temp>sum){
           left++;
           temp=temp-left;
       }
       if(temp==sum){
          endind=right+1;
          startind=left+1;
       }
     }
        System.out.println("positions are"+startind+" "+endind);
    
}
}
