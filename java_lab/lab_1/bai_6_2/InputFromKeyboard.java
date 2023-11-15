// Author: Dinh Van Luan
// MSSV: 20215083
package lab_1.excerises.bai_6_2;

import java.util.Scanner;

public class InputFromKeyboard {
    public static void main(String[] args) {
        try(Scanner keyboard = new Scanner(System.in)) {
            System.out.println("What's your name?");
            String strName = keyboard.nextLine();
            System.out.println("How old are you?");
            int iAge = keyboard.nextInt();
            System.out.println("How tall are you (m)?");
            double dHeight = keyboard.nextDouble();
    
            System.out.println("Mr/Ms. " + strName + ", " + iAge + " years old. "
                                + "Your height is " + dHeight + ".");

        } catch (Exception e) {
            System.out.println(e);
        }
    }

}
