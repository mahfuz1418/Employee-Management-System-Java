package employe.management.system;
import java.awt.*;
import javax.swing.*;


public class Login extends JFrame {
    
    Login() {
        getContentPane().setBackground(Color.WHITE);
        setLayout(null);
        
        JLabel username = new JLabel("User Name : ");
        username.setBounds(40, 40, 75, 30);
        add(username);
        
        JTextField tusername = new JTextField();
        tusername.setBounds(150, 40, 150, 30);
        add(tusername);
        
        JLabel password = new JLabel("Password : ");
        password.setBounds(40, 80, 75, 30);
        add(password);
        
        JTextField tpassword = new JTextField();
        tpassword.setBounds(150, 80, 150, 30);
        add(tpassword);
        
        JButton login = new JButton("Login");
        login.setBounds(150, 130, 150, 30);
        login.setBackground(Color.black);
        login.setForeground(Color.white);
        add(login);
        
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/second.jpg"));
        Image i2 = i1.getImage().getScaledInstance(200, 200, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(350, 0, 200, 200);
        add(image);
        
        
        setSize(600, 300);
        setLocation(400, 200);
        setVisible(true);
    }
    
   public static void main(String[] args){
       new Login();
   } 
}
