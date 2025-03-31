package Package1;

import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import java.awt.Color;

public class ProductStatus extends JFrame {

    private static final long serialVersionUID = 1L;
    private JPanel contentPane;
    private JTable table;
    private EmployeeData employeeData; // Instance of EmployeeData

    /**
     * Launch the application.
     */
    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    ProductStatus frame = new ProductStatus();
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
    public ProductStatus() {
        employeeData = new EmployeeData(); // Initialize EmployeeData
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 550, 600);
        contentPane = new JPanel();
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

        setContentPane(contentPane);
        contentPane.setLayout(null);
        
        JLabel lblNewLabel = new JLabel("Product Status");
        lblNewLabel.setForeground(new Color(0, 0, 255));
        lblNewLabel.setFont(new Font("Times New Roman", Font.BOLD, 14));
        lblNewLabel.setBounds(216, 22, 145, 35);
        contentPane.add(lblNewLabel);
        
        JScrollPane scrollPane = new JScrollPane();
        scrollPane.setBounds(10, 68, 499, 482);
        contentPane.add(scrollPane);
        
        table = new JTable();
        scrollPane.setViewportView(table);
        
        // Set the table model with product data
        setTableData();
    }

    private void setTableData() {
        // Column names for the table
        String[] columnNames = {"ID", "Product Name", "Quantity", "Price", "Total Sales"};
        
        // Create a 2D array to hold the data for the table
        String[][] tableData = new String[employeeData.products.length][5];

        // Populate the table data
        for (int i = 0; i < employeeData.products.length; i++) {
            tableData[i][0] = employeeData.products[i][0]; // ID
            tableData[i][1] = employeeData.products[i][1]; // Product Name
            tableData[i][2] = employeeData.products[i][2]; // Quantity
            tableData[i][3] = employeeData.products[i][3]; // Price
            
            // Calculate total sales
            int totalSales = 0;
            for (int sale : employeeData.sales[i]) {
                totalSales += sale;
            }
            tableData[i][4] = String.valueOf(totalSales); // Total Sales
        }

        // Create a DefaultTableModel with the table data
        DefaultTableModel model = new DefaultTableModel(tableData, columnNames);
        
        // Set the model to the table
        table.setModel(model);
    }
}