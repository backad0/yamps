package Idz1SecondCource.Num16;

import Idz1SecondCource.Num15.Point3D;

import static java.lang.Math.sqrt;

public class Vector3D {
    private double x, y, z;

    public Vector3D(double x, double y, double z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public Vector3D() {
        x = 0;
        y = 0;
        z = 0;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public double getZ() {
        return z;
    }

    public Vector3D(Point3D a1, Point3D a2) {
        x = a2.getX() - a1.getX();
        y = a2.getY() - a1.getY();
        z = a2.getZ() - a1.getZ();
    }

    public double getLength() {
        double res;
        res = sqrt(x * x + y * y + z * z);
        return res;
    }

    public static boolean getEquality(Vector3D v1, Vector3D v2) {
        boolean res = true;
        double var1 = v1.getX()/v2.getX(), var2 = v1.getY()/v2.getY(), var3 = v1.getZ()/v2.getZ();
        if (((var1 != var2) || (var1 != var3) || (var2 != var3)) && (var1<=0)) res = false;
        return res;
    }
    public void show(){
        System.out.printf("x = %.2f, y = %.2f, z = %.2f\n",x,y,z);
    }
}
