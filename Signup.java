package bank.atm.simulation;

import com.toedter.calendar.JDateChooser;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

public class Signup extends JFrame implements ActionListener {

    JTextField textName,textFname,textEmail,textAdd,textcity,textPin,textState;
    JDateChooser dateChooser;
    JRadioButton btn,btn1,m1,m2,m3;
    JButton next;

    Random r=new Random();
    long first4=(r.nextLong() % 9000L) +1000L;
    String first=" " + Math.abs(first4);
    Signup()
    {
        super("APPLICATION FORM");

        ImageIcon i1=new ImageIcon(ClassLoader.getSystemResource("icon/bank.png"));/* swing package*/
        Image i2=i1.getImage().getScaledInstance(100,100,Image.SCALE_DEFAULT);/* awt package */
        ImageIcon i3=new ImageIcon(i2);/* swing package*/
        JLabel image=new JLabel(i3);
        image.setBounds(25,10,100,100);
        add(image);

        JLabel label1=new JLabel("APPLICATION FORM NO."+first);
        label1.setBounds(160,20,600,40);
        label1.setFont(new Font("AvantGarde",Font.BOLD,38));
        add(label1);

        JLabel label2=new JLabel("Page 1");
        label2.setFont(new Font("AvantGarde",Font.BOLD,22));
        label2.setBounds(330,70,600,30);
        add(label2);

        JLabel label3=new JLabel("Personal Details");
        label3.setFont(new Font("AvantGarde",Font.BOLD,22));
        label3.setBounds(290,120,600,30);
        add(label3);

        JLabel labelname=new JLabel("Name :");
        labelname.setFont(new Font("AvantGarde",Font.BOLD,20));
        labelname.setBounds(100,190,100,30);
        add(labelname);

        textName = new JTextField();
        textName.setFont(new Font("Raleway",Font.BOLD, 14));
        textName.setBounds(300,190,400,30);
        add(textName);

        JLabel labelfName = new JLabel("Father's Name :");
        labelfName.setFont(new Font("Raleway", Font.BOLD, 20));
        labelfName.setBounds(100,230,200,30);
        add(labelfName);

        textFname = new JTextField();
        textFname.setFont(new Font("Raleway",Font.BOLD, 14));
        textFname.setBounds(300,230,400,30);
        add(textFname);

        JLabel DOB = new JLabel("Date of Birth :");
        DOB.setFont(new Font("Raleway", Font.BOLD, 20));
        DOB.setBounds(100,330,200,30);
        add(DOB);

        dateChooser=new JDateChooser();
        dateChooser.setForeground(new Color(105,105,105));
        dateChooser.setBounds(300,330,400,30);
        add(dateChooser);

        JLabel labelG = new JLabel("Gender");
        labelG.setFont(new Font("Raleway", Font.BOLD, 20));
        labelG.setBounds(100,280,200,30);
        add(labelG);

        btn = new JRadioButton("Male");
        btn.setFont(new Font("Raleway", Font.BOLD,18));
        btn.setBackground(new Color(68, 187, 242));
        btn.setBounds(300,280,100,30);
        add(btn);

        btn1= new JRadioButton("Female");
        btn1.setBackground(new Color(68, 187, 242));
        btn1.setFont(new Font("Raleway", Font.BOLD,18));
        btn1.setBounds(400,280,120,30);
        add(btn1);

        ButtonGroup bg=new ButtonGroup();
        bg.add(btn);
        bg.add(btn1);

        JLabel labelEmail = new JLabel("Email address :");
        labelEmail.setFont(new Font("Raleway", Font.BOLD, 20));
        labelEmail.setBounds(100,380,200,30);
        add(labelEmail);

        textEmail = new JTextField();
        textEmail.setFont(new Font("Raleway",Font.BOLD, 14));
        textEmail.setBounds(300,380,400,30);
        add(textEmail);

        JLabel labelMs = new JLabel("Marital Status :");
        labelMs.setFont(new Font("Raleway", Font.BOLD, 20));
        labelMs.setBounds(100,430,200,30);
        add(labelMs);

        m1 = new JRadioButton("Married");
        m1.setBounds(300,430,100,30);
        m1.setBackground(new Color(68, 187, 242));
        m1.setFont(new Font("Raleway", Font.BOLD,18));
        add(m1);

        m2 = new JRadioButton("Unmarried");
        m2.setBackground(new Color(68, 187, 242));
        m2.setBounds(410,430,120,30);
        m2.setFont(new Font("Raleway", Font.BOLD,18));
        add(m2);

        m3 = new JRadioButton("Other");
        m3.setBackground(new Color(68, 187, 242));
        m3.setBounds(550,430,100,30);
        m3.setFont(new Font("Raleway", Font.BOLD,18));
        add(m3);

        ButtonGroup buttonGroup1 = new ButtonGroup();
        buttonGroup1.add(m1);
        buttonGroup1.add(m2);
        buttonGroup1.add(m3);

        JLabel labelAdd = new JLabel("Address :");
        labelAdd.setFont(new Font("Raleway", Font.BOLD, 20));
        labelAdd.setBounds(100,480,200,30);
        add(labelAdd);

        textAdd = new JTextField();
        textAdd.setFont(new Font("Raleway",Font.BOLD, 14));
        textAdd.setBounds(300,480,400,30);
        add(textAdd);

        JLabel labelCity = new JLabel("City :");
        labelCity.setFont(new Font("Raleway", Font.BOLD, 20));
        labelCity.setBounds(100,530,200,30);
        add(labelCity);

        textcity = new JTextField();
        textcity.setFont(new Font("Raleway",Font.BOLD, 14));
        textcity.setBounds(300,530,400,30);
        add(textcity);

        JLabel labelPin = new JLabel("Pin Code :");
        labelPin.setFont(new Font("Raleway", Font.BOLD, 20));
        labelPin.setBounds(100,580,200,30);
        add(labelPin);

        textPin = new JTextField();
        textPin.setFont(new Font("Raleway",Font.BOLD, 14));
        textPin.setBounds(300,580,400,30);
        add(textPin);

        JLabel labelstate = new JLabel("State :");
        labelstate.setFont(new Font("Raleway", Font.BOLD, 20));
        labelstate.setBounds(100,630,200,30);
        add( labelstate);

        textState = new JTextField();
        textState.setFont(new Font("Raleway",Font.BOLD, 14));
        textState.setBounds(300,630,400,30);
        add(textState);

        next = new JButton("Next");
        next.setFont(new Font("Raleway",Font.BOLD, 14));
        next.setBackground(Color.BLACK);
        next.setForeground(Color.WHITE);
        next.setBounds(620,660,80,30);
        next.addActionListener(this);
        add(next);


        getContentPane().setBackground(new Color(68, 187, 242));
        setLayout(null);
        setSize(850,800);
        setVisible(true);
        setLocation(360,40);
    }
    @Override
    public void actionPerformed(ActionEvent e) {

        String formno=first;
        String name=textName.getText();
        String fname=textFname.getText();
        String dob=((JTextField)dateChooser.getDateEditor().getUiComponent()).getText();
        String gender=null;
        if(btn.isSelected())
        {
            gender="Male";
        }
        else if(btn1.isSelected()){
            gender="Female";
        }
        String email=textEmail.getText();
        String marital=null;
        if(m1.isSelected())
        {
            marital="Married";
        }
        else if(m2.isSelected()){
            marital="Unmarried";
        }
        else if(m3.isSelected())
        {
            marital="Other";
        }
        String address= textAdd.getText();
        String city=textcity.getText();
        String pincode=textPin.getText();
        String state=textState.getText();

        try{
            if(textName.getText().equals("")){
                JOptionPane.showMessageDialog(null,"Fill all the fields");
            }else{
                _Con con1=new _Con();
                String q = "insert into signup values('"+formno+"', '"+name+"','"+fname+"','"+dob+"','"+gender+"','"+email+"','"+marital+"', '"+address+"', '"+city+"','"+pincode+"','"+state+"' )";
                con1.statement.executeUpdate(q);
                new Signup2(first);
                setVisible(false);
            }
        }catch (Exception E){
            E.printStackTrace();
        }


    }

    public static void main(String[] args) {
        new Signup();
    }
}
