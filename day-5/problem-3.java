// given a string,Compare each substring of a string in a lexicographical order as (A<B<....<Z<a<b<.........<z)
// input: welcometojava
//        3
// output:ava
//        wel
import java.util.Scanner;

public class Solution {

    public static String getSmallestAndLargest(String s, int k) {
        String smallest = "";
        String largest = "";
        
        // Complete the function
        // 'smallest' must be the lexicographically smallest substring of length 'k'
        // 'largest' must be the lexicographically largest substring of length 'k'
        String arr []=new String[s.length()-k+1];
        int index=0;
        for(int i=0;i<=s.length()-k;i++){
            String l=s.substring(i,i+k);
           arr[index]=l;
           index++;
        }
         smallest=arr[0];
         largest=arr[0];
        for(int i=1;i<arr.length;i++){
            if(arr[i].compareTo(smallest)<0){
                smallest=arr[i];
            }
            if(arr[i].compareTo(largest)>0){
                largest=arr[i];
            }
        }
         
        return smallest + "\n" + largest;
    }


    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.next();
        int k = scan.nextInt();
        scan.close();
      
        System.out.println(getSmallestAndLargest(s, k));
    }
}
