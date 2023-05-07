package OnlineReservation;

import java.sql.DriverManager;

public class Connection {

    java.sql.Connection c;
    java.sql.Statement s;

    public Connection(){
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");

            c = DriverManager.getConnection("jdbc:mysql://localhost:3306/onlinereservation","root", "nitin");

            s = c.createStatement();

        }catch (Exception e){
            System.out.println("Exception");
        }
    }

}
