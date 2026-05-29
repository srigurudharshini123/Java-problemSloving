//Find frequency of each character in a string
//input:"apple"
//output:a=1,p=2,l=1,e=1
import java.util.Scanner;
class Main{
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		String s=scan.next();	
		char arr[]=s.toCharArray();
		for(int i=0;i<arr.length;i++) {
			int c=1;
			for(int j=0;j<arr.length;j++) {
				if(arr[i]==arr[j] && i!=j) {
					c++;
				  arr[j]='1';	
				}
			}
			if(arr[i]!='1') {
			System.out.println(s.charAt(i)+" = "+c);
		}	
		}
	}
}
