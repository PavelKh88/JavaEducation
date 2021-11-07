package com.rusin.array;

public class Exercise61 {
    public static void main(String[] args) {
        int[] array1 = new int[] {9 , 8 , 7 , 6 , 5};
        int[] array2 = new int[] {9 , 8 , 7 , 6 , 4};
        int[] array3 = new int[] {9 , 8 , 7 , 6 , 5};
      //array1 -array2
       int a = 0;
       if(array1.length != array2.length) a = 1;
       if(array1.length == array2.length){
           for (int i = 0; i < array1.length; i++) {
               if (array1[i] == array2[i]) a = 2;
           }
           for (int i = 0; i < array1.length; i++) {
               if(array1[i] != array2[i]) a = 3;
           }
       }
       switch (a) {
           case (1):
               System.out.println("Identity array1 - array2");
               System.out.println("false Size array not identity");
               break;
           case (2):
               System.out.println("Identity array1 - array2");
               System.out.println("true ");
               break;
           case (3):
               System.out.println("Identity array1 - array2");
               System.out.println("false Avariable array not identity");
               break;

       }
       //array2 -array3
         a = 0;
        if(array2.length != array3.length) a = 1;
        if(array2.length == array3.length){
            for (int i = 0; i < array2.length; i++) {
                if (array2[i] == array3[i]) a = 2;
            }
            for (int i = 0; i < array2.length; i++) {
                if(array2[i] != array3[i]) a = 3;
            }
        }
        switch (a) {
            case (1):
                System.out.println("Identity array2 - array3");
                System.out.println("false Size array not identity");
                break;
            case (2):
                System.out.println("Identity array2 - array3");
                System.out.println("true ");
                break;
            case (3):
                System.out.println("Identity array2 - array3");
                System.out.println("false Avariable array not identity");
                break;

        }
        //array3 -array1
        a = 0;
        if(array1.length != array3.length) a = 1;
        if(array1.length == array3.length){
            for (int i = 0; i < array1.length; i++) {
                if (array1[i] == array3[i]) a = 2;
            }
            for (int i = 0; i < array1.length; i++) {
                if(array1[i] != array3[i]) a = 3;
            }
        }
        switch (a) {
            case (1):
                System.out.println("Identity array1 - array3");
                System.out.println("false Size array not identity");
                break;
            case (2):
                System.out.println("Identity array1 - array3");
                System.out.println("true ");
                break;
            case (3):
                System.out.println("Identity array1 - array3");
                System.out.println("false Avariable array not identity");
                break;

        }




    }
}
