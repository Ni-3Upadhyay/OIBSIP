package OnlineReservation;

import javax.swing.*;
import java.awt.*;

public class Booking extends JFrame {

    Font f1, f2;

    public Booking(){
        setLayout(null);

        f1 = new Font("Arial", Font.BOLD,25);
        f2 = new Font("Arial",Font.BOLD,15);

        JLabel title = new JLabel("Flight Booking");
        title.setBounds(250, 30, 300, 40);
        title.setFont(new Font("Arial", Font.BOLD,30));
        title.setForeground(Color.black);
        add(title);



        setSize(800,600);
        setLocation(350,50);
        setVisible(true);
    }

    public static void main(String[] args) {
        new Booking();
    }

}
