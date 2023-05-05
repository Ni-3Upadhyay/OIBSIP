package OnlineReservation;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;

public class LoginPage extends JFrame implements ActionListener {

    JButton signup, signIn;
    JTextField user, pass;
    public LoginPage(){
        setLayout(null);

        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("airport.jpg"));
        Image i2 = i1.getImage().getScaledInstance(600,400, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(0,0,600,400);
        add(image);

        JLabel title = new JLabel("Login Account");
        title.setBounds(200, 50, 300, 40);
        title.setFont(new Font("Aerial", Font.BOLD, 30));
        image.add(title);

        JLabel username = new JLabel("Username : ");
        username.setBounds(100, 140, 150, 30);
        username.setFont(new Font("Aerial", Font.BOLD, 25));
        image.add(username);

        user = new JTextField();
        user.setBounds(250, 140, 200, 30);
        image.add(user);

        JLabel password = new JLabel("Password : ");
        password.setBounds(100, 210, 150, 30);
        password.setFont(new Font("Aerial", Font.BOLD, 25));
        image.add(password);

        pass = new JTextField();
        pass.setBounds(250, 210, 200, 30);
        image.add(pass);

        signIn = new JButton("SIGN IN");
        signIn.setBounds(150, 280, 100, 20);
        signIn.addActionListener(this);
        signIn.setBackground(Color.black);
        signIn.setForeground(Color.white);
        image.add(signIn);

        signup = new JButton("SIGN UP");
        signup.setBounds(280, 280, 100, 20);
        signup.addActionListener(this);
        signup.setBackground(Color.black);
        signup.setForeground(Color.white);
        image.add(signup);


        setSize(600,400);
        setLocation(450,200);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent ae) {
        if (ae.getSource() == signIn) {
            Connection connection = new Connection();

            String username = user.getText();
            String password = pass.getText();

            String query = "select * from login where username ='"+username+"'and password = '"+password+"'";

            try{
                ResultSet rs = connection.s.executeQuery(query);


            }catch (Exception e){

            }

        }
        else if(ae.getSource() == signup){

        }
    }

    public static void main(String[] args) {
        new LoginPage();
    }
}

