package hospital.management.system;

import javax.swing.*;
import java.awt.*;
import java.lang.reflect.MalformedParametersException;

public class NEW_PATIENT extends JFrame {

    JComboBox comboBox;

    JTextField textFieldNumber, textName, textFieldCountry, textFieldDeposite;

    JRadioButton r1, r2;

    Choice c1;
    JLabel date;

    JButton b1, b2;


    NEW_PATIENT(){

        JPanel panel = new JPanel();
        panel.setBounds(5,5,840,540);
        panel.setBackground(new Color(90,156,163));
        panel.setLayout(null);
        add(panel);

        ImageIcon imageIcon = new ImageIcon(ClassLoader.getSystemResource("icon/patient.png"));
        Image image = imageIcon.getImage().getScaledInstance(200,200,Image.SCALE_DEFAULT);
        ImageIcon imageIcon1 = new ImageIcon(image);
        JLabel label = new JLabel(imageIcon1);
        label.setBounds(550,150,200,200);
        panel.add(label);


        JLabel labelname = new JLabel("NEW PATIENT FORM");
        labelname.setBounds(118,11,260,53);
        labelname.setFont(new Font("Tahoma",Font.BOLD,20));
        panel.add(labelname);



        JLabel labelID = new JLabel("ID :");
        labelID.setBounds(35,76,200,14);
        labelID.setFont(new Font("Tahoma",Font.BOLD,14));
        labelID.setForeground(Color.white);
        panel.add(labelID);

        comboBox = new JComboBox(new String[]{"Adhar card","Voter id","Driving license"});
        comboBox.setBounds(271,73,150,20);
        comboBox.setBackground(new Color(3,45,48));
        comboBox.setForeground(Color.white);
        labelID.setFont(new Font("Tahoma",Font.BOLD,14));
        panel.add(comboBox);


        JLabel labelNumber = new JLabel("Number :");
        labelNumber.setBounds(35,111,200,14);
        labelNumber.setFont(new Font("Tahoma",Font.BOLD,14));
        labelNumber.setForeground(Color.white);
        panel.add(labelNumber);


        textFieldNumber = new JTextField();
        textFieldNumber.setBounds(271,111,150,20);
        panel.add(textFieldNumber);

        JLabel labelName1 = new JLabel("Name :");
        labelName1.setBounds(35,151,200,14);
        labelName1.setFont(new Font("Tahoma",Font.BOLD,14));
        labelName1.setForeground(Color.white);
        panel.add(labelName1);


        textName = new JTextField();
        textName.setBounds(271,151,150,20);
        panel.add(textName);


        JLabel labelGender = new JLabel("Gender :");
        labelGender.setBounds(35,191,200,14);
        labelGender.setFont(new Font("Tahoma",Font.BOLD,14));
        labelGender.setForeground(Color.white);
        panel.add(labelGender);

        r1 = new JRadioButton("Male");
        r1.setFont(new Font("Tahoma",Font.BOLD,14));
        r1.setForeground(Color.white);
        r1.setBackground(new Color(109,164,170));
        r1.setBounds(271,191,80,15);
        panel.add(r1);





        setSize(850,550);
        setLayout(null);
        setLocation(300,250);
        setVisible(true);

    }

    public static void main(String[] args) {
        new NEW_PATIENT();
    }
}
