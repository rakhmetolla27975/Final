import java.io.InputStream;
import java.io.Reader;
import java.math.BigDecimal;
import java.net.URL;
import java.sql.*;
import java.util.ArrayList;
import java.util.Calendar;

public class ManagerDB {
private Connection connection;
    private Addinformation addinformation;

    public void connect() {
    try {
        Class.forName("com.mysql.jdbc.Driver");
        connection = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/final_project/?useUnicode=true&serverTimezone=UTC", "root", "");

    } catch (Exception e){
        e.printStackTrace();
    }
}

    public void addInf(Addinformation addinformation){
    this.addinformation = addinformation;
    try{
        PreparedStatement statement = connection.prepareStatement("" + "INSERT INTO bread (id, username, password, number, onepriceflour, onepriceyeast, onepriceoil, onepricewater, onepriceenergy, priceflour, priceyeast, priceoil, pricewater, priceenergy, totaldirectcosts, overhead, generalexpenses, profit, price, allprice)" + "VALUES (NULL, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)"
        );
        statement.setString(1,addinformation.getUsername());
        statement.setString(2,addinformation.getPassword());
        statement.setString(3,addinformation.getNumber());
        statement.setString(4,addinformation.getOnepriceflour());
        statement.setString(5,addinformation.getOnepriceyeast());
        statement.setString(6,addinformation.getOnepriceoil());
        statement.setString(7,addinformation.getOnepricewater());
        statement.setString(8,addinformation.getOnepriceenergy());
        statement.setString(9,addinformation.getPriceflour());
        statement.setString(10,addinformation.getPriceyeast());
        statement.setString(11, addinformation.getPriceoil());
        statement.setString(12,addinformation.getPricewater());
        statement.setString(13,addinformation.getPriceenergy());
        statement.setString(14, addinformation.getTotaldirectcosts());
        statement.setString(15,addinformation.getOverhead());
        statement.setString(16,addinformation.getGeneralexpenses());
        statement.setString(17, addinformation.getProfit());
        statement.setString(18,addinformation.getPrice());
        statement.setString(19,addinformation.getAllprice());
        statement.executeUpdate();

        statement.close();
    } catch (Exception e) {
        e.printStackTrace();
    }

}
      public ArrayList<Addinformation> getAllInformation(){
       ArrayList<Addinformation> result = new ArrayList<>();
       try{
           PreparedStatement statement = connection.prepareStatement("SELECT * FROM addinformation");
           ResultSet resultSet = statement.executeQuery();

           while (resultSet.next()) {
               Integer id = resultSet.getInt("id");
               String username = resultSet.getString("username");
               String password = resultSet.getString("password");
               String number = resultSet.getString("number");
               String onepriceflour = resultSet.getString("onepriceflour");
               String onepriceyeast = resultSet.getString("onepriceyeast");
               String onepriceoil = resultSet.getString("onepriceoil");
               String onepricewater = resultSet.getString("onepricewater");
               String onepriceenergy = resultSet.getString("onepriceenergy");
               String priceflour = resultSet.getString("priceflour");
               String priceyeast = resultSet.getString("priceyeast");
               String priceoil = resultSet.getString("priceoil");
               String pricewater = resultSet.getString("pricewater");
               String priceenergy = resultSet.getString("priceenergy");
               String totaldirectcosts = resultSet.getString("totaldirectcosts");
               String overhead = resultSet.getString("overhead");
               String generalexpenses = resultSet.getString("generalexpenses");
               String profit = resultSet.getString("profit");
               String price = resultSet.getString("price");
               String allprice = resultSet.getString("allprice");
               result.add(new Addinformation(id, username, password, number, onepriceflour, onepriceyeast, onepriceoil, onepricewater, onepriceenergy, priceflour, priceyeast, priceoil, pricewater, priceenergy, totaldirectcosts, overhead, generalexpenses, profit, price, allprice));
           }
               statement.close();

       } catch (Exception e){
           e.printStackTrace();
       }
       return result;

      }

      public void deleteproject(Integer id){
        try{
            PreparedStatement statement = connection.prepareStatement("" +
                    "DELETE FROM bread WHERE id = ?");
            statement.setInt(1,id);
            int rows = statement.executeUpdate();
            statement.close();
        }catch (Exception e){
            e.printStackTrace();
        }
      }

}
