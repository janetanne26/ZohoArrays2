package ZohoArrays2;

import java.util.Scanner;

public class RunLength {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the string");
        String str=sc.next();

       String temp="";
       for(int i=0;i<str.length();i++){
           temp=temp+str.charAt(i);
           int count=1;
           while(i+1<str.length()&&str.charAt(i)==str.charAt(i+1)){
               count++;
               i++;
           }
           temp=temp+""+count;
           count=0;
       }
        System.out.println(temp);

    }
}
