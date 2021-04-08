import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertSame;

import java.util.Date;

import org.apache.commons.mail.EmailException;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class EmailTest {
	
	private static final String[] TEST_EMAILS = { "ab@bc.com", "a.b@c.org",
	"acbdefghijklmnopqrst@abcdefghijklmnopqrst.com.bd"};

private EmailConcrete email;
private Date d = new Date(2021-25-4);
private int connectionS = 3;
private static final String emailName = "abc@gmail.com";
private static final String value = "eVal";


@Before
public void setUpEmailTest() throws Exception{
email = new EmailConcrete();
}

@After
public void tearDownEmailTest() throws Exception{

}

@Test
public void testAddBcc() throws Exception{
	email.addBcc(TEST_EMAILS);
	
	assertEquals(3, email.getBccAddresses().size());
}

@Test
public void testAddCc() throws Exception{
	email.addCc(TEST_EMAILS);
	assertEquals(3, email.getCcAddresses().size());
}

@Test (expected = IllegalArgumentException.class)
public void addHeader() {
	email.addHeader(value, null);
	email.addHeader(null, null);
}
@Test 
public void addReplyTo() throws EmailException {
	email.addReplyTo(emailName, "emailName");
	//email.addReplyTo("abc.com", "0");
	//assertEquals(TEST_EMAILS, "name"); 
}

@Test (expected= EmailException.class)
public void getMailSession() throws EmailException {
	email.getMailSession();
	
}

@Test 
public void getSentDate() {
	email.setSentDate(d);
	email.getSentDate();
	assertEquals(d, email.getSentDate());
}

@Test
public void getSocketConnectionTimeout() {
	email.setSocketConnectionTimeout(connectionS);
	assertSame(connectionS, email.getSocketConnectionTimeout());
}

}
