import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Home extends Container {
    private JLabel titLabel;
    private JLabel usernameLabel;
    private JLabel passwordLabel;
    private JTextField usernameField;
    private JTextField passwordField;
    private JButton sendButton;

    public Home(){
        setSize(700, 400);
        setLayout(null);

        titLabel = new JLabel("Please write your username and password:");
        titLabel.setBounds(10,10,500,30);
        add(titLabel);

        usernameLabel = new JLabel("Username: ");
        usernameLabel.setBounds(50, 140, 150, 50);
        add(usernameLabel);

        usernameField = new JTextField();
        usernameField.setBounds(250,140,300,50);
        add(usernameField);

        passwordLabel = new JLabel("Password: ");
        passwordLabel.setBounds(50, 240, 150, 50);
        add(passwordLabel);

        passwordField = new JTextField();
        passwordField.setBounds(250, 240, 300, 50);
        add(passwordField);

        sendButton = new JButton("SEND");
        sendButton.setBounds(500, 340, 100, 50);
        sendButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String username = usernameField.getText();
                String password = passwordField.getText();

                Addinformation addinformation = new Addinformation(username, password);
                PackageData pd = new PackageData("ADD", addinformation);
                Main.connect(pd);

                Main.frame.homeWindow.setVisible(false);
                Main.frame.menuWindow.setVisible(true);
            }
        });
        add(sendButton);
    }
}
