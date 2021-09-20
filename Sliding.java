package basics;

import java.util.Scanner;

public class Sliding {
    public static void main(String[] args) {
        Scanner sc1=new Scanner(System.in);
        System.out.println("enter the number of array elements");
        int n=sc1.nextInt();
        int[] arr=new int[n];
        System.out.println("enter the elements");
        for(int i=0;i<n;i++){
            arr[i]= sc1.nextInt();
        }
        int temp=0;
        System.out.println("enter the window sliding size");
        int k=sc1.nextInt();

        int max;
            for(int i=0,j=k-1;j<n;i++,j++){

                    int m=i;
                    max=arr[m];
                    for(m=i+1;m<=j;m++){
                        if(max<arr[m]){
                            max=arr[m];
                        }
                    }
                    System.out.print(max+" ");
                }






    }

}
