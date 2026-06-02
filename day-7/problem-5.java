// java bigInt
// input:a and b  -> 1234 ,  20
// output: sum,multiply of a b  -> 1254 , 24680
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        
         BigInteger a = new BigInteger(scan.nextLine());
        BigInteger b = new BigInteger(scan.nextLine());
        
        System.out.println(a.add(b));
        System.out.println(a.multiply(b));
    }
}
