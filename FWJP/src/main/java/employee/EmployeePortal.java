package employee;

import java.awt.EventQueue;
import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;

public class EmployeePortal extends JFrame {

    private static final long serialVersionUID = 1L;
    private JPanel contentPane;

    /**
     * Launch the application.
     */
    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    EmployeePortal frame = new EmployeePortal();
                    frame.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }

    /**
     * Create the frame.
     */
    public EmployeePortal() {
        setFont(new Font("Sitka Small", Font.BOLD, 20));
        setTitle("Employee Portal");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 924, 505);
        contentPane = new JPanel();
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        setContentPane(contentPane);
        contentPane.setLayout(null);

        // Title Label
        JLabel lblNewLabel = new JLabel("Employee Portal");
        lblNewLabel.setForeground(Color.BLUE);
        lblNewLabel.setFont(new Font("Sitka Small", Font.BOLD, 25));
        lblNewLabel.setBounds(240, 38, 274, 43);
        contentPane.add(lblNewLabel);

        // Keeping all original labels same
        JLabel lblViewProductStatus = new JLabel("View Product Status");
        lblViewProductStatus.setBackground(Color.PINK);
        lblViewProductStatus.setForeground(Color.BLUE);
        lblViewProductStatus.setFont(new Font("Sitka Small", Font.BOLD, 18));
        lblViewProductStatus.setBounds(303, 120, 211, 43);
        contentPane.add(lblViewProductStatus);

        JLabel lblUpdateInventory = new JLabel("Update Inventory");
        lblUpdateInventory.setForeground(Color.BLUE);
        lblUpdateInventory.setFont(new Font("Sitka Small", Font.BOLD, 18));
        lblUpdateInventory.setBounds(303, 172, 211, 43);
        contentPane.add(lblUpdateInventory);

        JLabel lblDeleteProductFrom = new JLabel("Delete Product from Inventory");
        lblDeleteProductFrom.setForeground(Color.BLUE);
        lblDeleteProductFrom.setFont(new Font("Sitka Small", Font.BOLD, 18));
        lblDeleteProductFrom.setBounds(240, 240, 299, 43);
        contentPane.add(lblDeleteProductFrom);

        JLabel lblAddNewProducts = new JLabel("Add New Products ");
        lblAddNewProducts.setForeground(Color.BLUE);
        lblAddNewProducts.setFont(new Font("Sitka Small", Font.BOLD, 18));
        lblAddNewProducts.setBounds(274, 290, 211, 43);
        contentPane.add(lblAddNewProducts);

        JLabel lblFilterByPrice = new JLabel("Filter By Price");
        lblFilterByPrice.setForeground(Color.BLUE);
        lblFilterByPrice.setFont(new Font("Sitka Small", Font.BOLD, 18));
        lblFilterByPrice.setBounds(284, 349, 211, 43);
        contentPane.add(lblFilterByPrice);

        JLabel lblProductBelowMinimum = new JLabel("Product Below Minimum Quantity");
        lblProductBelowMinimum.setForeground(Color.BLUE);
        lblProductBelowMinimum.setFont(new Font("Sitka Small", Font.BOLD, 18));
        lblProductBelowMinimum.setBounds(524, 412, 340, 43);
        contentPane.add(lblProductBelowMinimum);
        
        JLabel lblNewLabel_2 = new JLabel("");
        lblNewLabel_2.setIcon(new ImageIcon("C:\\Users\\AMAN\\OneDrive\\Desktop\\logout.png"));
        lblNewLabel_2.setBounds(745, 24, 104, 82);
        contentPane.add(lblNewLabel_2);
    }
}
