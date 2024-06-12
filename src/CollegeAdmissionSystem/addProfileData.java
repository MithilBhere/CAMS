package CollegeAdmissionSystem;

import javax.imageio.stream.ImageInputStream;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;

public class addProfileData extends JFrame implements ActionListener {
    JLabel l1, l2, l3 ,l4 ,l5,l6, l7,l8,l9,l10,l11,l12,l13,l14,l15,l16;
    JTextField cetScore, hscScore, address, school, pNumber;
    JButton back, bHscResult, next1, next2, bPhoto,bAadhaar, bCasteCert,bLeavingCert, submit;
    JPanel pn;
    JTabbedPane tabs;
    JComboBox course1, course2, caste;
    JRadioButton pcm,pcb;
    int lw =150, lh = 80, font = 16,th = 40;

    addProfileData(){
        setSize(1200,800);
        setLocationRelativeTo(null);
        Container c = this.getContentPane();

        pn = new JPanel();
        pn.setBounds(80,80,1100,100);
        pn.setLayout(new FlowLayout(FlowLayout.CENTER,20,20));
        pn.setBackground(new Color(222,158,220));
        add(pn);

        l1 = new JLabel("Name: " +stdlogin.rName);
        l1.setBounds(100,50,lw,lh);
        l1.setFont(new Font("Tahoma",Font.BOLD,font));
        pn.add(l1);

        l2 = new JLabel("DOB: " +stdlogin.rDob);
        l2.setBounds(700,50,lw,lh);
        l2.setFont(new Font("Tahoma",Font.BOLD,font));
        pn.add(l2);

        l3 = new JLabel("ID = " +stdlogin.sesId);
        l3.setBounds(100,50,lw,lh);
        l3.setFont(new Font("Tahoma",Font.BOLD,font));
        pn.add(l3);

        l4 = new JLabel("Aadhaar: " +stdlogin.rAadhaar);
        l4.setBounds(400,50,lw,lh);
        l4.setFont(new Font("Tahoma",Font.BOLD,font));
        pn.add(l4);

        JPanel p2 = new JPanel();
        p2.setLayout(null);
        JPanel p3 = new JPanel();
        p3.setLayout(null);
        JPanel p4 = new JPanel();
        p4.setLayout(null);

        /*l5 = new JLabel("CET Score");
        l5.setBounds(20,50,lw,lh);
        p2.add(l5);

        cetScore = new JTextField();
        // cetScore.setFont(new Font("Tahoma",Font.PLAIN,font));
        cetScore.setBounds(200, 50, lw, 40);
        p2.add(cetScore);*/

        l6 = new JLabel("HSC Score");
        l6.setBounds(520,70,lw,40);
        p2.add(l6);

        hscScore = new JTextField();
        hscScore.setFont(new Font("Tahoma",Font.PLAIN,font));
        hscScore.setBounds(700, 70, lw, 40);
        p2.add(hscScore);

        l7 = new JLabel("HSC Result");
        l7.setBounds(30,70,lw,40);
        p2.add(l7);

        bHscResult = new JButton("Upload File");
        // hscScore.setFont(new Font("Tahoma",Font.PLAIN,font));
        bHscResult.setBounds(200, 70, 180, 30);
        bHscResult.addActionListener(this);
        p2.add(bHscResult);

        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("bg3.jpg"));
        Image i2 = i1.getImage().getScaledInstance(1500,900,Image.SCALE_SMOOTH);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel l3 = new JLabel(i3);
        l3.setBounds(0,0,1500,900);
        add(l3);

   /*     l8 = new JLabel("HSC Result");
        l8.setBounds(530,160,lw,40);
        p2.add(l8);

        hsc = new JTextField();
        // hscScore.setFont(new Font("Tahoma",Font.PLAIN,font));
        hsc.setBounds(700, 70, lw, 40);
        p2.add(hsc);*/

        next1 = new JButton("Next");
        // hscScore.setFont(new Font("Tahoma",Font.PLAIN,font));
        next1.setBounds(500, 280, 100, 50);
        next1.addActionListener(this);
        p2.add(next1);

        //Personal Detail Tab

        l8 = new JLabel("Address");
        l8.setBounds(30,50,lw,40);
        p3.add(l8);

        address = new JTextField();
        address.setBounds(150,50,700,30);
        p3.add(address);

        l9 = new JLabel("School Name");
        l9.setBounds(30,120,lw,40);
        p3.add(l9);

        school = new JTextField();
        school.setBounds(160,120,150,30);
        p3.add(school);

        l10 = new JLabel("Parents Mobile Number");
        l10.setBounds(400,120,lw,40);
        p3.add(l10);

        pNumber = new JTextField();
        pNumber.setBounds(600,120,150,30);
        p3.add(pNumber);

        l11 = new JLabel("Caste");
        l11.setBounds(850,120,lw,40);
        p3.add(l11);

        String caste1[] = {"General", "OBC", "SC", "ST", "VJNT", "EBC/EWS/SEBS"};
        caste = new JComboBox(caste1);
        caste.setBounds(920,120,150,30);
        p3.add(caste);

        l12 = new JLabel("Photo");
        l12.setBounds(230,250,lw,40);
        p3.add(l12);

        bPhoto = new JButton("Upload Photo");
        bPhoto.setBounds(320,250,150,30);
        bPhoto.addActionListener(this);
        p3.add(bPhoto);

        l13 = new JLabel("Photo");
        l13.setBounds(600,250,lw,40);
        p3.add(l13);

        bAadhaar = new JButton("Upload Aadhaar");
        bAadhaar.setBounds(680,250,150,30);
        bAadhaar.addActionListener(this);
        p3.add(bAadhaar);

//        next2 = new JButton("Next");
//        next2.setBounds(500,320,100,50);

        next2 = new JButton("Next");
        // hscScore.setFont(new Font("Tahoma",Font.PLAIN,font));
        next2.setBounds(500, 300, 100, 50);
        next2.addActionListener(this);
        p3.add(next2);

        // Document Tab

        l14 = new JLabel("Caste Certificate");
        l14.setBounds(50,70,lw,40);
        p4.add(l14);

        bCasteCert = new JButton("Upload Caste Certificate ");
        bCasteCert.setBounds(200,80,190,30);
        bCasteCert.addActionListener(this);
        p4.add(bCasteCert);

        l15 = new JLabel("Leaving Certificate");
        l15.setBounds(700,70,lw,40);
        p4.add(l15);

        bLeavingCert = new JButton("Upload Leaving Certificate ");
        bLeavingCert.setBounds(870,80,190,30);
        bLeavingCert.addActionListener(this);
        p4.add(bLeavingCert);

        submit = new JButton("Submit");
        submit.setBounds(200,230,200,80);
        submit.addActionListener(this);
        p4.add(submit);

        tabs = new JTabbedPane();
        tabs.setBounds(80,280,1100,400);
        tabs.setFont(new Font("Tahoma",Font.BOLD,font));

        tabs.add("HSC Details", p2);
        tabs.add("Personal", p3);
        tabs.add("Documents", p4);
        l3.add(tabs);

        //JButton Back;

        ImageIcon i4 = new ImageIcon(ClassLoader.getSystemResource("back.png"));
        Image i5 = i4.getImage().getScaledInstance(70,40,Image.SCALE_SMOOTH);
        ImageIcon i6 = new ImageIcon(i5);
        back = new JButton(i6);
        back.setBounds(5,5,50,50);
        back.addActionListener(this);
        add(back);


        setLayout(null);
        setVisible(true);

    }


    public void actionPerformed(ActionEvent ae) {
        int result = 1;
        if(ae.getSource() == back){
            new Main().setVisible(true);
            this.setVisible(false);
        }
        // For Certificate Upload;

        if(ae.getSource() == bHscResult){
            JFileChooser add = new JFileChooser();
            result = add.showOpenDialog(null);
            System.out.println(result);   // it will give the value as 0 if the file is selected successfull;
            File selectedFile = add.getSelectedFile();
            String fileName = selectedFile.getName();
            String path = selectedFile.getAbsolutePath();
            System.out.println(fileName);
            System.out.println(path);
            String dppath = "C:\\Users\\Mithil\\OneDrive\\Desktop\\";
            dppath = dppath.concat(fileName);  // it will show that path is created successfuly

            try{
                conn c = new conn();
                String str = "update files set hscResult = '"+dppath+"' where fid = '"+stdlogin.sesId+"'";
                c.s.executeUpdate(str);
            }catch(Exception e){
                System.out.println(e);
            }
        }
        if(ae.getSource() == next1){
            if(result != 0){
                JOptionPane.showMessageDialog(null,"Please Upload the HSC Result");
            }else {
                tabs.setSelectedIndex(1);
            }
        }
        if (ae.getSource() == next2) {
            tabs.setSelectedIndex(2);
        }
        if (ae.getSource() == bPhoto) {
            JFileChooser add = new JFileChooser();
            result = add.showOpenDialog(null);
            //System.out.println(result);
            File selectedFile = add.getSelectedFile();
            String fileName = selectedFile.getName();
            String path = selectedFile.getAbsolutePath();
           // System.out.println(fileName);
            //System.out.println(path);
            String dppath = "C:\\Users\\Mithil\\OneDrive\\Desktop\\";
            dppath = dppath.concat(fileName);
            //System.out.println(dppath); // path created for files successfully

            try{
                conn c = new conn();
                String str = "update files set photo = '"+dppath+"' where fid ='"+stdlogin.sesId+"'";
                c.s.executeUpdate(str);

            }catch (Exception e){
                System.out.println(e);
            }

            //aadhar card photo upload
            if (ae.getSource() == bAadhaar) {
                 add = new JFileChooser();
                result = add.showOpenDialog(null);
                System.out.println(result); // it will return 0 if file is choosen successfully
                selectedFile = add.getSelectedFile();
                 fileName = selectedFile.getName();
                path = selectedFile.getAbsolutePath();
                System.out.println(fileName);
                System.out.println(path);
                 dppath = "Downloads";
                dppath = dppath.concat(fileName);
                System.out.println(dppath); // path created for files successfully

                try{
                    conn c = new conn();
                    String str = "update files set aadhaar = '"+dppath+"' where fid ='"+stdlogin.sesId+"'";
                    c.s.executeUpdate(str);

                }catch (Exception e){
                    System.out.println(e);
                }
            }
            //caste certificate upload
            if (ae.getSource() == bCasteCert) {
                 add = new JFileChooser();
                result = add.showOpenDialog(null);
                System.out.println(result); // will rteturn 0 if file is choosen successfully
                 selectedFile = add.getSelectedFile();
                 fileName = selectedFile.getName();
                 path = selectedFile.getAbsolutePath();
                System.out.println(fileName);
                System.out.println(path);
                dppath = "C:\\Users\\Mithil\\OneDrive\\Desktop\\";
                dppath = dppath.concat(fileName);
                System.out.println(dppath); // path created for files successfully

                try{
                    conn c = new conn();
                    String str = "update files set caste = '"+dppath+"' where fid ='"+stdlogin.sesId+"'";
                    c.s.executeUpdate(str);

                }catch (Exception e){
                    System.out.println(e);
                }
            }
            // leaving certificate upload
            if (ae.getSource() == bLeavingCert) {
                 add = new JFileChooser();
                result = add.showOpenDialog(null);
                System.out.println(result); // will rteturn 0 if file is choosen successfully
                 selectedFile = add.getSelectedFile();
                 fileName = selectedFile.getName();
                 path = selectedFile.getAbsolutePath();
                System.out.println(fileName);
                System.out.println(path);
                dppath = "C:\\Users\\Mithil\\OneDrive\\Desktop\\";
                dppath = dppath.concat(fileName);
                System.out.println(dppath); // path created for files successfully

                try{
                    conn c = new conn();
                    String str = "update files set leavingCertificate = '"+dppath+"' where fid ='"+stdlogin.sesId+"'";
                    c.s.executeUpdate(str);

                }catch (Exception e){
                    System.out.println(e);
                }
            }
            //HSC result upload


            if (ae.getSource() == submit) {
                //String cetScore = this.cetScore.getText();
                String hscScore = this.hscScore.getText();
                String address = this.address.getText();
                String schoolName = this.school.getText();
                String parentsNumber = this.pNumber.getText();
                String caste = this.caste.getName();
                int b = JOptionPane.showConfirmDialog(null,"Are you Sure to Submit?");
                if(b==0) {
                    try {
                        conn c = new conn();
                        String str1 = "update students_details set hscScore = '" + hscScore + "', parentsNumber = '" + parentsNumber + "' , schoolname = '" + schoolName + "' address = '" + address + "'";
                        c.s.executeUpdate(str1);
                        JOptionPane.showMessageDialog(null, "Profile Details Added Successfully!");
                        this.setVisible(false);
                        new Main().setVisible(true);
                    } catch (Exception e) {
                        System.out.println(e);
                    }
                }
                else if(b!=0){
                    JOptionPane.showMessageDialog(null,"Please Add the Profile Details...");
                }





            }
        }

        }

    public static void main(String[] args) {
        new addProfileData();
    }
    }
