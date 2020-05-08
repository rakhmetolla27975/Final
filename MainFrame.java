import javax.swing.*;

public class MainFrame extends JFrame {
    public static Menu menuWindow;
    public static add addWindow;
    public static result resultWindow;
    public static Bproject bprojectWindow;
    public static Home homeWindow;
    public static Deleteproject deleteWindow;

    public MainFrame(){
        setSize(700,700);
        setTitle("Economist for bakery application");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        homeWindow = new Home();
        homeWindow.setLocation(0,0);
        add(homeWindow);

        menuWindow = new Menu();
        menuWindow.setLocation(0,0);
        menuWindow.setVisible(false);
        add(menuWindow);

        addWindow = new add();
        addWindow.setLocation(0,0);
        addWindow.setVisible(false);
        add(addWindow);

        resultWindow = new result();
        resultWindow.setLocation(0,0);
        resultWindow.setVisible(false);
        add(resultWindow);

        bprojectWindow = new Bproject();
        bprojectWindow.setLocation(0,0);
        bprojectWindow.setVisible(false);
        add(bprojectWindow);

        deleteWindow = new Deleteproject();
        deleteWindow.setLocation(0,0);
        deleteWindow.setVisible(false);
        add(deleteWindow);



    }
}
