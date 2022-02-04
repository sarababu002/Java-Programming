/**********************************************
*File        :RegistrationForm.java
*Creator     :Sara Babu
*Description :Java program to create Registration Form.
*Date        :4/2/22
***********************************************/

import java.awt.Frame;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.Button;
import java.awt.Label;
import java.awt.FlowLayout;



public class RegistrationForm extends Frame implements ActionListener{
    Label name,age,email,phoneNo;
    Button button;
    TextField textfield1,textfield2,textfield3,textfield4;
    
    public RegistrationForm(){
        setTitle("REGISTRATION FORM");
        setSize(400,400);
        setLayout(new FlowLayout());
        setVisible(true);
        
       
		
		//adding components into frame
		name=new Label("Name        :");
        add(name);
        textfield1 = new TextField(20);
        add(textfield1);

        age=new Label("Age        :");
		add(age);
        textfield2 = new TextField(20);
		add(textfield2);

        email=new Label("Email    :");
        add(email);
        textfield3 = new TextField(20);
		add(textfield3);

        phoneNo=new Label("Mobile No   :");
        add(phoneNo);
        textfield4 = new TextField(20);
		add(textfield4);

        button=new Button("Submit");
		add(button);
        button.addActionListener(this);
    
		
		
	}
	public void actionPerformed(ActionEvent e) {
		System.out.println("Name: "+textfield1.getText());
		System.out.println("Age: "+textfield2.getText());
		System.out.println("E-mail: "+textfield3.getText());
		System.out.println("Mobile No: "+textfield4.getText());
		
	}
	public static void main(String[] args) {
		RegistrationForm form = new RegistrationForm();
	}
}