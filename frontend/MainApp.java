package frontend;

import javax.swing.JFrame;
import frontend.forms.AddProductForm;

public class MainApp {
    public static void main(String[] args) {
        // Create the main application window
        JFrame frame = new JFrame("Coffee Product App");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 300);

        // Add the AddProductForm panel
        frame.add(new AddProductForm());

        // Show the window
        frame.setVisible(true);
    }
}