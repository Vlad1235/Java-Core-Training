package hashfunctions;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class Sha1 {
    public static void main(String[] args) {
        try {
            String result = sha1("Hello world");
            System.out.println(result);
        } catch (NoSuchAlgorithmException exc) {
            exc.printStackTrace();
        }
    }

    static String sha1(String input) throws NoSuchAlgorithmException {
        MessageDigest mDigest = MessageDigest.getInstance("SHA1");
        byte[] result = mDigest.digest(input.getBytes());
        StringBuffer sb = new StringBuffer();
        for (int i = 0; i < result.length; i++) {
            sb.append(Integer.toString((result[i] & 0xff) + 0x100, 16).substring(1));
        }
        return sb.toString();
    }
}
