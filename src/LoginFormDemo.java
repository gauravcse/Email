import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class LoginFormDemo 
{
	public static void main(String[] args)
	{
                // Creating object of LoginFrame class and setting it's properties ( step 4 ) 
		LoginFrame f=new LoginFrame();
		f.setTitle("Login Form");
		f.setVisible(true);
		f.setBounds(100,100,700,500);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	}
}