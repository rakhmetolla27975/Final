import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class add extends Container {
    Home home;
private JLabel titleLabel;
private JLabel numberLabel;
private JLabel onepriceflourLabel;
private JLabel onepriceyeastLabel;
private JLabel onepriceoilLabel;
private JLabel onepricewaterLabel;
private JLabel onepriceenergyLabel;

private JTextField numberText;
private JTextField onepriceflourText;
private JTextField onepriceyeastText;
private JTextField onepriceoilText;
private JTextField onepricewaterText;
private JTextField onepriceenergyText;

private JButton addButton;
private JButton resultButton;
 private JButton backButton;

public add(){
    setSize(700,700);
    setLayout(null);

titleLabel = new JLabel("Please fill in the entire field and add, then get the result!");
titleLabel.setBounds(10, 10, 500, 30);
add(titleLabel);

numberLabel = new JLabel("Number of bread:");
numberLabel.setBounds(50,60, 300, 40);
add(numberLabel);

numberText = new JTextField();
numberText.setBounds(450,60, 200, 40);
add(numberText);

onepriceflourLabel = new JLabel("The price of one kilogram of flour:");
onepriceflourLabel.setBounds(50,120, 300, 40);
add(onepriceflourLabel);

onepriceflourText = new JTextField();
onepriceflourText.setBounds(450, 120, 200, 40);
add(onepriceflourText);

    onepriceyeastLabel = new JLabel("The price of one kilogram of yeast:");
    onepriceyeastLabel.setBounds(50,180, 300, 40);
    add(onepriceyeastLabel);

    onepriceyeastText = new JTextField();
    onepriceyeastText.setBounds(450, 180, 200, 40);
    add(onepriceyeastText);

    onepriceoilLabel = new JLabel("The price of one liter of oil:");
    onepriceoilLabel.setBounds(50,240, 300, 40);
    add(onepriceoilLabel);

    onepriceoilText = new JTextField();
    onepriceoilText.setBounds(450, 240, 200, 40);
    add(onepriceoilText);

    onepricewaterLabel = new JLabel("The price of one liter of water:");
    onepricewaterLabel.setBounds(50,300, 300, 40);
    add(onepricewaterLabel);

    onepricewaterText = new JTextField();
    onepricewaterText.setBounds(450, 300, 200, 40);
    add(onepricewaterText);

    onepriceenergyLabel = new JLabel("The price of one KBt of energy:");
    onepriceenergyLabel.setBounds(50,360, 300, 40);
    add(onepriceenergyLabel);

    onepriceenergyText = new JTextField();
    onepriceenergyText.setBounds(450, 360, 200, 40);
    add(onepriceenergyText);

    addButton = new JButton("ADD");
    addButton.setBounds(50, 450, 180, 40);
    addButton.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            String number = numberText.getText();
            String onepriceflour = onepriceflourText.getText();
            String onepriceyeast = onepriceyeastText.getText();
            String onepriceoil = onepriceoilText.getText();
            String onepricewater = onepricewaterText.getText();
            String onepriceenergy = onepriceenergyText.getText();

            Addinformation addinformation = new Addinformation(null, number, onepriceflour, onepriceyeast, onepriceoil, onepricewater, onepriceenergy);
            PackageData pd = new PackageData("ADD", addinformation);
            Main.connect(pd);


            numberText.setText("");
            onepriceflourText.setText("");
            onepriceyeastText.setText("");
            onepriceoilText.setText("");
            onepricewaterText.setText("");
            onepriceenergyText.setText("");



        }
    });
    add(addButton);
   resultButton = new JButton("RESULT");
   resultButton.setBounds(250, 450, 180, 40);
   resultButton.addActionListener(new ActionListener() {
       @Override
       public void actionPerformed(ActionEvent e) {
           Main.frame.addWindow.setVisible(false);
           Main.frame.resultWindow.setVisible(true);
       }
   });
  add(resultButton);

    backButton = new JButton("BACK");
    backButton.setBounds(450,450, 180, 40);
    backButton.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            Main.frame.menuWindow.setVisible(true);
            Main.frame.addWindow.setVisible(false);
        }
    });
    add(backButton);
}
}

