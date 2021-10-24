package com.rusin.loops;
// 1
//  2
//   3
//    4
//     5
//      6
//       7
//        8
//         9
public class Exercise28While_3 {
    public static void main(String[] args) {
        int a = 1;
        int b = 1;
        int count = 1;
        while (a <= 9){
            while(b <= 9){
                if(count == b && count == a){
                System.out.print(" " + a);}
                else{
                    System.out.print(" ");
                }
                b++;
            }
            System.out.println();
            a++;b = 1;count++;
        }
    }
}
