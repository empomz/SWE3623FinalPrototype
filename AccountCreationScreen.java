import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileWriter;
import java.io.IOException;
public class AccountCreationScreen extends JFrame{
    private JPanel windowPanel;

    private JLabel KSU_Logo;
    private JButton joinButton;
    private JTextField fullName;
    private JLabel fName;
    private JLabel lName;
    private JTextField username;
    private JLabel pName;
    private JTextField phoneNumber;
    private JTextField emailAddress;
    private JLabel pWord;
    private JTextField password;
    private JLabel cNum;
    private JTextField CardNumber;
    private JLabel zCode;
    private JTextField zipCode;
    private JLabel reqDisclaimer;
    private JButton button1;

    private String newName;
    private String newPassword;
    private String newUsername;
    private String newAddress;
    private String newPhoneNumber;
    private String newCardInfo;



    public AccountCreationScreen(){

        setState(JFrame.MAXIMIZED_BOTH);
        setContentPane(windowPanel);
        setTitle("Login");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(330, 550);
        setLocationRelativeTo(null);
        setVisible(true);

        double width = windowPanel.getWidth();
        double height = windowPanel.getHeight();

        Font font = new Font("Plain", Font.PLAIN, (int) width / 25);

        setMinimumSize(new Dimension(1080, 1350));


        joinButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {


                fullName.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        newName = fullName.getText();
                    }
                });

                password.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {

                        newPassword = password.getText();

                    }
                });

                username.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        newUsername = username.getText();
                    }
                });

                emailAddress.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        newAddress = emailAddress.getText();
                    }
                });

                phoneNumber.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        newPhoneNumber = phoneNumber.getText();
                    }
                });

                CardNumber.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        newCardInfo = CardNumber.getText();
                    }
                });

            Student newStudent = new Student(newName,newUsername,newPassword,newAddress,newPhoneNumber,newCardInfo);
            try {
                FileWriter myWriter = new FileWriter("StudentInfo.txt");
                myWriter.write(newStudent.getName());
                myWriter.write(newStudent.getUsername());
                myWriter.write(newStudent.getPassword());
                myWriter.write(newStudent.getPhoneNumber());
                myWriter.write(newStudent.getCardInfo());
                myWriter.close();
            } catch (IOException a){
                System.out.println("An error occured.");
                a.printStackTrace();
            }

            if (e.getSource()==joinButton){
                dispose();

            }

            }





        });
    }
    public static void main(String[] args){

        new AccountCreationScreen();

    }
}


