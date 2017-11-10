import java.util.Properties;

import javax.mail.Flags.Flag;
import javax.mail.Folder;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.NoSuchProviderException;
import javax.mail.Session;
import javax.mail.Store;

public class CheckingMails {
	
	private String user;
	private String password;
	private final String host = "pop.gmail.com";
	private String output;
	
	
	public CheckingMails(String username, String password) {
		this.user = username;
		this.password = password;
	}
	
	public String getOutput() {
		return output;
	}

   public void check()  {
      try {

	      Properties properties = new Properties();
	
	      properties.put("mail.pop3.host", host);
	      properties.put("mail.pop3.port", "995");
	      properties.put("mail.pop3.starttls.enable", "true");
	      Session emailSession = Session.getDefaultInstance(properties);
	  
	      Store store = emailSession.getStore("pop3s");
	
	      store.connect(host, user, password);
	
	      Folder emailFolder = store.getFolder("INBOX");
	      emailFolder.open(Folder.READ_ONLY);
	
	      Message[] messages = emailFolder.getMessages();
//	      messages[0].getFlags().contains(Flag.SEEN);
	      System.out.println("messages.length---" + messages.length);
	
	      for (int i = messages.length - 1; i >= 0 ; i--) {
	         Message message = messages[i];
	         output += "Subject: " + message.getSubject() + "\nFrom: " + message.getFrom()[0] + "Text: \n" + message.getContent().toString() + "\n";
	         /*System.out.println("---------------------------------");
	         System.out.println("Email Number " + (i + 1));
	         System.out.println("Subject: " + message.getSubject());
	         System.out.println("From: " + message.getFrom()[0]);
	         System.out.println("Text: " + message.getContent().toString());
	          */
	      }
	
	      emailFolder.close(false);
	      store.close();

      } catch (NoSuchProviderException e) {
         e.printStackTrace();
      } catch (MessagingException e) {
         e.printStackTrace();
      } catch (Exception e) {
         e.printStackTrace();
      }
   }

   public static void main(String[] args) {

      String host = "pop.gmail.com";// change accordingly
      String mailStoreType = "pop3";
      String username = "bobmitrareal@gmail.com";// change accordingly
      String password = "realmitra";// change accordingly
      CheckingMails c = new CheckingMails(username, password);
      c.check();

   }

}