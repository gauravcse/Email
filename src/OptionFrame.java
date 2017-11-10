import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class OptionFrame extends JFrame implements ActionListener {

	private String username;
	private String password;
	Container c;
	JButton send=new JButton("SEND");
	JButton view=new JButton("VIEW");
	
	public OptionFrame(String username, String password) {
		c=this.getContentPane();
		c.setLayout(null);
		c.setBackground(Color.PINK);
		send.setBounds(100,100,150,150);
		view.setBounds(250,150,250,150);
		c.add(send);
		c.add(view);
		this.username = username;
		this.password = password;
		send.addActionListener(this);
		view.addActionListener(this);
	}
	
	@Override
	public void actionPerformed(ActionEvent arg0) {
		if(arg0.getSource() == send) {
			
			SendFrame s = new SendFrame(username, password);
			s.setTitle("SEND");
			s.setVisible(true);
			s.setBounds(100,100,700,500);
			s.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		}
		else if(arg0.getSource() == view) {
			ViewFrame v = new ViewFrame(username, password);
			v.setTitle("VIEW");
			v.setVisible(true);
			v.setBounds(100,100,700,500);
			v.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		}
	}
	
}
