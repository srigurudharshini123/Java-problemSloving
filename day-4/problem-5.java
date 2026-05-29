//Reverse each word in a sentence
//input: Java is easy
//output: easy is Java
import java.util.Scanner;
public class Main{

	public static void main(String[] args) throws Exception {
		Scanner scan=new Scanner(System.in);
		String word=scan.nextLine();
       String arr[]=word.split(" ");
       for(int i=arr.length-1;i>=0;i--) {
    	   System.out.print(arr[i]+" ");
       }
       }
	}
