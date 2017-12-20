package FIS;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;
import java.sql.Statement;

import DBConnect.*;

public class storeDetails extends  JFrame{
    private JTextField txtUsername;
    private JTextField txtEmail;
    private JTextField txtUserId;
    private JButton logOutButton;
    private JButton button2;
    private JPasswordField txtPW;
    private JPanel panal1;

    public storeDetails() {
        setContentPane(panal1);
        pack();
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setVisible(true);
        logOutButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });
        button2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                insertDB();
            }
        });
    }

    public void insertDB(){
        String query = "INSERT INTO userdetails VALUES("+txtUserId.getText()+",'"+txtEmail.getText()+"','"+String.valueOf(txtPW.getPassword())+"',5)";
        System.out.println(query);
        dbConnect DB= new dbConnect();
        Statement stmt =null;
        try{
            stmt=DB.Conn2DB();
            stmt.executeUpdate(query);
            JOptionPane.showMessageDialog(null,"Stored Details");
        }catch (SQLException se){
            se.printStackTrace();
        }
        DB.closeDB();
    }
}
