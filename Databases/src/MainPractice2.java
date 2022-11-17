import java.sql.*;

public class MainPractice2 {
    public static void main(String[] args) {
        try{
            Connection con = DriverManager.getConnection("jdbc:sqlite:/home/pranav/Data/sqlite/testjava.db");
            Statement statement = con.createStatement();

            ResultSet result = statement.executeQuery("SELECT * FROM contacts");
            while(result.next()){
                System.out.println("Name: " + result.getString("name")
                + " Phone: " + result.getInt("phone") + " E-Mail: " + result.getString("email"));
            }

            result = statement.executeQuery("SELECT * FROM contacts");
            ResultSetMetaData rsmd = result.getMetaData();

            System.out.println("Maximum number of columns are: " + rsmd.getColumnCount());

            System.out.println("Data:\tData Type:" );
            for(int i = 1; i <= rsmd.getColumnCount(); i++){
                System.out.println(rsmd.getColumnName(i) + "\t" + rsmd.getColumnTypeName(i));
            }
        }
        catch (SQLException ex){
            System.out.println(ex.getMessage());
        }
    }
}
