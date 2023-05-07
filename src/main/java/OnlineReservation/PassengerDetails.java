package OnlineReservation;

import javax.swing.*;
import java.awt.*;
import java.sql.ResultSet;

public class PassengerDetails extends JFrame{

    JTable table;
    String [] heading = {"Username","Name","Age", "Address", "Email", "D.O.B", "Phone", "Gender", "Passport"};
    String [][] info = new String[100][9];
    int i = 0, j=0;
    Font f;
    PassengerDetails(){
//        setLayout(null);

        try{
            Connection connection = new Connection();
            String query = "select * from signup";
            ResultSet rs = connection.s.executeQuery(query);

            while (rs.next()){
                info[i][j++] = rs.getString("username");
                info[i][j++] = rs.getString("name");
                info[i][j++] = rs.getString("age");
                info[i][j++] = rs.getString("address");
                info[i][j++] = rs.getString("email");
                info[i][j++] = rs.getString("DOB");
                info[i][j++] = rs.getString("phone");
                info[i][j++] = rs.getString("gender");
                info[i][j++] = rs.getString("passport");

                i++;
                j=0;
            }

            table = new JTable(info, heading);

        }catch (Exception e){
            System.out.println("Exception in passenger details");
        }
        table.setFont(new Font("raleway", Font.BOLD,15));
        table.setBackground(Color.black);
        table.setForeground(Color.white);
//            table.setBounds(0,0,800,600);
        JScrollPane jScrollPane= new JScrollPane(table);
        add(jScrollPane);


        setSize(800,600);
        setLocation(350,50);
        setVisible(true);

    }

    public static void main(String[] args) {
        new PassengerDetails();
    }
}
