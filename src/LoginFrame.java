import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
 

class LoginFrame extends JFrame implements ActionListener {
        
	Container c;
	JLabel userlabel=new JLabel("username");
	JLabel pwdlabel=new JLabel("password");
	JTextField u_tf=new JTextField();
	JPasswordField p_pf=new JPasswordField();
	JButton btn=new JButton("LOGIN");
	//SendMailTLS s;
	
	LoginFrame() {
		c=this.getContentPane();
		c.setLayout(null);
		c.setBackground(Color.YELLOW);
		userlabel.setBounds(100,100,100,50);
		pwdlabel.setBounds(100,200,100,50);
		u_tf.setBounds(200,100,200,50);
		p_pf.setBounds(200,200,200,50);
		btn.setBounds(250,300,100,50); 
		c.add(u_tf);
		c.add(p_pf);
		c.add(pwdlabel);
		c.add(userlabel);
		c.add(btn);
		btn.addActionListener(this);
		
	}

	public void actionPerformed(ActionEvent e) {

		if(e.getSource()==btn) {
			
			String username=u_tf.getText();
			String pwd=p_pf.getText();
			//s = new SendMailTLS(username, pwd);
			OptionFrame o = new OptionFrame(username, pwd);
			o.setTitle("SELECT ONE");
			o.setVisible(true);
			o.setBounds(100,100,700,500);
			o.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//			System.out.println(username + "\t" + pwd);
//			if(username.equals("mehtab") && pwd.equals("12345") )
//			{
//				success.setText("Login Successful");
//				success.setBounds(250,350,100,50);
//				c.add(success);
//				
//			}
//			else 
//			{
//				warning.setText("wrong username or password");
//				warning.setBounds(200,350,300,50);
//				c.add(warning);
//				
//			}
		}
		
		
		
	}
	
         // Creating two JLabels ( step 13 ) 
	JLabel success=new JLabel();
	
	JLabel warning=new JLabel();
}
	
