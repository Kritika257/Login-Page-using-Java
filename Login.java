import java.awt.event.*;
import java.awt.*;
import javax.swing.*;

public class Login extends JFrame implements ActionListener{
    public Login(){

        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocation(200,200);
        setLayout(null);
    }
    private static JTextField pass;
    private static JLabel successfullylogined;
    
    public static void main(String [] args){
        Login Lform = new Login();
        JLabel UserName,Password;
        UserName = new JLabel("USERNAME:");
        UserName.setBounds(100,100,100,100);
        JTextField name = new JTextField(15);
        name.setBounds(200,140,200,20);
        Password = new JLabel("PASSWORD:");
        Password.setBounds(100,150,100,100);
        pass = new JTextField(15);
        pass.setBounds(200,190,200,20);


        JButton login = new JButton("LOGIN");
        login.setBounds(220,250,100,40);
        JButton sign = new JButton("SIGN UP");

        successfullylogined=new JLabel("");
        successfullylogined.setBounds(100,300,300,150);

        Lform.add(UserName);
        Lform.add(name);
        Lform.add(Password);
        Lform.add(pass);
        Lform.add(login);
        Lform.add(sign);
        Lform.add(successfullylogined);

        login.addActionListener(Lform);
        sign.addActionListener(Lform);

        Lform.setTitle("LOG IN FORM");
        Lform.setSize(500,500);
        Lform.setVisible(true);

    }

    public void actionPerformed(ActionEvent e){

        String userkey=pass.getText();
        if(userkey.equals("123456789")){
            successfullylogined.setText("LOG IN SUCCESSFULLY");
        }
        else{
            successfullylogined.setText("WORNG PASSWORD LOG IN FAILED");
        }
    }
}