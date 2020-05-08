import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Menu extends Container {
    private JButton breadButton;
    private JButton bprojectButton;
    private JButton exitButton;

    public Menu() {
        setSize(700, 700);
        setLayout(null);


        breadButton = new JButton("BREAD CALCULATION");
        breadButton.setBounds(130, 200, 400, 50);

        breadButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Main.frame.menuWindow.setVisible(false);
                Main.frame.addWindow.setVisible(true);
            }
        });

        add(breadButton);

        bprojectButton = new JButton("BUSINESS PROJECTS");
        bprojectButton.setBounds(130, 300, 400, 50);
        bprojectButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Main.frame.menuWindow.setVisible(false);
                Main.frame.bprojectWindow.setVisible(true);
            }
        });
        add(bprojectButton);
        exitButton = new JButton("EXIT");
        exitButton.setBounds(130, 400, 400, 50);
        exitButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });
        add(exitButton);
    }
}
