import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class BaseScreen extends JFrame {

    private JPanel windowPanel;
    private JButton logOutButton;
    private JButton AdvisingButton;
    private JButton SDSButton;
    private JButton ASButton;
    private JButton mainButton;

    public BaseScreen() {

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

        logOutButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                dispose();

            }
        });
        mainButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                dispose();

            }
        });

        AdvisingButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                dispose();

            }
        });
        SDSButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                dispose();

            }
        });
        ASButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                dispose();

            }
        });
    }


    public static void main(String[] args){

        new BaseScreen();

    }

}
