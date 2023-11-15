// Author: Dinh Van Luan
// MSSV: 20215083
package hust.soict.dsai.lab01;

import javax.swing.JOptionPane;

public class ChoosingOption {
    public static void main(String[] args) {
        int option = JOptionPane.showConfirmDialog(null, 
        "Hi, Đinh Văn Luận - 20215083\nDo you want to change to the first class ticket!");

        JOptionPane.showMessageDialog(null, "You've chosen: " + 
        (option == JOptionPane.YES_OPTION?"YES":"NO"));
        System.exit(0);
    }
}
