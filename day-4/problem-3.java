//give an string contains brackets determine Valid or Invalid
//input: {}[]()
//output: Valid
//input: {](]
//output: Invalid

import java.util.Scanner;
public class Main{
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
	String b=scan.nextLine();
	int c=0;
	int j=1;
	for(int i=0;i<b.length();i++) {
		if(j<b.length()) {
		if(b.charAt(i)=='(') {
			if(b.charAt(j)==')') {
				c++;
			}
		}
		if(b.charAt(i)=='[') {
			if(b.charAt(j)==']') {
				c++;
			}
		}
		if(b.charAt(i)=='{') {
			if(b.charAt(j)=='}') {
				c++;
			}
		}
	 
		j++;
	}
	}
	if(c==3) {
		System.out.println("valid bracket");
	}
	else {
		System.out.println("Inavlid bracket");
	}
	}
}
