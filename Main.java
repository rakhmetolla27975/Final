import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.Socket;
import java.util.ArrayList;

public class Main {
    public static MainFrame frame;

    public static void connect(PackageData pd){
        try{
            Socket socket = new Socket("127.0.0.1", 2002);
            ObjectOutputStream outputStream = new ObjectOutputStream(socket.getOutputStream());
            ObjectInputStream inputStream = new ObjectInputStream(socket.getInputStream());

                if (pd.getOperType().equals("ADD")) {
                    outputStream.writeObject(pd);
                } else if (pd.getOperType().equals("RESULT")) {
                    outputStream.writeObject(pd);
                    PackageData InffromSer = (PackageData)inputStream.readObject();
                    ArrayList<Addinformation> arrayListfromSer = InffromSer.getBinformation();
                    result.text.append(String.valueOf(arrayListfromSer));
                }
                else if(pd.getOperType().equals("BPROJECT")){
                    PackageData InffromSer = (PackageData)inputStream.readObject();
                    ArrayList<Addinformation> arrayListfromSer = InffromSer.getBinformation();
                    String s = "";

                    for (int i = 0; i < arrayListfromSer.size(); i++) {
                        s += arrayListfromSer.get(i) + "\n";
                    }
                    result.text.append(s);
                }
                else if (pd.getOperType().equals("DELETE")){
                    outputStream.writeObject(pd);
                }

                inputStream.close();
                outputStream.close();
                socket.close();


        }catch (Exception e){
            e.printStackTrace();
        }
    }

    public static void main(String[] args){
        frame = new MainFrame();
        frame.setVisible(true);
    }
}
