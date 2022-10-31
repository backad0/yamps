package Idz1SecondCource.Num18;

import Idz1SecondCource.Num16.Vector3D;
import Idz1SecondCource.Num15.Point3D;
import static Idz1SecondCource.Num16.Vector3D.getEquality;
import static Idz1SecondCource.Num17.Vector3DProcessor.vectorProcessor_getSum;

public class Vector3DArray {
    private Vector3D[] arr;

    public Vector3DArray(int size) {
        arr = new Vector3D[size];
        for (int i = 0; i <= size - 1; i++) {
            arr[i] = new Vector3D();
        }
    }

    public int getSize() {
        return arr.length;
    }

    public void setI(Vector3D vector, int n) {
        arr[n] = vector;
    }

    public void show() {
        for (int i = 0; i <= arr.length - 1; i++) {
            arr[i].show();
        }
    }

    public void showI(int n) {
        arr[n].show();
    }

    public double getMaxLength() {
        double max = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].getLength() > max) {
                max = arr[i].getLength();
            }
        }
        return max;
    }

    public int getVectorIndex(Vector3D vector) {
        for (int i = 0; i < arr.length; i++) {
            if (getEquality(arr[i], vector)) {
                return i;
            }
        }
        return -1;
    }

    public Vector3D getArrSum() {
        Vector3D res = arr[0];
        for (int i = 1; i < arr.length; i++) res = vectorProcessor_getSum(res, arr[i]);
        return res;
    }

    public Vector3D getLinearCombination(double[] arrD) {
        Vector3D res = new Vector3D();
        if (arr.length == arrD.length) {
            for (int i = 0; i < arr.length; i++) {
                double a1=arr[i].getX();
                double a2=arr[i].getY();
                double a3=arr[i].getZ();

                arr[i].setX(arr[i].getX() * arrD[i]);
                arr[i].setY(arr[i].getY() * arrD[i]);
                arr[i].setZ(arr[i].getZ() * arrD[i]);
                res = vectorProcessor_getSum(res, arr[i]);
                arr[i].setX(a1);
                arr[i].setY(a2);
                arr[i].setZ(a3);
            }
        } else res = new Vector3D();
        return res;
    }
    public Point3D[] getDiffPointArr(Point3D point){
        Point3D[] res_arr = new Point3D[arr.length];
        for (int i = 0; i<arr.length;i++){
            System.out.println(arr[i].getX());
            res_arr[i] = new Point3D(point.getX()+arr[i].getX(),point.getY()+arr[i].getY(),point.getZ()+arr[i].getZ());
        }
        return res_arr;
    }

}
