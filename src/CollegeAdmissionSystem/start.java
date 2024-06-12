package CollegeAdmissionSystem;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class start extends JFrame implements ActionListener {

    JButton admin, studSignUp, studSignin, back;
    JLabel l1;
    start(){
        setBounds(350,100,800,800);

        l1 = new JLabel("WELCOME TO COLLEGE ADMISSION PORTAL");
        l1.setBounds(75,0,800,100);
        l1.setFont(new Font("Counter-Strike",Font.PLAIN,30));
        l1.setForeground(Color.WHITE);
        add(l1);

        admin = new JButton("Admin");
        admin.setBounds(75,250,250,50);
//        admin.setBackground(null);
//        admin.setBorder(null);
//        admin.setContentAreaFilled(false);
        admin.addActionListener(this);
        add(admin);

       /* studSignUp = new JButton("SignUp");
        studSignUp.setBounds(310,680,230,60);
        studSignUp.setBackground(null);
        studSignUp.setBorder(null);
        studSignUp.setContentAreaFilled(false);
        studSignUp.addActionListener(this);
        add(studSignUp);*/

        studSignin = new JButton("Signin");
        studSignin.setBounds(450,250,250,50);
//        studSignin.setBackground(null);
//        studSignin.setBorder(null);
//        studSignin.setContentAreaFilled(false);
        studSignin.addActionListener(this);
        add(studSignin);

        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("cbg.jpg"));
        Image i2 =i1.getImage().getScaledInstance(800,800, Image.SCALE_SMOOTH);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel l3 = new JLabel(i3);
        l3.setBounds(0,0,800,800);
        add(l3);

        /*ImageIcon i4 = new ImageIcon(ClassLoader.getSystemResource("back.png"));
        Image i5 = i4.getImage().getScaledInstance(70,40, Image.SCALE_SMOOTH);
        ImageIcon i6 = new ImageIcon(i5);
        back=new JButton(i6);
        back.setBounds(5,5,50,50);
        back.addActionListener(this);
        add(back);*/


        setLayout(null);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent ae) {
        if(ae.getSource() == admin){
            new login().setVisible(true);
            this.setVisible(false);
        }
        if(ae.getSource() == studSignUp){
            new StudentSignUp().setVisible(true);
            this.setVisible(false);
        }
        if(ae.getSource() == studSignin){
            new stdlogin().setVisible(true);
            this.setVisible(false);
        }
        /*if(ae.getSource() == back){
            new start().setVisible(true);
            this.setVisible(false);
        }*/
    }

    public static void main(String[] args) {
        new start();
    }
}
