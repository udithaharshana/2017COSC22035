import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class userDetails extends JFrame{
    private JTextField txtName;
    private JTextField txtPassword;
    private JTextField txtEmail;
    private JTextField txtGPA;
    private JButton coursesButtonButton;
    private JButton logoutButtonButton;
    private JPanel panel1;

    public userDetails(String userName ){
        setContentPane(panel1);
        pack();
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setVisible(true);
        txtName.setText(userName);

        logoutButtonButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });
    }
}
