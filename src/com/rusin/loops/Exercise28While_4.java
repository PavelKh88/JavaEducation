package com.rusin.loops;
//         1
//        2
//       3
//      4
//     5
//    6
//   7
//  8
// 9
public class Exercise28While_4 {
    public static void main(String[] args) {
        int a = 1;
        int b = 9;
        int count = 1;
        while(a <= 9){
            while(b >= 1){
                if(count == b){
                    System.out.print(" "+ b);
                }
                else{
                    System.out.print(" ");
                }
                b-- ;
            }
            System.out.println();
            a++;b = 9;count++;
        }
    }
}
