import java.awt.Color;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextArea;

public class ViewFrame extends JFrame implements ActionListener{

	private String username;
	private String password;
	Container c;
	JLabel allmessage;
	// Functionality not added yet
	JButton exit = new JButton("Exit");
	
	ViewFrame(String username, String password) {
		c = this.getContentPane();
		c.setLayout(null);
		this.username = username;
		this.password = password;
		CheckingMails chk = new CheckingMails(username, password);
		c.add(exit);
		chk.check();
		
		// chk.getOutput() contains the messages as String
		System.out.println(chk.getOutput());
		allmessage = new JLabel(chk.getOutput());
		//allmessage.setText(chk.getOutput());
		c.add(allmessage);
	}
	
	@Override
	public void actionPerformed(ActionEvent arg0) {
		
		
	}
	
}
