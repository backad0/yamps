package Idz1SecondCource.Num15;
public class Idz1num15 {
    public static void main(String[] args) {
        Point3D point1 = new Point3D(1, 2, 3);
        Point3D point2 = new Point3D(0,0,0);

        point1.show();


        if ((point1.getX()==point2.getX())&&(point1.getY()==point2.getY())&&(point1.getZ()==point2.getZ())) {
            System.out.println("right");
        }
        else {
            System.out.println("false");
        }
    }
}
