// Author: Dinh Van Luan
// MSSV: 20215083
package hust.soict.dsai.lab01;

import javax.swing.JOptionPane;

public class ShowTwoNumbers {
    public static void main(String[] args) {
        String strNum1, strNum2;
        String strNofication = "You've just entered: ";

        strNum1 = JOptionPane.showInputDialog(null, "Please input the first number: ", 
        "Input the first number", JOptionPane.INFORMATION_MESSAGE); 

        strNofication += strNum1 + " and ";

        strNum2 = JOptionPane.showInputDialog(null, "Please input the second number: ", 
        "Input the second number", JOptionPane.INFORMATION_MESSAGE);
        
        strNofication += strNum2;

        JOptionPane.showMessageDialog(null, "Show two numbes: ",strNofication, JOptionPane.INFORMATION_MESSAGE);
        System.exit(0);
    }
}
