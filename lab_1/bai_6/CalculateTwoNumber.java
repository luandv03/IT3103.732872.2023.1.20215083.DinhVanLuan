// Author: Dinh Van Luan
// MSSV: 20215083
package lab_1.bai_6;

import javax.swing.JOptionPane;

public class CalculateTwoNumber {
    public static void main(String[] args) {
        String strNum1, strNum2;

        strNum1 = JOptionPane.showInputDialog(null, "Please input the first number: ", "Input the first number", JOptionPane.INFORMATION_MESSAGE);
        strNum2 = JOptionPane.showInputDialog(null, "Please input the second number: ", "Input the second number", JOptionPane.INFORMATION_MESSAGE);

        double num1 = Double.parseDouble(strNum1);
        double num2 = Double.parseDouble(strNum2);

        double sum = num1 + num2;
        double difference = num1 - num2;
        double product = num1 * num2;
        double quote;
    
        if (num2 != 0) {
            quote = num1 / num2;
            JOptionPane.showMessageDialog(null, "Sum = " + sum + "\n" + "Difference = " + difference + "\n" + "Product = " + product + "\n" + "Quote = " + quote);
            return;
        }

        JOptionPane.showMessageDialog(null, "Sum = " + sum + "\n" + "Difference = " + difference + "\n" + "Product = " + product + "\n");

       
    }
}
