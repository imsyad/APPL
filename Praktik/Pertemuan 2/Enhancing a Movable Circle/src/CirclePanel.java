// ******************************************************************
// CirclePanel.java
//
// A panel with a circle drawn in the center and buttons on the
// bottom that move the circle.
// ******************************************************************

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class CirclePanel extends JPanel {

    private final int CIRCLE_SIZE = 50;
    private int x, y;
    private Color c;

    // Create buttons to move the circle
    JButton left = new JButton("Left");
    JButton right = new JButton("Right");
    JButton up = new JButton("Up");
    JButton down = new JButton("Down");
//---------------------------------------------------------------
// Set up circle and buttons to move it.
//---------------------------------------------------------------

    public CirclePanel(int width, int height) {
// Set coordinates so circle starts in middle
        x = (width / 2) - (CIRCLE_SIZE / 2);
        y = (height / 2) - (CIRCLE_SIZE / 2);
        c = Color.green;
// Need a border layout to get the buttons on the bottom
        this.setLayout(new BorderLayout());

// Add listeners to the buttons
        left.addActionListener(new MoveListener(-20, 0));
        right.addActionListener(new MoveListener(20, 0));
        up.addActionListener(new MoveListener(0, -20));
        down.addActionListener(new MoveListener(0, 20));

        // Add mnemonics to the button
        left.setMnemonic(KeyEvent.VK_L);
        right.setMnemonic(KeyEvent.VK_R);
        up.setMnemonic(KeyEvent.VK_U);
        down.setMnemonic(KeyEvent.VK_D);

        // Add tooltips to the button
        left.setToolTipText("Move circle 20 units to the left side");
        right.setToolTipText("Move circle 20 units to the right side ");
        up.setToolTipText("Move circle up to 20 units");
        down.setToolTipText("Move circle down to 20 units");
        
// Need a panel to put the buttons on or they'll be on
// top of each other.
        JPanel buttonPanel = new JPanel();
        buttonPanel.add(left);
        buttonPanel.add(right);
        buttonPanel.add(up);
        buttonPanel.add(down);
// Add the button panel to the bottom of the main panel
        this.add(buttonPanel, "South");
    }
//---------------------------------------------------------------
// Draw circle on CirclePanel
//---------------------------------------------------------------

    public void paintComponent(Graphics page) {
        super.paintComponent(page);
        page.setColor(c);
        page.fillOval(x, y, CIRCLE_SIZE, CIRCLE_SIZE);
    }
//---------------------------------------------------------------
// Class to listen for button clicks that move circle.
//---------------------------------------------------------------

    private class MoveListener implements ActionListener {

        private int dx;
        private int dy;
//---------------------------------------------------------------
// Parameters tell how to move circle at click.
//---------------------------------------------------------------

        public MoveListener(int dx, int dy) {
            this.dx = dx;
            this.dy = dy;
        }
//---------------------------------------------------------------
// Change x and y coordinates and repaint.
//---------------------------------------------------------------

        public void actionPerformed(ActionEvent e) {
            x += dx;
            y += dy;
            repaint();
            
            //add limit to the button
            //if the conditions are fulfilled, disable the button
            left.setEnabled( (x <= CIRCLE_SIZE/2) ? false : true );
            right.setEnabled( (x >= getWidth()-CIRCLE_SIZE) ? false : true );
            up.setEnabled( (y <= CIRCLE_SIZE/2) ? false : true );
            down.setEnabled( (y >= getHeight() - CIRCLE_SIZE) ? false : true );
        }
    }
}
