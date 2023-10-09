
/**
 * This is a utility class that encrypts and decrypts a phrase using two
 * different approaches. The first approach is called the Caesar Cipher and is a
 * simple �substitution cipher� where characters in a message are replaced by a
 * substitute character. The second approach, due to Giovan Battista Bellaso,
 * uses a key word, where each character in the word specifies the offset for
 * the corresponding character in the message, with the key word wrapping around
 * as needed.
 * 
 * @author Farnaz Eivazi
 * @version 7/16/2022
 */
public class CryptoManager {
	
	private static final char LOWER_RANGE = ' ';
	private static final char UPPER_RANGE = '_';
	private static final int RANGE = UPPER_RANGE - LOWER_RANGE + 1;

	/**
	 * This method determines if a string is within the allowable bounds of ASCII codes 
	 * according to the LOWER_RANGE and UPPER_RANGE characters
	 * @param plainText a string to be encrypted, if it is within the allowable bounds
	 * @return true if all characters are within the allowable bounds, false if any character is outside
	 */
	public static boolean isStringInBounds (String plainText) {
		for(int i = 0; i < plainText.length();i++) {
			if (plainText.charAt(i) < LOWER_RANGE || plainText.charAt(i) > UPPER_RANGE)// checks to see if the string is within bounds
				return false;
		}
		
		return true; //returns true if string is within range
	}

	/**
	 * Encrypts a string according to the Caesar Cipher.  The integer key specifies an offset
	 * and each character in plainText is replaced by the character \"offset\" away from it 
	 * @param plainText an uppercase string to be encrypted.
	 * @param key an integer that specifies the offset of each character
	 * @return the encrypted string
	 */
	public static String caesarEncryption(String plainText, int key) {
		String encrypt = "";
		
		if(key > RANGE) {//if key is bigger than range, substract the range from the key, until key is in the range
			while(key > UPPER_RANGE)
				key = key - RANGE - 1;
		}
		
		for(int i = 0; i < plainText.length(); i++) {
			encrypt = encrypt + (char)(plainText.charAt(i) + key);
		}
		return encrypt;
	}
	
	/**
	 * Encrypts a string according the Bellaso Cipher.  Each character in plainText is offset 
	 * according to the ASCII value of the corresponding character in bellasoStr, which is repeated
	 * to correspond to the length of plainText
	 * @param plainText an uppercase string to be encrypted.
	 * @param bellasoStr an uppercase string that specifies the offsets, character by character.
	 * @return the encrypted string
	 */
	public static String bellasoEncryption (String plainText, String bellasoStr) {
		String key = "";
		String encrypt = "";
		int p = 0;
		
		while(key.length() != plainText.length()) {
			key = key + bellasoStr.charAt(p);
			p++;
			
			if( p == bellasoStr.length())
				p = 0;
		}
		//encryption of each character
		for(int i = 0; i < plainText.length();i++) {
			int res = plainText.charAt(i) + key.charAt(i); //replace characters 
			
			if(res > UPPER_RANGE) {
				while (res > UPPER_RANGE)
					res = res - RANGE;
			}
			
			encrypt = encrypt + (char) res;// add each encrypted character into the new string 
				
		}
		
		return encrypt;
	}
	
	/**
	 * Decrypts a string according to the Caesar Cipher.  The integer key specifies an offset
	 * and each character in encryptedText is replaced by the character \"offset\" characters before it.
	 * This is the inverse of the encryptCaesar method.
	 * @param encryptedText an encrypted string to be decrypted.
	 * @param key an integer that specifies the offset of each character
	 * @return the plain text string
	 */
	public static String caesarDecryption (String encryptedText, int key) {
		String decrypt = "";
		
		if(key > RANGE) { // if key is bigger than range, once again substract the range from key until its in the range
			while(key > UPPER_RANGE)
				key = key - RANGE - 1;
		}
		//for loop to decrypt 
		for(int i = 0; i < encryptedText.length(); i++) {
			decrypt = decrypt + (char)(encryptedText.charAt(i) - key);
		}
		
		return decrypt;
	}
	
	/**
	 * Decrypts a string according the Bellaso Cipher.  Each character in encryptedText is replaced by
	 * the character corresponding to the character in bellasoStr, which is repeated
	 * to correspond to the length of plainText.  This is the inverse of the encryptBellaso method.
	 * @param encryptedText an uppercase string to be encrypted.
	 * @param bellasoStr an uppercase string that specifies the offsets, character by character.
	 * @return the decrypted string
	 */
	public static String bellasoDecryption(String encryptedText, String bellasoStr) {
		String decrypt = "";
		String key = "";
		int p = 0;
		
		while(key.length()!= encryptedText.length()) {
			key = key + bellasoStr.charAt(p);
			p++;
			
			if(p == bellasoStr.length())
				p = 0;
		}
		//for loop to decrpyt
		for(int i = 0; i < encryptedText.length();i++) {
			int res = encryptedText.charAt(i) - key.charAt(i);
			
			if(res < LOWER_RANGE) {
				while(res < LOWER_RANGE)
					res = res + RANGE;
			}
			
			decrypt = decrypt + (char)res;
				
		}
		return decrypt; // gives the decrypted string
	}
}
