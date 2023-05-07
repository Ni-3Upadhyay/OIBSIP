package OnlineReservation;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SignUpPage extends JFrame implements ActionListener {

    JButton close, save;
    JTextField userText, nameText, ageText, addressText,emailText,dobText,phoneText, nationalityText,genderText,passportText;
    public SignUpPage(){
        setLayout(null);

        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource(""));
        Image i2 = i1.getImage().getScaledInstance(800,700,Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(0,0,800,700);
        add(image);

        JLabel title = new JLabel("Welcome to Indian Airlines");
        title.setBounds(200, 50, 500, 40);
        title.setFont(new Font("Aerial", Font.BOLD, 30));
        image.add(title);

        JLabel username = new JLabel("UserName");
        username.setBounds(50, 140, 150, 25);
        username.setFont(new Font("Aerial", Font.BOLD, 20));
        image.add(username);

        userText = new JTextField();
        userText.setBounds(220, 140, 150, 25);
        image.add(userText);

        JLabel name = new JLabel("Name");
        name.setBounds(450, 140, 150, 25);
        name.setFont(new Font("Aerial", Font.BOLD, 20));
        image.add(name);

        nameText = new JTextField();
        nameText.setBounds(590, 140, 150, 25);
        image.add(nameText);

        JLabel age = new JLabel("Age");
        age.setBounds(50, 210, 150, 25);
        age.setFont(new Font("Aerial", Font.BOLD, 20));
        image.add(age);

        ageText = new JTextField();
        ageText.setBounds(220, 210, 150, 25);
        image.add(ageText);

        JLabel dob = new JLabel("D.O.B");
        dob.setBounds(450, 210, 150, 25);
        dob.setFont(new Font("Aerial", Font.BOLD, 20));
        image.add(dob);

        dobText = new JTextField();
        dobText.setBounds(590, 210, 150, 25);
        image.add(dobText);

        JLabel address = new JLabel("Address");
        address.setBounds(50, 280, 150, 25);
        address.setFont(new Font("Aerial", Font.BOLD, 20));
        image.add(address);

         addressText = new JTextField();
        addressText.setBounds(220, 280, 150, 25);
        image.add(addressText);

        JLabel phone = new JLabel("Phone");
        phone.setBounds(450, 280, 150, 25);
        phone.setFont(new Font("Aerial", Font.BOLD, 20));
        image.add(phone);

        phoneText = new JTextField();
        phoneText.setBounds(590, 280, 150, 25);
        image.add(phoneText);

        JLabel email = new JLabel("Email Id");
        email.setBounds(50, 350, 150, 25);
        email.setFont(new Font("Aerial", Font.BOLD, 20));
        image.add(email);

        emailText = new JTextField();
        emailText.setBounds(220, 350, 150, 25);
        image.add(emailText);

        JLabel nationality = new JLabel("Nationality");
        nationality.setBounds(450, 350, 150, 25);
        nationality.setFont(new Font("Aerial", Font.BOLD, 20));
        image.add(nationality);

        nationalityText = new JTextField();
        nationalityText.setBounds(590, 350, 150, 25);
        image.add(nationalityText);

        JLabel gender = new JLabel("Gender");
        gender.setBounds(50, 420, 150, 25);
        gender.setFont(new Font("Aerial", Font.BOLD, 20));
        image.add(gender);

         genderText = new JTextField();
        genderText.setBounds(220, 420, 150, 25);
        image.add(genderText);

        JLabel passport = new JLabel("Passport No");
        passport.setBounds(450, 420, 150, 25);
        passport.setFont(new Font("Aerial", Font.BOLD, 20));
        image.add(passport);

         passportText = new JTextField();
        passportText.setBounds(590, 420, 150, 25);
        image.add(passportText);

         save = new JButton("Save");
        save.setBounds(300, 530, 100, 40);
        save.setBackground(Color.black);
        save.setForeground(Color.white);
        save.addActionListener(this);
        image.add(save);

         close = new JButton("Close");
        close.setBounds(430, 530, 100, 40);
        close.setBackground(Color.red);
        close.setForeground(Color.white);
        close.addActionListener(this);
        image.add(close);

        setSize(800, 700);
        setLocation(350,50);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent ae){
        String username = userText.getText();
        String name = nameText.getText();
        String age = ageText.getText();
        String address = addressText.getText();
        String email = emailText.getText();
        String dob = dobText.getText();
        String phone = phoneText.getText();
        String gender = genderText.getText();
        String passport = passportText.getText();

        if(ae.getSource()==save){

            try {
                Connection connection = new Connection();

                String query = "insert into signup values ('"+username+"', '"+name+"', '"+age+"', '"+address+"', '"+email+"', '"+dob+"', '"+phone+"', '"+gender+"', '"+passport+"')";
                connection.s.executeUpdate(query);
                JOptionPane.showMessageDialog(null, "Details filled successfully");

                setVisible(false);

            }catch (Exception e){
                System.out.println("Exception in signup");
            }
        }
        if(ae.getSource()==close){
                System.exit(0);
        }
    }
    public static void main(String[] args) {
        new SignUpPage();
    }
}
