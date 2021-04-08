import static org.junit.Assert.assertEquals;

import java.util.Date;

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
}
