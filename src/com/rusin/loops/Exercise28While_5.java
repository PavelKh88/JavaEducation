package com.rusin.loops;
// 9
//  8
//   7
//    6
//     5
//      4
//       3
//        2
//         1
public class Exercise28While_5 {
    public static void main(String[] args) {
        int a = 1;
        int b = 9;
        int count = 9;
        while(a <= 9){
            while(b >= 1){
               if(b == count){ System.out.print(count);}
               else{
                   System.out.print(" ");
               }
                b--;
            }
            System.out.println();
            a++;count--;b = 9;
        }
    }
}
