import java.awt.Color;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class SendFrame extends JFrame implements ActionListener{

	private String username;
	private String password;
	
	
	JLabel l_to = new JLabel("To");
	JTextField to = new JTextField();
	JLabel l_sub = new JLabel("Subject");
	JTextField sub = new JTextField();
	JLabel l_mes = new JLabel("Message");
	JTextField mes = new JTextField();
	JButton but = new JButton("Send");
	Container c;
	
	public SendFrame(String username, String password) {
		c = this.getContentPane();
		c.setLayout(null);
		c.setBackground(Color.RED);
		this.username = username;
		this.password = password;
		l_to.setBounds(100,100,100,50);
		to.setBounds(100,200,100,50);
		l_sub.setBounds(200,100,200,50);
		sub.setBounds(200,200,200,50);
		l_mes.setBounds(300,100,300,50);
		mes.setBounds(300,200,300,50);
		but.setBounds(400,400,425,425);
		
		c.add(l_to);
		c.add(to);
		c.add(l_sub);
		c.add(sub);
		c.add(l_mes);
		c.add(mes);
		c.add(but);
		
		but.addActionListener(this);
	}
	
	
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == but) {
			String sendTo = to.getText();
			String subject = sub.getText();
			String message = mes.getText();
			System.out.println("Sent Frame" + username + password);
			SendMailTLS s = new SendMailTLS(username, password);
			s.sendMail(sendTo, subject, message);
		}
	}
	
}
