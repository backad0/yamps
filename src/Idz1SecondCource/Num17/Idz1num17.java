package Idz1SecondCource.Num17;

import Idz1SecondCource.Num15.Point3D;
import Idz1SecondCource.Num16.Vector3D;

import static Idz1SecondCource.Num17.Vector3DProcessor.*;


public class Idz1num17 {
    public static void main(String[] args) {
       /* Point3D point1 = new Point3D(1, 0, 0);
        Point3D point2 = new Point3D(0, 1, 0);*/

        Vector3D p1p2 = new Vector3D(1,0,0);
        Vector3D vector = new Vector3D(0,1,0);

        Vector3D sumVector = vectorProcessor_getSum(p1p2, vector);
        sumVector.show();

        Vector3D diffVector1 = vectorProcessor_getDiff(p1p2, vector);
        Vector3D diffVector2 = vectorProcessor_getDiff(vector, p1p2);
        diffVector1.show();
        diffVector2.show();

        double scalarProd = vectorProcessor_getScalarProduct(p1p2, vector);
        System.out.println("Scalar Product equal " + scalarProd);

        Vector3D vectorProd = vectorProcessor_getVectorProduct(p1p2, vector);
        vectorProd.show();

        boolean collinearCheck = vectorProcessor_getCollinear(p1p2, vector);
        if (!collinearCheck) {
            System.out.println("Vectors are not collinear");
        }else {
            System.out.println("Vectors are collinear");
        }
    }
}
