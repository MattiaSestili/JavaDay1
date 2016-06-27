package dayOne;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import javax.swing.text.ChangedCharSetException;

/**
 * Created by student on 27-Jun-16.
 */
public class ValidatePassword {

    JFrame mainFrame;
    JPanel panel;
    JButton buttonValidate;
    JTextArea passwordTxt;

    boolean result;

    //constructor


    public ValidatePassword() {
        mainFrame = new JFrame("Password Validation");
        mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        mainFrame.setSize(400, 100);
        mainFrame.setResizable(false);
        mainFrame.setLayout(new FlowLayout());
        mainFrame.setLocationRelativeTo(null);

        panel = new JPanel();
        panel.setSize(400,100);

        //add components to panel
        passwordTxt = new JTextArea("", 1, 15);
        panel.add(passwordTxt, BorderLayout.WEST);

        buttonValidate = new JButton("Validate");

        buttonValidate.addActionListener(event -> {
            result = validate(passwordTxt.getText());
            JOptionPane.showMessageDialog(null, result);

            if (result) JOptionPane.showMessageDialog(null, "Your password met the requirment");
            else JOptionPane.showMessageDialog(null, "Your password does not meet the requirements");
        });

        panel.add(buttonValidate, BorderLayout.EAST);
        mainFrame.add(panel);
        mainFrame.setVisible(true);

        /**
         buttonValidate.addActionListener(new ActionListener() {
        @Override public void actionPerformed(ActionEvent e) {

        }
        });
         **/
    }

    static boolean validate (String password){

        int letter = 0;
        int digit = 0;
        int symbols = 0;
        int lenght = 0;

        for(char ch : password.toCharArray()){
            if (Character.isLetter(ch)) {
                letter++;
            }
            else if ((ch == '#') || (ch =='$') || (ch == '£')) {
                symbols++;
            }
            else if (Character.isDigit(ch)){
                digit++;
            }
            else{
                lenght++;
            }


            if ((lenght >= 5 && lenght <= 10) && letter > 0 && digit > 0
                    && symbols > 0){
                return true;
            }
        }
        return false;

        /**Regular expression
            (?=.*[0-9]) @a digit must occur at least once
            (?=.*[a-z]) @ a lower case must occur at least once
            (?=.*[A-Z]) @ a upper case must occur at least once
            (?=.*[@#$%^&+=]) a special character must occur at least once
            (?=\S+$) no whitespace allowed in the entire string
            .{8,} anything at least eight places through
        */
    }

    public static void main(String[] args) {
        new ValidatePassword();
    }
}
