import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class CryptoManagerTestStudent {
	CryptoManager cryptoManager;
	
	@BeforeEach
	void setUp() throws Exception {
	}

	@AfterEach
	void tearDown() throws Exception {
	}

	@Test
	public void testStringInBounds() {
		assertTrue(CryptoManager.isStringInBounds("LOVE ECLIPSE"));
	}
	
	@Test
	public void testEncryptCaesar() {
		assertEquals("ORYH#FRPSXWHUV", CryptoManager.caesarEncryption("LOVE COMPUTERS", 3));
	}
	
	@Test
	public void testDecryptCaesar() {
		assertEquals("LOVE SCHOOL", CryptoManager.caesarDecryption("TW^M([KPWWT", 8));
	}
	
	@Test
	public void testEncryptBellaso() {
		//assertEquals("WN#\\N &", CryptoManager.bellasoEncryption("TESTING", "CIPHER_IS_LONGER_THAN_THE_PLAIN_TEXT"));
		assertEquals("X^,J,TYQU_)J", CryptoManager.bellasoEncryption("LOVE ECLIPSE", "LOVE"));
		
		

	}
	
	@Test
	public void testDecryptBellaso() {
		//assertEquals("TESTING", CryptoManager.bellasoDecryption("WN#\\N &", "CIPHER_IS_LONGER_THAN_THE_PLAIN_TEXT"));
		assertEquals("LOVE COMPUTERS", CryptoManager.bellasoDecryption("O\\)HR3BP](W7BF", "CMSC203"));
		//assertEquals("THIS IS ANOTHER TEST", CryptoManager.bellasoDecryption("WU\\VR9F#N!RF88U-'HED", "CMSC203"));

	}

}
