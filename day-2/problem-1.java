//print first  non repeating character in a string
//i/p: apple o/p:a   
//i/p:aabbc o/p:c

import java.util.Scanner;
class Main {
    public static void main(String[] args) {
  Scanner scan=new Scanner(System.in);
  String s=scan.next();
  for(int i=0;i<s.length();i++){
       boolean flag=true;
      for(int j=0;j<s.length();j++){
          if( i!=j && s.charAt(i)==s.charAt(j)){
            flag=false;
          }
      }
      if(flag){
          System.out.println(s.charAt(i));
          break;
      }
  }
    }
}
