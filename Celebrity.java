package ZohoArrays2;

import java.util.Scanner;

public class Celebrity {
    public static int celebrity(int[][] arr,int row){
        //logic
        int a=0;
        int b=row-1;
        // move till a<b
        while(a<b){
            if(arr[a][b]==1){
                a++;
            }
            else{
                b--;
            }
        }

        for(int i=0;i<row;i++){
            if(i!=a&&(arr[a][i]==1||arr[i][a]==0)){
                return -1;
            }
        }
        return a;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("enter the row size");
        int row = sc.nextInt();
        System.out.println("enter the column size");
        int col = sc.nextInt();
        int[][] arr = new int[row][col];
        System.out.println("enter the elements");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        System.out.println(celebrity(arr,row));

    }
}