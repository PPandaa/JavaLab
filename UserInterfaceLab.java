import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class UserInterfaceLab {

    public static void main (String args[])
    {
         // Draw a frame
        JFrame frame = new JFrame("User Interface Lab");
        frame.setSize(500,500);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().setLayout(new BorderLayout());
        frame.setResizable(false);

        // Draw a panel
        JPanel indexPanel = new JPanel();
        indexPanel.setPreferredSize(new Dimension(500, 500));
        indexPanel.setLayout(new BorderLayout());
        indexPanel.setBackground(Color.GRAY);

        // Set position of panel
        frame.getContentPane().add(indexPanel, BorderLayout.PAGE_START);

        // Draw a view panel
        JPanel viewPanel = new JPanel();
        viewPanel.setPreferredSize(new Dimension(30, 400));
        viewPanel.setLayout(new BorderLayout());
        viewPanel.setBackground(Color.WHITE);

        // Set position of panel
        indexPanel.add(viewPanel, BorderLayout.PAGE_START);

        // Draw a button panel
        JPanel buttonPanel = new JPanel();
        buttonPanel.setPreferredSize(new Dimension(100, 100));
        buttonPanel.setLayout(new BorderLayout());
        buttonPanel.setBackground(Color.WHITE);

        // Set a Button
        JButton submitBtn = new JButton("Submit");
        submitBtn.setSize(new Dimension(20, 20));

        // Add button to panel
        buttonPanel.add(submitBtn);

        // Set position of panel
        indexPanel.add(buttonPanel, BorderLayout.CENTER);

        frame.getContentPane().add(indexPanel, BorderLayout.CENTER);

        // Draw a panel
        JPanel updatePanel = new JPanel();
        updatePanel.setPreferredSize(new Dimension(500, 500));
        updatePanel.setLayout(new BorderLayout());
        updatePanel.setBackground(Color.BLUE);



        // Draw a panel
        // JPanel panel = new JPanel();
        // panel.setPreferredSize(new Dimension(30, 400));
        // panel.setLayout(new BorderLayout());
        // panel.setBackground(Color.GRAY);

        
        submitBtn.addActionListener(new ActionListener()
            {
                public void actionPerformed(ActionEvent e)
                {
                    frame.remove(indexPanel);
                    frame.getContentPane().add(updatePanel, BorderLayout.CENTER);
                    frame.pack();
                }
            }
        );

        

       

        

        // Set panel visible
        buttonPanel.setVisible(true);
        indexPanel.setVisible(true);
        frame.setVisible(true);
    }

}
