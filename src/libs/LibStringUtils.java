package libs;

import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class LibStringUtils {
	public static String md5(String str) {
		String result = "";
		MessageDigest md = null;
		try {
			md = MessageDigest.getInstance("MD5");
			md.update(str.getBytes());
			BigInteger bigInteger = new BigInteger(1, md.digest());
			result = bigInteger.toString(16);
			while (result.length() < 32) {
				result = "0" + result;
			}
		} catch (NoSuchAlgorithmException e) {
			e.printStackTrace();
		}
		return result;
	}

}
