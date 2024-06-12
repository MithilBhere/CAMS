package CollegeAdmissionSystem;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.IOException;

public class scrutiny extends JFrame implements ActionListener {
    JTabbedPane tab;
    JPanel caste, hsc, photo, aadhaar, lc, p1;
    JButton accept, reject;
    JLabel l1;


    scrutiny() {
        //setSize(750,700);
        setExtendedState(this.getExtendedState() | JFrame.MAXIMIZED_BOTH);

        caste = new JPanel();
        caste.setLayout(null);
        lc = new JPanel();
        lc.setLayout(null);
        aadhaar = new JPanel();
        aadhaar.setLayout(null);
        hsc = new JPanel();
        hsc.setLayout(null);
        photo = new JPanel();
        photo.setLayout(null);

        p1 = new JPanel();
        p1.setBounds(0, 0, 600, 650);
        p1.setLayout(null);
        //p1.setBackground(Color.CYAN);
        aadhaar.add(p1);

        accept = new JButton("Accept");
        accept.setBounds(680, 100, 150, 100);
        accept.addActionListener(this);
        aadhaar.add(accept);

        reject = new JButton("Reject");
        reject.setBounds(680, 300, 150, 100);
        aadhaar.add(reject);

        accept = new JButton("Accept");
        accept.setBounds(680, 100, 150, 100);
        accept.addActionListener(this);
        photo.add(accept);

        reject = new JButton("Reject");
        reject.setBounds(680, 300, 150, 100);
        photo.add(reject);

        accept = new JButton("Accept");
        accept.setBounds(680, 100, 150, 100);
        accept.addActionListener(this);
        hsc.add(accept);

        reject = new JButton("Reject");
        reject.setBounds(680, 300, 150, 100);
        hsc.add(reject);

        accept = new JButton("Accept");
        accept.setBounds(680, 100, 150, 100);
        accept.addActionListener(this);
        caste.add(accept);

        reject = new JButton("Reject");
        reject.setBounds(680, 300, 150, 100);
        caste.add(reject);

        accept = new JButton("Accept");
        accept.setBounds(680, 100, 150, 100);
        accept.addActionListener(this);
        lc.add(accept);

        reject = new JButton("Reject");
        reject.setBounds(680, 300, 150, 100);
        lc.add(reject);




        tab = new JTabbedPane();
        tab.setBounds(200, 20, 950, 650);

        tab.add("Aadhaar", aadhaar);
        tab.add("Photo", photo);
        tab.add("HSC Result", hsc);
        tab.add("Leaving Certificate", lc);
        tab.add("Caste Certificate", caste);
        add(tab);



        setLocationRelativeTo(null);
        setLayout(null);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent ae) {
        if (ae.getSource() == accept) {
            JFileChooser fc = new JFileChooser();
            int result = fc.showOpenDialog(null);
            if (result == JFileChooser.APPROVE_OPTION) {
                File file = fc.getSelectedFile();
                String sname = file.getAbsolutePath(); //THIS WAS THE PROBLEM
                l1 = new JLabel("", new ImageIcon(sname), JLabel.CENTER);
                l1.setVisible(true);
                p1.add(l1, BorderLayout.CENTER);
                p1.revalidate(); //ADD THIS AS WELL
                p1.repaint();  //ADD THIS AS WELL
            }

        }
    }

    public static void main (String[]args){
        new scrutiny();
    }
}


