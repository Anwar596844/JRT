package in.ashokit;

import java.util.Base64;
import java.util.Base64.Decoder;

public class Pwdutils {
	public static String encode(String txt) {
		java.util.Base64.Encoder encoder = Base64.getEncoder();
		return encoder.encodeToString(txt.getBytes());
	}
	public static String decode(String encodeTxt) {
		Decoder decoder = Base64.getDecoder();
		byte[] decode = decoder.decode(encodeTxt);
		return new String(decode);
	}

	public static void main(String[] args) {
		Pwdutils pw = new Pwdutils();
		String encode=Pwdutils.encode("Anwar");
		System.out.println(encode);
		String decode = Pwdutils.decode(encode);
		System.out.println(decode);

	}

}
