package CollegeAdmissionSystem;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Arrays;


public class selectCourses extends JFrame implements ActionListener {
    //int font=22;
    JLabel l1,l3;
    JButton b1, back;
    JCheckBox c1,c2,c3,c4,c5,c6;
    public static int[] choice = new int[6];


    selectCourses(){
        setSize(600,640);


        l1 = new JLabel();
        l1.setText("Select the Courses");
        l1.setFont(new Font("SERIF",Font.BOLD,28));
        l1.setForeground(Color.BLACK);
        l1.setBounds(150,0,400,100);
        add(l1);



        c1 = new JCheckBox("B.E.  CS ");
        c1.setBounds(100,100, 400,50);
        c1.setFont(new Font("SEGIO",Font.PLAIN,20));
        add(c1);
        c2 = new JCheckBox("B.E.  IT");
        c2.setBounds(100,150, 400,50);
        c2.setFont(new Font("SEGIO",Font.PLAIN,20));
        add(c2);
        c3 = new JCheckBox("B.E  Mechanical Engineering");
        c3.setBounds(100,200, 400,50);
        c3.setFont(new Font("SEGIO",Font.PLAIN,20));
        add(c3);
        c4 = new JCheckBox("B.E  EXTC");
        c4.setFont(new Font("SEGIO",Font.PLAIN,20));
        c4.setBounds(100,250, 400,50);
        add(c4);
        c5 = new JCheckBox("B.E  Electrical Engineering");
        c5.setFont(new Font("SEGIO",Font.PLAIN,20));
        c5.setBounds(100,300, 400,50);
        add(c5);
        c6 = new JCheckBox("B.E  AIDS");
        c6.setFont(new Font("SEGIO",Font.PLAIN,20));
        c6.setBounds(100,350, 400,50);
        add(c6);

        b1= new JButton("SUBMIT");
        b1.setBounds(200,550,120,40);
        b1.setFont(new Font("SEGIO",Font.PLAIN,20));
        b1.addActionListener(this);
        add(b1);

        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("back.png"));
        Image i2 = i1.getImage().getScaledInstance(70,40, Image.SCALE_SMOOTH);
        ImageIcon i3 = new ImageIcon(i2);
        back=new JButton(i3);
        back.setBounds(5,5,50,50);
        back.addActionListener(this);
        add(back);

        ImageIcon i4 = new ImageIcon(ClassLoader.getSystemResource("bg6.jpg"));
        Image i5 =i4.getImage().getScaledInstance(1000,600, Image.SCALE_SMOOTH);
        ImageIcon i6 = new ImageIcon(i5);
        JLabel l3 = new JLabel(i6);
        l3.setBounds(0,0,600,600);
        add(l3);

        setLocationRelativeTo(null);
        setLayout(null);
        setVisible(true);
        setResizable(false);


    }
    public void actionPerformed(ActionEvent ae){
        if(ae.getSource()==b1){
            int i = 0;
            if(c2.isSelected()){
                choice[i]= 1;
                i++;
            }
            if(c3.isSelected()){
                choice[i]= 2;
                i++;
            }
            if(c4.isSelected()){
                choice[i]= 3;
                i++;
            }
            if(c5.isSelected()){
                choice[i]= 4;
                i++;
            }
            if(c6.isSelected()) {
                choice[i] = 5;
                i++;
            }
            if(c1.isSelected()){
                choice[i]=6;
                i++;
            }
            System.out.println(Arrays.toString(choice));
            try{
                conn c = new conn();
                String str = "update selectstream set ch1 = '"+choice[0]+"', ch2 = '"+choice[1]+"', ch3 = '"+choice[2]+"', ch4 = '"+choice[3]+"', ch5 = '"+choice[4]+"', ch6 = '"+choice[5]+"' where id='100001'";
                c.s.executeUpdate(str);
                JOptionPane.showMessageDialog(null,"Courses Filled Successfully!");
            }catch (Exception e){
                System.out.println(e);
            }
            this.setVisible(false);
            new Main().setVisible(true);
        }
        if (ae.getSource()==back){
            new Main().setVisible(true);
            this.setVisible(false);
        }
    }
    public static void main(String args[])
    {
        new selectCourses();
    }
}