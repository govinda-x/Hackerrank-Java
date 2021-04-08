import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();
        // Write your code here.
        scan.close();
        int i;
        for (i = 0; i < s.length(); i++) {
            if (Character.isLetter(s.charAt(i))) {
                break;
            }
        }
        s = s.substring(i);
        if (s.length() == 0) {
            System.out.println(0);
            return;
        }
        
        String[] tokens = s.split("[^a-zA-Z]+");
        
        System.out.println(tokens.length);
        for (String t : tokens) {
            System.out.println(t);
        }
    }
}

