package employe.management.system;
import javax.swing.*;
import java.awt.*;
import com.toedter.calendar.JDateChooser;
import java.awt.event.*;
import java.util.*;

public class AddEmployee extends JFrame implements ActionListener{
 
    JTextField tusername, tfname, tsalary, taddress, tphone, temail, tdesignation;
    JButton addemployee, back;
    JComboBox teducation;
    JDateChooser tdob;
    JLabel employeeid;
    Random ran = new Random();
    int number = ran.nextInt(999999);
    
    AddEmployee() {
        getContentPane().setBackground(Color.WHITE);
        setLayout(null);
        
        JLabel heading = new JLabel("ADD EMPLOYEE");
        heading.setBounds(320, 30, 1200, 60);
        heading.setFont(new Font("san_serif", Font.PLAIN, 30));
        add(heading);
        
        
        //first row
        JLabel labelname = new JLabel("User Name : ");
        labelname.setBounds(50, 150, 150, 30);
        labelname.setFont(new Font("san_serif", Font.PLAIN, 20));
        add(labelname);
        
        tusername = new JTextField();
        tusername.setBounds(200, 150, 150, 30);
        add(tusername);
        
        JLabel labelfname = new JLabel("Father Name : ");
        labelfname.setBounds(400, 150, 150, 30);
        labelfname.setFont(new Font("san_serif", Font.PLAIN, 20));
        add(labelfname);
        
        tfname = new JTextField();
        tfname.setBounds(600, 150, 150, 30);
        add(tfname);
        
        
        //2nd row
        JLabel labeldob = new JLabel("Date of Birth : ");
        labeldob.setBounds(50, 200, 150, 30);
        labeldob.setFont(new Font("san_serif", Font.PLAIN, 20));
        add(labeldob);
        
        tdob = new JDateChooser();
        tdob.setBounds(200, 200, 150, 30);
        add(tdob);
        
        JLabel labelsalary = new JLabel("Salary : ");
        labelsalary.setBounds(400, 200, 150, 30);
        labelsalary.setFont(new Font("san_serif", Font.PLAIN, 20));
        add(labelsalary);
        
        tsalary = new JTextField();
        tsalary.setBounds(600, 200, 150, 30);
        add(tsalary);
                
        //3rd row
        JLabel labeladdress = new JLabel("Address : ");
        labeladdress.setBounds(50, 250, 150, 30);
        labeladdress.setFont(new Font("san_serif", Font.PLAIN, 20));
        add(labeladdress);
        
        taddress = new JTextField();
        taddress.setBounds(200, 250, 150, 30);
        add(taddress);
        
        JLabel labelphone = new JLabel("Phone : ");
        labelphone.setBounds(400, 250, 150, 30);
        labelphone.setFont(new Font("san_serif", Font.PLAIN, 20));
        add(labelphone);
        
        tphone = new JTextField();
        tphone.setBounds(600, 250, 150, 30);
        add(tphone);
        
        
        //3rd row
        JLabel labelemail = new JLabel("Email : ");
        labelemail.setBounds(50, 300, 150, 30);
        labelemail.setFont(new Font("san_serif", Font.PLAIN, 20));
        add(labelemail);
        
        temail = new JTextField();
        temail.setBounds(200, 300, 150, 30);
        add(temail);
        
        JLabel labelhedu = new JLabel("Higher Education: ");
        labelhedu.setBounds(400, 300, 150, 30);
        labelhedu.setFont(new Font("san_serif", Font.PLAIN, 20));
        add(labelhedu);
        
        String courses[] = {"SSC", "HSC", "DIPLOMA", "BBA", "MBA", "BSC", "MSC", "PHD"};
        teducation = new JComboBox(courses);
        teducation.setBackground(Color.WHITE);
        teducation.setBounds(600, 300, 150, 30);
        add(teducation);
        
        
        //4th row
        JLabel labeldesignation = new JLabel("Designtaion : ");
        labeldesignation.setBounds(50, 350, 150, 30);
        labeldesignation.setFont(new Font("san_serif", Font.PLAIN, 20));
        add(labeldesignation);
        
        tdesignation = new JTextField();
        tdesignation.setBounds(200, 350, 150, 30);
        add(tdesignation);
        
        JLabel lableid = new JLabel("Employee ID : ");
        lableid.setBounds(400, 350, 150, 30);
        lableid.setFont(new Font("san_serif", Font.PLAIN, 20));
        add(lableid);
        
        employeeid = new JLabel("" + number);
        employeeid.setBounds(600, 350, 150, 30);
        employeeid.setFont(new Font("san_serif", Font.PLAIN, 20));
        add(employeeid);
        
        //button row
        addemployee = new JButton("Add Employee");
        addemployee.setBounds(250, 450, 150, 30);
        addemployee.setBackground(Color.black);
        addemployee.setForeground(Color.white);
        addemployee.addActionListener(this);
        add(addemployee);
        
        //button row
        back = new JButton("Back");
        back.setBounds(500, 450, 150, 30);
        back.setBackground(Color.black);
        back.setForeground(Color.white);
        back.addActionListener(this);
        add(back);
        
        
        setSize(900, 600);
        setLocation(250, 40);
        setVisible(true);
    }
    
    public void actionPerformed(ActionEvent ae){
        if(ae.getSource() == addemployee){
            String name = tusername.getText();
            String fname = tfname.getText();
            String salary = tsalary.getText();
            String address = taddress.getText();
            String phone = tphone.getText();
            String email = temail.getText();
            String designation = tdesignation.getText();
            String dob = ((JTextField) tdob.getDateEditor().getUiComponent()).getText();
            String education = (String) teducation.getSelectedItem();
            String empid = employeeid.getText();
 

            
            
//            setVisible(false);
        }  else {
            setVisible(false);
            new Home();
        }
    }
    
    
    public static void main(String[] args)
    {
        new AddEmployee();
    }
}
