package Idz1SecondCource.Num16;

import Idz1SecondCource.Num15.Point3D;

import static Idz1SecondCource.Num16.Vector3D.getEquality;

public class Idz1num16 {
    public static void main(String[] args) {
        Vector3D p1p2 = new Vector3D(1,1,1);
        Vector3D vector = new Vector3D(2,2,2);

        boolean equality = getEquality(p1p2, vector);
        if (!equality) {
            System.out.println("Vectors are not equal");
        } else {
            System.out.println("Vectors are equal");

        }
    }
}
