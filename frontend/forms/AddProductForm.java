package frontend.forms;

import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.BoxLayout;
import frontend.components.ProductComponent;

public class AddProductForm extends JPanel {
    public AddProductForm() {
        setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));

        // Title
        JLabel titleLabel = new JLabel("Available Coffee Product:");
        add(titleLabel);

        // Add one coffee product component
        ProductComponent product = new ProductComponent("Cappuccino", "Rich espresso with steamed milk and foam",
                150.00);
        add(product);
    }
}