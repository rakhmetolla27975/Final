import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Deleteproject extends Container {
    private JLabel titLabel;
    private JLabel idLabel;
    private JTextField idText;
    private JButton deleteButton;
    private JButton backButton;



    public Deleteproject(){
        setSize(700, 400);
        setLayout(null);

        titLabel = new JLabel("Please write ID of the project you want to delete:");
        titLabel.setBounds(10,50,700,50);
        add(titLabel);

        idLabel = new JLabel("ID: ");
        idLabel.setBounds(50,150, 100, 50);
        add(idLabel);

        idText = new JTextField();
        idText.setBounds(200, 150, 300, 50);
        add(idText);

        deleteButton = new JButton("DELETE");
        deleteButton.setBounds(100, 300, 200, 50);
        deleteButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String id = idText.getText();
                Integer ID = Integer.parseInt(id);
                Addinformation addinformation = new Addinformation(ID);
                PackageData pd = new PackageData("DELETE", addinformation);
            }
        });
        add(deleteButton);

        backButton = new JButton("BACK");
        backButton.setBounds(380,300, 200, 50);
        backButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Main.frame.bprojectWindow.setVisible(true);
                Main.frame.deleteWindow.setVisible(false);
            }
        });
        add(backButton);
    }
}
