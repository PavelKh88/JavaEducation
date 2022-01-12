package com.rusin.Exercises_Part_1_17;

public class Vector3D {

    private double x ;
    private double y;
    private double z;

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    public double getZ() {
        return z;
    }

    public void setZ(double z) {
        this.z = z;
    }

    public Vector3D(double x, double y, double z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public Vector3D add(Vector3D vector) {
        return new Vector3D(this.x + vector.x,this.y + vector.y, this.z + vector.z);
    }

    public Vector3D subtraction(Vector3D v2) {
        return new Vector3D(this.x - v2.x,this.y - v2.y, this.z - v2.z);
    }

    public double length() {
        return Math.sqrt( (x * x) + (y * y) + (z * z) );
    }

    @Override
    public String toString() {
        return "Vector3D{" +
                "x=" + x +
                ", y=" + y +
                ", z=" + z +
                '}';
    }
}
