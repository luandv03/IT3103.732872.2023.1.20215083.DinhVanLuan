package lab_1.bai_4;

import javax.swing.JOptionPane;

public class HelloNameDialog {

    public static void main(String[] args) {
        String name;
        name = JOptionPane.showInputDialog("Please your name: ");
        JOptionPane.showMessageDialog(null, "Hi " + name + "!");
        System.exit(0);
    }
    
}
