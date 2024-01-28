import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class DataEncryptorTest{

	@Test
	public void testForEncryptData(){
		DataEncryptor dataEncryptor = new DataEncryptor();
		
		
		String encryptionOfFirstInput = dataEncryptor.encrypt("2468");
		String encryptionOfSecondInput = dataEncryptor.encrypt("2357");

		assertEquals("3591", encryptionOfFirstInput);
		assertEquals("2490", encryptionOfSecondInput);

	}

	@Test
	public void testForEncrytDataWithLeadingZeros(){
	
		DataEncryptor dataEncryptor = new DataEncryptor();

		String encryption = dataEncryptor.encrypt("0123");

		assertEquals("9078",encryption);


	}

	@Test
	public void testThatEncryptGeneratesOutputWithLeadingZeros(){
		
		DataEncryptor dataEncryptor = new DataEncryptor();

		assertThrows(IllegalArgumentException.class, ()->dataEncryptor.encrypt("123888"));

	}

	@Test
	public void testValidateDate(){

		DataEncryptor dataEncryptor = new DataEncryptor();

		assertFalse(dataEncryptor.isValidDate("-123"));
		assertFalse(dataEncryptor.isValidDate("0-23"));
		assertFalse(dataEncryptor.isValidDate("12_3"));
		assertFalse(dataEncryptor.isValidDate("123+"));
		

	}



	
}