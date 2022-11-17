import java.sql.SQLException;
import java.sql.*;

public class Main {
    public static void main(String[] args) {
        try{
            Connection con = DriverManager.getConnection("jdbc:sqlite:/home/pranav/Data/sqlite/testjava.db");
            Statement statement = con.createStatement();

            statement.execute("CREATE TABLE IF NOT EXISTS" +
                            " contacts(name TEXT, phone INTEGER, email TEXT)");

//            statement.execute("INSERT INTO contacts (name, phone, email)" +
//                    " VALUES('Tim', 398401, 'mail@mail.com')");
//
//            statement.execute("INSERT INTO contacts (name, phone, email)" +
//                    " VALUES('Pranav', 2314124, 'pranav@pranavpore.com')");
//
//            statement.execute("UPDATE contacts SET phone = 1234567 WHERE name = 'Pranav'");

            // statement.execute("DELETE FROM contacts WHERE name='Pranav'");

//            statement.execute("SELECT * FROM contacts");
//            ResultSet results = statement.getResultSet();

//            ResultSet results = statement.executeQuery("SELECT * FROM contacts");
//            while(results.next()){
//                System.out.println(results.getString("name") +
//                        " " + results.getInt("phone") +
//                        " " + results.getString("email"));
//            }

            ResultSet table = statement.executeQuery("SELECT * FROM contacts");
            ResultSetMetaData resultSetMetaData = table.getMetaData();

            System.out.println("Maximum number of columns are: " + resultSetMetaData.getColumnCount());

            System.out.println("Data: \t Data Type: ");
            for(int i = 1; i <= resultSetMetaData.getColumnCount(); i++){
                System.out.print(resultSetMetaData.getColumnName(i) + "\t");
                System.out.println(resultSetMetaData.getColumnTypeName(i));
            }

            statement.close();
            con.close();
        }
        catch (SQLException ex){
            System.out.println(ex.getMessage());
        }
    }
}
