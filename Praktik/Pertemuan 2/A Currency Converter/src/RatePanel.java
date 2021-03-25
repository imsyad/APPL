// ******************************************************************
// RatePanel.java
//
// Panel for a program that converts different currencies to
// U.S. Dollars
// ******************************************************************

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class RatePanel extends JPanel {

    private double[] rate; // exchange rates
    private String[] currencyName;
    private JLabel result;
    private JComboBox currency;
    private JTextField inputCurrency;
// ------------------------------------------------------------
// Sets up a panel to convert cost from one of 6 currencies
// into U.S. Dollars. The panel contains a heading, a text
// field for the cost of the item, a combo box for selecting
// the currency, and a label to display the result.
// ------------------------------------------------------------

    public RatePanel() {
        JLabel title = new JLabel("How much is that in dollars?");
        title.setAlignmentX(Component.CENTER_ALIGNMENT);
        title.setFont(new Font("Helvetica", Font.BOLD, 20));
        // Set up the arrays for the currency conversions
        currencyName = new String[]{"Select the currency..",
            "European Euro", "Canadian Dollar",
            "Japanese Yen", "Australian Dollar",
            "Indian Rupee", "Mexican Peso"};
        
        rate = new double[]{0.0, 1.2103, 0.7351,
            0.0091, 0.6969,
            0.0222, 0.0880};
        result = new JLabel(" ------------ ");
        
        //Create JComboBox
        currency = new JComboBox(currencyName);
//        currency.setBounds(50,50,90,20);    
        currency.addActionListener(new ComboListener());
        
        //Create text field
        JLabel inputLabel = new JLabel("Input: ");
        inputLabel.setBounds(50, 50, 90, 20);
        inputCurrency = new JTextField(10);
        
//        Insets insets = this.getInsets();
//        Dimension dim;
//        
//        dim = title.getPreferredSize();
//        title.setBounds(20 + insets.left, 10 + insets.top, dim.width, dim.height);
//        
//        dim = inputLabel.getPreferredSize();
//        dim = inputCurrency.getPreferredSize();
//        inputCurrency.setBounds(20 + insets.left, 40 + insets.top, dim.width, dim.height);
//        
//        dim = currency.getPreferredSize();
//        currency.setBounds(20 + insets.left, 65 + insets.top, dim.width, dim.height);
//        
//        dim = result.getPreferredSize();
//        result.setBounds(20 + insets.left, 100 + insets.top, dim.width + 200, dim.height);
        
        add(title);
        add(inputLabel);
        add(inputCurrency);
        add(currency);
        add(result);
    }
// ******************************************************
// Represents an action listener for the combo box.
// ******************************************************

    private class ComboListener implements ActionListener {
// --------------------------------------------------
// Determines which currency has been selected and
// the value in that currency then computes and
// displays the value in U.S. Dollars.
// --------------------------------------------------
        public void actionPerformed(ActionEvent event) {
            
            String input = inputCurrency.getText();
                                       
            try{
                result.setText(input + currencyName[currency.getSelectedIndex()]
                    + " = " + (rate[currency.getSelectedIndex()] * Double.parseDouble(input)) + " U.S. Dollars");
            }
            catch(NumberFormatException e){
                System.err.println(e.getMessage());
            }
        }
    }
}
