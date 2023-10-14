package lab_1.bai_7;

import java.util.Scanner;

public class EquationSolver {
    public static void main(String[] args) {
        System.out.println("1. Giai phuong trinh bac nhat");
        System.out.println("2. Giai he phuong trinh bac nhat");
        System.out.println("3. Giai phuong trinh bac hai");
        System.out.println("Moi ban nhap lua chon: ");
        Scanner in = new Scanner(System.in);
 
        int select = in.nextInt();
        if (select == 1) {
            System.out.println("Nhap vao a: ");
            Scanner aInput = new Scanner(System.in);
            double a = aInput.nextDouble();
            System.out.println("Nhap vao b: ");
            Scanner bInput = new Scanner(System.in);
            double b = bInput.nextDouble();
            System.out.println("Nhap vao c: ");
            Scanner cInput = new Scanner(System.in);
            double c = cInput.nextDouble();


            if (a == 0) {
                if (b == c) {
                    System.out.println("Phuong trinh vo so nghiem");
                } else {
                    System.out.println("Phuong trinh vo nghiem");
                }
            }

        } else if (select == 2) {
            System.out.println("2..");
        } else if (select == 3) {
            System.out.println("3..");
        }

    }   

}
