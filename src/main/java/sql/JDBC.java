package sql;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.InetAddress;
import java.net.URL;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBC {
    public static void main(String[] args) throws SQLException {

        String userName = "sqlcourse";
        String userPass = "sqlcourse";
        String query = "Select * from EngineeringStudents where PassOutYear >= 2021";

        try {

            Class.forName("com.mysql.cj.jdbc.Driver");
            System.out.println("Successfully connected to sqlcourse DB");
        }catch (ClassNotFoundException e){
            System.out.println("Driver not found".toUpperCase());
            e.printStackTrace();
        }

        try {
            String url = "jdbc:mysql://" + terminalIP() +":3306/sqlcourse";
            Connection  sqlCourseDB = DriverManager.getConnection(url,userName,userPass);
            Statement statement = sqlCourseDB.createStatement();
            ResultSet result = statement.executeQuery(query);
            int value = 1;
            while (result.next()){

                StringBuilder universityData = new StringBuilder();
                for (int i = 1; i <=6; i++){
                    universityData.append(result.getString(i)).append("-");
                }
                System.out.println(value++ + ":\t"+universityData);
            }
        }catch (SQLException e){
            e.printStackTrace();
        }catch (IOException o ){
            System.out.println("Not found DB ");
        }
    }

    public static String terminalIP() throws IOException
    {
        URL url = new URL("http://checkip.amazonaws.com/");
        InetAddress getIp = InetAddress.getLocalHost();
        BufferedReader br = new BufferedReader(new InputStreamReader(url.openStream()));
        return br.readLine();
    }
}
