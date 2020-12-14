package myswing;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 * author yg
 * description
 * date 2020/12/14
 */
public class CountWord extends JFrame {
    JTextField nameTextField;
    JTextArea jTextArea;
    JTextField countField;

    CountWord() {
        //文章部分
        JPanel articlePanel = new JPanel();
        jTextArea = new JTextArea("", 40, 70);
        jTextArea.setLineWrap(true);
        Dimension size = jTextArea.getPreferredSize();    //获得文本域的首选大小
        JScrollPane jScrollPane = new JScrollPane(jTextArea);
        jScrollPane.setBounds(110, 90, size.width, size.height);
        articlePanel.add(jScrollPane);
        this.add(articlePanel);

        //文章名字以及读取按钮
        JPanel bottom = new JPanel();
//        bottom.setBorder(BorderFactory.createLineBorder(Color.black));//
        JLabel countLabel = new JLabel("单词数量:");
        JButton jButton = new JButton("提交文章名字");
        countField = new JTextField(5);
        countField.setText("0");
        nameTextField = new JTextField(15);
        nameTextField.setBounds(0, 0, 50, -1);
        jButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String text = nameTextField.getText();
                if (text.length() == 0) {
                    JOptionPane.showMessageDialog(null, "空！", "错误 ", 0);
                } else {
                    jTextArea.setText("");
                    try {
                        File myObj = new File(text);
                        Scanner myReader = new Scanner(myObj);
                        while (myReader.hasNextLine()) {
                            String data = myReader.nextLine();
                            jTextArea.append(data + "\n");
                        }
                        myReader.close();
                    } catch (FileNotFoundException ex) {
                        JOptionPane.showMessageDialog(null, "找不到文件！", "错误 ", 0);
                    }
                    String[] split = jTextArea.getText().split("\\s+|\\\\n+");
                    countField.setText("" + split.length);
                }
            }
        });

        bottom.add(nameTextField);
        bottom.add(jButton);
        bottom.add(countLabel);
        bottom.add(countField);
        bottom.setLayout(new FlowLayout(FlowLayout.CENTER, 35, 5));

        this.add(bottom, BorderLayout.SOUTH);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
        this.pack();
    }

    public static void main(String[] args) {
        new CountWord();
    }
}
