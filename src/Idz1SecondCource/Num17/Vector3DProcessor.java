package Idz1SecondCource.Num17;

import Idz1SecondCource.Num16.Vector3D;

import static java.lang.Math.abs;

public class Vector3DProcessor {
    public static Vector3D vectorProcessor_getSum(Vector3D v1, Vector3D v2) {
        return new Vector3D(v1.getX() + v2.getX(), v1.getY() + v2.getY(), v1.getZ() + v2.getZ());
    }

    public static Vector3D vectorProcessor_getDiff(Vector3D v1, Vector3D v2) {
        return new Vector3D(v1.getX() - v2.getX(), v1.getY() - v2.getY(), v1.getZ() - v2.getZ());
    }

    public static double vectorProcessor_getScalarProduct(Vector3D v1, Vector3D v2) {
        return v1.getX() * v2.getX() + v1.getY() * v2.getY() + v1.getZ() * v2.getZ();
    }

    public static Vector3D vectorProcessor_getVectorProduct(Vector3D v1, Vector3D v2) {
        double x = v1.getY() * v2.getZ() - v1.getZ() * v2.getY();
        double y = v1.getZ() * v2.getX() - v1.getX() * v2.getZ();
        double z = v1.getX() * v2.getY() - v1.getY() * v2.getX();
        Vector3D vector3D = new Vector3D(x, y, z);
        return vector3D;
    }

    public static boolean vectorProcessor_getCollinear(Vector3D v1, Vector3D v2) {
        boolean res = true;
        if ((v1.getX()==0)||(v1.getY()==0)||(v1.getZ()==0)||(v2.getX()==0)||(v2.getY()==0)||(v2.getZ()==0)) {
            res = false;
        } else {
            double var1 = abs(v1.getX() / v2.getX()), var2 = abs(v1.getY() / v2.getY()), var3 = abs(v1.getZ() / v2.getZ());
            if ((var1 != var2) || (var1 != var3) || (var2 != var3)) res = false;
        }
        return res;
    }
}
