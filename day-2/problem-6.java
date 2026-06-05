// input:digits=[1,2,3]
// output=[1,2,4]
// explain==> 123+1=124
// change 124 as array;

// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.*;
class Main {
    public static void main(String[] args) {
        System.out.println("Start small. Ship something.");
      Scanner scan=new Scanner(System.in);
      int n=scan.nextInt();
      int digits[]=new int[n];
      for(int i=0;i<digits.length;i++){
         int num=scan.nextInt();
         digits[i]=num;
      }
     String s1="";
     for(int i=0;i<digits.length;i++){
         s1+=digits[i];
     }
             System.out.println(s1);

    //  change String to int
     int n1=Integer.parseInt(s1);
     int ans=n1+1;

    //   change int to String
    String s2=String.valueOf(ans);
            System.out.println(s2);
   char d2[]=new char[n];
   for(int i=0;i<d2.length;i++){
       d2[i]=s2.charAt(i);
   }
   
//   print answer
System.out.print("[");
for(int i=0;i<d2.length;i++){
            System.out.print(d2[i]+",");

}        System.out.print("]");

    }
}
