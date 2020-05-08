import java.io.Serializable;

public class Addinformation implements Serializable {
    private Integer id;
    private String username;
    private String password;
 private String number;
 private String onepriceflour;
 private String onepriceyeast;
 private String onepriceoil;
 private String onepricewater;
 private String onepriceenergy;
    private String priceflour = "0";
    private String priceyeast = "0";
    private String priceoil = "0";
    private String pricewater = "0";
    private String priceenergy = "0";
    private String totaldirectcosts = "0";
    private String overhead = "0";
    private String generalexpenses = "0";
    private String profit = "0";
    private String price = "0";
    private String allprice = "0";

    public Addinformation() {

    }

    public Addinformation(Integer id) {
        this.id = id;
    }

    public Addinformation(String username, String password) {
        this.username = username;
        this.password = password;
    }

    public Addinformation(Integer id, String number, String onepriceflour, String onepriceyeast, String onepriceoil, String onepricewater, String onepriceenergy) {
        this.id = id;
        this.number = number;
        this.onepriceflour = onepriceflour;
        this.onepriceyeast = onepriceyeast;
        this.onepriceoil = onepriceoil;
        this.onepricewater = onepricewater;
        this.onepriceenergy = onepriceenergy;
    }

    public Addinformation(Integer id, String username, String password, String number, String onepriceflour, String onepriceyeast, String onepriceoil, String onepricewater, String onepriceenergy, String priceflour, String priceyeast, String priceoil, String pricewater, String priceenergy, String totaldirectcosts, String overhead, String generalexpenses, String profit, String price, String allprice) {
        this.id = id;
        this.username = username;
        this.password = password;
        this.number = number;
        this.onepriceflour = onepriceflour;
        this.onepriceyeast = onepriceyeast;
        this.onepriceoil = onepriceoil;
        this.onepricewater = onepricewater;
        this.onepriceenergy = onepriceenergy;
        this.priceflour = priceflour;
        this.priceyeast = priceyeast;
        this.priceoil = priceoil;
        this.pricewater = pricewater;
        this.priceenergy = priceenergy;
        this.totaldirectcosts = totaldirectcosts;
        this.overhead = overhead;
        this.generalexpenses = generalexpenses;
        this.profit = profit;
        this.price = price;
        this.allprice = allprice;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNumber() {
        return number;
    }

    public String getOnepriceflour() {
        return onepriceflour;
    }

    public String getOnepriceyeast() {
        return onepriceyeast;
    }

    public String getOnepriceoil() {
        return onepriceoil;
    }

    public String getOnepricewater() {
        return onepricewater;
    }

    public String getOnepriceenergy() {
        return onepriceenergy;
    }

    public String getPriceflour() {
        return priceflour;
    }

    public String getPriceyeast() {
        return priceyeast;
    }

    public String getPriceoil() {
        return priceoil;
    }

    public String getPricewater() {
        return pricewater;
    }

    public String getPriceenergy() {
        return priceenergy;
    }

    public String getTotaldirectcosts() {
        return totaldirectcosts;
    }

    public String getOverhead() {
        return overhead;
    }

    public String getGeneralexpenses() {
        return generalexpenses;
    }

    public String getProfit() {
        return profit;
    }

    public String getPrice() {
        return price;
    }

    public String getAllprice() {
        return allprice;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public void setOnepriceflour(String onepriceflour) {
        this.onepriceflour = onepriceflour;
    }

    public void setOnepriceyeast(String onepriceyeast) {
        this.onepriceyeast = onepriceyeast;
    }

    public void setOnepriceoil(String onepriceoil) {
        this.onepriceoil = onepriceoil;
    }

    public void setOnepricewater(String onepricewater) {
        this.onepricewater = onepricewater;
    }

    public void setOnepriceenergy(String onepriceenergy) {
        this.onepriceenergy = onepriceenergy;
    }

    public void setPriceflour(String priceflour) {
        this.priceflour = priceflour;
    }

    public void setPriceyeast(String priceyeast) {
        this.priceyeast = priceyeast;
    }

    public void setPriceoil(String priceoil) {
        this.priceoil = priceoil;
    }

    public void setPricewater(String pricewater) {
        this.pricewater = pricewater;
    }

    public void setPriceenergy(String priceenergy) {
        this.priceenergy = priceenergy;
    }

    public void setTotaldirectcosts(String totaldirectcosts) {
        this.totaldirectcosts = totaldirectcosts;
    }

    public void setOverhead(String overhead) {
        this.overhead = overhead;
    }

    public void setGeneralexpenses(String generalexpenses) {
        this.generalexpenses = generalexpenses;
    }

    public void setProfit(String profit) {
        this.profit = profit;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public void setAllprice(String allprice) {
        this.allprice = allprice;
    }

    public String Priceflour(String priceflour, String onepriceflour){
        int opf = Integer.parseInt(getOnepriceflour());
        double pf = opf * 0.416;
        return priceflour = Double.toString(pf);
    }
    public String Priceyeast(String priceyeast, String onepriceyeast){
        int opy = Integer.parseInt(getOnepriceyeast());
        double py = opy * 0.002;
        return priceyeast = Double.toString(py);
    }
    public String Priceoil(String priceoil, String onepriceoil){
        int opo = Integer.parseInt(getOnepriceoil());
        double po = opo * 0.02;
        return priceoil = Double.toString(po);
    }
    public String Pricewater(String pricewater, String onepricewater){
        double opw = Double.parseDouble(getOnepricewater());
        double pw = opw * 0.1;
        return pricewater = Double.toString(pw);
    }
    public String Priceenergy(String priceenergy, String onepriceenergy){
        double ope = Double.parseDouble(getOnepriceenergy());
        double pe = ope * 0.19;
        return priceenergy = Double.toString(pe);
    }
    public String Totaldirectcosts(String totaldirectcosts, String priceflour, String priceyeast, String priceoil, String pricewater, String priceenergy){
        double pf = Double.parseDouble(Priceflour(priceflour, onepriceflour));
        double py = Double.parseDouble(Priceyeast(priceyeast, onepriceyeast));
        double po = Double.parseDouble(Priceoil(priceoil, onepriceoil));
        double pw = Double.parseDouble(Pricewater(pricewater, onepricewater));
        double pe = Double.parseDouble(Priceenergy(priceenergy, onepriceenergy));
        double tdc = pf + py + po + pw + pe;
        return totaldirectcosts = Double.toString(tdc);

    }
    public String Overhead(String totaldirectcosts, String overhead){
        double tdc = Double.parseDouble(Totaldirectcosts(totaldirectcosts, priceflour, priceyeast, priceoil, pricewater, priceenergy));
        double oh = tdc * 0.1;
        return overhead = Double.toString(oh);
    }
    public String Generalexpenses(String overhead, String totaldirectcosts, String generalexpenses){
        double oh = Double.parseDouble(Overhead(totaldirectcosts, overhead));
        double tdc = Double.parseDouble(Totaldirectcosts(totaldirectcosts, priceflour, priceyeast, priceoil, pricewater, priceenergy));
        double ge = oh + tdc;
        return generalexpenses = Double.toString(ge);
    }
    public String Profit(String generalexpenses, String profit){
        double ge = Double.parseDouble(Generalexpenses(overhead, totaldirectcosts, generalexpenses));
        double p = ge * 0.07;
        return profit = Double.toString(p);
    }
    public String Price(String price, String profit, String generalexpenses){
     double ge = Double.parseDouble(Generalexpenses(overhead, totaldirectcosts, generalexpenses));
     double p = Double.parseDouble(Profit(generalexpenses, profit));
     double pr = ge + p;
     return price = Double.toString(pr);
    }
    public String Allprice(String price, String number, String allprice){
        double pr = Double.parseDouble(Price(price, generalexpenses, profit));
        int n = Integer.parseInt(getNumber());
        double apr = pr * n;
        return allprice = Double.toString(apr);
    }

    @Override
    public String toString() {
        return id + "). " + "  Username: " + username + "   ,Password: " + password +
                "   ,Bread number: " + number  +
                "   ,The price of one kilogram flour: " + onepriceflour + "   , Kilogram: 0.416" + "   ,The price of flour: " + Priceflour(priceflour, onepriceflour) +
                "   ,The price of one kilogram yeast: " + onepriceyeast + "   , Kilogram: 0.002" + "   ,The price of yeast: " + Priceyeast(priceyeast, onepriceyeast)  +
                "   ,The price of one liter oil: " + onepriceoil + "   , Liter: 0.02" + "   ,The price of oil: " + Priceoil(priceoil, onepriceoil) +
                "   ,The price of one liter water: " + onepricewater + "   , Liter: 0.1" + "   ,The price of water: " + Pricewater(pricewater, onepricewater) +
                "   ,The price of one KBt energy: " + onepriceenergy + "   , KBt: 0.19" + "   ,The price of energy: " + Priceenergy(priceenergy, onepriceenergy) +
                "   ,Total direct costs: " + Totaldirectcosts(totaldirectcosts, priceflour, priceyeast, priceoil, pricewater, priceenergy) +
                "   ,Overhead: " + Overhead(overhead, totaldirectcosts) +
                "   ,General expenses: " + Generalexpenses(generalexpenses, totaldirectcosts, overhead) +
                "   ,Profit: " + Profit(profit, generalexpenses)+
                "   ,Price: " + Price(price, generalexpenses, profit) +
                "   ,All price: " + Allprice(allprice, price, number);
    }
}
