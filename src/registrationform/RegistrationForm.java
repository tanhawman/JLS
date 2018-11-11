
package registrationform;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import static java.util.Objects.isNull;
public class RegistrationForm {
    
    static JTextField name;
    static JRadioButton male;
    static JRadioButton female;
    static JRadioButton consumer;
    static JRadioButton cor_cust;
    static JTextField IC;
    static JTextArea address;
    static JTextField phone;
    static JTextField email;
    static JButton submit;
    
    public static void main(String[] args) {
        JFrame frame = new JFrame("Registration Form");  
        frame.setVisible(true);      
        frame.setBounds(450,50,800,800);    
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);  
        
        Container c = frame.getContentPane(); 
        c.setLayout(null); 
        c.setBackground(Color.LIGHT_GRAY);    
        
        Font fn = new Font("Arial",Font.BOLD,14);
        Font ft = new Font("Arial",Font.BOLD,20);
        
        JLabel heading = new JLabel();
        heading.setBounds(350,5,200,40);
        heading.setText("Registration Form");
        heading.setFont(ft);
        
        JLabel name_lbl = new JLabel("Name : ");
        name_lbl.setBounds(50,80,100,30); 
        
        name = new JTextField();
        name.setBounds(180,80,180,30);
         
        JLabel gender = new JLabel("Gender : ");
        gender.setBounds(50,160,150,30);
        
        Cursor cur = new Cursor(Cursor.HAND_CURSOR); 
        
        male = new JRadioButton("Male");
        male.setBounds(180,160,90,30);
        male.setBackground(Color.LIGHT_GRAY);
        male.setCursor(cur);
 
        female = new JRadioButton("Female");
        female.setBounds(300,160,100,30);
        female.setBackground(Color.LIGHT_GRAY);
        female.setCursor(cur);
        
        ButtonGroup gender_grp = new ButtonGroup();
        gender_grp.add(male);
        gender_grp.add(female);
        
        JLabel type = new JLabel("Customer Type : ");
        type.setBounds(50,240,180,30);
        
        consumer = new JRadioButton("Consumer");
        consumer.setBounds(180,240,110,30);
        consumer.setBackground(Color.LIGHT_GRAY);
        consumer.setCursor(cur);
 
        cor_cust = new JRadioButton("Corporate Customer");
        cor_cust.setBounds(300,240,170,30);
        cor_cust.setBackground(Color.LIGHT_GRAY);
        cor_cust.setCursor(cur);
        
        ButtonGroup cust_grp = new ButtonGroup();
        cust_grp.add(consumer);
        cust_grp.add(cor_cust);
        
        JLabel ic = new JLabel("I.C : ");
        ic.setBounds(50,320,100,30); 
        
        IC = new JTextField();
        IC.setBounds(180,320,180,30);
        
        JLabel add_lbl = new JLabel("Address : ");
        add_lbl.setBounds(50,400,100,30); 
 
        address = new JTextArea();
        address.setBounds(180,400,180,90);
 
        JLabel phone_lbl = new JLabel("Phone No. : ");
        phone_lbl.setBounds(50,520,100,30);
 
        phone = new JTextField();
        phone.setBounds(180,520,180,30);
 
        JLabel email_lbl = new JLabel("Email : ");
        email_lbl.setBounds(50,580,100,30);
 
        email = new JTextField();
        email.setBounds(180,580,180,30); 
        
        submit = new JButton("Submit");
        submit.setBounds(180,640,120,40);
        submit.setCursor(cur);
        
        // Submit button listener
        submit.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent event){
                submit_action(event);
            } 
        });
        
        // Setting font for all label
        name_lbl.setFont(fn);
        gender.setFont(fn);
        male.setFont(fn);
        female.setFont(fn);
        type.setFont(fn);
        consumer.setFont(fn);
        cor_cust.setFont(fn);
        ic.setFont(fn);
        add_lbl.setFont(fn);
        phone_lbl.setFont(fn);
        email_lbl.setFont(fn);
        
        c.add(heading); 
        c.add(name_lbl);
        
        c.add(gender);
        c.add(male);
        c.add(female);
        male.setSelected(true);
        
        c.add(type);
        c.add(consumer);
        c.add(cor_cust);
        consumer.setSelected(true);
        
        c.add(ic);
        c.add(add_lbl);
        c.add(phone_lbl);
        c.add(email_lbl);
							
        c.add(name);
	c.add(IC);
	c.add(address);
	c.add(phone);
	c.add(email);
	c.add(submit);
    }
    
    public static String validation(){
        String error = "";
        int email_val = 0;
        
        if( name.getText().isEmpty() || IC.getText().isEmpty() || address.getText().isEmpty() || phone.getText().isEmpty() || email.getText().isEmpty() )
            error += "\nAll field is required, please fill in all field.";
        
        for(int i = 0; i < email.getText().length(); i++){
            if( email.getText().charAt(i) == '@'){
                email_val = 1;
                break;
            }
        }
        if(email_val == 0)
            error += "\nEmail is not valid.";
        
        return error;
    }
    public static void submit_action(ActionEvent event){
        String error = validation();
        
        if(error.equals("")){
            JOptionPane.showMessageDialog(null, "Register Successful. \n\nYou are now able to make purchase now. :)");
        }else{
            JOptionPane.showMessageDialog(null, "Warning \n" + error.toString(),"Something's wrong..",JOptionPane.WARNING_MESSAGE);
        }
//            String name = name.getText();
//            String gender="Male";
//            
//            if(female.isSelected() == true)
//		gender="Female";
//
//            String add=address.getText();
//            String phone = phone.getText();
//            String email = email.getText();
//
//            output_txtArea.setText(" Name :   " +name +
//                "\n Gender :   "+gender + "\n I.C :   "+
//                "\n Address :  "+add + " \n Phone no :  "+phone + "\n Email :  "+email + "\n ");			
    }
}
