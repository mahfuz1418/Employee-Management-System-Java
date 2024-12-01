package employe.management.system;
import java.awt.*;
import javax.swing.*;
import java.sql.*;
import net.proteanit.sql.DbUtils;
import java.awt.event.*;


public class ViewEmployee extends JFrame implements ActionListener {
    
    JTable table;
    Choice employeeid;
    JButton search, print, update, back, all;
    
    ViewEmployee(){
        
        getContentPane().setBackground(Color.WHITE);
        setLayout(null);
        
        JLabel searchlbl = new JLabel("Search By Employee ID: ");
        searchlbl.setBounds(20, 20, 150, 20);
        add(searchlbl);
        
        employeeid = new Choice();
        employeeid.setBounds(180, 20, 150, 20);
        add(employeeid);
        
        try{
            Conn c = new Conn();
            String query = "select * from employee";
            ResultSet rs = c.s.executeQuery(query);
            while(rs.next()){
                employeeid.add(rs.getString("employeeid"));
            }
        }catch(Exception e) {
            e.printStackTrace();
        }
        
        search = new JButton("Search");
        search.setBounds(340, 20, 80, 20);
        search.addActionListener(this);
        add(search);
        
        all = new JButton("All");
        all.setBounds(430, 20, 80, 20);
        all.addActionListener(this);
        add(all);
        
        print = new JButton("Print");
        print.setBounds(20, 60, 100, 20);
        print.addActionListener(this);
        add(print);
        
        update = new JButton("Update");
        update.setBounds(130, 60, 100, 20);
        update.addActionListener(this);
        add(update);
        
        back = new JButton("Back");
        back.setBounds(240, 60, 100, 20);
        back.addActionListener(this);
        add(back);
        
        
        table = new JTable();
        
        try{
            Conn c = new Conn();
            String query = "select * from employee";
            ResultSet rs = c.s.executeQuery(query);
            table.setModel(DbUtils.resultSetToTableModel(rs));
        }catch(Exception e) {
            e.printStackTrace();
        }
        
        JScrollPane jsp = new JScrollPane(table);
        jsp.setBounds(0, 100, 900, 600);
        add(jsp);
        
        
        setSize(900, 700);
        setLocation(250, 100);
        setVisible(true);
    }
    
    public void actionPerformed(ActionEvent ae){
        if(ae.getSource() == search){
            String query = "Select * from employee where employeeid = '"+employeeid.getSelectedItem()+"'";
            try{
                Conn c = new Conn();
                ResultSet rs = c.s.executeQuery(query);
                table.setModel(DbUtils.resultSetToTableModel(rs));
            }catch(Exception e) {
                e.printStackTrace();
            }
        } else if(ae.getSource() == print) {
            try {
                table.print();
            } catch (Exception e) {
                e.printStackTrace();
            }
        } else if(ae.getSource() == update) {
            setVisible(false);
            new UpdateEmployee(employeeid.getSelectedItem());
        } else if(ae.getSource() == all) {
            try{
                Conn c = new Conn();
                String query = "select * from employee";
                ResultSet rs = c.s.executeQuery(query);
                table.setModel(DbUtils.resultSetToTableModel(rs));
            }catch(Exception e) {
                e.printStackTrace();
            }
        } else {
            setVisible(false);
            new Home();
        }
    }
    
    public static void main(String[] args){
        new ViewEmployee();
    }
}
