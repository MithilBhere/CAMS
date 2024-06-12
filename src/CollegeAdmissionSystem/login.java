package CollegeAdmissionSystem;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;

public class login extends JFrame implements ActionListener {
    JLabel l1,l2,l3;
    JTextField t1;
    JPasswordField p1;
    JButton signIn, cancel,back;
    login(){
        super("Admin Login");
        setBounds(200,200,600,600);



        l1 = new JLabel("Username");
        l1.setBounds(90,190,100,40);
        l1.setFont(new Font("Serif", Font.BOLD,19));
        add(l1);

        l2 = new JLabel("Password");
        l2.setBounds(90,250,100,40);
        l2.setFont(new Font("Serif", Font.BOLD,19));
        add(l2);

        l3 = new JLabel("ADMIN LOGIN");
        l3.setBounds(180,50,220,40);
        l3.setFont(new Font("Serif", Font.BOLD,30));
        add(l3);

        ImageIcon i7 = new ImageIcon(ClassLoader.getSystemResource("back.png"));
        Image i8 = i7.getImage().getScaledInstance(70,40, Image.SCALE_SMOOTH);
        ImageIcon i9 = new ImageIcon(i8);
        back=new JButton(i9);
        back.setBounds(5,5,50,50);
        back.addActionListener(this);
        back.setBackground(null);
        back.setBorder(null);

        add(back);



        //textfields
        t1 = new JTextField();
        t1.setFont(new Font("Times New Roman", Font.PLAIN,19));
        t1.setBounds(200,190,180,40);
        add(t1);

        p1 = new JPasswordField();
        p1.setBounds(200,250,180,40);
        add(p1);

        signIn = new JButton("SignIn");
        signIn.setBounds(90,330,120,60);
        signIn.setContentAreaFilled(false);
        //signIn.setBorder(null);
        signIn.setBackground(null);
        signIn.addActionListener(this);
        add(signIn);

        cancel = new JButton("Cancel");
        cancel.setBounds(350,330,110,60);
        cancel.addActionListener(this);
        add(cancel);

        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("b5.jpg"));
        Image i2 =i1.getImage().getScaledInstance(600,600, Image.SCALE_SMOOTH);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel l2 = new JLabel(i3);
        l2.setBounds(0,0,600,600);
        add(l2);

        setLocationRelativeTo(null);
        setLayout(null);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent ae){
        if(ae.getSource()==signIn){
            String username = t1.getText();
            String password = String.valueOf(p1.getPassword());
            conn c = new conn();
            String str = "Select * from adminlogin where usernameAdmin='"+username+"'and passAdmin='"+password+"'";
            try{
                ResultSet rs = c.s.executeQuery(str);
                if(rs.next()){
                    JOptionPane.showMessageDialog(null,"Login credentials Validated");
                    new adminHome().setVisible(true);
                    this.setVisible(false);
                }
                else{
                    JOptionPane.showMessageDialog(null,"Invalid Login credentials!");
                }
            }catch (Exception e){
                System.out.println(e);
                e.printStackTrace();
            }
        }
        if (ae.getSource()==cancel){
            int b = JOptionPane.showConfirmDialog(null,"Are Sure to Exit?");
            if(b==0){
                System.exit(0);
            }
        }
        if(ae.getSource() == back){
            new start().setVisible(true);
            this.setVisible(false);
        }
    }

    public static void main(String[] args) {
        new login();

    }

}