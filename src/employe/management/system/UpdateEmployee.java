package employe.management.system;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;

public class UpdateEmployee extends JFrame implements ActionListener{
 
    JTextField tusername, tfname, tsalary, taddress, tphone, temail, tdesignation, tnid, tdob, teducation;
    JButton updateemployee, back;
    JLabel employeeid;
    String empId;
    
    UpdateEmployee(String empid) {
        this.empId = empid;
        getContentPane().setBackground(Color.WHITE);
        setLayout(null);
        
        JLabel heading = new JLabel("UPDATE EMPLOYEE");
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
        
        tdob = new JTextField();
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
        
        JLabel labelhedu = new JLabel("Education: ");
        labelhedu.setBounds(400, 300, 150, 30);
        labelhedu.setFont(new Font("san_serif", Font.PLAIN, 20));
        add(labelhedu);
        
        teducation = new JTextField();
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
        
        JLabel labelnid = new JLabel("NID : ");
        labelnid.setBounds(400, 350, 150, 30);
        labelnid.setFont(new Font("san_serif", Font.PLAIN, 20));
        add(labelnid);
        
        tnid = new JTextField();
        tnid.setBounds(600, 350, 150, 30);
        add(tnid);
        
//        5th row
        JLabel lableid = new JLabel("Employee ID : ");
        lableid.setBounds(50, 400, 150, 30);
        lableid.setFont(new Font("san_serif", Font.PLAIN, 20));
        add(lableid);
        
        employeeid = new JLabel();
        employeeid.setBounds(200, 400, 150, 30);
        employeeid.setFont(new Font("san_serif", Font.PLAIN, 20));
        add(employeeid);
        
        try {
            Conn c = new Conn();
            String query = "select * from employee where employeeid = '"+empId+"'";
            ResultSet rs = c.s.executeQuery(query);
            while(rs.next()) {
                tusername.setText(rs.getString("name"));
                tfname.setText(rs.getString("fname"));
                tdob.setText(rs.getString("dob"));
                taddress.setText(rs.getString("address"));
                tsalary.setText(rs.getString("salary"));
                tphone.setText(rs.getString("phone"));
                temail.setText(rs.getString("email"));
                teducation.setText(rs.getString("education"));
                tnid.setText(rs.getString("nid"));
                employeeid.setText(rs.getString("employeeid"));
                tdesignation.setText(rs.getString("designation"));
                
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        
        //button row
        updateemployee = new JButton("Update Employee");
        updateemployee.setBounds(250, 450, 150, 30);
        updateemployee.setBackground(Color.black);
        updateemployee.setForeground(Color.white);
        updateemployee.addActionListener(this);
        add(updateemployee);
        
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
        if(ae.getSource() == updateemployee){
            String name = tusername.getText();
            String fname = tfname.getText();
            String salary = tsalary.getText();
            String address = taddress.getText();
            String phone = tphone.getText();
            String email = temail.getText();
            String designation = tdesignation.getText();
            String dob = tdob.getText();
            String education = teducation.getText();     
            String nid = tnid.getText();

            
            try {
                Conn conn = new Conn();
                String query = "update employee set name = '"+name+"', fname = '"+fname+"', salary = '"+salary+"', address = '"+address+"', phone = '"+phone+"', email =  '"+email+"', education = '"+education+"', designation = '"+designation+"', dob = '"+dob+"', nid = '"+nid+"' where employeeid = '"+empId+"'";
                conn.s.executeUpdate(query);
                JOptionPane.showMessageDialog(null, "Employee details updated successfully");
                setVisible(false);
                new ViewEmployee();
            }catch (Exception e) {
                e.printStackTrace();
            }
        }  else {
            setVisible(false);
            new Home();
        }
    }
    
    
    public static void main(String[] args)
    {
        new UpdateEmployee("");
    }
}
