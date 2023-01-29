package utils;

import java.security.SecureRandom;
import java.time.LocalDate;

public class RandomUtils {

    public static void main(String[] args) {
        System.out.println(randomString(10));
    }
    public static String randomString(int len) {
        String AB = "0123456789";
        SecureRandom rnd = new SecureRandom();
        StringBuilder sb = new StringBuilder(len);
        for (int i = 0; i < len; i++)
            sb.append(AB.charAt(rnd.nextInt(AB.length())));
        return sb.toString();
    }


}
