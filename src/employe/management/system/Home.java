package employe.management.system;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Home extends JFrame implements ActionListener{
    
    JButton add, edit, update, remove;
    
    Home() {
        setLayout(null);
        
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/home.jpg"));
        Image i2 = i1.getImage().getScaledInstance(1120, 630, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(0, 0, 1120, 630);
        add(image);
        
        JLabel heading = new JLabel("EMPLOYEE MANAGEMENT SYSTEM");
        heading.setBounds(580, 30, 450, 70);
        heading.setFont(new Font("Raleway", Font.PLAIN, 25));
        image.add(heading);

        
        add = new JButton("Add Employee");
        add.setBounds(580, 100, 150, 40);
        add.addActionListener(this);
        image.add(add);
        
        edit = new JButton("Edit Employee");
        edit.setBounds(750, 100, 150, 40);
        edit.addActionListener(this);
        image.add(edit);
        
        update = new JButton("Update Employee");
        update.setBounds(580, 150, 150, 40);
        update.addActionListener(this);
        image.add(update);
        
        remove = new JButton("Remove Employee");
        remove.setBounds(750, 150, 150, 40);
        remove.addActionListener(this);
        image.add(remove);
        
        setSize(1120, 630);
        setLocation(150, 80);
        setVisible(true);
    }
    public void actionPerformed(ActionEvent ae){
        if(ae.getSource() == add){
            
        } else if(ae.getSource() == edit) {
        
        } else if(ae.getSource() == update) {
        
        } else {
        
        }
    }
    
    public static void main(String[] args)
    {
        new Home();
    }
}
