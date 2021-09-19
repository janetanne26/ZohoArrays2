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
public class LocalMinima {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number of array elements");
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        for(int i=0;i<n;i++){
            if(i==0&&arr[0]<=arr[n-1]&&arr[0]<=arr[1]){
                System.out.print(arr[0]+" ");
            }
            if(i>0&&i<n-1&&arr[i]<=arr[i+1]&&arr[i]<=arr[i-1]){
                System.out.print(arr[i]+" ");
            }
            if(i==n-1&&arr[n-1]<=arr[0]&&arr[n-1]<=arr[n-2]){
                System.out.print(arr[n-1]+" ");
            }
        }
    }
    
}
