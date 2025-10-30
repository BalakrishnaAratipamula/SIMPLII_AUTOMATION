package Pr_RegistrationEmailTest;
// Required dependency: https://mvnrepository.com/artifact/com.sun.mail/javax.mail

import java.util.*;
import javax.mail.*;
import javax.mail.internet.*;
import javax.mail.search.FlagTerm;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;


public class RegistrationEmailTest {
	public static void main(String[] args) throws Exception {
        // Step 1: Perform registration using Selenium
        WebDriver driver = new ChromeDriver();
        driver.get("https://example.com/register");
        driver.findElement(By.id("email")).sendKeys("yourtestemail@gmail.com");
        driver.findElement(By.id("username")).sendKeys("testuser");
        driver.findElement(By.id("password")).sendKeys("Password123");
        driver.findElement(By.id("register")).click();
        driver.quit();

        // Step 2: Wait a few seconds for the email to arrive
        Thread.sleep(5000);

        // Step 3: Connect to email inbox using JavaMail
        Properties props = new Properties();
        props.put("mail.store.protocol", "imaps");

        Session session = Session.getInstance(props, null);
        Store store = session.getStore();
        store.connect("imap.gmail.com", "yourtestemail@gmail.com", "your-app-password"); // Use App Password for Gmail

        Folder inbox = store.getFolder("INBOX");
        inbox.open(Folder.READ_ONLY);

        // Step 4: Search unread emails
        Message[] messages = inbox.search(new FlagTerm(new Flags(Flags.Flag.SEEN), false));

        boolean emailFound = false;

        for (Message msg : messages) {
            String subject = msg.getSubject();
            if (subject.contains("Registration Successful") || subject.contains("Welcome")) {
                emailFound = true;
                System.out.println("✅ Email received: " + subject);
                break;
            }
        }
        
        // Step 5: Validate
        Assert.assertTrue(emailFound, "Email not received after registration!");

        inbox.close(false);
        store.close();
    }
}
