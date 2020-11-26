import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        BigInteger A,B,C;
        A= new BigInteger(sc.nextLine());
        B= new BigInteger(sc.nextLine());
        sc.close();
        C= A.add(B);
        System.out.println(C);
        C= A.multiply(B);
        System.out.println(C);
    }
}