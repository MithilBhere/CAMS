package CollegeAdmissionSystem;

import com.toedter.calendar.JDateChooser;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.SimpleDateFormat;

public class StudentSignUp extends JFrame implements ActionListener {
    JDateChooser DOB;
    ButtonGroup b1;
    JRadioButton r1,r2,r3;
    JLabel l1,l2,l3,l4,l5,l6,l7,l8,l9;
    JTextField name,email, aadhaar,gender,dob,contact,username;
    JPasswordField password;
    JButton submit;
    JButton home;
    public boolean bA, bC;
    int jbtnw = 100;
    int jbtnh = 40;
    int txtW = 180;
    int txtH = 40;
    StudentSignUp() {
        setBounds(400, 20, 550, 620);


        l1 = new JLabel("Name");
        l1.setBounds(50, 40, jbtnw, jbtnh);
        l1.setFont(new Font("TIMES NEW ROMAN", Font.BOLD, 14));
        l1.setForeground(Color.BLACK);
        add(l1);

        l2 = new JLabel("Gender");
        l2.setBounds(50, 90, jbtnw, jbtnh);
        l2.setFont(new Font("TIMES NEW ROMAN", Font.BOLD, 14));
        l2.setForeground(Color.BLACK);
        add(l2);

        l3 = new JLabel("D.O.B ");
        l3.setBounds(50, 140, jbtnw, jbtnh);
        l3.setFont(new Font("TIMES NEW ROMAN", Font.BOLD, 14));
        l3.setForeground(Color.BLACK);
        add(l3);

        l4 = new JLabel("Email-ID");
        l4.setBounds(50, 190, jbtnw, jbtnh);
        l4.setFont(new Font("TIMES NEW ROMAN", Font.BOLD, 14));
        l4.setForeground(Color.BLACK);
        add(l4);

        l5 = new JLabel("Contact");
        l5.setBounds(50, 240, jbtnw, jbtnh);
        l5.setFont(new Font("TIMES NEW ROMAN", Font.BOLD, 14));
        l5.setForeground(Color.BLACK);
        add(l5);

        l6 = new JLabel("AADHAAR NO");
        l6.setBounds(50, 290, jbtnw, jbtnh);
        l6.setFont(new Font("TIMES NEW ROMAN", Font.BOLD, 14));
        l6.setForeground(Color.BLACK);
        add(l6);

        l7 = new JLabel("Username");
        l7.setBounds(50, 340, jbtnw, jbtnh);
        l7.setFont(new Font("TIMES NEW ROMAN", Font.BOLD, 16));
        l7.setForeground(Color.BLACK);
        add(l7);

        l8 = new JLabel("Password");
        l8.setBounds(50, 390, jbtnw, jbtnh);
        l8.setFont(new Font("TIMES NEW ROMAN", Font.BOLD, 16));
        l8.setForeground(Color.BLACK);
        add(l8);

        // Text box(field)

        name = new JTextField();
        name.setBounds(180, 40, txtW, txtH);
        add(name);

        b1 = new ButtonGroup();     // this is use to select only one option like either male or female or other

        r1 = new JRadioButton("Male");
        r1.setBounds(180, 90, 80, 40);
        b1.add(r1);
        add(r1);

        r2 = new JRadioButton("Female");
        r2.setBounds(240, 90, 80, 40);
        b1.add(r2);
        add(r2);

        r3 = new JRadioButton("Other");
        r3.setBounds(320, 90, 80, 40);
        b1.add(r3);
        add(r3);

        DOB = new JDateChooser();
        DOB.setBounds(180, 140, txtW, txtH);
        add(DOB);

        email = new JTextField();
        email.setBounds(180, 190, txtW, txtH);
        add(email);

        contact = new JTextField();
        contact.setBounds(180, 240, txtW, txtH);
        add(contact);

        aadhaar = new JTextField();
        aadhaar.setBounds(180, 290, txtW, txtH);
        add(aadhaar);

        username = new JTextField();
        username.setBounds(180, 340, txtW, txtH);
        add(username);

        password = new JPasswordField();
        password.setBounds(180, 390, txtW, txtH);
        add(password);


        submit = new JButton("Sign Up");
        submit.setBounds(270, 460, 100, 70);
        submit.addActionListener(this);
        add(submit);

      ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("12.jpg"));
      Image i5 = i1.getImage().getScaledInstance(500,620,Image.SCALE_SMOOTH);
      ImageIcon i6 = new ImageIcon(i5);
        JLabel l9 = new JLabel(i6);
       l9.setBounds(0,0,550,620);
        add(l9);



        /*setBackground(Color.BLUE);*/
        setResizable(false);
        setLayout(null);
        setVisible(true);
    }
    public void actionPerformed(ActionEvent ae){
        if (ae.getSource()==submit){
            String aadhaar = this.aadhaar.getText();
            if(aadhaar.length()!=12){
                JOptionPane.showMessageDialog(null,"Enter 12 digit aaddhaar number");
                bA = false;
            }
            else{
                bA = true;
            }
            String contact = this.contact.getText();
            if(contact.length()!=10){
                JOptionPane.showMessageDialog(null,"Enter 10 digit contact number");
                bC = false;
            }
            else{
                bC = true;
            }
            SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy");
            String dob = dateFormat.format(DOB.getDate());

            String gender = null;
            if(r1.isSelected()){
                gender = "Male";
            }
            else if (r2.isSelected()) {
                gender = "Female";
            }
            else{
                gender = "Other";
            }
            String name = this.name.getText();
            String username = this.username.getText() ;
            String password = this.password.getText();
            String email = this.email.getText();


            if(bA&bC){
                conn c = new conn();
                String str1 = "insert into students_details (name,gender,dob,email,contact,aadhaar) values('"+name+"','"+gender+"','"+dob+"','"+email+"','"+contact+"','"+aadhaar+"');";
                String str2 = "insert into studlogin (studUsername,studPass) values('"+username+"','"+password+"');";

                try{
                    c.s.execute(str1);
                    c.s.execute(str2);

                    JOptionPane.showMessageDialog(null,"Signed Up Successfully!!!");
                   this.name.setText(null);
                    this.email.setText(null);
                    this.username.setText(null);
                    this.contact.setText(null);
                    this.aadhaar.setText(null);
                    this.password.setText(null);
                    this.r1.setSelected(false);
                    this.r2.setSelected(false);
                    this.r3.setSelected(false);

                }catch(Exception e){
                    System.out.println(e);
                    System.out.println(dob);
                }



            }
        }


    }

    public static void main(String[] args) {
        new StudentSignUp();
    }

}