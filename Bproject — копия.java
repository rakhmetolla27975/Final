import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Bproject extends Container {
    private JTextArea bprojectText;
    private JButton bprojectButton;
    private JButton backButton;
    private JButton deleteButton;

    public Bproject(){
        setSize(700,700);
        setLayout(null);

        bprojectText = new JTextArea();
        bprojectText.setBounds(10, 10, 650, 530);
        bprojectText.setLineWrap(true);
        bprojectText.setWrapStyleWord(true);
        bprojectText.setFont(new Font("Dialog", Font.PLAIN, 14));
        bprojectText.setTabSize(10);
        add(bprojectText);

        bprojectButton = new JButton("ALL PROJECTS");
        bprojectButton.setBounds(150,580, 100, 50);
        bprojectButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                PackageData pd = new PackageData("BPROJECT");
                Main.connect(pd);
            }
        });
        add(bprojectButton);

        deleteButton = new JButton("DELETE");
        deleteButton.setBounds(300, 580, 100, 50);
        deleteButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Main.frame.deleteWindow.setVisible(true);
                Main.frame.bprojectWindow.setVisible(false);
            }
        });
        add(deleteButton);

        backButton = new JButton("BACK");
        backButton.setBounds(450, 580, 100, 50);
        backButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Main.frame.menuWindow.setVisible(true);
                Main.frame.bprojectWindow.setVisible(false);
            }

        });
        add(backButton);

    }
}
