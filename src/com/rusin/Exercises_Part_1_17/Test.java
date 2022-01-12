package com.rusin.Exercises_Part_1_17;

public class Test {
    public static void main(String[] args) {
        Vector3D v1 = new Vector3D(2, 3, 4);
        Vector3D v3 = new Vector3D(1, 1, 1);
        Vector3D resultSum = v1.add(v3);
        System.out.println(resultSum);
        Vector3D resultSub = v1.subtraction(v3);
        System.out.println(resultSub);
        System.out.println(v1.length());
    }
}
