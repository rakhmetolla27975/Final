import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.Socket;
import java.util.ArrayList;

public class ServerThread extends Thread{
    private Socket socket;

    public ServerThread(Socket socket) {
        this.socket = socket;
    }
    public void run(){
        try{
            ManagerDB manager = new ManagerDB();
            manager.connect();

            ObjectOutputStream outputStream = new ObjectOutputStream(socket.getOutputStream());
            ObjectInputStream inputStream = new ObjectInputStream(socket.getInputStream());

            PackageData packageData = null;
            while ((packageData = (PackageData)inputStream.readObject())!=null){
                if(packageData.getOperType().equals("ADD")){
                    Addinformation informationfromclient = packageData.getInformation();

                    manager.addInf(informationfromclient);
                }

                else if(packageData.getOperType().equals("RESULT")){
                    ArrayList<Addinformation> infforclient = manager.getAllInformation();
                    PackageData toclient = new PackageData(infforclient);
                    outputStream.writeObject(toclient);

                }
                else if(packageData.getOperType().equals("BPROJECT")){
                    ArrayList<Addinformation> infforclient = manager.getAllInformation();
                    PackageData toclient = new PackageData(infforclient);
                    outputStream.writeObject(toclient);
                }
                else if (packageData.getOperType().equals("DELETE")){
                    Addinformation informationfromclient = packageData.getInformation();
                    manager.addInf(informationfromclient);

                }
            }
            inputStream.close();
            outputStream.close();
            socket.close();

        } catch (Exception e){
            e.printStackTrace();
        }
    }

}
