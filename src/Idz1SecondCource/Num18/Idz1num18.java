package Idz1SecondCource.Num18;

import Idz1SecondCource.Num15.Point3D;
import Idz1SecondCource.Num16.Vector3D;

import java.util.Scanner;

public class Idz1num18 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Vector3DArray arr = new Vector3DArray(5);
        for (int i = 0; i < arr.getSize(); i++) {
            System.out.println("Enter the coordinates of " + i + " vector");
            double a = in.nextDouble();
            double b = in.nextDouble();
            double c = in.nextDouble();
            arr.setI(new Vector3D(a, b, c), i);
        }
        System.out.println();
        //text setI//

            /*arr.showI(3);
            double max_length = arr.getMaxLength();
            System.out.println();
            System.out.println(max_length);*/
        // test point 5 //
            System.out.println("Enter the coordinates of test_vector (for point5)");
            Vector3D test_vector = new Vector3D(in.nextDouble(), in.nextDouble(), in.nextDouble());
            System.out.println();
            System.out.println(arr.getVectorIndex(test_vector));
            System.out.println();
        // test point 6 //
            System.out.println("Sum of all vectors:");
            arr.getArrSum().show();
        // test point 7 //
            double[] arrD = new double[5];
            for (int i = 0; i < arrD.length; i++) {
                System.out.println("Enter " + i + " coefficient");
                arrD[i] = in.nextDouble();
            }
            arr.getLinearCombination(arrD).show();
            System.out.println();
        // test point 8 //
            Point3D point = new Point3D(1,1,1);
            Point3D[] pointArr = arr.getDiffPointArr(point);
            for (int i=0; i<arr.getSize(); i++){
                pointArr[i].show();
            }
        in.close();
    }
}
