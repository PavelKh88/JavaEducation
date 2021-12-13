package com.rusin.Exercises_Part_1_8_Problem;

public class Vector3D {
   private double xCoordinate;
   private double yCoordinate;
    private double zCoordinate;

    public double getxCoordinate() {
        return xCoordinate;
    }

    public void setxCoordinate(double xCoordinate) {
        this.xCoordinate = xCoordinate;
    }

    public double getyCoordinate() {
        return yCoordinate;
    }

    public void setyCoordinate(double yCoordinate) {
        this.yCoordinate = yCoordinate;
    }

    public double getzCoordinate() {
        return zCoordinate;
    }

    public void setzCoordinate(double zCoordinate) {
        this.zCoordinate = zCoordinate;
    }

    public double lenght(){
        return Math.sqrt(xCoordinate * xCoordinate + yCoordinate * yCoordinate + zCoordinate * zCoordinate);
    }
    ////https://habr.com/ru/post/440436/  не понятно как сложение и вычитание и от куда .vek
//    public double scalarProduct(Vector vector) {
//        return x * vector.x + y * vector.y + z * vector.z;
//    }
}
