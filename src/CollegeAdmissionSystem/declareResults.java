package CollegeAdmissionSystem;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class declareResults extends JFrame implements ActionListener {

    JButton result, retrieve;
    declareResults(){
        setSize(600,300);

        result = new JButton("Declare Result");
        result.setBounds(70,60,200,70);
        result.addActionListener(this);
        add(result);

        retrieve = new JButton("Retrieve Result");
        retrieve.setBounds(320,60,200,70);
        retrieve.addActionListener(this);
        add(retrieve);

        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("bg9.jpg"));
        Image i2 =i1.getImage().getScaledInstance(600,300, Image.SCALE_SMOOTH);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel l3 = new JLabel(i3);
        l3.setBounds(0,0,600,300);
        add(l3);

        ImageIcon i4 = new ImageIcon(ClassLoader.getSystemResource("bg9.jpg"));
        Image i5 =i4.getImage().getScaledInstance(600,300, Image.SCALE_SMOOTH);
        ImageIcon i6 = new ImageIcon(i5);
        JLabel l4 = new JLabel(i6);
        l4.setBounds(0,0,600,300);
        add(l4);


        setLayout(null);
        setLocationRelativeTo(null);
        setVisible(true);

    }


    public void actionPerformed(ActionEvent ae) {
        if(ae.getSource() == result){
            try {
                conn c = new conn();
                String str1 = "update adminlogin set result = '1' where usernameAdmin= '2512'";
                c.s.executeUpdate(str1);
                JOptionPane.showMessageDialog(null,"RESULT DECLARED SUCCESSFULLY!!!");
                //resultDeclared=true;
            } catch (Exception e) {
                System.out.println(e);
            }
        }
        if(ae.getSource() == retrieve){
            try{
                conn c = new conn();
                String str2 = "update adminlogin set result = '0' where usernameAdmin = ''";
                c.s.executeUpdate(str2);
                JOptionPane.showMessageDialog(null,"RESULT RETRIEVED SUCCESSFULLY!!!");
            }catch(Exception e){
                System.out.println(e);
            }
        }

    }

    public static void main(String[] args) {
        new declareResults();
    }
}
