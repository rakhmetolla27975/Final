import java.io.Serializable;
import java.util.ArrayList;

public class PackageData implements Serializable {
    private String operType;
    private Addinformation information;
    private ArrayList<Addinformation> binformation;

    public PackageData(String operType, Addinformation information) {
        this.operType = operType;
        this.information = information;
    }

    public PackageData(String operType) {
        this.operType = operType;
    }

    public PackageData(ArrayList<Addinformation> binformation) {
        this.binformation = binformation;
    }

    public String getOperType() {
        return operType;
    }

    public Addinformation getInformation() {
        return information;
    }

    public ArrayList<Addinformation> getBinformation() {
        return binformation;
    }

}
