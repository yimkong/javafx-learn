package myswing;

import javax.swing.*;
import javax.swing.border.Border;
import javax.swing.border.EmptyBorder;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * author yg
 * description
 * date 2020/12/14
 */
public class SimpleJudge extends JFrame {

    private JPanel contentPane;
    private JTextField textField;
    private JTextField textField_1;

    /**
     * Launch the application.
     */
    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    SimpleJudge frame = new SimpleJudge();
                    frame.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }

    /**
     * Create the frame.
     */
    public SimpleJudge() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 450, 300);
        contentPane = new JPanel();
        contentPane.setBackground(new Color(0, 153, 255));
        contentPane.setForeground(new Color(0, 51, 255));
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        setContentPane(contentPane);
        contentPane.setLayout(null);

        JLabel lbl = new JLabel("关于整数是否能被整除的判断");
        lbl.setFont(new Font("Monospaced", Font.BOLD, 18));
        lbl.setForeground(new Color(255, 204, 0));
        lbl.setBounds(125, 23, 220, 51);
        contentPane.add(lbl);

        JLabel lblNewLabel_1 = new JLabel("\u8BF7\u8F93\u5165\u4E00\u4E2A1-300\u4E4B\u95F4\u7684\u6574\u6570\uFF1A");
        lblNewLabel_1.setFont(new Font("����", Font.BOLD, 16));
        lblNewLabel_1.setForeground(new Color(153, 0, 0));
        lblNewLabel_1.setBounds(29, 84, 216, 33);
        contentPane.add(lblNewLabel_1);

        JLabel lblNewLabel_2 = new JLabel("\u8BE5\u6570\u662F\u5426\u53EF\u4EE5\u540C\u65F6\u88AB13\u548C7\u6574\u9664\uFF1A");
        lblNewLabel_2.setForeground(new Color(153, 0, 0));
        lblNewLabel_2.setFont(new Font("����", Font.BOLD, 16));
        lblNewLabel_2.setBounds(29, 138, 275, 33);
        contentPane.add(lblNewLabel_2);

        textField = new JTextField();
        textField.setBounds(279, 91, 119, 21);
        contentPane.add(textField);
        textField.setColumns(10);

        textField_1 = new JTextField();
        textField_1.setColumns(10);
        textField_1.setBounds(279, 145, 119, 21);
        contentPane.add(textField_1);

        JButton btnC = new JButton("\u5224\u65AD");
        btnC.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                int x = Integer.parseInt(textField.getText());
                if (x >= 1 & x <= 300) {
                    if (x % 13 == 0 && x % 7 == 0) {
                        textField_1.setText("true");
                    } else {
                        textField_1.setText("false");
                    }
                } else {
                    textField_1.setText("not in range");
                }
            }
        });
        btnC.setFont(new Font("����", Font.BOLD, 16));
        btnC.setForeground(new Color(51, 102, 51));
        btnC.setBounds(68, 196, 93, 23);
        contentPane.add(btnC);

        JButton btnN = new JButton("\u6E05\u7A7A");
        btnN.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                textField.setText("");
                textField_1.setText("");
            }
        });
        btnN.setForeground(new Color(51, 102, 51));
        btnN.setFont(new Font("����", Font.BOLD, 16));
        btnN.setBounds(264, 196, 93, 23);
        contentPane.add(btnN);
    }

}
