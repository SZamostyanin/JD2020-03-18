package by.it.borys.jd01_05;

import static java.lang.Math.*;

public class TaskA {
    public static void main(String[] args) {
        step1();
        step2();
        step3();
    }

    private static void step1() {
        double a = 756.13;
        double x = 0.3;
        double z = cos(pow(pow(x,2)+PI/6,5))-sqrt(x*pow(a,3)) - log(abs((a-1.12*x)/4));
        System.out.println(z);
    }

    private static void step2() {
        double a = 1.21;
        double b = 0.371;
        double y = tan(pow(a+b,2))-pow(a+1.5,1.0/3) + a*pow(b,5)-b/(log(pow(a,2)));
        System.out.println(y);
    }

    private static void step3() {
        System.out.println("Для a        f=");
        double x = 12.1;
        for (double a = -5; a <= 12 ; a+=3.75) {
            double f = exp(a*x)-3.45*a;
            System.out.printf("%4.2f   %10.8g\n",a,f);

        }
    }



}
