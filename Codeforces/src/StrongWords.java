import java.util.*;
 
public class StrongWords{
    public static void strongPassword(String s) {
        String sb = "";
        int pos = -1;
        for (int i = 0; i < s.length() - 1; i++) {
            if (s.charAt(i) == s.charAt(i + 1)) {
                pos = i;
            }
        }
 
        if (pos == -1) {
            if (s.charAt(s.length() - 1) == 'a') {
 
                sb = s + "b";
            } else {
                sb = s + "a";
            }
        } else {
 
            if (s.charAt(pos) == 'a') {
                sb = s.substring(0, pos + 1) + "b" + s.substring(pos + 1, s.length());
            } else {
                sb = s.substring(0, pos + 1) + "a" + s.substring(pos + 1, s.length());
            }
        }
 
        System.out.println(sb);
    }
 
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
 
        int t = sc.nextInt();
 
        for (int i = 0; i < t; i++) {
            String s = sc.next();
            strongPassword(s);
        }
        sc.close();
    }
}