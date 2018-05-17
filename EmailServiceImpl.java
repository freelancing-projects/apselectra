/**
 * 
 */
package org.apselectra.com.service;

/**
 * @author arpit-k
 *
 */
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Component;

/**
 * @author arpit-k
 *
 */
@Component
public class EmailServiceImpl implements EmailService {

	@Autowired
	public JavaMailSender emailSender;
	
	@Autowired
	public SimpleMailMessage template;
	

	public void sendSimpleMessage(String to, String subject, String text) {
		SimpleMailMessage message = new SimpleMailMessage();
		message.setTo(to);
		message.setSubject(subject);
		
		/*String text = String.format(template.getText(), templateArgs);  
		sendSimpleMessage(to, subject, text);*/
		message.setText(text);
		
		emailSender.send(message);
	}
}