package ZohoArrays2;

import java.util.Arrays;
import java.util.Scanner;

public class MergeArr {
    public static int merger(int[] newArr){
        int r=0;
        //logic to remove duplicates
        for(int p=0;p<newArr.length-1;p++) {

            if (newArr[p] != newArr[p+1])   // if repeating terms found in array 3
            {
                newArr[r++]=newArr[p];
                    /* for(count=l;count<n3-1;newarr[count]=newarr[count+1],count++);   //delete repeating terms
                    n3--;                              //reduce length of array 3 by one
                    l--; */                             //j reduces by one to continue on same jth iteration
            }

        }
        newArr[r++]=newArr[newArr.length-1];
    return r;
}
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("enter the number of array1 elements");
        int n1=sc.nextInt();
        int[] arr=new int[n1];
        for(int l=0;l<n1;l++){
            arr[l]=sc.nextInt();
        }
        System.out.println("enter the number of array2 elements");
        int n2=sc.nextInt();
        int[] brr=new int[n2];
        for(int l=0;l<n2;l++){
            brr[l]=sc.nextInt();
        }
        int n3=n1+n2;
        int k=0;


        int[] newarr=new int[n3];

        for(int i=0;i<n1;i++){
            newarr[k]=arr[i];
            k++;

        }
        for(int j=0;j<n2;j++){

            newarr[k]=brr[j];
            k++;
        }

        Arrays.sort(newarr);
        //to print merged array
      /*  for(int m=0;m<n3;m++){
            System.out.println(newarr[m]);
        }*/
        System.out.println(merger(newarr));


}
}