// Check valid ip address
// IP address is a string in the form "A.B.C.D", where the value of A, B, C, and D may range from 0 to 255. Leading zeros are allowed. The length of A, B, C, or D can't be greater than 3.
// input:000.12.12.034 ->Valid
// 000.12.234.23.23->Invalid
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.Scanner;

class Solution{

    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        while(in.hasNext()){
            String IP = in.next();
            System.out.println(IP.matches(new MyRegex().pattern));
        }

    }
}
class MyRegex {
    String pattern =
        "((25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)\\.){3}"
      + "(25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)";
}
//Write your code here
