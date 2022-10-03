package Idz1SecondCource;

import java.util.Scanner;

import static java.lang.Math.abs;
import static java.lang.Math.pow;

public class Idz1dot1to7 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("input degree and accuracy \n");
        double n = in.nextDouble();
        double acc = in.nextDouble();
        double sum = 1.;
        double i = 1., f = 1.;
        //System.out.printf("%.5f, %.5f\n", abs(pow(n, i)) / f, acc );
        while ((abs(pow(n, i)) / f) >= acc) {
            //System.out.printf("sum=%.5f\n",sum);
            sum += pow(n, i) / f;
            i++;
            //System.out.printf("n=%.5f\n",n);
            f *= i;
            //System.out.println(sum);
        }
        System.out.println(sum);
        in.close();
    }
}

//Task 6
/*public class Idz1 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Input coefficients and the result of the equations: \n");

        System.out.print("Fist equation: \n");
        double a1 = in.nextDouble();
        double b1 = in.nextDouble();
        double an1 = in.nextDouble();

        System.out.print("Second equation: \n");
        double a2 = in.nextDouble();
        double b2 = in.nextDouble();
        double an2 = in.nextDouble();
        double x , y;

        if((a1==a2)&&(b1==b2)){
            System.out.print("there is no answer\n");
        } else {
            if (((a1 == 0) && (b1 == 0)) || ((a2 == 0) && (b2 == 0))) {
                System.out.print("there is no answer\n");
            } else {
                if (a1 == 0) {
                    y = an1 / b1;
                    System.out.printf("x any number, y=%.2f\n", y);
                } else {
                    if (a2 == 0) {
                        y = an2 / b2;
                        System.out.printf("x any number, y=%.2f\n", y);
                    } else {
                        if (a1 >= a2) {
                            b1 = b1 / a1 * a2;
                            b2 = b2 - b1;
                            a1 = a2;
                            an1 = an1 / a1 * a2;
                            an2 = an2 - an1;
                            if (b2 == 0) {
                                x = an1 / a1;
                                System.out.printf("Y any number, x=%.2f\n", x);
                            } else {
                                y = an2 / b2;
                                x = (an1 - b1 * y) / a1;
                                System.out.printf("x=%.2f, y=%.2f\n", x, y);

                            }

                        } else {
                            b2 = b2 / a2 * a1;
                            b1 = b1 - b2;
                            a2 = a1;
                            an2 = an2 / a2 * a1;
                            an1 = an1 - an2;
                            if (b1 == 0) {
                                x = an2 / a2;
                                System.out.printf("Y any number, x=%.2f\n", x);
                            } else {
                                y = an1 / b1;
                                x = (an2 - b1 * y) / a2;
                                System.out.printf("x=%.2f, y=%.2f\n", x, y);

                            }
                        }
                    }
                }
            }
        }

        in.close();
    }
}*/

//Task 5
/*public class Idz1 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Input tab segment: ");
        double s = in.nextDouble();
        double e = in.nextDouble();


        if (s>e){
            System.out.print("This is not a correct segment. Start should be less than end. Input correct segment: ");
            double s1 = in.nextDouble(); s=s1;
            double e1 = in.nextDouble(); e=e1;
        }

        if (s==e) {
            System.out.print("The segment is zero");
            double s1 = in.nextDouble(); s=s1;
            double e1 = in.nextDouble(); e=e1;
        }

        System.out.print("\nInput step(if you want to go backwards input negative number: ");
        double step = in.nextDouble();

        if (step==0){
            System.out.print("\nStep should be not equal zero\n");
            double step1 = in.nextDouble(); step = step1;
        }


        if (step>0){
            double start1=s;
            System.out.printf("|| segment = [%.2f,%.2f] ||\n|| step = %.2f ||\n",s,e,step);
            double res = sin(start1);
            System.out.printf("|| x=%.2f | sin(x)=%.2f ||\n",start1,res);
            start1=start1+step;

            while ((start1+step)<=e){
                res = sin(start1);
                System.out.printf("|| x=%.2f | sin(x)=%.4f ||\n",start1,res);
                start1=start1+step;
            }
            res = sin(start1);
            System.out.printf("|| x=%.2f | sin(x)=%.4f ||\n",start1,res);

        } else {
            double start1=e;
            System.out.printf("|| segment = [%.2f,%.2f] ||\n|| step = %.2f ||\n",e,s,step);
            double res = sin(start1);
            System.out.printf("|| x=%.2f | sin(x)=%.2f ||\n",start1,res);
            start1=start1+step;

            while ((start1+step)>=s){
                res = sin(start1);
                System.out.printf("|| x=%.2f | sin(x)=%.4f ||\n",start1,res);
                start1=start1+step;
            }
            res = sin(start1);
            System.out.printf("|| x=%.2f | sin(x)=%.4f ||\n",start1,res);

        }





        in.close();
    }
}*/
//Task 4
/*public class Idz1 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Input your coefficients of the equation: ");          // -2 0 2; 0 -4 4; 1 2 1; -2 4 2;
        double a = in.nextDouble();
        double b = in.nextDouble();
        double c = in.nextDouble();
        double answer1, answer2;

        if ((a == 0)&&(b!=0)&&(c!=0)) {
            System.out.printf("Your equation is: %.1fx+%.1f=0 \n", b, c);
            answer1 = -c / b;
            System.out.printf("Answer is %.2f", answer1);
        }

        if ((a==0)&&(b==0)&&(c!=0)) {
            System.out.println("There are no roots of equation.");
        }

        if ((a==0)&&(b==0)&&(c==0)){
            System.out.println("X is any number.");
        }

        if (a!=0) {
            System.out.printf("Your equation is: %.1fx^2+%.1fx+%.1f=0 \n", a, b, c);

            double D = b * b - 4 * a * c;
            if (D < 0) {
                System.out.println("There are no roots of equation.");
            }
            if (D == 0) {
                answer1 = -b / (2 * a);
                System.out.printf("x=%.2f", answer1);
            }
            if (D > 0) {
                answer1 = (-b - sqrt(D)) / (2 * a);
                answer2 = (-b + sqrt(D)) / (2 * a);
                System.out.printf("x1=%.2f, x2=%.2f", answer1, answer2);
            }
        }
        in.close();
    }
}*/

// Task 2/3
/*public class Idz1 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Input thee double numbers: ");
        int num1 = in.nextInt();
        int num2 = in.nextInt();
        int num3 = in.nextInt();

        int sum = num1 + num2 + num3;
        int pr = num1 * num2 * num3;
        double average = sum / 3.0;

        int max = 0, min = 0, medium = 0;
        if ((num1 > num2) && (num1 > num3)) {
            max = num1;
            if (num2 > num3) {
                medium = num2;
                min = num3;
            } else {
                medium = num3;
                min = num2;
            }
        }
        if ((num2 > num1) && (num2 > num3)) {
            max = num2;
            if (num1 > num3) {
                medium = num1;
                min = num3;
            } else {
                medium = num3;
                min = num1;
            }
        }
        if ((num3 > num1) && (num3 > num2)) {
            max = num3;
            if (num1 > num2) {
                medium = num1;
                min = num2;
            } else {
                medium = num2;
                min = num1;
            }
        }


        System.out.printf("Your answers:\n ans1=%d, ans2=%.2f, in increasing order: %d,%d,%d ", pr, average, min, medium, max);
        in.close();
    }
}*/

