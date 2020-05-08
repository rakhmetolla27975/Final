import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class result extends Container {
public static JTextArea text;
private JButton resultsButton;
private JButton backButton;

public result(){
    setSize(700, 700);
    setLayout(null);

    text = new JTextArea();
    text.setBounds(50, 50, 600, 400);
    text.setLineWrap(true);
    text.setWrapStyleWord(true);
    text.setFont(new Font("Dialog", Font.PLAIN, 14));
    text.setTabSize(10);
    add(text);

    resultsButton = new JButton("RESULT");
    resultsButton.setBounds(50,500,275,50);
    resultsButton.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
        PackageData pd = new PackageData("RESULT");
        Main.connect(pd);
        }
    });
    add(resultsButton);
    backButton = new JButton("BACK");
    backButton.setBounds(375,500, 275, 50);
    backButton.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            Main.frame.addWindow.setVisible(true);
            Main.frame.resultWindow.setVisible(false);
        }
    });
    add(backButton);
}
}
