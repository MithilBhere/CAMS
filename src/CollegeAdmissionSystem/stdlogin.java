package CollegeAdmissionSystem;

import com.mysql.cj.x.protobuf.MysqlxCursor;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;
import java.sql.SQLException;

public class stdlogin extends JFrame implements ActionListener {
    public static String rName, rDob, rAadhaar, rHSCSCORE, rContact;

    public static int sesId;
    JLabel l1,l2,l3,l4,l5,l6,l7,l8,l9;
    JTextField t1;
    JPasswordField p1;
    JButton SignIn,Cancel,SignUp, back;
    JScrollPane sp1,sp2;
    stdlogin(){
        super("Student Login");


        setBounds(200,200,1000,650);

        JFrame f = new JFrame();



/*        sp1 = new JScrollPane();
        sp1.setBounds(0,0,600,700);
        add(sp1);
*/
       /* sp2 = new JScrollPane();
        sp2.setBounds(600,650,400,650);
        sp2.setBackground(Color.BLUE);
        sp2.setOpaque(true);
        add(sp2);*/



        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("first.jpg"));
        Image i2 = i1.getImage().getScaledInstance(600,650,Image.SCALE_SMOOTH);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel l2 = new JLabel(i3);

        l2.setBounds(0,0,600,650);
        //sp1.setViewportView(l2);
       add(l2);
       


        ImageIcon i4 = new ImageIcon(ClassLoader.getSystemResource("21453459.jpg"));
        Image i5 = i4.getImage().getScaledInstance(150,150,Image.SCALE_SMOOTH);
        ImageIcon i6 = new ImageIcon(i5);
        JLabel l3 = new JLabel(i6);
        l3.setBounds(750,90,80,100);
        add(l3);

        l4 = new JLabel("Welcome");
        l4.setBounds(750,200,200,100);
        l4.setFont(new Font("Forte",Font.PLAIN,28));
        add(l4);

        l5 = new JLabel("COLLEGE ADMISSION PORTAL");
        l5.setBounds(650,0,500,100);
        l5.setFont(new Font("Counter-Strike",Font.PLAIN,20));
        add(l5);

        l6 = new JLabel(" Username");
        l6.setBounds(610,295,400,100);
        l6.setFont(new Font("Calibri (Body)",Font.PLAIN,18));
        add(l6);

        l7 = new JLabel(" Password");
        l7.setBounds(610,395,400,100);
        l7.setFont(new Font("Calibri (Body)",Font.PLAIN,18));
        add(l7);

        l8 = new JLabel("Don't have an account?");
        l8.setBounds(650,510,400,100);
        l8.setFont(new Font("Calibri (Body)",Font.PLAIN,16));
        add(l8);


        t1 = new JTextField();
        t1.setFont(new Font("Calibri (Body)",Font.PLAIN,18));
        t1.setBounds(700,325,275,40);
        add(t1);

        p1 = new JPasswordField();
        p1.setBounds(700,425,275,40);
        add(p1);

        SignIn = new JButton("Login");
        SignIn.setBounds(610,500,365,30);
       SignIn.setContentAreaFilled(false);
       //SignIn.setBorder();
       SignIn.setBackground(null);
      // SignIn.setOpaque(true);
        SignIn.addActionListener(this);
        add(SignIn);

        SignUp = new JButton("Sign Up");
        SignUp.setBounds(710,545,365,30);
        SignUp.setContentAreaFilled(false);
        SignUp.setBorder(null);
        SignUp.setBackground(null);
        SignUp.addActionListener(this);
        add(SignUp);



        ImageIcon i7 = new ImageIcon(ClassLoader.getSystemResource("back.png"));
        Image i8 = i7.getImage().getScaledInstance(70,40, Image.SCALE_SMOOTH);
        ImageIcon i9 = new ImageIcon(i8);
        back=new JButton(i9);
        back.setBounds(5,5,50,50);
        back.addActionListener(this);
        back.setBackground(null);
        back.setBorder(null);

        add(back);



        setLayout(null);
        setLocationRelativeTo(null);
        setVisible(true);
        setResizable(false);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        Color color=new Color(44, 121, 246);
        f.getContentPane().setBackground(color);
        f.setBounds(630, 0, 400, 650);


    }

    public void actionPerformed(ActionEvent ae) {
        if(ae.getSource() == SignIn){
            String username = t1.getText();
            String password = String.valueOf(p1.getPassword());
            conn c = new conn();
            String str = "Select * from studLogin where studUsername = '"+username+"' and studPass = '"+password+"'";
            try {
                ResultSet rs = c.s.executeQuery(str);
                if(rs.next()){
                    JOptionPane.showMessageDialog(null,"Login Successfully!!!!");
                    String str1 = "Select id from studLogin where studUsername = '"+username+"'and studPass = '"+password+"';";
                    ResultSet rs1 = c.s.executeQuery(str1);
                    if(rs1.next()){
                        sesId = rs1.getInt("id");
                        System.out.println(sesId);

                    }
                    String str2 = "Select name, dob, aadhaar, hscscore, contact from students_details where id = '"+stdlogin.sesId+"'";
                    ResultSet rs2 = c.s.executeQuery(str2);
                    while(rs2.next()){
                        rName = rs2.getString("name");
                        rDob = rs2.getString("dob");
                        rAadhaar = rs2.getString("aadhaar");
                        rHSCSCORE = rs2.getString("hscscore");
                        rContact = rs2.getString("contact");

                    }
                     new Main().setVisible(true);
                    this.setVisible(false);
                }
                else{
                    JOptionPane.showMessageDialog(null,"Invalid Login!!!!");
                }
            } catch (Exception e) {
                System.out.println(e);
            }

        }

        if(ae.getSource() == SignUp){
            StudentSignUp a = new StudentSignUp();


        }
        if(ae.getSource() == back){
            new start().setVisible(true);
            this.setVisible(false);
        }

    }


    public static void main(String[] args) {
        new stdlogin();
    }

}

// 895623741659
// 8956239853
// 526075615338