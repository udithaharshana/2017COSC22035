package FIS;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class userDetails extends JFrame{
    private JTextField txtName;
    private JTextField txtcaontactnumber;
    private JTextField txtEmail;
    private JTextField txtGPA;
    private JButton storeDeatilsButton;
    private JButton logoutButtonButton;
    private JPanel panel1;
    private JLabel txtCon;

    public userDetails(student user){
        setContentPane(panel1);
        pack();
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setVisible(true);
        txtName.setText(user.name);
        txtEmail.setText(user.email);
        txtcaontactnumber.setText(String.valueOf(user.phoneNumber));
        logoutButtonButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });

        storeDeatilsButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
    }
}
