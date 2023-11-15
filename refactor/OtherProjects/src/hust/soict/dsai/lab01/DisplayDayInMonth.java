// Author: Dinh Van Luan
// MSSV: 20215083
package hust.soict.dsai.lab01;

import java.util.Scanner;

public class DisplayDayInMonth {
    public static void main(String[] args) {
        try (Scanner in = new Scanner(System.in)) {
            int month, year;
            do {
                System.out.print("Hi, Dinh Van Luan - 20215083 \n");
                System.out.print("Nhap vao thang: ");
                month = in.nextInt();
                System.out.print("Nhap vao nam: ");
                year = in.nextInt();

                switch (month) {
                    case 1:
                    case 3:
                    case 5:
                    case 7:
                    case 8:
                    case 10:
                        System.out.println("Days: " + 31);
                        break;
                    case 4:
                    case 6:
                    case 9:
                    case 11:
                        System.out.println("Days: " + 30);
                        break;
                    case 2:
                        if (year % 4 == 0 && year % 100 != 0) {
                            System.out.println("Days: " + 29);
                            break;
                        }
                        System.out.println("Days: 28");
                }

            } while (month <= 0 || month > 12 || year <= 0);

        } catch(Exception e) {
            throw new RuntimeException(e);
        }
    }
}
