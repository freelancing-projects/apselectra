/**
 * 
 */
package org.apselectra.com.service;

/**
 * @author arpit-k
 *
 */
public interface EmailService {

	public void sendSimpleMessage(String to, String subject, String text);
}