// Given a string,and print each tokens with total words in a sentence.
// input: He is a very very good boy, isn't he?
//output: 
// 10
// He
// is
// a
// very
// very
// good
// boy
// isn
// t
// he
import java.io.*;
import java.util.*;
public class Solution {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();

        String str = s.replaceAll("[!,?._'@]", " ").trim();

        if (str.isEmpty()) {
            System.out.println(0);
            scan.close();
            return;
        }

        String arr[] = str.split("\\s+");

        System.out.println(arr.length);

        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }

        scan.close();
    }
}
