package com.rusin;
import java.util.Scanner;
public class chislocase {
//exersice 24
    public static void main(String[] args)
            throws java.io.IOException{

        System.out.println("Enter the noumber:");
        Scanner scanner=new Scanner(System.in);
        int a=scanner.nextInt();
        int result=a%2;


        switch (result){
            case 0:
                System.out.println("number even");
              break;
            case 1:
                System.out.println("number not even");
                break;


        }




    }

}
