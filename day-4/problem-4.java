//create weakpasswordException and also throw password len <8
//input: java123$
//output: Valid Password

import java.util.Scanner;
public class Main{
	public static void main(String[] args) throws Exception {
		Scanner scan=new Scanner(System.in);
		String pass=scan.next();
		int alpha=0,number=0,special=0;
		if(pass.length()>=8) {
			for(int i=0;i<pass.length();i++) {
				if((pass.charAt(i)>=97 && pass.charAt(i)<=122) || (pass.charAt(i)>=65 && pass.charAt(i)<=90)) {
					alpha++;
				}
				 if(pass.charAt(i)>=48 && pass.charAt(i)<=57) {
					number++;
				}
				if((pass.charAt(i)>=32 && pass.charAt(i)<=47) || (pass.charAt(i)>=58 && pass.charAt(i)<=63)) {
					special++;
				}
			}
			if(alpha>=1 && number>=1 && special>=1) {
				System.out.println("Valid Password");
			}
			else {
				throw new Exception("WeakPassword");
			}
		}
		else {
			throw new Exception("WeakPassword");
			
		}
	}

}
