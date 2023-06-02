package CH11;

import javax.swing.*;

public class StudentForm extends JFrame {
    JLabel nameL,dobL,addressL,phoneL,genderL,emailL,facultyL,referenceL;
    JTextField nameT,dobT,addressT,phoneT,emailT;
    JRadioButton genderM,genderF;
    JCheckBox referenceFriends,referenceFamily,referenceInternet;
    JComboBox<String> faculty;
    JButton submitButton;
    public StudentForm() {

        nameL = new JLabel("Name:");
        nameL.setBounds(10,10,100,30);
        nameT = new JTextField();
        nameT.setBounds(110,10,150,30);

        dobL = new JLabel("DOB (dd/mm/yy):");
        dobL.setBounds(10,50,100,30);
        dobT = new JTextField();
        dobT.setBounds(110,50,150,30);

        addressL = new JLabel("Address:");
        addressL.setBounds(10,90,100,30);
        addressT = new JTextField();
        addressT.setBounds(110,90,150,30);

        phoneL = new JLabel("Cell No:");
        phoneL.setBounds(10,130,100,30);
        phoneT = new JTextField();
        phoneT.setBounds(110,130,150,30);

        genderL = new JLabel("Gender:");
        genderL.setBounds(10,170,100,30);
        genderM = new JRadioButton("Male");
        genderM.setBounds(110,170,75,30);
        genderF = new JRadioButton("Female");
        genderF.setBounds(185,170,75,30);

        ButtonGroup b = new ButtonGroup();
        b.add(genderM);b.add(genderF);

        emailL = new JLabel("E-Mail:");
        emailL.setBounds(10,210,100,30);
        emailT = new JTextField();
        emailT.setBounds(110,210,150,30);

        facultyL = new JLabel("Faculty:");
        facultyL.setBounds(10,250,100,30);

        String[] faculties = {"BCA","BBM","BIT"};

        faculty = new JComboBox<>(faculties);
        faculty.setBounds(110,250,150,30);

        referenceL = new JLabel("References:");
        referenceL.setBounds(10,290,100,30);

        referenceFamily = new JCheckBox("Family");
        referenceFamily.setBounds(110,290,80,30);

        referenceFriends = new JCheckBox("Friends");
        referenceFriends.setBounds(190,290,80,30);

        referenceInternet = new JCheckBox("Internet",true);
        referenceInternet.setBounds(270,290,80,30);

        submitButton = new JButton("Submit");
        submitButton.setFocusable(false);
        submitButton.setBounds(110,330,210,30);

        add(nameL);add(nameT);
        add(dobL);add(dobT);
        add(addressL);add(addressT);
        add(phoneL);add(phoneT);
        add(genderL);add(genderM);add(genderF);
        add(emailL);add(emailT);
        add(facultyL);add(faculty);
        add(referenceL);add(referenceFamily);add(referenceFriends);add(referenceInternet);
        add(submitButton);


        setBounds(750, 350, 360, 420);
        setLayout(null);
        setVisible(true);
        setResizable(false);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        new StudentForm();
    }
}
