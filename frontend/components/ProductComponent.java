package frontend.components;

import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.border.EmptyBorder;
import java.awt.GridLayout;

public class ProductComponent extends JPanel {
    public ProductComponent(String name, String description, double price) {
        setLayout(new GridLayout(3, 1));
        setBorder(new EmptyBorder(10, 10, 10, 10));

        JLabel nameLabel = new JLabel("Name: " + name);
        JLabel descriptionLabel = new JLabel("Description: " + description);
        JLabel priceLabel = new JLabel("Price: ₱" + price);

        add(nameLabel);
        add(descriptionLabel);
        add(priceLabel);
    }
}