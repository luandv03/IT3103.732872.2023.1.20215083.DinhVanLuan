// Author: Dinh Van Luan
// MSSV: 20215083
package lab_1.bai_7;

import java.util.Scanner;
import java.lang.Math; 

public class EquationSolver {
    public static void main(String[] args) {

        System.out.println("1. Giai phuong trinh bac nhat");
        System.out.println("2. Giai he phuong trinh bac nhat");
        System.out.println("3. Giai phuong trinh bac hai");
        System.out.println("Moi ban nhap lua chon: ");

        try (Scanner in = new Scanner(System.in)) {
            int select = in.nextInt();
            // ax + b = c;
            if (select == 1) {
                System.out.println("Nhap vao a: ");
                double a = in.nextDouble();

                System.out.println("Nhap vao b: ");
                double b = in.nextDouble();

                System.out.println("Nhap vao c: ");
                double c = in.nextDouble();
                       
                if (a == 0) {
                    if (b == c) {
                        System.out.println("Phuong trinh vo so nghiem");
                    } else {
                        System.out.println("Phuong trinh vo nghiem");
                    }
                } else {
                    double x = (c-b)/a;
                    System.out.println("Phuong trinh co nghiem: x = " + x);
                }

            } else if (select == 2) {
                // a1x + b1y = c1
                // a2x + b2y = c2
                System.out.println("Nhap vao a1, b1, c1 \n a2, b2, c2 \n");
                double a1 = in.nextDouble();
                double b1 = in.nextDouble();
                double c1 = in.nextDouble();
                double a2 = in.nextDouble();
                double b2 = in.nextDouble();
                double c2 = in.nextDouble();

                double D = a1*b2 - a2*b1;
                double Dx = c1*b2 - c2*b1;
                double Dy = a1*c2 - a2*c1;
                if (D != 0) {
                    System.out.println("Phuong trinh nghiem la: (" + Dx/D + "," + Dy/D + ")");
                } else {
                    if (Dx != 0 || Dy != 0) {
                       System.out.println("Phuong trinh vo nghiem");
                    } else {
                        System.out.println("Phuong trinh co vo so nghiem");
                    }
                }
            } else if (select == 3) {
                // ax^2 + bx + c = 0;
                System.out.println("Nhap vao a, b, c");
                double a = in.nextDouble();
                double b = in.nextDouble();
                double c = in.nextDouble();
                
                if (a == 0) {
                    if (b == 0) {
                        if (c == 0) {
                            System.out.println("Phuong trinh vo so nghiem");
                        } else {
                            System.out.println("Phuong trinh vo nghiem");
                        }
                    } else {
                        System.out.println("Phuong trinh co nghiem la: x = " + -c/b);
                    }
                } else {
                    double delta = b*b - 4*a*c;

                    if (delta > 0) {
                        System.out.println("Phuong trinh co 2 nghiem: x1 = " + (-b + Math.sqrt(delta)) / 2*a + "; x2 = " + (-b - Math.sqrt(delta)) / 2*a);
                    } else if (delta < 0) {
                        System.out.println("Phuong trinh vo nghiem");
                    } else {
                        System.out.println("Phuong trinh co nghiem kep: x = " + (-b/2*a));
                    }
                }
            }
        } catch (Exception e) {
            System.out.println(e);
        }

    }   

}
